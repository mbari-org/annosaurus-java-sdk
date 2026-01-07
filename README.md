# annosaurus-java-sdk

Java SDK for the [Annosaurus](https://github.com/mbari-org/annosaurus) microservice - a video annotation system for marine biology research. The SDK provides two complementary APIs for different use cases.

## Features

- **Dual API Design**: Choose between auto-generated Kiota API (fluent builders) or custom AnnotationService API (async/CompletableFuture)
- **JWT Authentication**: Automatic token management and refresh
- **VCR4J Integration**: Built-in support for video metadata structures
- **Java 21+**: Modern async/concurrency with virtual threads
- **JPMS Support**: Published as an automatic module (`org.mbari.vars.annosaurus.sdk`)

## Requirements

- Java 21 or higher
- Maven 3.6+

## Installation

```xml
<dependency>
    <groupId>org.mbari.vars</groupId>
    <artifactId>annosaurus-java-sdk</artifactId>
    <version>0.0.9</version>
</dependency>
```

## Quick Start

### Kiota API (Fluent Builder Pattern)

Auto-generated from OpenAPI specification with strong typing and fluent builders:

```java
var baseUrl = "http://localhost/anno/v1"; // Your service URL
var apiKey  = "foobar";                   // Your API key

// Create client
var annosaurus = AnnosaurusFactory.create(baseUrl, apiKey);

// Get 1000 annotations (fluent API)
List<AnnotationSC> annos = annosaurus.v1()
    .fast()
    .get(gcr -> gcr.queryParameters.limit = 10000);

// Request annotations by video reference UUID
var multiRequest = new MultiRequestSC();
multiRequest.setVideoReferenceUuids(List.of(
    UUID.fromString("feefe228-c503-4add-ae19-9cd713ee2175")
));
var annos = annosaurus.v1().fast().multi().post(multiRequest);

// Create an annotation
var annotation = new AnnotationCreateSC();
annotation.setConcept("Nanomia bijuga");
annotation.setObserver("Brian Schlining");
annotation.setObservationTimestamp(OffsetDateTime.now());
annotation.setVideoReferenceUuid(UUID.fromString("feefe228-c503-4add-ae19-9cd713ee2175"));
var created = annosaurus.v1().annotations().post(annotation);
```

**Note**: Kiota models use "SC" suffix (e.g., `AnnotationSC`, `MultiRequestSC`).

### AnnotationService API (Async Interface)

Domain-focused interface with `CompletableFuture` for async operations:

```java
var baseUrl = "http://localhost/anno/v1";
var apiKey  = "foobar";

// Create client
var service = new AnnosaurusHttpClient(URI.create(baseUrl), apiKey);

// Async operations return CompletableFuture
CompletableFuture<List<Annotation>> future = service.findAnnotations(videoRefUuid);
future.thenAccept(annos -> System.out.println("Found: " + annos.size()));

// Or block and wait
List<String> groups = service.findGroups().join();

// Create annotation with custom models
var annotation = new Annotation();
annotation.setConcept("Bathochordaeus stygius");
annotation.setObserver("Lonny Lundsten");
// ... set other fields
CompletableFuture<Annotation> result = service.createAnnotation(annotation);
```

**Note**: Custom models do NOT have "SC" suffix (e.g., `Annotation`, `Association`).

## API Comparison

| Feature | Kiota API | AnnotationService API |
|---------|-----------|----------------------|
| **Models** | `*SC` suffix | No suffix |
| **Style** | Fluent builders | Method-based |
| **Async** | Blocking | `CompletableFuture` |
| **Generation** | Auto-generated | Custom implementation |
| **Entry Point** | `AnnosaurusFactory.create()` | `new AnnosaurusHttpClient()` |
| **Use Case** | OpenAPI compliance | Domain-driven development |

## Build & Test

```bash
# Build the project
mvn clean install

# Run tests
mvn test

# Run a specific test class
mvn test -Dtest=AnnosaurusFactoryIntegrationTest

# Generate javadocs
mvn javadoc:javadoc

# Skip tests during build
mvn clean install -DskipTests
```

## Architecture

### Dual-API Design

The SDK provides two distinct API surfaces for different use cases:

**Kiota API (Auto-generated)** - `org.mbari.vars.annosaurus.sdk.kiota`
- 224 auto-generated files from OpenAPI specification
- Models use "SC" suffix (e.g., `AnnotationSC`, `AnnotationCreateSC`)
- Fluent builder pattern: `annosaurus.v1().annotations().post(annotation)`
- Strong typing with generated request/response builders
- Entry point: `AnnosaurusFactory.create(baseUrl, apiKey)`

**AnnotationService API (Custom)** - `org.mbari.vars.annosaurus.sdk.r1`
- 47 custom implementation files
- Models without "SC" suffix (e.g., `Annotation`, `Association`)
- Method-based interface with `CompletableFuture` returns
- Custom GSON serialization with type adapters
- Entry point: `new AnnosaurusHttpClient(baseUrl, duration, apiKey)`

### Key Components

- **AnnosaurusFactory** - Factory for creating Kiota clients
- **AnnosaurusAccessTokenProvider** - JWT token management for Kiota
- **AnnosaurusHttpClient** - Primary AnnotationService implementation
- **AnnosaurusKiotaClient** - Adapter wrapping Kiota client
- **JwtHttpClient** - JWT token lifecycle management
- **BaseHttpClient** - Abstract HTTP operations base

### VCR4J Integration

The SDK integrates with [VCR4J](https://github.com/mbari-org/vcr4j) for video metadata:

- `ImagedMoment` interface bridges VCR4J `VideoIndex` and annotation models
- Implemented by: `Annotation`, `Image`, `Index`
- Provides: `toVideoIndex()` conversion method
- Handles: timecode, recordedTimestamp, elapsedTime

## Regenerating the Kiota SDK

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

## License

Apache License 2.0 - See LICENSE file for details.

## Contributing

This project is maintained by [MBARI](https://www.mbari.org). For questions or issues, please open an issue on GitHub.
