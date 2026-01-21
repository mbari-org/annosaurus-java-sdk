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
public class ImageSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The description property
     */
    private String description;
    /**
     * The elapsed_time_millis property
     */
    private Long elapsedTimeMillis;
    /**
     * The format property
     */
    private String format;
    /**
     * The height_pixels property
     */
    private Integer heightPixels;
    /**
     * The imaged_moment_uuid property
     */
    private UUID imagedMomentUuid;
    /**
     * The image_reference_uuid property
     */
    private UUID imageReferenceUuid;
    /**
     * The recorded_timestamp property
     */
    private String recordedTimestamp;
    /**
     * The timecode property
     */
    private String timecode;
    /**
     * The url property
     */
    private String url;
    /**
     * The video_reference_uuid property
     */
    private UUID videoReferenceUuid;
    /**
     * The width_pixels property
     */
    private Integer widthPixels;
    /**
     * Instantiates a new {@link ImageSC} and sets the default values.
     */
    public ImageSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ImageSC}
     */
    @jakarta.annotation.Nonnull
    public static ImageSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImageSC();
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
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the elapsed_time_millis property value. The elapsed_time_millis property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getElapsedTimeMillis() {
        return this.elapsedTimeMillis;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("elapsed_time_millis", (n) -> { this.setElapsedTimeMillis(n.getLongValue()); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getStringValue()); });
        deserializerMap.put("height_pixels", (n) -> { this.setHeightPixels(n.getIntegerValue()); });
        deserializerMap.put("imaged_moment_uuid", (n) -> { this.setImagedMomentUuid(n.getUUIDValue()); });
        deserializerMap.put("image_reference_uuid", (n) -> { this.setImageReferenceUuid(n.getUUIDValue()); });
        deserializerMap.put("recorded_timestamp", (n) -> { this.setRecordedTimestamp(n.getStringValue()); });
        deserializerMap.put("timecode", (n) -> { this.setTimecode(n.getStringValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        deserializerMap.put("video_reference_uuid", (n) -> { this.setVideoReferenceUuid(n.getUUIDValue()); });
        deserializerMap.put("width_pixels", (n) -> { this.setWidthPixels(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. The format property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFormat() {
        return this.format;
    }
    /**
     * Gets the height_pixels property value. The height_pixels property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHeightPixels() {
        return this.heightPixels;
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
     * Gets the image_reference_uuid property value. The image_reference_uuid property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getImageReferenceUuid() {
        return this.imageReferenceUuid;
    }
    /**
     * Gets the recorded_timestamp property value. The recorded_timestamp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecordedTimestamp() {
        return this.recordedTimestamp;
    }
    /**
     * Gets the timecode property value. The timecode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimecode() {
        return this.timecode;
    }
    /**
     * Gets the url property value. The url property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.url;
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
     * Gets the width_pixels property value. The width_pixels property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWidthPixels() {
        return this.widthPixels;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeLongValue("elapsed_time_millis", this.getElapsedTimeMillis());
        writer.writeStringValue("format", this.getFormat());
        writer.writeIntegerValue("height_pixels", this.getHeightPixels());
        writer.writeUUIDValue("imaged_moment_uuid", this.getImagedMomentUuid());
        writer.writeUUIDValue("image_reference_uuid", this.getImageReferenceUuid());
        writer.writeStringValue("recorded_timestamp", this.getRecordedTimestamp());
        writer.writeStringValue("timecode", this.getTimecode());
        writer.writeStringValue("url", this.getUrl());
        writer.writeUUIDValue("video_reference_uuid", this.getVideoReferenceUuid());
        writer.writeIntegerValue("width_pixels", this.getWidthPixels());
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
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the elapsed_time_millis property value. The elapsed_time_millis property
     * @param value Value to set for the elapsed_time_millis property.
     */
    public void setElapsedTimeMillis(@jakarta.annotation.Nullable final Long value) {
        this.elapsedTimeMillis = value;
    }
    /**
     * Sets the format property value. The format property
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final String value) {
        this.format = value;
    }
    /**
     * Sets the height_pixels property value. The height_pixels property
     * @param value Value to set for the height_pixels property.
     */
    public void setHeightPixels(@jakarta.annotation.Nullable final Integer value) {
        this.heightPixels = value;
    }
    /**
     * Sets the imaged_moment_uuid property value. The imaged_moment_uuid property
     * @param value Value to set for the imaged_moment_uuid property.
     */
    public void setImagedMomentUuid(@jakarta.annotation.Nullable final UUID value) {
        this.imagedMomentUuid = value;
    }
    /**
     * Sets the image_reference_uuid property value. The image_reference_uuid property
     * @param value Value to set for the image_reference_uuid property.
     */
    public void setImageReferenceUuid(@jakarta.annotation.Nullable final UUID value) {
        this.imageReferenceUuid = value;
    }
    /**
     * Sets the recorded_timestamp property value. The recorded_timestamp property
     * @param value Value to set for the recorded_timestamp property.
     */
    public void setRecordedTimestamp(@jakarta.annotation.Nullable final String value) {
        this.recordedTimestamp = value;
    }
    /**
     * Sets the timecode property value. The timecode property
     * @param value Value to set for the timecode property.
     */
    public void setTimecode(@jakarta.annotation.Nullable final String value) {
        this.timecode = value;
    }
    /**
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
    /**
     * Sets the video_reference_uuid property value. The video_reference_uuid property
     * @param value Value to set for the video_reference_uuid property.
     */
    public void setVideoReferenceUuid(@jakarta.annotation.Nullable final UUID value) {
        this.videoReferenceUuid = value;
    }
    /**
     * Sets the width_pixels property value. The width_pixels property
     * @param value Value to set for the width_pixels property.
     */
    public void setWidthPixels(@jakarta.annotation.Nullable final Integer value) {
        this.widthPixels = value;
    }
}
