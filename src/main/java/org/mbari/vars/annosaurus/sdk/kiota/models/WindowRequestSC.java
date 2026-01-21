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
public class WindowRequestSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The imaged_moment_uuid property
     */
    private UUID imagedMomentUuid;
    /**
     * The video_reference_uuids property
     */
    private java.util.List<UUID> videoReferenceUuids;
    /**
     * The window_millis property
     */
    private Long windowMillis;
    /**
     * Instantiates a new {@link WindowRequestSC} and sets the default values.
     */
    public WindowRequestSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowRequestSC}
     */
    @jakarta.annotation.Nonnull
    public static WindowRequestSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowRequestSC();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("imaged_moment_uuid", (n) -> { this.setImagedMomentUuid(n.getUUIDValue()); });
        deserializerMap.put("video_reference_uuids", (n) -> { this.setVideoReferenceUuids(n.getCollectionOfPrimitiveValues(UUID.class)); });
        deserializerMap.put("window_millis", (n) -> { this.setWindowMillis(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the imaged_moment_uuid property value. The imaged_moment_uuid property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getImagedMomentUuid() {
        return this.imagedMomentUuid;
    }
    /**
     * Gets the video_reference_uuids property value. The video_reference_uuids property
     * @return a {@link java.util.List<UUID>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getVideoReferenceUuids() {
        return this.videoReferenceUuids;
    }
    /**
     * Gets the window_millis property value. The window_millis property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getWindowMillis() {
        return this.windowMillis;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeUUIDValue("imaged_moment_uuid", this.getImagedMomentUuid());
        writer.writeCollectionOfPrimitiveValues("video_reference_uuids", this.getVideoReferenceUuids());
        writer.writeLongValue("window_millis", this.getWindowMillis());
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
     * Sets the imaged_moment_uuid property value. The imaged_moment_uuid property
     * @param value Value to set for the imaged_moment_uuid property.
     */
    public void setImagedMomentUuid(@jakarta.annotation.Nullable final UUID value) {
        this.imagedMomentUuid = value;
    }
    /**
     * Sets the video_reference_uuids property value. The video_reference_uuids property
     * @param value Value to set for the video_reference_uuids property.
     */
    public void setVideoReferenceUuids(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.videoReferenceUuids = value;
    }
    /**
     * Sets the window_millis property value. The window_millis property
     * @param value Value to set for the window_millis property.
     */
    public void setWindowMillis(@jakarta.annotation.Nullable final Long value) {
        this.windowMillis = value;
    }
}
