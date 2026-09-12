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
public class ConcurrentRequestSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The end_timestamp property
     */
    private String endTimestamp;
    /**
     * The start_timestamp property
     */
    private String startTimestamp;
    /**
     * The video_reference_uuids property
     */
    private java.util.List<UUID> videoReferenceUuids;
    /**
     * Instantiates a new {@link ConcurrentRequestSC} and sets the default values.
     */
    public ConcurrentRequestSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConcurrentRequestSC}
     */
    @jakarta.annotation.Nonnull
    public static ConcurrentRequestSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConcurrentRequestSC();
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
     * Gets the end_timestamp property value. The end_timestamp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEndTimestamp() {
        return this.endTimestamp;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("end_timestamp", (n) -> { this.setEndTimestamp(n.getStringValue()); });
        deserializerMap.put("start_timestamp", (n) -> { this.setStartTimestamp(n.getStringValue()); });
        deserializerMap.put("video_reference_uuids", (n) -> { this.setVideoReferenceUuids(n.getCollectionOfPrimitiveValues(UUID.class)); });
        return deserializerMap;
    }
    /**
     * Gets the start_timestamp property value. The start_timestamp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStartTimestamp() {
        return this.startTimestamp;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("end_timestamp", this.getEndTimestamp());
        writer.writeStringValue("start_timestamp", this.getStartTimestamp());
        writer.writeCollectionOfPrimitiveValues("video_reference_uuids", this.getVideoReferenceUuids());
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
     * Sets the end_timestamp property value. The end_timestamp property
     * @param value Value to set for the end_timestamp property.
     */
    public void setEndTimestamp(@jakarta.annotation.Nullable final String value) {
        this.endTimestamp = value;
    }
    /**
     * Sets the start_timestamp property value. The start_timestamp property
     * @param value Value to set for the start_timestamp property.
     */
    public void setStartTimestamp(@jakarta.annotation.Nullable final String value) {
        this.startTimestamp = value;
    }
    /**
     * Sets the video_reference_uuids property value. The video_reference_uuids property
     * @param value Value to set for the video_reference_uuids property.
     */
    public void setVideoReferenceUuids(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.videoReferenceUuids = value;
    }
}
