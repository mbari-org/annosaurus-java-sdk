package org.mbari.vars.annosaurus.sdk.r1.models;

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

import java.util.UUID;

import org.mbari.vars.annosaurus.sdk.kiota.models.DeleteCountSC;

public record DeleteCount(
    UUID videoReferenceUuid,
    Integer ancillaryDataCount,
    Integer imageReferenceCount,
    Integer associationCount, 
    Integer observationCount) {


    public static DeleteCount fromKiota(DeleteCountSC sc) {
        return new DeleteCount(
            sc.getVideoReferenceUuid(),
            sc.getAncillaryDataCount(),
            sc.getImageReferenceCount(),
            sc.getAssociationCount(),
            sc.getObservationCount()
        );
    }
    
}
