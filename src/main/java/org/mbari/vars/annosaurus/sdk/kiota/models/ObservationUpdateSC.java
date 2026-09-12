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
public class ObservationUpdateSC implements AdditionalDataHolder, Parsable {
    /**
     * The activity property
     */
    private String activity;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The concept property
     */
    private String concept;
    /**
     * The duration_millis property
     */
    private Long durationMillis;
    /**
     * The group property
     */
    private String group;
    /**
     * The imaged_moment_uuid property
     */
    private UUID imagedMomentUuid;
    /**
     * The observation_timestamp property
     */
    private String observationTimestamp;
    /**
     * The observer property
     */
    private String observer;
    /**
     * Instantiates a new {@link ObservationUpdateSC} and sets the default values.
     */
    public ObservationUpdateSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ObservationUpdateSC}
     */
    @jakarta.annotation.Nonnull
    public static ObservationUpdateSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ObservationUpdateSC();
    }
    /**
     * Gets the activity property value. The activity property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActivity() {
        return this.activity;
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
     * Gets the duration_millis property value. The duration_millis property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getDurationMillis() {
        return this.durationMillis;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getStringValue()); });
        deserializerMap.put("concept", (n) -> { this.setConcept(n.getStringValue()); });
        deserializerMap.put("duration_millis", (n) -> { this.setDurationMillis(n.getLongValue()); });
        deserializerMap.put("group", (n) -> { this.setGroup(n.getStringValue()); });
        deserializerMap.put("imaged_moment_uuid", (n) -> { this.setImagedMomentUuid(n.getUUIDValue()); });
        deserializerMap.put("observation_timestamp", (n) -> { this.setObservationTimestamp(n.getStringValue()); });
        deserializerMap.put("observer", (n) -> { this.setObserver(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. The group property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGroup() {
        return this.group;
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
     * Gets the observation_timestamp property value. The observation_timestamp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getObservationTimestamp() {
        return this.observationTimestamp;
    }
    /**
     * Gets the observer property value. The observer property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getObserver() {
        return this.observer;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("activity", this.getActivity());
        writer.writeStringValue("concept", this.getConcept());
        writer.writeLongValue("duration_millis", this.getDurationMillis());
        writer.writeStringValue("group", this.getGroup());
        writer.writeUUIDValue("imaged_moment_uuid", this.getImagedMomentUuid());
        writer.writeStringValue("observation_timestamp", this.getObservationTimestamp());
        writer.writeStringValue("observer", this.getObserver());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activity property value. The activity property
     * @param value Value to set for the activity property.
     */
    public void setActivity(@jakarta.annotation.Nullable final String value) {
        this.activity = value;
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
     * Sets the duration_millis property value. The duration_millis property
     * @param value Value to set for the duration_millis property.
     */
    public void setDurationMillis(@jakarta.annotation.Nullable final Long value) {
        this.durationMillis = value;
    }
    /**
     * Sets the group property value. The group property
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final String value) {
        this.group = value;
    }
    /**
     * Sets the imaged_moment_uuid property value. The imaged_moment_uuid property
     * @param value Value to set for the imaged_moment_uuid property.
     */
    public void setImagedMomentUuid(@jakarta.annotation.Nullable final UUID value) {
        this.imagedMomentUuid = value;
    }
    /**
     * Sets the observation_timestamp property value. The observation_timestamp property
     * @param value Value to set for the observation_timestamp property.
     */
    public void setObservationTimestamp(@jakarta.annotation.Nullable final String value) {
        this.observationTimestamp = value;
    }
    /**
     * Sets the observer property value. The observer property
     * @param value Value to set for the observer property.
     */
    public void setObserver(@jakarta.annotation.Nullable final String value) {
        this.observer = value;
    }
}
