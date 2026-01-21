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

import org.mbari.vcr4j.VideoIndex;
import org.mbari.vcr4j.time.Timecode;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

/**
 * Interface that captures the bare-essentials of both an Image and an Annotation.
 *
 * @author Brian Schlining
 * @since 2017-06-02T08:11:00
 */
public interface ImagedMoment {

    UUID getVideoReferenceUuid();
    void setVideoReferenceUuid(UUID videoReferenceUuid);
    UUID getImagedMomentUuid();
    void setImagedMomentUuid(UUID imagedMomentUuid);
    Instant getRecordedTimestamp();
    void setRecordedTimestamp(Instant recordedTimestamp);
    Timecode getTimecode();
    void setTimecode(Timecode timecode);
    Duration getElapsedTime();
    void setElapsedTime(Duration elapsedTime);

    default VideoIndex toVideoIndex() {
        return new VideoIndex(Optional.ofNullable(getRecordedTimestamp()),
                Optional.ofNullable(getElapsedTime()),
                Optional.ofNullable(getTimecode()));
    }
}
