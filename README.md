# annosaurus-java-sdk

This is a client SDK for interacting with the [annosaurus](https://github.com/mbari-org/annosaurus) microservice. It's mostly auto-generated using [Kiota](https://learn.microsoft.com/en-us/openapi/kiota/overview).

## Usage

```xml
<dependency>
    <groupId>org.mbari.vars</groupId>
    <artifactId>annosaurus-java-sdk</artifactId>
    <version>0.0.1</version>
</dependency>
```

```java
var baseUrl = "http://localhost/anno/v1" // Substitute yoru services URL
var apiKey  = "foobar"                   // Substitute your services API KEY

// -- Kiota API
var annosaurus = AnnosaurusFactory.create(baseUrl, apiKey)

// Use the service! Some examples.
// Get 1000 annotations
List<AnnotationSC> annos = annosaurus.v1().fast().get(gcr -> gcr.queryParameters.limit = 10000);

// Request annotations by a video reference uuid (a unique key for a video)
var multiRequest = new MultiRequestSC();
multiRequest.setVideoReferenceUuids(List.of(UUID.fromString("feefe228-c503-4add-ae19-9cd713ee2175")));
var annos = annosaurus.v1().fast().multi().post(multiRequest);

// Create an annotation
var annosaurus = AnnosaurusFactory.create(baseUrl, apiKey);
var annotation = new AnnotationCreateSC();
annotation.setConcept("Concept");
annotation.setObserver("Observer");
annotation.setObservationTimestamp("2021-09-01T00:00:00Z");
annotation.setVideoReferenceUuid(UUID.fromString("feefe228-c503-4add-ae19-9cd713ee2175"));
var created = annosaurus.v1().annotations().post(annotation);

// -- AnnotationService APi
var annotationService = new AnnosaurusHttpClient(URI.create(baseUrl), apiKey);
List<String> groups = annotationService.findGroups();

```

## To regenerate the SDK

1. Copy the open api yaml file into each project's src/main/resources folder as docs.yaml
2. Some may need the openapi version changed to 3.0.0 as kiota does not support 3.1.0
3. Run the following command in the project's root directory

```shell
kiota generate -l java -c Annosaurus -n org.mbari.vars.annosaurus.sdk.kiota -d src/main/resources/docs.yaml -o ./src/main/java/org/mbari/vars/annosaurus/sdk/kiota
```
