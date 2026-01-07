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
    
}
