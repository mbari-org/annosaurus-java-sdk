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

/**
 * @author Brian Schlining
 * @since 2019-11-12T11:00:00
 */
public class CachedVideoReference {

    private String missionContact;
    private String platformName;
    private UUID videoReferenceUuid;
    private String missionId;
    private UUID uuid;

    public CachedVideoReference(String missionContact, String platformName,
                                UUID videoReferenceUuid, String missionId,
                                UUID uuid) {
        this.missionContact = missionContact;
        this.platformName = platformName;
        this.videoReferenceUuid = videoReferenceUuid;
        this.missionId = missionId;
        this.uuid = uuid;
    }

    public String getMissionContact() {
        return missionContact;
    }

    public String getPlatformName() {
        return platformName;
    }

    public UUID getVideoReferenceUuid() {
        return videoReferenceUuid;
    }

    public String getMissionId() {
        return missionId;
    }


    public UUID getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CachedVideoReference that = (CachedVideoReference) o;

        return uuid.equals(that.uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }

    @Override
    public String toString() {
        return "CachedVideoReference{" +
                "missionContact='" + missionContact + '\'' +
                ", missionId='" + missionId + '\'' +
                '}';
    }
}
