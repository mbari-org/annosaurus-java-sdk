package org.mbari.vars.annosaurus.sdk;

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

import org.junit.jupiter.api.Test;
import org.mbari.vars.annosaurus.sdk.kiota.models.AnnotationCreateSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.AnnotationSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.MultiRequestSC;


import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.UUID;

public class AnnosaurusFactoryIT {
    String baseUrl = "https://gehenna.shore.mbari.org/anno";
    String apiKey = "foofoo";
  
    @Test
    void fastGetTest() {
      var annosaurus = AnnosaurusFactory.create(baseUrl, apiKey);
      List<AnnotationSC> annos = annosaurus.v1().fast().get(gcr -> gcr.queryParameters.limit = 10000);
      assertNotNull(annos);
      assertTrue(annos.size() > 0);
    }
  
    @Test
    void fastMultiRequestTest() {
      var annosaurus = AnnosaurusFactory.create(baseUrl, apiKey);
      var multiRequest = new MultiRequestSC();
      multiRequest.setVideoReferenceUuids(List.of(UUID.fromString("feefe228-c503-4add-ae19-9cd713ee2175")));
      var annos = annosaurus.v1().fast().multi().post(multiRequest);
      assertNotNull(annos);
      assertTrue(annos.size() > 0);
    }
  
    @Test
    void testCreateAnnotation() {
      var annosaurus = AnnosaurusFactory.create(baseUrl, apiKey);
      var annotation = new AnnotationCreateSC();
      annotation.setConcept("Concept");
      annotation.setObserver("Observer");
      annotation.setObservationTimestamp("2021-09-01T00:00:00Z");
      annotation.setVideoReferenceUuid(UUID.fromString("feefe228-c503-4add-ae19-9cd713ee2175"));
      var created = annosaurus.v1().annotations().post(annotation);
      assertNotNull(created);
      assertNotNull(created.getObservationUuid());
    }
}

