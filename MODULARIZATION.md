# Java Platform Module System (JPMS) Modularization

## Current Status: AUTOMATIC MODULE ✓

This SDK is published as an **automatic module** with the name `org.mbari.vars.annosaurus.sdk`. This allows it to be used on the module path without requiring full JPMS modularization (no `module-info.java`).

### What This Means

- ✅ Your JAR can be used on the module path with a stable module name
- ✅ Consumers can use `requires org.mbari.vars.annosaurus.sdk;` in their `module-info.java`
- ✅ The SDK works on both classpath (traditional) and module path (JPMS)
- ⚠️ The SDK does not have a full `module-info.java` due to Kiota dependency limitations

## The Problem

All Microsoft Kiota JARs (abstractions, http-okHttp, serialization-json, serialization-text, etc.) share the **same automatic module name**: `com.microsoft.kiota`. This violates JPMS requirements where each module must have a unique name.

When you try to use multiple Kiota JARs on the module path, you get:

```
package com.microsoft.kiota.http does not exist
package com.microsoft.kiota.serialization does not exist
```

## Why This Happens

Run `jar --describe-module --file <kiota-jar>` on any Kiota JAR:
```bash
$ jar --describe-module --file microsoft-kiota-abstractions-1.8.0.jar
No module descriptor found. Derived automatic module.
com.microsoft.kiota@1.8.0 automatic
...

$ jar --describe-module --file microsoft-kiota-http-okHttp-1.8.0.jar
No module descriptor found. Derived automatic module.
com.microsoft.kiota@1.8.0 automatic  # Same name!
...
```

JPMS requires unique module names. Multiple JARs with the same module name cannot coexist on the module path.

## How We Achieved This

The SDK uses the `Automatic-Module-Name` manifest entry, configured in `pom.xml`:

```xml
<plugin>
  <artifactId>maven-jar-plugin</artifactId>
  <configuration>
    <archive>
      <manifestEntries>
        <Automatic-Module-Name>org.mbari.vars.annosaurus.sdk</Automatic-Module-Name>
      </manifestEntries>
    </archive>
  </configuration>
</plugin>
```

This gives the JAR a stable, predictable module name without requiring `module-info.java`.

## Solutions for Full Modularization (Future)

### Option 1: Use as Automatic Module (CURRENT APPROACH) ✓

**Status: IMPLEMENTED**

Use `Automatic-Module-Name` in MANIFEST.MF to provide a stable module name.

- Pros: Simple, works on both classpath and module path, stable module name
- Cons: Not a "real" module (no explicit requires/exports), limited encapsulation

**What to do**: Already done! The JAR is published with automatic module name.

---

### Option 2: Create an Uber-JAR with Maven Shade Plugin

**Status: WORKING SOLUTION**

Merge all Kiota JARs into a single JAR with a unified module descriptor.

#### Implementation:

Add to `pom.xml`:

```xml
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-shade-plugin</artifactId>
  <version>3.5.1</version>
  <executions>
    <execution>
      <phase>package</phase>
      <goals>
        <goal>shade</goal>
      </goals>
      <configuration>
        <shadedArtifactAttached>false</shadedArtifactAttached>
        <createDependencyReducedPom>true</createDependencyReducedPom>
        <artifactSet>
          <includes>
            <include>com.microsoft.kiota:*</include>
          </includes>
        </artifactSet>
        <filters>
          <filter>
            <artifact>*:*</artifact>
            <excludes>
              <exclude>META-INF/maven/**</exclude>
              <exclude>META-INF/*.SF</exclude>
              <exclude>META-INF/*.DSA</exclude>
              <exclude>META-INF/*.RSA</exclude>
            </excludes>
          </filter>
        </filters>
        <transformers>
          <transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
            <manifestEntries>
              <Automatic-Module-Name>com.microsoft.kiota.merged</Automatic-Module-Name>
            </manifestEntries>
          </transformer>
        </transformers>
      </configuration>
    </execution>
  </executions>
</plugin>
```

Then enable `src/main/java/module-info.java.disabled` by renaming to `module-info.java`.

- Pros: Proper JPMS support, works at compile and runtime
- Cons: Creates larger JAR, may have conflicts, complicates dependency management

---

### Option 3: Use ModiTect Maven Plugin

**Status: COMPLEX**

