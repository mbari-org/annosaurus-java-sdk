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
public class ImagedMomentSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ancillary_data property
     */
    private CachedAncillaryDatumSC ancillaryData;
    /**
     * The elapsed_time_millis property
     */
    private Long elapsedTimeMillis;
    /**
     * The image_references property
     */
    private java.util.List<ImageReferenceSC> imageReferences;
    /**
     * The last_updated_time property
     */
    private String lastUpdatedTime;
    /**
     * The observations property
     */
    private java.util.List<ObservationSC> observations;
    /**
     * The recorded_timestamp property
     */
    private String recordedTimestamp;
    /**
     * The timecode property
     */
    private String timecode;
    /**
     * The uuid property
     */
    private UUID uuid;
    /**
     * The video_reference_uuid property
     */
    private UUID videoReferenceUuid;
    /**
     * Instantiates a new {@link ImagedMomentSC} and sets the default values.
     */
    public ImagedMomentSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ImagedMomentSC}
     */
    @jakarta.annotation.Nonnull
    public static ImagedMomentSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImagedMomentSC();
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
     * Gets the ancillary_data property value. The ancillary_data property
     * @return a {@link CachedAncillaryDatumSC}
     */
    @jakarta.annotation.Nullable
    public CachedAncillaryDatumSC getAncillaryData() {
        return this.ancillaryData;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("ancillary_data", (n) -> { this.setAncillaryData(n.getObjectValue(CachedAncillaryDatumSC::createFromDiscriminatorValue)); });
        deserializerMap.put("elapsed_time_millis", (n) -> { this.setElapsedTimeMillis(n.getLongValue()); });
        deserializerMap.put("image_references", (n) -> { this.setImageReferences(n.getCollectionOfObjectValues(ImageReferenceSC::createFromDiscriminatorValue)); });
        deserializerMap.put("last_updated_time", (n) -> { this.setLastUpdatedTime(n.getStringValue()); });
        deserializerMap.put("observations", (n) -> { this.setObservations(n.getCollectionOfObjectValues(ObservationSC::createFromDiscriminatorValue)); });
        deserializerMap.put("recorded_timestamp", (n) -> { this.setRecordedTimestamp(n.getStringValue()); });
        deserializerMap.put("timecode", (n) -> { this.setTimecode(n.getStringValue()); });
        deserializerMap.put("uuid", (n) -> { this.setUuid(n.getUUIDValue()); });
        deserializerMap.put("video_reference_uuid", (n) -> { this.setVideoReferenceUuid(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the image_references property value. The image_references property
     * @return a {@link java.util.List<ImageReferenceSC>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ImageReferenceSC> getImageReferences() {
        return this.imageReferences;
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
     * Gets the observations property value. The observations property
     * @return a {@link java.util.List<ObservationSC>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ObservationSC> getObservations() {
        return this.observations;
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
     * Gets the uuid property value. The uuid property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getUuid() {
        return this.uuid;
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
        writer.writeObjectValue("ancillary_data", this.getAncillaryData());
        writer.writeLongValue("elapsed_time_millis", this.getElapsedTimeMillis());
        writer.writeCollectionOfObjectValues("image_references", this.getImageReferences());
        writer.writeStringValue("last_updated_time", this.getLastUpdatedTime());
        writer.writeCollectionOfObjectValues("observations", this.getObservations());
        writer.writeStringValue("recorded_timestamp", this.getRecordedTimestamp());
        writer.writeStringValue("timecode", this.getTimecode());
        writer.writeUUIDValue("uuid", this.getUuid());
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
     * Sets the ancillary_data property value. The ancillary_data property
     * @param value Value to set for the ancillary_data property.
     */
    public void setAncillaryData(@jakarta.annotation.Nullable final CachedAncillaryDatumSC value) {
        this.ancillaryData = value;
    }
    /**
     * Sets the elapsed_time_millis property value. The elapsed_time_millis property
     * @param value Value to set for the elapsed_time_millis property.
     */
    public void setElapsedTimeMillis(@jakarta.annotation.Nullable final Long value) {
        this.elapsedTimeMillis = value;
    }
    /**
     * Sets the image_references property value. The image_references property
     * @param value Value to set for the image_references property.
     */
    public void setImageReferences(@jakarta.annotation.Nullable final java.util.List<ImageReferenceSC> value) {
        this.imageReferences = value;
    }
    /**
     * Sets the last_updated_time property value. The last_updated_time property
     * @param value Value to set for the last_updated_time property.
     */
    public void setLastUpdatedTime(@jakarta.annotation.Nullable final String value) {
        this.lastUpdatedTime = value;
    }
    /**
     * Sets the observations property value. The observations property
     * @param value Value to set for the observations property.
     */
    public void setObservations(@jakarta.annotation.Nullable final java.util.List<ObservationSC> value) {
        this.observations = value;
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
     * Sets the uuid property value. The uuid property
     * @param value Value to set for the uuid property.
     */
    public void setUuid(@jakarta.annotation.Nullable final UUID value) {
        this.uuid = value;
    }
    /**
     * Sets the video_reference_uuid property value. The video_reference_uuid property
     * @param value Value to set for the video_reference_uuid property.
     */
    public void setVideoReferenceUuid(@jakarta.annotation.Nullable final UUID value) {
        this.videoReferenceUuid = value;
    }
}
