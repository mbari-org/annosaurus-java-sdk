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
public class ObservationSC implements AdditionalDataHolder, Parsable {
    /**
     * The activity property
     */
    private String activity;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The associations property
     */
    private java.util.List<AssociationSC> associations;
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
     * The last_updated_time property
     */
    private String lastUpdatedTime;
    /**
     * The observation_timestamp property
     */
    private String observationTimestamp;
    /**
     * The observer property
     */
    private String observer;
    /**
     * The uuid property
     */
    private UUID uuid;
    /**
     * Instantiates a new {@link ObservationSC} and sets the default values.
     */
    public ObservationSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ObservationSC}
     */
    @jakarta.annotation.Nonnull
    public static ObservationSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ObservationSC();
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
     * Gets the associations property value. The associations property
     * @return a {@link java.util.List<AssociationSC>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssociationSC> getAssociations() {
        return this.associations;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getStringValue()); });
        deserializerMap.put("associations", (n) -> { this.setAssociations(n.getCollectionOfObjectValues(AssociationSC::createFromDiscriminatorValue)); });
        deserializerMap.put("concept", (n) -> { this.setConcept(n.getStringValue()); });
        deserializerMap.put("duration_millis", (n) -> { this.setDurationMillis(n.getLongValue()); });
        deserializerMap.put("group", (n) -> { this.setGroup(n.getStringValue()); });
        deserializerMap.put("last_updated_time", (n) -> { this.setLastUpdatedTime(n.getStringValue()); });
        deserializerMap.put("observation_timestamp", (n) -> { this.setObservationTimestamp(n.getStringValue()); });
        deserializerMap.put("observer", (n) -> { this.setObserver(n.getStringValue()); });
        deserializerMap.put("uuid", (n) -> { this.setUuid(n.getUUIDValue()); });
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
     * Gets the last_updated_time property value. The last_updated_time property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
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
     * Gets the uuid property value. The uuid property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getUuid() {
        return this.uuid;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("activity", this.getActivity());
        writer.writeCollectionOfObjectValues("associations", this.getAssociations());
        writer.writeStringValue("concept", this.getConcept());
        writer.writeLongValue("duration_millis", this.getDurationMillis());
        writer.writeStringValue("group", this.getGroup());
        writer.writeStringValue("last_updated_time", this.getLastUpdatedTime());
        writer.writeStringValue("observation_timestamp", this.getObservationTimestamp());
        writer.writeStringValue("observer", this.getObserver());
        writer.writeUUIDValue("uuid", this.getUuid());
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
     * Sets the associations property value. The associations property
     * @param value Value to set for the associations property.
     */
    public void setAssociations(@jakarta.annotation.Nullable final java.util.List<AssociationSC> value) {
        this.associations = value;
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
     * Sets the last_updated_time property value. The last_updated_time property
     * @param value Value to set for the last_updated_time property.
     */
    public void setLastUpdatedTime(@jakarta.annotation.Nullable final String value) {
        this.lastUpdatedTime = value;
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
    /**
     * Sets the uuid property value. The uuid property
     * @param value Value to set for the uuid property.
     */
    public void setUuid(@jakarta.annotation.Nullable final UUID value) {
        this.uuid = value;
    }
}
