package org.mbari.vars.annosaurus.sdk.r1.models;

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

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

import org.mbari.vars.annosaurus.sdk.kiota.models.CachedAncillaryDatumSC;
import org.mbari.vars.annosaurus.sdk.r1.etc.jdk.Instants;


/**
 * @author Brian Schlining
 * @since 2017-08-25T15:42:00
 */
public class AncillaryData {

    /** Used for merging only. Typically this will be null */
    private Instant recordedTimestamp;
    private Double altitude;
    private String crs;
    private Double depthMeters;
    private Double latitude;
    private Double lightTransmission;
    private Double longitude;
    private Double oxygenMlL;
    private Double phi;
    private String posePositionUnits;
    private Double pressureDbar;
    private Double psi;
    private Double salinity;
    private Double temperatureCelsius;
    private Double theta;
    private Double x;
    private Double y;
    private Double z;
    private Instant lastUpdatedTime;
    private UUID uuid;
    private UUID imagedMomentUuid;

    public AncillaryData() {
    }

    public AncillaryData(AncillaryData src) {
        setAltitude(src.getAltitude());
        setCrs(src.getCrs());
        setDepthMeters(src.getDepthMeters());
        setLatitude(src.getLatitude());
        setLightTransmission(src.getLightTransmission());
        setLongitude(src.getLongitude());
        setOxygenMlL(src.getOxygenMlL());
        setPhi(src.getPhi());
        setPosePositionUnits(src.getPosePositionUnits());
        setPressureDbar(src.getPressureDbar());
        setPsi(src.getPsi());
        setSalinity(src.getSalinity());
        setTemperatureCelsius(src.getTemperatureCelsius());
        setTheta(src.getTheta());
        setX(src.getX());
        setY(src.getY());
        setZ(src.getZ());
        uuid = src.getUuid();
        lastUpdatedTime = src.getLastUpdatedTime();
        setImagedMomentUuid(src.getImagedMomentUuid());
        setRecordedTimestamp(src.getRecordedTimestamp());
    }

    public Instant getRecordedTimestamp() {
        return recordedTimestamp;
    }

    public void setRecordedTimestamp(Instant recordedTimestamp) {
        this.recordedTimestamp = recordedTimestamp;
    }

