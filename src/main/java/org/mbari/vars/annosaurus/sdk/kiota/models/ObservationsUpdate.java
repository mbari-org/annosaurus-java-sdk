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
public class ObservationsUpdate implements AdditionalDataHolder, Parsable {
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
     * The group property
     */
    private String group;
    /**
     * The observationUuids property
     */
    private java.util.List<UUID> observationUuids;
    /**
     * The observer property
     */
    private String observer;
    /**
     * Instantiates a new {@link ObservationsUpdate} and sets the default values.
     */
    public ObservationsUpdate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ObservationsUpdate}
     */
    @jakarta.annotation.Nonnull
    public static ObservationsUpdate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ObservationsUpdate();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getStringValue()); });
        deserializerMap.put("concept", (n) -> { this.setConcept(n.getStringValue()); });
        deserializerMap.put("group", (n) -> { this.setGroup(n.getStringValue()); });
        deserializerMap.put("observationUuids", (n) -> { this.setObservationUuids(n.getCollectionOfPrimitiveValues(UUID.class)); });
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
     * Gets the observationUuids property value. The observationUuids property
     * @return a {@link java.util.List<UUID>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getObservationUuids() {
        return this.observationUuids;
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
        writer.writeStringValue("group", this.getGroup());
        writer.writeCollectionOfPrimitiveValues("observationUuids", this.getObservationUuids());
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
     * Sets the group property value. The group property
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final String value) {
        this.group = value;
    }
    /**
     * Sets the observationUuids property value. The observationUuids property
     * @param value Value to set for the observationUuids property.
     */
    public void setObservationUuids(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.observationUuids = value;
    }
    /**
     * Sets the observer property value. The observer property
     * @param value Value to set for the observer property.
     */
    public void setObserver(@jakarta.annotation.Nullable final String value) {
        this.observer = value;
    }
}
