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

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class Observation {
    private String concept;
    private Instant observationTimestamp;
    private String observer;
    private String group;
    private String activity;
    private List<Association> associations;
    private Instant lastUpdatedTime;
    private UUID uuid;

    public Observation() {

    }

    public Observation(String concept, Instant observationTimestamp, String observer, String group,
                       String activity, List<Association> associations, Instant lastUpdatedTime,
                       UUID uuid) {
        this.concept = concept;
        this.observationTimestamp = observationTimestamp;
        this.observer = observer;
        this.group = group;
        this.activity = activity;
        this.associations = associations;
        this.lastUpdatedTime = lastUpdatedTime;
        this.uuid = uuid;
    }

    public String getConcept() {
        return concept;
    }

    public Instant getObservationTimestamp() {
        return observationTimestamp;
    }

    public String getObserver() {
        return observer;
    }

    public String getGroup() {
        return group;
    }

    public String getActivity() {
        return activity;
    }

    public List<Association> getAssociations() {
        return associations;
    }

    public Instant getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public UUID getUuid() {
        return uuid;
    }
}