    public Instant getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public UUID getUuid() {
        return uuid;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Double getDepthMeters() {
        return depthMeters;
    }

    public void setDepthMeters(Double depthMeters) {
        this.depthMeters = depthMeters;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLightTransmission() {
        return lightTransmission;
    }

    public void setLightTransmission(Double lightTransmission) {
        this.lightTransmission = lightTransmission;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getOxygenMlL() {
        return oxygenMlL;
    }

    public void setOxygenMlL(Double oxygenMlL) {
        this.oxygenMlL = oxygenMlL;
    }

    public Double getPhi() {
        return phi;
    }

    public void setPhi(Double phi) {
        this.phi = phi;
    }

    public Double getPressureDbar() {
        return pressureDbar;
    }

    public void setPressureDbar(Double pressureDbar) {
        this.pressureDbar = pressureDbar;
    }

    public Double getPsi() {
        return psi;
    }

    public void setPsi(Double psi) {
        this.psi = psi;
    }

    public Double getSalinity() {
        return salinity;
    }

    public void setSalinity(Double salinity) {
        this.salinity = salinity;
    }

    public Double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(Double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    public Double getTheta() {
        return theta;
    }

    public void setTheta(Double theta) {
        this.theta = theta;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public String getCrs() {
        return crs;
    }

    public void setCrs(String crs) {
        this.crs = crs;
    }

    public String getPosePositionUnits() {
        return posePositionUnits;
    }

    public void setPosePositionUnits(String posePositionUnits) {
        this.posePositionUnits = posePositionUnits;
    }

    public UUID getImagedMomentUuid() {
        return imagedMomentUuid;
    }

    public void setImagedMomentUuid(UUID imagedMomentUuid) {
        this.imagedMomentUuid = imagedMomentUuid;
    }

    public static AncillaryData fromKiota(CachedAncillaryDatumSC kiota) {
        AncillaryData ad = new AncillaryData();
        Optional.ofNullable(kiota.getAltitude()).ifPresent(v -> ad.setAltitude(v.doubleValue()));
        ad.setCrs(kiota.getCrs());
        Optional.ofNullable(kiota.getDepthMeters()).ifPresent(v -> ad.setDepthMeters(v.doubleValue()));
        Optional.ofNullable(kiota.getLatitude()).ifPresent(v -> ad.setLatitude(v.doubleValue()));
        Optional.ofNullable(kiota.getLightTransmission()).ifPresent(v -> ad.setLightTransmission(v.doubleValue()));
        Optional.ofNullable(kiota.getLongitude()).ifPresent(v -> ad.setLongitude(v.doubleValue()));
        Optional.ofNullable(kiota.getOxygenMlL()).ifPresent(v -> ad.setOxygenMlL(v.doubleValue()));
        Optional.ofNullable(kiota.getPhi()).ifPresent(v -> ad.setPhi(v.doubleValue()));
        ad.setPosePositionUnits(kiota.getPosePositionUnits());
        Optional.ofNullable(kiota.getPressureDbar()).ifPresent(v -> ad.setPressureDbar(v.doubleValue()));
        ad.setPsi(kiota.getPsi());
        Optional.ofNullable(kiota.getSalinity()).ifPresent(v -> ad.setSalinity(v.doubleValue()));
        Optional.ofNullable(kiota.getTemperatureCelsius()).ifPresent(v -> ad.setTemperatureCelsius(v.doubleValue()));
        Optional.ofNullable(kiota.getTheta()).ifPresent(v -> ad.setTheta(v.doubleValue()));
        Optional.ofNullable(kiota.getX()).ifPresent(v -> ad.setX(v.doubleValue()));
        Optional.ofNullable(kiota.getY()).ifPresent(v -> ad.setY(v.doubleValue()));
        Optional.ofNullable(kiota.getZ()).ifPresent(v -> ad.setZ(v.doubleValue()));
        ad.uuid = kiota.getUuid();
        Optional.ofNullable(kiota.getLastUpdatedTime()).ifPresent(v -> {
            Instants.parseIso8601(v).ifPresent(w -> ad.lastUpdatedTime = w);
        } );
        return ad;
    }

    public CachedAncillaryDatumSC toKiota() {
        CachedAncillaryDatumSC kiota = new CachedAncillaryDatumSC();
        Optional.ofNullable(this.getAltitude()).ifPresent(v -> kiota.setAltitude(v.floatValue()));
        kiota.setCrs(this.getCrs());
        Optional.ofNullable(this.getDepthMeters()).ifPresent(v -> kiota.setDepthMeters(v.floatValue()));
        kiota.setLatitude(this.getLatitude());
        Optional.ofNullable(this.getLightTransmission()).ifPresent(v -> kiota.setLightTransmission(v.floatValue()));
        kiota.setLongitude(this.getLongitude());
        Optional.ofNullable(this.getOxygenMlL()).ifPresent(v -> kiota.setOxygenMlL(v.floatValue()));
        kiota.setPhi(this.getPhi());
        kiota.setPosePositionUnits(this.getPosePositionUnits());
        Optional.ofNullable(this.getPressureDbar()).ifPresent(v -> kiota.setPressureDbar(v.floatValue()));
        kiota.setPsi(this.getPsi());
        Optional.ofNullable(this.getSalinity()).ifPresent(v -> kiota.setSalinity(v.floatValue()));
        Optional.ofNullable(this.getTemperatureCelsius()).ifPresent(v -> kiota.setTemperatureCelsius(v.floatValue()));
        kiota.setTheta(this.getTheta());
        kiota.setX(this.getX());
        kiota.setY(this.getY());
        kiota.setZ(this.getZ());
        kiota.setUuid(this.getUuid());
        if (this.getLastUpdatedTime() != null) {
            kiota.setLastUpdatedTime(Instants.TIME_FORMATTER.format(this.getLastUpdatedTime()));
        }
        return kiota;
    }


}
