# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Java SDK for the Annosaurus microservice - a video annotation system for marine biology research. The SDK provides two complementary APIs:
1. **Kiota API** - Auto-generated fluent API from OpenAPI spec
2. **AnnotationService API** - Custom async interface for domain-driven development

## Build & Test Commands

```bash
# Build the project
mvn clean install

# Run tests
mvn test

# Run a specific test class
mvn test -Dtest=AnnosaurusFactoryIntegrationTest

# Run a specific test method
mvn test -Dtest=AnnosaurusHttpClientIntegrationTest#countObservationsByConcept

# Generate javadocs
mvn javadoc:javadoc

# Skip tests during build
mvn clean install -DskipTests

# Build with verbose output
mvn clean install -X
```

## Regenerating Kiota SDK Code

When the OpenAPI specification changes, regenerate the Kiota code:

1. Place the updated OpenAPI YAML file at `src/main/resources/docs.yaml`
2. If needed, change OpenAPI version to 3.0.0 (Kiota doesn't support 3.1.0)
3. Run the Kiota generator:

```bash
kiota generate -l java -c Annosaurus -n org.mbari.vars.annosaurus.sdk.kiota \
  -d src/main/resources/docs.yaml \
  -o ./src/main/java/org/mbari/vars/annosaurus/sdk/kiota
```

**IMPORTANT**: Never manually edit files in the `org.mbari.vars.annosaurus.sdk.kiota` package - they are auto-generated and will be overwritten.

## Architecture

### Dual-API Design

The SDK provides two distinct API surfaces for different use cases:

**Kiota API (Fluent)** - Located in `org.mbari.vars.annosaurus.sdk.kiota`
- 224 auto-generated files from OpenAPI specification
- Models use "SC" suffix (e.g., `AnnotationSC`, `AnnotationCreateSC`)
- Fluent builder pattern: `annosaurus.v1().annotations().post(annotation)`
- Strong typing with generated request/response builders
- Entry point: `AnnosaurusFactory.create(baseUrl, apiKey)`

**AnnotationService API (Async)** - Located in `org.mbari.vars.annosaurus.sdk.r1`
- 47 custom implementation files
- Models without "SC" suffix (e.g., `Annotation`, `Association`)
- Method-based interface with `CompletableFuture` returns
- Custom GSON serialization with type adapters
- Entry point: `new AnnosaurusHttpClient(baseUrl, duration, apiKey)`

### Key Package Structure

```
org.mbari.vars.annosaurus.sdk/
├── AnnosaurusFactory              # Factory for creating Kiota clients
├── AnnosaurusAccessTokenProvider  # JWT token management for Kiota
│
├── kiota/                         # AUTO-GENERATED - DO NOT EDIT
│   ├── Annosaurus                 # Main Kiota client entry point
│   ├── models/                    # Generated models with "SC" suffix
│   └── v1/                        # REST endpoint request builders
│
└── r1/                            # CUSTOM IMPLEMENTATION
    ├── AnnosaurusHttpClient       # Primary AnnotationService implementation
    ├── AnnosaurusKiotaClient      # Adapter wrapping Kiota client
    ├── AnnotationService          # Interface (45+ methods)
    ├── VideoReferenceService      # Interface for video metadata
    ├── BaseHttpClient             # Abstract HTTP operations base
    ├── JwtHttpClient              # JWT token lifecycle management
    ├── models/                    # Custom POJOs (no "SC" suffix)
    │   ├── Annotation             # Implements ImagedMoment interface
    │   ├── Association, Image, Index, etc.
    │   └── ImagedMoment           # Bridge to VCR4J VideoIndex
    └── etc/
        ├── gson/                  # Custom GSON type adapters
        │   ├── DurationConverter, InstantConverter
        │   └── TimecodeConverter  # VCR4J timecode serialization
        └── jdk/
            └── Loggers            # Fluent logging wrapper
```

### Model Naming Convention

- **Kiota models** (auto-generated): Suffix "SC" → `AnnotationSC`, `MultiRequestSC`
- **Custom models** (r1 package): No suffix → `Annotation`, `Association`

When converting between APIs, use `AnnosaurusKiotaClient` which handles model translation.

### Authentication Flow

Both APIs use JWT bearer tokens:

1. Client makes initial request to `/v1/auth` with API key in `Authorization` header
2. Server returns JWT token with expiration
3. Token is cached (`AnnosaurusAccessTokenProvider` for Kiota, `JwtHttpClient` for r1)
4. Subsequent requests include `Authorization: Bearer <token>`
5. Tokens auto-refresh when expired before requests

### VCR4J Integration

The SDK integrates with VCR4J (Video Cassette Recorder for Java) for video metadata:

- `ImagedMoment` interface bridges VCR4J `VideoIndex` and annotation models
- Implemented by: `Annotation`, `Image`, `Index`
- Provides: `toVideoIndex()` conversion method
- Handles: timecode, recordedTimestamp, elapsedTime
- Custom `TimecodeConverter` for GSON serialization

### Async/Concurrency Model

The r1 API uses modern Java 21+ concurrency:

- All `AnnotationService` methods return `CompletableFuture<T>`
- Virtual thread executor: `Executors.newVirtualThreadPerTaskExecutor()`
- Non-blocking I/O throughout
- Methanol HTTP client for async operations
- Use `.join()` or `.thenAccept()` to handle results

Example:
```java
CompletableFuture<List<Annotation>> future = service.findAnnotations(videoRefUuid);
future.thenAccept(annos -> System.out.println("Found: " + annos.size()));
```

## Development Patterns

### When to Use Which API

**Use Kiota API when:**
- You want strict OpenAPI contract compliance
- You need the latest endpoint additions immediately
- You prefer fluent builder patterns
- You're integrating with other Kiota-based services

**Use AnnotationService API when:**
- You want domain-focused method names
- You need async/CompletableFuture patterns
- You prefer traditional Java interfaces
- You're building on existing VCR4J infrastructure

### Adding New Functionality

**For Kiota API changes:**
1. Update `src/main/resources/docs.yaml` with new OpenAPI spec
2. Run Kiota generator command (see "Regenerating Kiota SDK Code")
3. Update `AnnosaurusKiotaClient` adapter if custom models need new mappings

**For AnnotationService API changes:**
1. Add method signature to `AnnotationService` interface
2. Implement in `AnnosaurusHttpClient` using `submit()` pattern
3. If using Kiota backend, implement in `AnnosaurusKiotaClient`
4. Add corresponding model classes to `r1/models/` if needed
5. Create GSON type adapter in `r1/etc/gson/` if custom serialization required

### GSON Type Adapters

Custom type adapters handle special serialization cases:

- `DurationConverter` - Converts `Duration` to/from milliseconds
- `InstantConverter` - ISO-8601 format for `Instant`
- `TimecodeConverter` - VCR4J `Timecode` serialization
- `AnnotationCreator` - Custom deserializer for `ImagedMoment` hierarchy

GSON configured with `LOWER_CASE_WITH_UNDERSCORES` naming policy (camelCase ↔ snake_case).

## Testing

Integration tests require a running Annosaurus service instance. Tests use real HTTP calls (no mocking):

- `AnnosaurusFactoryIntegrationTest` - Tests Kiota API
- `AnnosaurusHttpClientIntegrationTest` - Tests AnnotationService API

Both require environment-specific configuration (base URL, API key) which should be set in test setup.

## Java Version

This project requires Java 21+ due to:
- Virtual threads (`Executors.newVirtualThreadPerTaskExecutor()`)
- Modern pattern matching features
- Records and sealed classes (if used in future development)

Maven compiler is set to `<maven.compiler.release>21</maven.compiler.release>`.

## Modularization (JPMS)

This SDK is published as an **automatic module** with the name `org.mbari.vars.annosaurus.sdk`.

**What this means:**
- ✅ Can be used on the module path in modular applications
- ✅ Consumers can use `requires org.mbari.vars.annosaurus.sdk;` in their `module-info.java`
- ✅ Works on both classpath (traditional) and module path (JPMS)
- ⚠️ Does not have a full `module-info.java` due to Kiota dependency limitations

See `MODULARIZATION.md` for:
- How automatic modules work
- Why full modularization isn't possible yet (Kiota JARs share module names)
- Solutions for full modularization (uber-JAR, ModiTect, etc.)
- Ready-to-use `module-info.java.disabled` for when Kiota adds proper module support

## Key Dependencies

- **Kiota 1.8.0** - OpenAPI client generation framework
- **vcr4j-core 5.3.1** - Video metadata structures
- **Methanol 1.8.1** - Modern HTTP client builder
- **Auth0 JWT 4.4.0** - JWT token parsing/validation
- **OkHttp3 4.12.0** - HTTP transport layer

## Publishing

The SDK is published to Maven Central:

```xml
<dependency>
    <groupId>org.mbari.vars</groupId>
    <artifactId>annosaurus-java-sdk</artifactId>
    <version>0.0.8</version>
</dependency>
```

Release process uses Maven Central publishing plugin with GPG signing.
