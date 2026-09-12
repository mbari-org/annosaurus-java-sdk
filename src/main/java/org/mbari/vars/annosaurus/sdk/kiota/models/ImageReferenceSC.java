package org.mbari.vars.annosaurus.sdk.kiota.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImageReferenceSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The description property
     */
    private String description;
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
     * The last_updated_time property
     */
    private String lastUpdatedTime;
    /**
     * The url property
     */
    private String url;
    /**
     * The uuid property
     */
    private UUID uuid;
    /**
     * The width_pixels property
     */
    private Integer widthPixels;
    /**
     * Instantiates a new {@link ImageReferenceSC} and sets the default values.
     */
    public ImageReferenceSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ImageReferenceSC}
     */
    @jakarta.annotation.Nonnull
    public static ImageReferenceSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImageReferenceSC();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getStringValue()); });
        deserializerMap.put("height_pixels", (n) -> { this.setHeightPixels(n.getIntegerValue()); });
        deserializerMap.put("imaged_moment_uuid", (n) -> { this.setImagedMomentUuid(n.getUUIDValue()); });
        deserializerMap.put("last_updated_time", (n) -> { this.setLastUpdatedTime(n.getStringValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        deserializerMap.put("uuid", (n) -> { this.setUuid(n.getUUIDValue()); });
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
     * Gets the last_updated_time property value. The last_updated_time property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
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
     * Gets the uuid property value. The uuid property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getUuid() {
        return this.uuid;
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
        writer.writeStringValue("format", this.getFormat());
        writer.writeIntegerValue("height_pixels", this.getHeightPixels());
        writer.writeUUIDValue("imaged_moment_uuid", this.getImagedMomentUuid());
        writer.writeStringValue("last_updated_time", this.getLastUpdatedTime());
        writer.writeStringValue("url", this.getUrl());
        writer.writeUUIDValue("uuid", this.getUuid());
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
     * Sets the last_updated_time property value. The last_updated_time property
     * @param value Value to set for the last_updated_time property.
     */
    public void setLastUpdatedTime(@jakarta.annotation.Nullable final String value) {
        this.lastUpdatedTime = value;
    }
    /**
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
    /**
     * Sets the uuid property value. The uuid property
     * @param value Value to set for the uuid property.
     */
    public void setUuid(@jakarta.annotation.Nullable final UUID value) {
        this.uuid = value;
    }
    /**
     * Sets the width_pixels property value. The width_pixels property
     * @param value Value to set for the width_pixels property.
     */
    public void setWidthPixels(@jakarta.annotation.Nullable final Integer value) {
        this.widthPixels = value;
    }
}
