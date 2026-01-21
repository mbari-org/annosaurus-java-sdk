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
public class GeographicRangeSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The max_depth_meters property
     */
    private Double maxDepthMeters;
    /**
     * The max_latitude property
     */
    private Double maxLatitude;
    /**
     * The max_longitude property
     */
    private Double maxLongitude;
    /**
     * The min_depth_meters property
     */
    private Double minDepthMeters;
    /**
     * The min_latitude property
     */
    private Double minLatitude;
    /**
     * The min_longitude property
     */
    private Double minLongitude;
    /**
     * Instantiates a new {@link GeographicRangeSC} and sets the default values.
     */
    public GeographicRangeSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GeographicRangeSC}
     */
    @jakarta.annotation.Nonnull
    public static GeographicRangeSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GeographicRangeSC();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("max_depth_meters", (n) -> { this.setMaxDepthMeters(n.getDoubleValue()); });
        deserializerMap.put("max_latitude", (n) -> { this.setMaxLatitude(n.getDoubleValue()); });
        deserializerMap.put("max_longitude", (n) -> { this.setMaxLongitude(n.getDoubleValue()); });
        deserializerMap.put("min_depth_meters", (n) -> { this.setMinDepthMeters(n.getDoubleValue()); });
        deserializerMap.put("min_latitude", (n) -> { this.setMinLatitude(n.getDoubleValue()); });
        deserializerMap.put("min_longitude", (n) -> { this.setMinLongitude(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the max_depth_meters property value. The max_depth_meters property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxDepthMeters() {
        return this.maxDepthMeters;
    }
    /**
     * Gets the max_latitude property value. The max_latitude property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxLatitude() {
        return this.maxLatitude;
    }
    /**
     * Gets the max_longitude property value. The max_longitude property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxLongitude() {
        return this.maxLongitude;
    }
    /**
     * Gets the min_depth_meters property value. The min_depth_meters property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinDepthMeters() {
        return this.minDepthMeters;
    }
    /**
     * Gets the min_latitude property value. The min_latitude property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinLatitude() {
        return this.minLatitude;
    }
    /**
     * Gets the min_longitude property value. The min_longitude property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinLongitude() {
        return this.minLongitude;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("max_depth_meters", this.getMaxDepthMeters());
        writer.writeDoubleValue("max_latitude", this.getMaxLatitude());
        writer.writeDoubleValue("max_longitude", this.getMaxLongitude());
        writer.writeDoubleValue("min_depth_meters", this.getMinDepthMeters());
        writer.writeDoubleValue("min_latitude", this.getMinLatitude());
        writer.writeDoubleValue("min_longitude", this.getMinLongitude());
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
     * Sets the max_depth_meters property value. The max_depth_meters property
     * @param value Value to set for the max_depth_meters property.
     */
    public void setMaxDepthMeters(@jakarta.annotation.Nullable final Double value) {
        this.maxDepthMeters = value;
    }
    /**
     * Sets the max_latitude property value. The max_latitude property
     * @param value Value to set for the max_latitude property.
     */
    public void setMaxLatitude(@jakarta.annotation.Nullable final Double value) {
        this.maxLatitude = value;
    }
    /**
     * Sets the max_longitude property value. The max_longitude property
     * @param value Value to set for the max_longitude property.
     */
    public void setMaxLongitude(@jakarta.annotation.Nullable final Double value) {
        this.maxLongitude = value;
    }
    /**
     * Sets the min_depth_meters property value. The min_depth_meters property
     * @param value Value to set for the min_depth_meters property.
     */
    public void setMinDepthMeters(@jakarta.annotation.Nullable final Double value) {
        this.minDepthMeters = value;
    }
    /**
     * Sets the min_latitude property value. The min_latitude property
     * @param value Value to set for the min_latitude property.
     */
    public void setMinLatitude(@jakarta.annotation.Nullable final Double value) {
        this.minLatitude = value;
    }
    /**
     * Sets the min_longitude property value. The min_longitude property
     * @param value Value to set for the min_longitude property.
     */
    public void setMinLongitude(@jakarta.annotation.Nullable final Double value) {
        this.minLongitude = value;
    }
}
