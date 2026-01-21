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
public class MoveImagedMoments implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The imagedMomentUuids property
     */
    private java.util.List<UUID> imagedMomentUuids;
    /**
     * The videoReferenceUuid property
     */
    private UUID videoReferenceUuid;
    /**
     * Instantiates a new {@link MoveImagedMoments} and sets the default values.
     */
    public MoveImagedMoments() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MoveImagedMoments}
     */
    @jakarta.annotation.Nonnull
    public static MoveImagedMoments createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MoveImagedMoments();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("imagedMomentUuids", (n) -> { this.setImagedMomentUuids(n.getCollectionOfPrimitiveValues(UUID.class)); });
        deserializerMap.put("videoReferenceUuid", (n) -> { this.setVideoReferenceUuid(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the imagedMomentUuids property value. The imagedMomentUuids property
     * @return a {@link java.util.List<UUID>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getImagedMomentUuids() {
        return this.imagedMomentUuids;
    }
    /**
     * Gets the videoReferenceUuid property value. The videoReferenceUuid property
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
        writer.writeCollectionOfPrimitiveValues("imagedMomentUuids", this.getImagedMomentUuids());
        writer.writeUUIDValue("videoReferenceUuid", this.getVideoReferenceUuid());
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
     * Sets the imagedMomentUuids property value. The imagedMomentUuids property
     * @param value Value to set for the imagedMomentUuids property.
     */
    public void setImagedMomentUuids(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.imagedMomentUuids = value;
    }
    /**
     * Sets the videoReferenceUuid property value. The videoReferenceUuid property
     * @param value Value to set for the videoReferenceUuid property.
     */
    public void setVideoReferenceUuid(@jakarta.annotation.Nullable final UUID value) {
        this.videoReferenceUuid = value;
    }
}
