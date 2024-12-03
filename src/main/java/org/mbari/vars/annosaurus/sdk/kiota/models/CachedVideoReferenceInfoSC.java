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
public class CachedVideoReferenceInfoSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The last_updated property
     */
    private String lastUpdated;
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
     * The uuid property
     */
    private UUID uuid;
    /**
     * The video_reference_uuid property
     */
    private UUID videoReferenceUuid;
    /**
     * Instantiates a new {@link CachedVideoReferenceInfoSC} and sets the default values.
     */
    public CachedVideoReferenceInfoSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CachedVideoReferenceInfoSC}
     */
    @jakarta.annotation.Nonnull
    public static CachedVideoReferenceInfoSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CachedVideoReferenceInfoSC();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("last_updated", (n) -> { this.setLastUpdated(n.getStringValue()); });
        deserializerMap.put("mission_contact", (n) -> { this.setMissionContact(n.getStringValue()); });
        deserializerMap.put("mission_id", (n) -> { this.setMissionId(n.getStringValue()); });
        deserializerMap.put("platform_name", (n) -> { this.setPlatformName(n.getStringValue()); });
        deserializerMap.put("uuid", (n) -> { this.setUuid(n.getUUIDValue()); });
        deserializerMap.put("video_reference_uuid", (n) -> { this.setVideoReferenceUuid(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the last_updated property value. The last_updated property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastUpdated() {
        return this.lastUpdated;
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
        writer.writeStringValue("last_updated", this.getLastUpdated());
        writer.writeStringValue("mission_contact", this.getMissionContact());
        writer.writeStringValue("mission_id", this.getMissionId());
        writer.writeStringValue("platform_name", this.getPlatformName());
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
     * Sets the last_updated property value. The last_updated property
     * @param value Value to set for the last_updated property.
     */
    public void setLastUpdated(@jakarta.annotation.Nullable final String value) {
        this.lastUpdated = value;
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
