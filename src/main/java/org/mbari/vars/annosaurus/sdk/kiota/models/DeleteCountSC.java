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
public class DeleteCountSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ancillary_data_count property
     */
    private Integer ancillaryDataCount;
    /**
     * The association_count property
     */
    private Integer associationCount;
    /**
     * The error_message property
     */
    private String errorMessage;
    /**
     * The imaged_moment_count property
     */
    private Integer imagedMomentCount;
    /**
     * The image_reference_count property
     */
    private Integer imageReferenceCount;
    /**
     * The observation_count property
     */
    private Integer observationCount;
    /**
     * The video_reference_uuid property
     */
    private UUID videoReferenceUuid;
    /**
     * Instantiates a new {@link DeleteCountSC} and sets the default values.
     */
    public DeleteCountSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeleteCountSC}
     */
    @jakarta.annotation.Nonnull
    public static DeleteCountSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeleteCountSC();
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
     * Gets the ancillary_data_count property value. The ancillary_data_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAncillaryDataCount() {
        return this.ancillaryDataCount;
    }
    /**
     * Gets the association_count property value. The association_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAssociationCount() {
        return this.associationCount;
    }
    /**
     * Gets the error_message property value. The error_message property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("ancillary_data_count", (n) -> { this.setAncillaryDataCount(n.getIntegerValue()); });
        deserializerMap.put("association_count", (n) -> { this.setAssociationCount(n.getIntegerValue()); });
        deserializerMap.put("error_message", (n) -> { this.setErrorMessage(n.getStringValue()); });
        deserializerMap.put("imaged_moment_count", (n) -> { this.setImagedMomentCount(n.getIntegerValue()); });
        deserializerMap.put("image_reference_count", (n) -> { this.setImageReferenceCount(n.getIntegerValue()); });
        deserializerMap.put("observation_count", (n) -> { this.setObservationCount(n.getIntegerValue()); });
        deserializerMap.put("video_reference_uuid", (n) -> { this.setVideoReferenceUuid(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the imaged_moment_count property value. The imaged_moment_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getImagedMomentCount() {
        return this.imagedMomentCount;
    }
    /**
     * Gets the image_reference_count property value. The image_reference_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getImageReferenceCount() {
        return this.imageReferenceCount;
    }
    /**
     * Gets the observation_count property value. The observation_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getObservationCount() {
        return this.observationCount;
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
        writer.writeIntegerValue("ancillary_data_count", this.getAncillaryDataCount());
        writer.writeIntegerValue("association_count", this.getAssociationCount());
        writer.writeStringValue("error_message", this.getErrorMessage());
        writer.writeIntegerValue("imaged_moment_count", this.getImagedMomentCount());
        writer.writeIntegerValue("image_reference_count", this.getImageReferenceCount());
        writer.writeIntegerValue("observation_count", this.getObservationCount());
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
     * Sets the ancillary_data_count property value. The ancillary_data_count property
     * @param value Value to set for the ancillary_data_count property.
     */
    public void setAncillaryDataCount(@jakarta.annotation.Nullable final Integer value) {
        this.ancillaryDataCount = value;
    }
    /**
     * Sets the association_count property value. The association_count property
     * @param value Value to set for the association_count property.
     */
    public void setAssociationCount(@jakarta.annotation.Nullable final Integer value) {
        this.associationCount = value;
    }
    /**
     * Sets the error_message property value. The error_message property
     * @param value Value to set for the error_message property.
     */
    public void setErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.errorMessage = value;
    }
    /**
     * Sets the imaged_moment_count property value. The imaged_moment_count property
     * @param value Value to set for the imaged_moment_count property.
     */
    public void setImagedMomentCount(@jakarta.annotation.Nullable final Integer value) {
        this.imagedMomentCount = value;
    }
    /**
     * Sets the image_reference_count property value. The image_reference_count property
     * @param value Value to set for the image_reference_count property.
     */
    public void setImageReferenceCount(@jakarta.annotation.Nullable final Integer value) {
        this.imageReferenceCount = value;
    }
    /**
     * Sets the observation_count property value. The observation_count property
     * @param value Value to set for the observation_count property.
     */
    public void setObservationCount(@jakarta.annotation.Nullable final Integer value) {
        this.observationCount = value;
    }
    /**
     * Sets the video_reference_uuid property value. The video_reference_uuid property
     * @param value Value to set for the video_reference_uuid property.
     */
    public void setVideoReferenceUuid(@jakarta.annotation.Nullable final UUID value) {
        this.videoReferenceUuid = value;
    }
}