Use ModiTect to patch module descriptors into each Kiota JAR with unique names.

Add to `pom.xml`:

```xml
<plugin>
  <groupId>org.moditect</groupId>
  <artifactId>moditect-maven-plugin</artifactId>
  <version>1.2.2.Final</version>
  <executions>
    <execution>
      <id>add-module-infos</id>
      <phase>package</phase>
      <goals>
        <goal>add-module-info</goal>
      </goals>
      <configuration>
        <outputDirectory>${project.build.directory}/modules</outputDirectory>
        <modules>
          <module>
            <artifact>
              <groupId>com.microsoft.kiota</groupId>
              <artifactId>microsoft-kiota-abstractions</artifactId>
            </artifact>
            <moduleInfoSource>
              module com.microsoft.kiota.abstractions {
                exports com.microsoft.kiota;
                exports com.microsoft.kiota.authentication;
                exports com.microsoft.kiota.serialization;
                exports com.microsoft.kiota.store;
                requires transitive java.net.http;
              }
            </moduleInfoSource>
          </module>
          <module>
            <artifact>
              <groupId>com.microsoft.kiota</groupId>
              <artifactId>microsoft-kiota-http-okHttp</artifactId>
            </artifact>
            <moduleInfoSource>
              module com.microsoft.kiota.http.okhttp {
                exports com.microsoft.kiota.http;
                exports com.microsoft.kiota.http.middleware;
                requires transitive com.microsoft.kiota.abstractions;
                requires transitive okhttp3;
              }
            </moduleInfoSource>
          </module>
          <!-- Add similar blocks for other Kiota artifacts -->
        </modules>
      </configuration>
    </execution>
  </executions>
</plugin>
```

Then configure Maven Compiler and Surefire to use the modularized JARs from `target/modules/`.

- Pros: Each module properly separated
- Cons: Very complex build configuration, runtime configuration needed

---

### Option 4: Wait for Upstream Fix

**Status: WAITING**

Track these issues:
- [Microsoft Kiota JPMS support](https://github.com/microsoft/kiota/issues)
- Consider filing a feature request if one doesn't exist

Once Kiota publishes proper modules with unique names:
1. Update dependencies to the modular versions
2. Rename `module-info.java.disabled` to `module-info.java`
3. Build should work without changes

---

## Files in This Repository

- `module-info.java.proposed` - Original attempt at module descriptor (won't compile)
- `module-info.java.disabled` - Updated module descriptor ready for future use
- `MODULARIZATION.md` - This document

## Recommended Next Steps

1. **For now**: Use the classpath-based build (no changes needed)
2. **If JPMS is required**: Implement Option 2 (Uber-JAR with Shade plugin)
3. **Long term**: Monitor Kiota for proper JPMS support and migrate when available

## Module Descriptor for Reference

When Kiota is fixed or if using Option 2/3, use this `module-info.java`:

```java
module org.mbari.vars.annosaurus.sdk {
    // Exports
    exports org.mbari.vars.annosaurus.sdk;
    exports org.mbari.vars.annosaurus.sdk.kiota;
    exports org.mbari.vars.annosaurus.sdk.kiota.models;
    exports org.mbari.vars.annosaurus.sdk.kiota.v1;
    exports org.mbari.vars.annosaurus.sdk.r1;
    exports org.mbari.vars.annosaurus.sdk.r1.models;
    exports org.mbari.vars.annosaurus.sdk.r1.etc.jdk;
    exports org.mbari.vars.annosaurus.sdk.r1.etc.gson;

    // Kiota (merged or properly modularized)
    requires transitive com.microsoft.kiota;  // or com.microsoft.kiota.merged if using Shade

    // HTTP clients
    requires okhttp3;
    requires okhttp3.logging;
    requires transitive methanol;

    // Other dependencies
    requires transitive com.google.gson;
    requires transitive vcr4j.core;
    requires com.auth0.jwt;
    requires jakarta.annotation;
    requires static org.jetbrains.annotations;

    // JDK modules
    requires java.net.http;
    requires java.desktop;  // for java.beans
}
```

## Testing Module Descriptor

To verify module configuration without breaking the build:

```bash
# Check if a JAR is modular
jar --describe-module --file <path-to-jar>

# List all modules on module path
java --list-modules --module-path target/

# Dry-run compilation with module-info
mvn clean compile -X
```
