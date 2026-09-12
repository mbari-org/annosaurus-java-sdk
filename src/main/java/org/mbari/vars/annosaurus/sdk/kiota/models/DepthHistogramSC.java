package org.mbari.vars.annosaurus.sdk.kiota.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DepthHistogramSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The bins_max property
     */
    private java.util.List<Integer> binsMax;
    /**
     * The bins_min property
     */
    private java.util.List<Integer> binsMin;
    /**
     * The values property
     */
    private java.util.List<Integer> values;
    /**
     * Instantiates a new {@link DepthHistogramSC} and sets the default values.
     */
    public DepthHistogramSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DepthHistogramSC}
     */
    @jakarta.annotation.Nonnull
    public static DepthHistogramSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DepthHistogramSC();
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
     * Gets the bins_max property value. The bins_max property
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getBinsMax() {
        return this.binsMax;
    }
    /**
     * Gets the bins_min property value. The bins_min property
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getBinsMin() {
        return this.binsMin;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("bins_max", (n) -> { this.setBinsMax(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("bins_min", (n) -> { this.setBinsMin(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfPrimitiveValues(Integer.class)); });
        return deserializerMap;
    }
    /**
     * Gets the values property value. The values property
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getValues() {
        return this.values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("bins_max", this.getBinsMax());
        writer.writeCollectionOfPrimitiveValues("bins_min", this.getBinsMin());
        writer.writeCollectionOfPrimitiveValues("values", this.getValues());
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
     * Sets the bins_max property value. The bins_max property
     * @param value Value to set for the bins_max property.
     */
    public void setBinsMax(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.binsMax = value;
    }
    /**
     * Sets the bins_min property value. The bins_min property
     * @param value Value to set for the bins_min property.
     */
    public void setBinsMin(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.binsMin = value;
    }
    /**
     * Sets the values property value. The values property
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.values = value;
    }
}
