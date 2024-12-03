package org.mbari.vars.annosaurus.sdk.kiota.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QueryConstraintsResponseSCGeographicRangeSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The content property
     */
    private GeographicRangeSC content;
    /**
     * The query_constraints property
     */
    private QueryConstraintsSC queryConstraints;
    /**
     * Instantiates a new {@link QueryConstraintsResponseSCGeographicRangeSC} and sets the default values.
     */
    public QueryConstraintsResponseSCGeographicRangeSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link QueryConstraintsResponseSCGeographicRangeSC}
     */
    @jakarta.annotation.Nonnull
    public static QueryConstraintsResponseSCGeographicRangeSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QueryConstraintsResponseSCGeographicRangeSC();
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
     * Gets the content property value. The content property
     * @return a {@link GeographicRangeSC}
     */
    @jakarta.annotation.Nullable
    public GeographicRangeSC getContent() {
        return this.content;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("content", (n) -> { this.setContent(n.getObjectValue(GeographicRangeSC::createFromDiscriminatorValue)); });
        deserializerMap.put("query_constraints", (n) -> { this.setQueryConstraints(n.getObjectValue(QueryConstraintsSC::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the query_constraints property value. The query_constraints property
     * @return a {@link QueryConstraintsSC}
     */
    @jakarta.annotation.Nullable
    public QueryConstraintsSC getQueryConstraints() {
        return this.queryConstraints;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("content", this.getContent());
        writer.writeObjectValue("query_constraints", this.getQueryConstraints());
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
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final GeographicRangeSC value) {
        this.content = value;
    }
    /**
     * Sets the query_constraints property value. The query_constraints property
     * @param value Value to set for the query_constraints property.
     */
    public void setQueryConstraints(@jakarta.annotation.Nullable final QueryConstraintsSC value) {
        this.queryConstraints = value;
    }
}
