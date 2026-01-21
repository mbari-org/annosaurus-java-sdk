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
public class QueryConstraintsSC implements AdditionalDataHolder, Parsable {
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
     * The link_name property
     */
    private String linkName;
    /**
     * The link_value property
     */
    private String linkValue;
    /**
     * The max_depth property
     */
    private Double maxDepth;
    /**
     * The max_lat property
     */
    private Double maxLat;
    /**
     * The max_lon property
     */
    private Double maxLon;
    /**
     * The max_timestamp property
     */
    private String maxTimestamp;
    /**
     * The min_depth property
     */
    private Double minDepth;
    /**
     * The min_lat property
     */
    private Double minLat;
    /**
     * The min_lon property
     */
    private Double minLon;
    /**
     * The min_timestamp property
     */
    private String minTimestamp;
    /**
     * The mission_contacts property
     */
    private java.util.List<String> missionContacts;
    /**
     * The mission_id property
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
     * The platform_name property
     */
    private String platformName;
    /**
     * The video_reference_uuids property
     */
    private java.util.List<UUID> videoReferenceUuids;
    /**
     * Instantiates a new {@link QueryConstraintsSC} and sets the default values.
     */
    public QueryConstraintsSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link QueryConstraintsSC}
     */
    @jakarta.annotation.Nonnull
    public static QueryConstraintsSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QueryConstraintsSC();
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
        deserializerMap.put("link_name", (n) -> { this.setLinkName(n.getStringValue()); });
        deserializerMap.put("link_value", (n) -> { this.setLinkValue(n.getStringValue()); });
        deserializerMap.put("max_depth", (n) -> { this.setMaxDepth(n.getDoubleValue()); });
        deserializerMap.put("max_lat", (n) -> { this.setMaxLat(n.getDoubleValue()); });
        deserializerMap.put("max_lon", (n) -> { this.setMaxLon(n.getDoubleValue()); });
        deserializerMap.put("max_timestamp", (n) -> { this.setMaxTimestamp(n.getStringValue()); });
        deserializerMap.put("min_depth", (n) -> { this.setMinDepth(n.getDoubleValue()); });
        deserializerMap.put("min_lat", (n) -> { this.setMinLat(n.getDoubleValue()); });
        deserializerMap.put("min_lon", (n) -> { this.setMinLon(n.getDoubleValue()); });
        deserializerMap.put("min_timestamp", (n) -> { this.setMinTimestamp(n.getStringValue()); });
        deserializerMap.put("mission_contacts", (n) -> { this.setMissionContacts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("mission_id", (n) -> { this.setMissionId(n.getStringValue()); });
        deserializerMap.put("observers", (n) -> { this.setObservers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("platform_name", (n) -> { this.setPlatformName(n.getStringValue()); });
        deserializerMap.put("video_reference_uuids", (n) -> { this.setVideoReferenceUuids(n.getCollectionOfPrimitiveValues(UUID.class)); });
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
     * Gets the link_name property value. The link_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLinkName() {
        return this.linkName;
    }
    /**
     * Gets the link_value property value. The link_value property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLinkValue() {
        return this.linkValue;
    }
    /**
     * Gets the max_depth property value. The max_depth property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxDepth() {
        return this.maxDepth;
    }
    /**
     * Gets the max_lat property value. The max_lat property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxLat() {
        return this.maxLat;
    }
    /**
     * Gets the max_lon property value. The max_lon property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxLon() {
        return this.maxLon;
    }
    /**
     * Gets the max_timestamp property value. The max_timestamp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMaxTimestamp() {
        return this.maxTimestamp;
    }
    /**
     * Gets the min_depth property value. The min_depth property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinDepth() {
        return this.minDepth;
    }
    /**
     * Gets the min_lat property value. The min_lat property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinLat() {
        return this.minLat;
    }
    /**
     * Gets the min_lon property value. The min_lon property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinLon() {
        return this.minLon;
    }
    /**
     * Gets the min_timestamp property value. The min_timestamp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinTimestamp() {
        return this.minTimestamp;
    }
    /**
     * Gets the mission_contacts property value. The mission_contacts property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMissionContacts() {
        return this.missionContacts;
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
     * Gets the platform_name property value. The platform_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlatformName() {
        return this.platformName;
    }
    /**
     * Gets the video_reference_uuids property value. The video_reference_uuids property
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
        writer.writeStringValue("link_name", this.getLinkName());
        writer.writeStringValue("link_value", this.getLinkValue());
        writer.writeDoubleValue("max_depth", this.getMaxDepth());
        writer.writeDoubleValue("max_lat", this.getMaxLat());
        writer.writeDoubleValue("max_lon", this.getMaxLon());
        writer.writeStringValue("max_timestamp", this.getMaxTimestamp());
        writer.writeDoubleValue("min_depth", this.getMinDepth());
        writer.writeDoubleValue("min_lat", this.getMinLat());
        writer.writeDoubleValue("min_lon", this.getMinLon());
        writer.writeStringValue("min_timestamp", this.getMinTimestamp());
        writer.writeCollectionOfPrimitiveValues("mission_contacts", this.getMissionContacts());
        writer.writeStringValue("mission_id", this.getMissionId());
        writer.writeCollectionOfPrimitiveValues("observers", this.getObservers());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeStringValue("platform_name", this.getPlatformName());
        writer.writeCollectionOfPrimitiveValues("video_reference_uuids", this.getVideoReferenceUuids());
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
     * Sets the link_name property value. The link_name property
     * @param value Value to set for the link_name property.
     */
    public void setLinkName(@jakarta.annotation.Nullable final String value) {
        this.linkName = value;
    }
    /**
     * Sets the link_value property value. The link_value property
     * @param value Value to set for the link_value property.
     */
    public void setLinkValue(@jakarta.annotation.Nullable final String value) {
        this.linkValue = value;
    }
    /**
     * Sets the max_depth property value. The max_depth property
     * @param value Value to set for the max_depth property.
     */
    public void setMaxDepth(@jakarta.annotation.Nullable final Double value) {
        this.maxDepth = value;
    }
    /**
     * Sets the max_lat property value. The max_lat property
     * @param value Value to set for the max_lat property.
     */
    public void setMaxLat(@jakarta.annotation.Nullable final Double value) {
        this.maxLat = value;
    }
    /**
     * Sets the max_lon property value. The max_lon property
     * @param value Value to set for the max_lon property.
     */
    public void setMaxLon(@jakarta.annotation.Nullable final Double value) {
        this.maxLon = value;
    }
    /**
     * Sets the max_timestamp property value. The max_timestamp property
     * @param value Value to set for the max_timestamp property.
     */
    public void setMaxTimestamp(@jakarta.annotation.Nullable final String value) {
        this.maxTimestamp = value;
    }
    /**
     * Sets the min_depth property value. The min_depth property
     * @param value Value to set for the min_depth property.
     */
    public void setMinDepth(@jakarta.annotation.Nullable final Double value) {
        this.minDepth = value;
    }
    /**
     * Sets the min_lat property value. The min_lat property
     * @param value Value to set for the min_lat property.
     */
    public void setMinLat(@jakarta.annotation.Nullable final Double value) {
        this.minLat = value;
    }
    /**
     * Sets the min_lon property value. The min_lon property
     * @param value Value to set for the min_lon property.
     */
    public void setMinLon(@jakarta.annotation.Nullable final Double value) {
        this.minLon = value;
    }
    /**
     * Sets the min_timestamp property value. The min_timestamp property
     * @param value Value to set for the min_timestamp property.
     */
    public void setMinTimestamp(@jakarta.annotation.Nullable final String value) {
        this.minTimestamp = value;
    }
    /**
     * Sets the mission_contacts property value. The mission_contacts property
     * @param value Value to set for the mission_contacts property.
     */
    public void setMissionContacts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.missionContacts = value;
    }
    /**
     * Sets the mission_id property value. The mission_id property
     * @param value Value to set for the mission_id property.
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
     * Sets the platform_name property value. The platform_name property
     * @param value Value to set for the platform_name property.
     */
    public void setPlatformName(@jakarta.annotation.Nullable final String value) {
        this.platformName = value;
    }
    /**
     * Sets the video_reference_uuids property value. The video_reference_uuids property
     * @param value Value to set for the video_reference_uuids property.
     */
    public void setVideoReferenceUuids(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.videoReferenceUuids = value;
    }
}
