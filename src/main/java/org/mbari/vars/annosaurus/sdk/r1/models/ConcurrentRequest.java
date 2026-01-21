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
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/**
 * Data class for requesting annotations from multiple videos at the same time
 *
 * @author Brian Schlining
 * @since 2019-05-28T11:02:00
 */
public class ConcurrentRequest {

    private Instant startTimestamp;
    private Instant endTimestamp;
    private List<UUID> videoReferenceUuids;

    /**
     *
     * @param startTimestamp Filter out annotations before this date
     * @param endTimestamp Filter out annotations after this date
     * @param videoReferenceUuids A list of uuids for each video that we want
     *                            annotations from
     */
    public ConcurrentRequest(Instant startTimestamp, Instant endTimestamp, List<UUID> videoReferenceUuids) {
        this.startTimestamp = startTimestamp;
        this.endTimestamp = endTimestamp;
        this.videoReferenceUuids = Collections.unmodifiableList(videoReferenceUuids);
    }

    public Instant getStartTimestamp() {
        return startTimestamp;
    }

    public Instant getEndTimestamp() {
        return endTimestamp;
    }

    public List<UUID> getVideoReferenceUuids() {
        return videoReferenceUuids;
    }
}
