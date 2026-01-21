package org.mbari.vars.annosaurus.sdk.kiota.models;

/*-
 * #%L
 * org.mbari.vars:annosaurus-java-sdk
 * %%
 * Copyright (C) 2025 - 2026 Monterey Bay Aquarium Research Institute
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QueryRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The concurrentObservations property
     */
    private Boolean concurrentObservations;
    /**
     * The distinct property
     */
    private Boolean distinct;
    /**
     * The limit property
     */
    private Integer limit;
    /**
     * The offset property
     */
    private Integer offset;
    /**
     * The orderBy property
     */
    private java.util.List<String> orderBy;
    /**
     * The relatedAssociations property
     */
    private Boolean relatedAssociations;
    /**
     * The select property
     */
    private java.util.List<String> select;
    /**
     * The strict property
     */
    private Boolean strict;
    /**
     * The where property
     */
    private java.util.List<ConstraintRequest> where;
    /**
     * Instantiates a new {@link QueryRequest} and sets the default values.
     */
    public QueryRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link QueryRequest}
     */
    @jakarta.annotation.Nonnull
    public static QueryRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QueryRequest();
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
     * Gets the concurrentObservations property value. The concurrentObservations property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getConcurrentObservations() {
        return this.concurrentObservations;
    }
    /**
     * Gets the distinct property value. The distinct property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDistinct() {
        return this.distinct;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("concurrentObservations", (n) -> { this.setConcurrentObservations(n.getBooleanValue()); });
        deserializerMap.put("distinct", (n) -> { this.setDistinct(n.getBooleanValue()); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("orderBy", (n) -> { this.setOrderBy(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("relatedAssociations", (n) -> { this.setRelatedAssociations(n.getBooleanValue()); });
        deserializerMap.put("select", (n) -> { this.setSelect(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("strict", (n) -> { this.setStrict(n.getBooleanValue()); });
        deserializerMap.put("where", (n) -> { this.setWhere(n.getCollectionOfObjectValues(ConstraintRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the limit property value. The limit property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the offset property value. The offset property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the orderBy property value. The orderBy property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOrderBy() {
        return this.orderBy;
    }
    /**
     * Gets the relatedAssociations property value. The relatedAssociations property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRelatedAssociations() {
        return this.relatedAssociations;
    }
    /**
     * Gets the select property value. The select property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSelect() {
        return this.select;
    }
    /**
     * Gets the strict property value. The strict property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getStrict() {
        return this.strict;
    }
    /**
     * Gets the where property value. The where property
     * @return a {@link java.util.List<ConstraintRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConstraintRequest> getWhere() {
        return this.where;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("concurrentObservations", this.getConcurrentObservations());
        writer.writeBooleanValue("distinct", this.getDistinct());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeCollectionOfPrimitiveValues("orderBy", this.getOrderBy());
        writer.writeBooleanValue("relatedAssociations", this.getRelatedAssociations());
        writer.writeCollectionOfPrimitiveValues("select", this.getSelect());
        writer.writeBooleanValue("strict", this.getStrict());
        writer.writeCollectionOfObjectValues("where", this.getWhere());
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
     * Sets the concurrentObservations property value. The concurrentObservations property
     * @param value Value to set for the concurrentObservations property.
     */
    public void setConcurrentObservations(@jakarta.annotation.Nullable final Boolean value) {
        this.concurrentObservations = value;
    }
    /**
     * Sets the distinct property value. The distinct property
     * @param value Value to set for the distinct property.
     */
    public void setDistinct(@jakarta.annotation.Nullable final Boolean value) {
        this.distinct = value;
    }
    /**
     * Sets the limit property value. The limit property
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the offset property value. The offset property
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the orderBy property value. The orderBy property
     * @param value Value to set for the orderBy property.
     */
    public void setOrderBy(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.orderBy = value;
    }
    /**
     * Sets the relatedAssociations property value. The relatedAssociations property
     * @param value Value to set for the relatedAssociations property.
     */
    public void setRelatedAssociations(@jakarta.annotation.Nullable final Boolean value) {
        this.relatedAssociations = value;
    }
    /**
     * Sets the select property value. The select property
     * @param value Value to set for the select property.
     */
    public void setSelect(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.select = value;
    }
    /**
     * Sets the strict property value. The strict property
     * @param value Value to set for the strict property.
     */
    public void setStrict(@jakarta.annotation.Nullable final Boolean value) {
        this.strict = value;
    }
    /**
     * Sets the where property value. The where property
     * @param value Value to set for the where property.
     */
    public void setWhere(@jakarta.annotation.Nullable final java.util.List<ConstraintRequest> value) {
        this.where = value;
    }
}
