/*
 * Copyright © 2025 MBARI (brian@mbari.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mbari.vars.annosaurus.sdk.r1.models;

import com.google.gson.annotations.SerializedName;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Instant;
import java.util.UUID;

import org.mbari.vars.annosaurus.sdk.kiota.models.ImageReferenceSC;

/**
 * @author Brian Schlining
 * @since 2017-05-11T14:01:00
 */
public class ImageReference implements Cloneable {
    private UUID uuid;
    private String description;
    private URL url;
    private String format;
    private Instant lastUpdatedTime;

    @SerializedName("width_pixels")
    private Integer width;

    @SerializedName("height_pixels")
    private Integer height;

    public ImageReference() {
    }

    /**
     * Copy constructor
     * @param i
     */
    public ImageReference(ImageReference i) {
        uuid = i.uuid;
        description = i.description;
        url = i.url;
        format = i.format;
        lastUpdatedTime = i.lastUpdatedTime;
        width = i.width;
        height = i.height;
    }

    public ImageReference(Image i) {
        uuid = i.getImageReferenceUuid();
        description = i.getDescription();
        url = i.getUrl();
        format = i.getFormat();
        lastUpdatedTime = i.getRecordedTimestamp();
        width = i.getWidth();
        height = i.getHeight();
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Instant getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Instant lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public ImageReferenceSC toKiota() {
        var sc = new ImageReferenceSC();
        sc.setUuid(this.getUuid());
        sc.setDescription(this.getDescription());
        if (this.getUrl() != null) sc.setUrl(this.getUrl().toString());
        sc.setFormat(this.getFormat());
        sc.setWidthPixels(this.getWidth());
        sc.setHeightPixels(this.getHeight());
        return sc;
    }

    public static ImageReference fromKiota(ImageReferenceSC sc) {
        if (sc == null) {
            return null;
        }
        var i = new ImageReference();
        i.setUuid(sc.getUuid());
        i.setDescription(sc.getDescription());
        try {
            i.setUrl(URI.create(sc.getUrl()).toURL());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        i.setFormat(sc.getFormat());
        if (sc.getLastUpdatedTime() != null) {
            i.setLastUpdatedTime(Instant.parse(sc.getLastUpdatedTime()));
        }

        i.setWidth(sc.getWidthPixels());
        i.setHeight(sc.getHeightPixels());
        return i;
    }
}
