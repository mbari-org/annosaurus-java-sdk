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

import com.google.gson.annotations.SerializedName;
import org.mbari.vcr4j.VideoIndex;
import org.mbari.vcr4j.time.Timecode;

import java.time.Duration;
import java.time.Instant;
import java.util.UUID;

/**
 * @author Brian Schlining
 * @since 2019-02-08T15:03:00
 */
public class Index implements ImagedMoment {

    private UUID uuid;
    private UUID videoReferenceUuid;
    @SerializedName("elapsed_time_millis")
    private Duration elapsedTime;
    private Instant recordedTimestamp;
    private Timecode timecode;
    private Instant lastUpdatedTime;

    public Index() {
    }

    public Index(Index index) {
        this.uuid = index.uuid;
        this.videoReferenceUuid = index.videoReferenceUuid;
        this.elapsedTime = index.elapsedTime;
        this.recordedTimestamp = index.recordedTimestamp;
        this.timecode = index.timecode;
    }

    public Index(UUID uuid, UUID videoReferenceUuid, Duration elapsedTime) {
        this.uuid = uuid;
        this.videoReferenceUuid = videoReferenceUuid;
        this.elapsedTime = elapsedTime;
    }

    public Index(UUID uuid, UUID videoReferenceUuid, Instant recordedTimestamp) {
        this.uuid = uuid;
        this.videoReferenceUuid = videoReferenceUuid;
        this.recordedTimestamp = recordedTimestamp;
    }

    public Index(UUID uuid, UUID videoReferenceUuid, Timecode timecode) {
        this.uuid = uuid;
        this.videoReferenceUuid = videoReferenceUuid;
        this.timecode = timecode;
    }

    public Index(UUID uuid, UUID videoReferenceUuid, Duration elapsedTime, Instant recordedTimestamp, Timecode timecode) {
        this.uuid = uuid;
        this.videoReferenceUuid = videoReferenceUuid;
        this.elapsedTime = elapsedTime;
        this.recordedTimestamp = recordedTimestamp;
        this.timecode = timecode;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getImagedMomentUuid() {
        return uuid;
    }

    @Override
    public void setImagedMomentUuid(UUID imagedMomentUuid) {
        this.uuid = imagedMomentUuid;
    }

    public UUID getVideoReferenceUuid() {
        return videoReferenceUuid;
    }

    public void setVideoReferenceUuid(UUID videoReferenceUuid) {
        this.videoReferenceUuid = videoReferenceUuid;
    }

    public Duration getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Duration elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

//    @Override
//    public VideoIndex toVideoIndex() {
//        return ImagedMoment.super.toVideoIndex();
//    }

    public Instant getRecordedTimestamp() {
        return recordedTimestamp;
    }

    public void setRecordedTimestamp(Instant recordedTimestamp) {
        this.recordedTimestamp = recordedTimestamp;
    }

    public Timecode getTimecode() {
        return timecode;
    }

    public void setTimecode(Timecode timecode) {
        this.timecode = timecode;
    }

    public Instant getLastUpdatedTime() {
        return lastUpdatedTime;
    }
}
