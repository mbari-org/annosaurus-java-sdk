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
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QueryConstraints implements AdditionalDataHolder, Parsable {
    /**
     * The activities property
     */
    private java.util.List<String> activities;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The concepts property
     */
    private java.util.List<String> concepts;
    /**
     * The data property
     */
    private Boolean data;
    /**
     * The groups property
     */
    private java.util.List<String> groups;
    /**
     * The limit property
     */
    private Integer limit;
    /**
     * The linkName property
     */
    private String linkName;
    /**
     * The linkValue property
     */
    private String linkValue;
    /**
     * The maxDepth property
     */
    private Double maxDepth;
    /**
     * The maxLat property
     */
    private Double maxLat;
    /**
     * The maxLon property
     */
    private Double maxLon;
    /**
     * The maxTimestamp property
     */
    private String maxTimestamp;
    /**
     * The minDepth property
     */
    private Double minDepth;
    /**
     * The minLat property
     */
    private Double minLat;
    /**
     * The minLon property
     */
    private Double minLon;
    /**
     * The minTimestamp property
     */
    private String minTimestamp;
    /**
     * The missionContacts property
     */
    private java.util.List<String> missionContacts;
    /**
     * The missionId property
     */
    private String missionId;
    /**
     * The observers property
     */
    private java.util.List<String> observers;
    /**
     * The offset property
     */
    private Integer offset;
    /**
     * The platformName property
     */
    private String platformName;
    /**
     * The videoReferenceUuids property
     */
    private java.util.List<UUID> videoReferenceUuids;
    /**
     * Instantiates a new {@link QueryConstraints} and sets the default values.
     */
    public QueryConstraints() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link QueryConstraints}
     */
    @jakarta.annotation.Nonnull
    public static QueryConstraints createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QueryConstraints();
    }
    /**
     * Gets the activities property value. The activities property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getActivities() {
        return this.activities;
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
     * Gets the concepts property value. The concepts property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getConcepts() {
        return this.concepts;
    }
    /**
     * Gets the data property value. The data property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getData() {
        return this.data;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(21);
        deserializerMap.put("activities", (n) -> { this.setActivities(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("concepts", (n) -> { this.setConcepts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("data", (n) -> { this.setData(n.getBooleanValue()); });
        deserializerMap.put("groups", (n) -> { this.setGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("linkName", (n) -> { this.setLinkName(n.getStringValue()); });
        deserializerMap.put("linkValue", (n) -> { this.setLinkValue(n.getStringValue()); });
        deserializerMap.put("maxDepth", (n) -> { this.setMaxDepth(n.getDoubleValue()); });
        deserializerMap.put("maxLat", (n) -> { this.setMaxLat(n.getDoubleValue()); });
        deserializerMap.put("maxLon", (n) -> { this.setMaxLon(n.getDoubleValue()); });
        deserializerMap.put("maxTimestamp", (n) -> { this.setMaxTimestamp(n.getStringValue()); });
        deserializerMap.put("minDepth", (n) -> { this.setMinDepth(n.getDoubleValue()); });
        deserializerMap.put("minLat", (n) -> { this.setMinLat(n.getDoubleValue()); });
        deserializerMap.put("minLon", (n) -> { this.setMinLon(n.getDoubleValue()); });
        deserializerMap.put("minTimestamp", (n) -> { this.setMinTimestamp(n.getStringValue()); });
        deserializerMap.put("missionContacts", (n) -> { this.setMissionContacts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("missionId", (n) -> { this.setMissionId(n.getStringValue()); });
        deserializerMap.put("observers", (n) -> { this.setObservers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("platformName", (n) -> { this.setPlatformName(n.getStringValue()); });
        deserializerMap.put("videoReferenceUuids", (n) -> { this.setVideoReferenceUuids(n.getCollectionOfPrimitiveValues(UUID.class)); });
        return deserializerMap;
    }
    /**
     * Gets the groups property value. The groups property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGroups() {
        return this.groups;
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
     * Gets the linkName property value. The linkName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLinkName() {
        return this.linkName;
    }
    /**
     * Gets the linkValue property value. The linkValue property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLinkValue() {
        return this.linkValue;
    }
    /**
     * Gets the maxDepth property value. The maxDepth property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxDepth() {
        return this.maxDepth;
    }
    /**
     * Gets the maxLat property value. The maxLat property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxLat() {
        return this.maxLat;
    }
    /**
     * Gets the maxLon property value. The maxLon property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxLon() {
        return this.maxLon;
    }
    /**
     * Gets the maxTimestamp property value. The maxTimestamp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMaxTimestamp() {
        return this.maxTimestamp;
    }
    /**
     * Gets the minDepth property value. The minDepth property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinDepth() {
        return this.minDepth;
    }
    /**
     * Gets the minLat property value. The minLat property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinLat() {
        return this.minLat;
    }
    /**
     * Gets the minLon property value. The minLon property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinLon() {
        return this.minLon;
    }
    /**
     * Gets the minTimestamp property value. The minTimestamp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinTimestamp() {
        return this.minTimestamp;
    }
    /**
     * Gets the missionContacts property value. The missionContacts property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMissionContacts() {
        return this.missionContacts;
    }
    /**
     * Gets the missionId property value. The missionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMissionId() {
        return this.missionId;
    }
    /**
     * Gets the observers property value. The observers property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getObservers() {
        return this.observers;
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
     * Gets the platformName property value. The platformName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlatformName() {
        return this.platformName;
    }
    /**
     * Gets the videoReferenceUuids property value. The videoReferenceUuids property
     * @return a {@link java.util.List<UUID>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getVideoReferenceUuids() {
        return this.videoReferenceUuids;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("activities", this.getActivities());
        writer.writeCollectionOfPrimitiveValues("concepts", this.getConcepts());
        writer.writeBooleanValue("data", this.getData());
        writer.writeCollectionOfPrimitiveValues("groups", this.getGroups());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("linkName", this.getLinkName());
        writer.writeStringValue("linkValue", this.getLinkValue());
        writer.writeDoubleValue("maxDepth", this.getMaxDepth());
        writer.writeDoubleValue("maxLat", this.getMaxLat());
        writer.writeDoubleValue("maxLon", this.getMaxLon());
        writer.writeStringValue("maxTimestamp", this.getMaxTimestamp());
        writer.writeDoubleValue("minDepth", this.getMinDepth());
        writer.writeDoubleValue("minLat", this.getMinLat());
        writer.writeDoubleValue("minLon", this.getMinLon());
        writer.writeStringValue("minTimestamp", this.getMinTimestamp());
        writer.writeCollectionOfPrimitiveValues("missionContacts", this.getMissionContacts());
        writer.writeStringValue("missionId", this.getMissionId());
        writer.writeCollectionOfPrimitiveValues("observers", this.getObservers());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeStringValue("platformName", this.getPlatformName());
        writer.writeCollectionOfPrimitiveValues("videoReferenceUuids", this.getVideoReferenceUuids());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activities property value. The activities property
     * @param value Value to set for the activities property.
     */
    public void setActivities(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.activities = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the concepts property value. The concepts property
     * @param value Value to set for the concepts property.
     */
    public void setConcepts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.concepts = value;
    }
    /**
     * Sets the data property value. The data property
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final Boolean value) {
        this.data = value;
    }
    /**
     * Sets the groups property value. The groups property
     * @param value Value to set for the groups property.
     */
    public void setGroups(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.groups = value;
    }
    /**
     * Sets the limit property value. The limit property
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the linkName property value. The linkName property
     * @param value Value to set for the linkName property.
     */
    public void setLinkName(@jakarta.annotation.Nullable final String value) {
        this.linkName = value;
    }
    /**
     * Sets the linkValue property value. The linkValue property
     * @param value Value to set for the linkValue property.
     */
    public void setLinkValue(@jakarta.annotation.Nullable final String value) {
        this.linkValue = value;
    }
    /**
     * Sets the maxDepth property value. The maxDepth property
     * @param value Value to set for the maxDepth property.
     */
    public void setMaxDepth(@jakarta.annotation.Nullable final Double value) {
        this.maxDepth = value;
    }
    /**
     * Sets the maxLat property value. The maxLat property
     * @param value Value to set for the maxLat property.
     */
    public void setMaxLat(@jakarta.annotation.Nullable final Double value) {
        this.maxLat = value;
    }
    /**
     * Sets the maxLon property value. The maxLon property
     * @param value Value to set for the maxLon property.
     */
    public void setMaxLon(@jakarta.annotation.Nullable final Double value) {
        this.maxLon = value;
    }
    /**
     * Sets the maxTimestamp property value. The maxTimestamp property
     * @param value Value to set for the maxTimestamp property.
     */
    public void setMaxTimestamp(@jakarta.annotation.Nullable final String value) {
        this.maxTimestamp = value;
    }
    /**
     * Sets the minDepth property value. The minDepth property
     * @param value Value to set for the minDepth property.
     */
    public void setMinDepth(@jakarta.annotation.Nullable final Double value) {
        this.minDepth = value;
    }
    /**
     * Sets the minLat property value. The minLat property
     * @param value Value to set for the minLat property.
     */
    public void setMinLat(@jakarta.annotation.Nullable final Double value) {
        this.minLat = value;
    }
    /**
     * Sets the minLon property value. The minLon property
     * @param value Value to set for the minLon property.
     */
    public void setMinLon(@jakarta.annotation.Nullable final Double value) {
        this.minLon = value;
    }
    /**
     * Sets the minTimestamp property value. The minTimestamp property
     * @param value Value to set for the minTimestamp property.
     */
    public void setMinTimestamp(@jakarta.annotation.Nullable final String value) {
        this.minTimestamp = value;
    }
    /**
     * Sets the missionContacts property value. The missionContacts property
     * @param value Value to set for the missionContacts property.
     */
    public void setMissionContacts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.missionContacts = value;
    }
    /**
     * Sets the missionId property value. The missionId property
     * @param value Value to set for the missionId property.
     */
    public void setMissionId(@jakarta.annotation.Nullable final String value) {
        this.missionId = value;
    }
    /**
     * Sets the observers property value. The observers property
     * @param value Value to set for the observers property.
     */
    public void setObservers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.observers = value;
    }
    /**
     * Sets the offset property value. The offset property
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the platformName property value. The platformName property
     * @param value Value to set for the platformName property.
     */
    public void setPlatformName(@jakarta.annotation.Nullable final String value) {
        this.platformName = value;
    }
    /**
     * Sets the videoReferenceUuids property value. The videoReferenceUuids property
     * @param value Value to set for the videoReferenceUuids property.
     */
    public void setVideoReferenceUuids(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.videoReferenceUuids = value;
    }
}
