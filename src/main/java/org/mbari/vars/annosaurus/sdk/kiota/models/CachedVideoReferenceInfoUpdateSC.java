package org.mbari.vars.annosaurus.sdk.kiota.models;

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

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CachedVideoReferenceInfoUpdateSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The mission_contact property
     */
    private String missionContact;
    /**
     * The mission_id property
     */
    private String missionId;
    /**
     * The platform_name property
     */
    private String platformName;
    /**
     * The video_reference_uuid property
     */
    private UUID videoReferenceUuid;
    /**
     * Instantiates a new {@link CachedVideoReferenceInfoUpdateSC} and sets the default values.
     */
    public CachedVideoReferenceInfoUpdateSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CachedVideoReferenceInfoUpdateSC}
     */
    @jakarta.annotation.Nonnull
    public static CachedVideoReferenceInfoUpdateSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CachedVideoReferenceInfoUpdateSC();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("mission_contact", (n) -> { this.setMissionContact(n.getStringValue()); });
        deserializerMap.put("mission_id", (n) -> { this.setMissionId(n.getStringValue()); });
        deserializerMap.put("platform_name", (n) -> { this.setPlatformName(n.getStringValue()); });
        deserializerMap.put("video_reference_uuid", (n) -> { this.setVideoReferenceUuid(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mission_contact property value. The mission_contact property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMissionContact() {
        return this.missionContact;
    }
    /**
     * Gets the mission_id property value. The mission_id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMissionId() {
        return this.missionId;
    }
    /**
     * Gets the platform_name property value. The platform_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlatformName() {
        return this.platformName;
    }
    /**
     * Gets the video_reference_uuid property value. The video_reference_uuid property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getVideoReferenceUuid() {
        return this.videoReferenceUuid;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("mission_contact", this.getMissionContact());
        writer.writeStringValue("mission_id", this.getMissionId());
        writer.writeStringValue("platform_name", this.getPlatformName());
        writer.writeUUIDValue("video_reference_uuid", this.getVideoReferenceUuid());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the mission_contact property value. The mission_contact property
     * @param value Value to set for the mission_contact property.
     */
    public void setMissionContact(@jakarta.annotation.Nullable final String value) {
        this.missionContact = value;
    }
    /**
     * Sets the mission_id property value. The mission_id property
     * @param value Value to set for the mission_id property.
     */
    public void setMissionId(@jakarta.annotation.Nullable final String value) {
        this.missionId = value;
    }
    /**
     * Sets the platform_name property value. The platform_name property
     * @param value Value to set for the platform_name property.
     */
    public void setPlatformName(@jakarta.annotation.Nullable final String value) {
        this.platformName = value;
    }
    /**
     * Sets the video_reference_uuid property value. The video_reference_uuid property
     * @param value Value to set for the video_reference_uuid property.
     */
    public void setVideoReferenceUuid(@jakarta.annotation.Nullable final UUID value) {
        this.videoReferenceUuid = value;
    }
}
