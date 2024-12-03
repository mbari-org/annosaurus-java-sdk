package org.mbari.vars.annosaurus.sdk.kiota.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConstraintRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The between property
     */
    private java.util.List<String> between;
    /**
     * The column property
     */
    private String column;
    /**
     * The contains property
     */
    private String contains;
    /**
     * The equals property
     */
    private String equalsEscaped;
    /**
     * The in property
     */
    private java.util.List<String> in;
    /**
     * The isnull property
     */
    private Boolean isnull;
    /**
     * The like property
     */
    private String like;
    /**
     * The max property
     */
    private Double max;
    /**
     * The min property
     */
    private Double min;
    /**
     * The minmax property
     */
    private java.util.List<Double> minmax;
    /**
     * Instantiates a new {@link ConstraintRequest} and sets the default values.
     */
    public ConstraintRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConstraintRequest}
     */
    @jakarta.annotation.Nonnull
    public static ConstraintRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConstraintRequest();
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
     * Gets the between property value. The between property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBetween() {
        return this.between;
    }
    /**
     * Gets the column property value. The column property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getColumn() {
        return this.column;
    }
    /**
     * Gets the contains property value. The contains property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContains() {
        return this.contains;
    }
    /**
     * Gets the equals property value. The equals property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEquals() {
        return this.equalsEscaped;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("between", (n) -> { this.setBetween(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("column", (n) -> { this.setColumn(n.getStringValue()); });
        deserializerMap.put("contains", (n) -> { this.setContains(n.getStringValue()); });
        deserializerMap.put("equals", (n) -> { this.setEquals(n.getStringValue()); });
        deserializerMap.put("in", (n) -> { this.setIn(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isnull", (n) -> { this.setIsnull(n.getBooleanValue()); });
        deserializerMap.put("like", (n) -> { this.setLike(n.getStringValue()); });
        deserializerMap.put("max", (n) -> { this.setMax(n.getDoubleValue()); });
        deserializerMap.put("min", (n) -> { this.setMin(n.getDoubleValue()); });
        deserializerMap.put("minmax", (n) -> { this.setMinmax(n.getCollectionOfPrimitiveValues(Double.class)); });
        return deserializerMap;
    }
    /**
     * Gets the in property value. The in property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIn() {
        return this.in;
    }
    /**
     * Gets the isnull property value. The isnull property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsnull() {
        return this.isnull;
    }
    /**
     * Gets the like property value. The like property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLike() {
        return this.like;
    }
    /**
     * Gets the max property value. The max property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMax() {
        return this.max;
    }
    /**
     * Gets the min property value. The min property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMin() {
        return this.min;
    }
    /**
     * Gets the minmax property value. The minmax property
     * @return a {@link java.util.List<Double>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Double> getMinmax() {
        return this.minmax;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("between", this.getBetween());
        writer.writeStringValue("column", this.getColumn());
        writer.writeStringValue("contains", this.getContains());
        writer.writeStringValue("equals", this.getEquals());
        writer.writeCollectionOfPrimitiveValues("in", this.getIn());
        writer.writeBooleanValue("isnull", this.getIsnull());
        writer.writeStringValue("like", this.getLike());
        writer.writeDoubleValue("max", this.getMax());
        writer.writeDoubleValue("min", this.getMin());
        writer.writeCollectionOfPrimitiveValues("minmax", this.getMinmax());
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
     * Sets the between property value. The between property
     * @param value Value to set for the between property.
     */
    public void setBetween(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.between = value;
    }
    /**
     * Sets the column property value. The column property
     * @param value Value to set for the column property.
     */
    public void setColumn(@jakarta.annotation.Nullable final String value) {
        this.column = value;
    }
    /**
     * Sets the contains property value. The contains property
     * @param value Value to set for the contains property.
     */
    public void setContains(@jakarta.annotation.Nullable final String value) {
        this.contains = value;
    }
    /**
     * Sets the equals property value. The equals property
     * @param value Value to set for the equals property.
     */
    public void setEquals(@jakarta.annotation.Nullable final String value) {
        this.equalsEscaped = value;
    }
    /**
     * Sets the in property value. The in property
     * @param value Value to set for the in property.
     */
    public void setIn(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.in = value;
    }
    /**
     * Sets the isnull property value. The isnull property
     * @param value Value to set for the isnull property.
     */
    public void setIsnull(@jakarta.annotation.Nullable final Boolean value) {
        this.isnull = value;
    }
    /**
     * Sets the like property value. The like property
     * @param value Value to set for the like property.
     */
    public void setLike(@jakarta.annotation.Nullable final String value) {
        this.like = value;
    }
    /**
     * Sets the max property value. The max property
     * @param value Value to set for the max property.
     */
    public void setMax(@jakarta.annotation.Nullable final Double value) {
        this.max = value;
    }
    /**
     * Sets the min property value. The min property
     * @param value Value to set for the min property.
     */
    public void setMin(@jakarta.annotation.Nullable final Double value) {
        this.min = value;
    }
    /**
     * Sets the minmax property value. The minmax property
     * @param value Value to set for the minmax property.
     */
    public void setMinmax(@jakarta.annotation.Nullable final java.util.List<Double> value) {
        this.minmax = value;
    }
}
