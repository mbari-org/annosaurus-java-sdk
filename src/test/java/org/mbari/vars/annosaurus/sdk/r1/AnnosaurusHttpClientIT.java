package org.mbari.vars.annosaurus.sdk.r1;

/*-
 * #%L
 * org.mbari.vars:annosaurus-java-sdk
 * %%
 * Copyright (C) 2025 - 2026 Monterey Bay Aquarium Research Institute
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;
public class AnnosaurusHttpClientIT {

    public static String baseUrl = "https://gehenna.shore.mbari.org/anno/v1";
    // public static String baseUrl = "https://localhost/anno/v1";
    public static String apiKey = "foofoo";

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
