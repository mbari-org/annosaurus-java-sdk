package org.mbari.vars.annosaurus.sdk.r1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;
public class AnnosaurusHttpClientIT {

    String baseUrl = "https://gehenna.shore.mbari.org/anno/v1";
    String apiKey = "foofoo";

    @Test
    void countObservationsByConcept() {
        var annotationService = new AnnosaurusHttpClient(baseUrl, Duration.ofSeconds(10), apiKey);
        var concept = "Nanomia bijuga";
        var future = annotationService.countObservationsByConcept(concept);
        var conceptCount = future.join();
        assertNotNull(conceptCount);
        assertEquals(concept, conceptCount.getConcept());
        assertTrue(conceptCount.getCount() > 0, "Expected count to be greater than 0, but was " + conceptCount.getCount());
    }

    @Test
    void countImagesByVideoReferenceUuid() {
        var annotationService = new AnnosaurusHttpClient(baseUrl, Duration.ofSeconds(10), apiKey);
        var videoReferenceUuid = java.util.UUID.fromString("89f95294-9c7a-48f2-8ef9-911991f1057f");
        var future = annotationService.countImagesByVideoReferenceUuid(videoReferenceUuid);
        var count = future.join();
        assertNotNull(count);
        assertTrue(count.count() > 0, "Expected count to be greater than 0, but was " + count.count());
    }

    @Test
    void findImagesByVideoReferenceUuid() {
        var annotationService = new AnnosaurusHttpClient(baseUrl, Duration.ofSeconds(10), apiKey);
        var videoReferenceUuid = java.util.UUID.fromString("89f95294-9c7a-48f2-8ef9-911991f1057f");
        var future = annotationService.findImagesByVideoReferenceUuid(videoReferenceUuid, 5L, 0L);
        var images = future.join();
        assertNotNull(images);
        assertTrue(images.size() > 0, "Expected more than 0 images but got " + images.size());
    }


    
}
