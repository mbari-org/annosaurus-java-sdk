package org.mbari.vars.annosaurus.sdk.kiota.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConcurrentRequestCountSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The concurrent_request property
     */
    private ConcurrentRequestSC concurrentRequest;
    /**
     * The count property
     */
    private Long count;
    /**
     * Instantiates a new {@link ConcurrentRequestCountSC} and sets the default values.
     */
    public ConcurrentRequestCountSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConcurrentRequestCountSC}
     */
    @jakarta.annotation.Nonnull
    public static ConcurrentRequestCountSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConcurrentRequestCountSC();
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
     * Gets the concurrent_request property value. The concurrent_request property
     * @return a {@link ConcurrentRequestSC}
     */
    @jakarta.annotation.Nullable
    public ConcurrentRequestSC getConcurrentRequest() {
        return this.concurrentRequest;
    }
    /**
     * Gets the count property value. The count property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCount() {
        return this.count;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("concurrent_request", (n) -> { this.setConcurrentRequest(n.getObjectValue(ConcurrentRequestSC::createFromDiscriminatorValue)); });
        deserializerMap.put("count", (n) -> { this.setCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("concurrent_request", this.getConcurrentRequest());
        writer.writeLongValue("count", this.getCount());
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
     * Sets the concurrent_request property value. The concurrent_request property
     * @param value Value to set for the concurrent_request property.
     */
    public void setConcurrentRequest(@jakarta.annotation.Nullable final ConcurrentRequestSC value) {
        this.concurrentRequest = value;
    }
    /**
     * Sets the count property value. The count property
     * @param value Value to set for the count property.
     */
    public void setCount(@jakarta.annotation.Nullable final Long value) {
        this.count = value;
    }
}
