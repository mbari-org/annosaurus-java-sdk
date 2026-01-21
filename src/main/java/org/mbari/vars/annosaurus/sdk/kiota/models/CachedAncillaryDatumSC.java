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
public class CachedAncillaryDatumSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The altitude property
     */
    private Float altitude;
    /**
     * The crs property
     */
    private String crs;
    /**
     * The depth_meters property
     */
    private Float depthMeters;
    /**
     * The imaged_moment_uuid property
     */
    private UUID imagedMomentUuid;
    /**
     * The last_updated_time property
     */
    private String lastUpdatedTime;
    /**
     * The latitude property
     */
    private Double latitude;
    /**
     * The light_transmission property
     */
    private Float lightTransmission;
    /**
     * The longitude property
     */
    private Double longitude;
    /**
     * The oxygen_ml_l property
     */
    private Float oxygenMlL;
    /**
     * The phi property
     */
    private Double phi;
    /**
     * The pose_position_units property
     */
    private String posePositionUnits;
    /**
     * The pressure_dbar property
     */
    private Float pressureDbar;
    /**
     * The psi property
     */
    private Double psi;
    /**
     * The recorded_timestamp property
     */
    private String recordedTimestamp;
    /**
     * The salinity property
     */
    private Float salinity;
    /**
     * The temperature_celsius property
     */
    private Float temperatureCelsius;
    /**
     * The theta property
     */
    private Double theta;
    /**
     * The uuid property
     */
    private UUID uuid;
    /**
     * The x property
     */
    private Double x;
    /**
     * The y property
     */
    private Double y;
    /**
     * The z property
     */
    private Double z;
    /**
     * Instantiates a new {@link CachedAncillaryDatumSC} and sets the default values.
     */
    public CachedAncillaryDatumSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CachedAncillaryDatumSC}
     */
    @jakarta.annotation.Nonnull
    public static CachedAncillaryDatumSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CachedAncillaryDatumSC();
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
     * Gets the altitude property value. The altitude property
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getAltitude() {
        return this.altitude;
    }
    /**
     * Gets the crs property value. The crs property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCrs() {
        return this.crs;
    }
    /**
     * Gets the depth_meters property value. The depth_meters property
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getDepthMeters() {
        return this.depthMeters;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(21);
        deserializerMap.put("altitude", (n) -> { this.setAltitude(n.getFloatValue()); });
        deserializerMap.put("crs", (n) -> { this.setCrs(n.getStringValue()); });
        deserializerMap.put("depth_meters", (n) -> { this.setDepthMeters(n.getFloatValue()); });
        deserializerMap.put("imaged_moment_uuid", (n) -> { this.setImagedMomentUuid(n.getUUIDValue()); });
        deserializerMap.put("last_updated_time", (n) -> { this.setLastUpdatedTime(n.getStringValue()); });
        deserializerMap.put("latitude", (n) -> { this.setLatitude(n.getDoubleValue()); });
        deserializerMap.put("light_transmission", (n) -> { this.setLightTransmission(n.getFloatValue()); });
        deserializerMap.put("longitude", (n) -> { this.setLongitude(n.getDoubleValue()); });
        deserializerMap.put("oxygen_ml_l", (n) -> { this.setOxygenMlL(n.getFloatValue()); });
        deserializerMap.put("phi", (n) -> { this.setPhi(n.getDoubleValue()); });
        deserializerMap.put("pose_position_units", (n) -> { this.setPosePositionUnits(n.getStringValue()); });
        deserializerMap.put("pressure_dbar", (n) -> { this.setPressureDbar(n.getFloatValue()); });
        deserializerMap.put("psi", (n) -> { this.setPsi(n.getDoubleValue()); });
        deserializerMap.put("recorded_timestamp", (n) -> { this.setRecordedTimestamp(n.getStringValue()); });
        deserializerMap.put("salinity", (n) -> { this.setSalinity(n.getFloatValue()); });
        deserializerMap.put("temperature_celsius", (n) -> { this.setTemperatureCelsius(n.getFloatValue()); });
        deserializerMap.put("theta", (n) -> { this.setTheta(n.getDoubleValue()); });
        deserializerMap.put("uuid", (n) -> { this.setUuid(n.getUUIDValue()); });
        deserializerMap.put("x", (n) -> { this.setX(n.getDoubleValue()); });
        deserializerMap.put("y", (n) -> { this.setY(n.getDoubleValue()); });
        deserializerMap.put("z", (n) -> { this.setZ(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the imaged_moment_uuid property value. The imaged_moment_uuid property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getImagedMomentUuid() {
        return this.imagedMomentUuid;
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
     * Gets the latitude property value. The latitude property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLatitude() {
        return this.latitude;
    }
    /**
     * Gets the light_transmission property value. The light_transmission property
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getLightTransmission() {
        return this.lightTransmission;
    }
    /**
     * Gets the longitude property value. The longitude property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLongitude() {
        return this.longitude;
    }
    /**
     * Gets the oxygen_ml_l property value. The oxygen_ml_l property
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getOxygenMlL() {
        return this.oxygenMlL;
    }
    /**
     * Gets the phi property value. The phi property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getPhi() {
        return this.phi;
    }
    /**
     * Gets the pose_position_units property value. The pose_position_units property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPosePositionUnits() {
        return this.posePositionUnits;
    }
    /**
     * Gets the pressure_dbar property value. The pressure_dbar property
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getPressureDbar() {
        return this.pressureDbar;
    }
    /**
     * Gets the psi property value. The psi property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getPsi() {
        return this.psi;
    }
    /**
     * Gets the recorded_timestamp property value. The recorded_timestamp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecordedTimestamp() {
        return this.recordedTimestamp;
    }
    /**
     * Gets the salinity property value. The salinity property
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getSalinity() {
        return this.salinity;
    }
    /**
     * Gets the temperature_celsius property value. The temperature_celsius property
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getTemperatureCelsius() {
        return this.temperatureCelsius;
    }
    /**
     * Gets the theta property value. The theta property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTheta() {
        return this.theta;
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
     * Gets the x property value. The x property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getX() {
        return this.x;
    }
    /**
     * Gets the y property value. The y property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getY() {
        return this.y;
    }
    /**
     * Gets the z property value. The z property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getZ() {
        return this.z;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeFloatValue("altitude", this.getAltitude());
        writer.writeStringValue("crs", this.getCrs());
        writer.writeFloatValue("depth_meters", this.getDepthMeters());
        writer.writeUUIDValue("imaged_moment_uuid", this.getImagedMomentUuid());
        writer.writeStringValue("last_updated_time", this.getLastUpdatedTime());
        writer.writeDoubleValue("latitude", this.getLatitude());
        writer.writeFloatValue("light_transmission", this.getLightTransmission());
        writer.writeDoubleValue("longitude", this.getLongitude());
        writer.writeFloatValue("oxygen_ml_l", this.getOxygenMlL());
        writer.writeDoubleValue("phi", this.getPhi());
        writer.writeStringValue("pose_position_units", this.getPosePositionUnits());
        writer.writeFloatValue("pressure_dbar", this.getPressureDbar());
        writer.writeDoubleValue("psi", this.getPsi());
        writer.writeStringValue("recorded_timestamp", this.getRecordedTimestamp());
        writer.writeFloatValue("salinity", this.getSalinity());
        writer.writeFloatValue("temperature_celsius", this.getTemperatureCelsius());
        writer.writeDoubleValue("theta", this.getTheta());
        writer.writeUUIDValue("uuid", this.getUuid());
        writer.writeDoubleValue("x", this.getX());
        writer.writeDoubleValue("y", this.getY());
        writer.writeDoubleValue("z", this.getZ());
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
     * Sets the altitude property value. The altitude property
     * @param value Value to set for the altitude property.
     */
    public void setAltitude(@jakarta.annotation.Nullable final Float value) {
        this.altitude = value;
    }
    /**
     * Sets the crs property value. The crs property
     * @param value Value to set for the crs property.
     */
    public void setCrs(@jakarta.annotation.Nullable final String value) {
        this.crs = value;
    }
    /**
     * Sets the depth_meters property value. The depth_meters property
     * @param value Value to set for the depth_meters property.
     */
    public void setDepthMeters(@jakarta.annotation.Nullable final Float value) {
        this.depthMeters = value;
    }
    /**
     * Sets the imaged_moment_uuid property value. The imaged_moment_uuid property
     * @param value Value to set for the imaged_moment_uuid property.
     */
    public void setImagedMomentUuid(@jakarta.annotation.Nullable final UUID value) {
        this.imagedMomentUuid = value;
    }
    /**
     * Sets the last_updated_time property value. The last_updated_time property
     * @param value Value to set for the last_updated_time property.
     */
    public void setLastUpdatedTime(@jakarta.annotation.Nullable final String value) {
        this.lastUpdatedTime = value;
    }
    /**
     * Sets the latitude property value. The latitude property
     * @param value Value to set for the latitude property.
     */
    public void setLatitude(@jakarta.annotation.Nullable final Double value) {
        this.latitude = value;
    }
    /**
     * Sets the light_transmission property value. The light_transmission property
     * @param value Value to set for the light_transmission property.
     */
    public void setLightTransmission(@jakarta.annotation.Nullable final Float value) {
        this.lightTransmission = value;
    }
    /**
     * Sets the longitude property value. The longitude property
     * @param value Value to set for the longitude property.
     */
    public void setLongitude(@jakarta.annotation.Nullable final Double value) {
        this.longitude = value;
    }
    /**
     * Sets the oxygen_ml_l property value. The oxygen_ml_l property
     * @param value Value to set for the oxygen_ml_l property.
     */
    public void setOxygenMlL(@jakarta.annotation.Nullable final Float value) {
        this.oxygenMlL = value;
    }
    /**
     * Sets the phi property value. The phi property
     * @param value Value to set for the phi property.
     */
    public void setPhi(@jakarta.annotation.Nullable final Double value) {
        this.phi = value;
    }
    /**
     * Sets the pose_position_units property value. The pose_position_units property
     * @param value Value to set for the pose_position_units property.
     */
    public void setPosePositionUnits(@jakarta.annotation.Nullable final String value) {
        this.posePositionUnits = value;
    }
    /**
     * Sets the pressure_dbar property value. The pressure_dbar property
     * @param value Value to set for the pressure_dbar property.
     */
    public void setPressureDbar(@jakarta.annotation.Nullable final Float value) {
        this.pressureDbar = value;
    }
    /**
     * Sets the psi property value. The psi property
     * @param value Value to set for the psi property.
     */
    public void setPsi(@jakarta.annotation.Nullable final Double value) {
        this.psi = value;
    }
    /**
     * Sets the recorded_timestamp property value. The recorded_timestamp property
     * @param value Value to set for the recorded_timestamp property.
     */
    public void setRecordedTimestamp(@jakarta.annotation.Nullable final String value) {
        this.recordedTimestamp = value;
    }
    /**
     * Sets the salinity property value. The salinity property
     * @param value Value to set for the salinity property.
     */
    public void setSalinity(@jakarta.annotation.Nullable final Float value) {
        this.salinity = value;
    }
    /**
     * Sets the temperature_celsius property value. The temperature_celsius property
     * @param value Value to set for the temperature_celsius property.
     */
    public void setTemperatureCelsius(@jakarta.annotation.Nullable final Float value) {
        this.temperatureCelsius = value;
    }
    /**
     * Sets the theta property value. The theta property
     * @param value Value to set for the theta property.
     */
    public void setTheta(@jakarta.annotation.Nullable final Double value) {
        this.theta = value;
    }
    /**
     * Sets the uuid property value. The uuid property
     * @param value Value to set for the uuid property.
     */
    public void setUuid(@jakarta.annotation.Nullable final UUID value) {
        this.uuid = value;
    }
    /**
     * Sets the x property value. The x property
     * @param value Value to set for the x property.
     */
    public void setX(@jakarta.annotation.Nullable final Double value) {
        this.x = value;
    }
    /**
     * Sets the y property value. The y property
     * @param value Value to set for the y property.
     */
    public void setY(@jakarta.annotation.Nullable final Double value) {
        this.y = value;
    }
    /**
     * Sets the z property value. The z property
     * @param value Value to set for the z property.
     */
    public void setZ(@jakarta.annotation.Nullable final Double value) {
        this.z = value;
    }
}
