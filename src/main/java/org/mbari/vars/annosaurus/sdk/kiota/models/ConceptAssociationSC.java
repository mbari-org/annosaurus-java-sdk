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
public class ConceptAssociationSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The concept property
     */
    private String concept;
    /**
     * The link_name property
     */
    private String linkName;
    /**
     * The link_value property
     */
    private String linkValue;
    /**
     * The mime_type property
     */
    private String mimeType;
    /**
     * The to_concept property
     */
    private String toConcept;
    /**
     * The uuid property
     */
    private UUID uuid;
    /**
     * The video_reference_uuid property
     */
    private UUID videoReferenceUuid;
    /**
     * Instantiates a new {@link ConceptAssociationSC} and sets the default values.
     */
    public ConceptAssociationSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConceptAssociationSC}
     */
    @jakarta.annotation.Nonnull
    public static ConceptAssociationSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConceptAssociationSC();
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
     * Gets the concept property value. The concept property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConcept() {
        return this.concept;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("concept", (n) -> { this.setConcept(n.getStringValue()); });
        deserializerMap.put("link_name", (n) -> { this.setLinkName(n.getStringValue()); });
        deserializerMap.put("link_value", (n) -> { this.setLinkValue(n.getStringValue()); });
        deserializerMap.put("mime_type", (n) -> { this.setMimeType(n.getStringValue()); });
        deserializerMap.put("to_concept", (n) -> { this.setToConcept(n.getStringValue()); });
        deserializerMap.put("uuid", (n) -> { this.setUuid(n.getUUIDValue()); });
        deserializerMap.put("video_reference_uuid", (n) -> { this.setVideoReferenceUuid(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the link_name property value. The link_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLinkName() {
        return this.linkName;
    }
    /**
     * Gets the link_value property value. The link_value property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLinkValue() {
        return this.linkValue;
    }
    /**
     * Gets the mime_type property value. The mime_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMimeType() {
        return this.mimeType;
    }
    /**
     * Gets the to_concept property value. The to_concept property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getToConcept() {
        return this.toConcept;
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
        writer.writeStringValue("concept", this.getConcept());
        writer.writeStringValue("link_name", this.getLinkName());
        writer.writeStringValue("link_value", this.getLinkValue());
        writer.writeStringValue("mime_type", this.getMimeType());
        writer.writeStringValue("to_concept", this.getToConcept());
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
     * Sets the concept property value. The concept property
     * @param value Value to set for the concept property.
     */
    public void setConcept(@jakarta.annotation.Nullable final String value) {
        this.concept = value;
    }
    /**
     * Sets the link_name property value. The link_name property
     * @param value Value to set for the link_name property.
     */
    public void setLinkName(@jakarta.annotation.Nullable final String value) {
        this.linkName = value;
    }
    /**
     * Sets the link_value property value. The link_value property
     * @param value Value to set for the link_value property.
     */
    public void setLinkValue(@jakarta.annotation.Nullable final String value) {
        this.linkValue = value;
    }
    /**
     * Sets the mime_type property value. The mime_type property
     * @param value Value to set for the mime_type property.
     */
    public void setMimeType(@jakarta.annotation.Nullable final String value) {
        this.mimeType = value;
    }
    /**
     * Sets the to_concept property value. The to_concept property
     * @param value Value to set for the to_concept property.
     */
    public void setToConcept(@jakarta.annotation.Nullable final String value) {
        this.toConcept = value;
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
