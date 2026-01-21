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

import java.util.Collection;
import java.util.UUID;

public record ObservationsUpdate(Collection<UUID> observationUuids, String concept, String observer, String group, String activity) {


    public static ObservationsUpdate forActivity(Collection<UUID> observationUuids, String activity) {
        return new ObservationsUpdate(observationUuids, null, null, null, activity);
    }

    public static ObservationsUpdate forConcept(Collection<UUID> observationUuids, String concept) {
        return new ObservationsUpdate(observationUuids, concept, null, null, null);
    }

    public static ObservationsUpdate forGroup(Collection<UUID> observationUuids, String group) {
        return new ObservationsUpdate(observationUuids, null, null, group, null);
    }

    public static ObservationsUpdate forObserver(Collection<UUID> observationUuids, String observer) {
        return new ObservationsUpdate(observationUuids, null, observer, null, null);
    }

    public static ObservationsUpdate forConceptAndObserver(Collection<UUID> observationUuids, String concept, String observer) {
        return new ObservationsUpdate(observationUuids, concept, observer, null, null);
    }

    public ObservationsUpdate withConcept(String concept) {
        return new ObservationsUpdate(observationUuids, concept, observer, group, activity);
    }

    public ObservationsUpdate withObserver(String observer) {
        return new ObservationsUpdate(observationUuids, concept, observer, group, activity);
    }

}
