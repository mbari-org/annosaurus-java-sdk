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
public class ImagedMomentTimestampUpdateSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The annotation_count property
     */
    private Integer annotationCount;
    /**
     * The timestamps_updated property
     */
    private Integer timestampsUpdated;
    /**
     * Instantiates a new {@link ImagedMomentTimestampUpdateSC} and sets the default values.
     */
    public ImagedMomentTimestampUpdateSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ImagedMomentTimestampUpdateSC}
     */
    @jakarta.annotation.Nonnull
    public static ImagedMomentTimestampUpdateSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImagedMomentTimestampUpdateSC();
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
     * Gets the annotation_count property value. The annotation_count property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAnnotationCount() {
        return this.annotationCount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("annotation_count", (n) -> { this.setAnnotationCount(n.getIntegerValue()); });
        deserializerMap.put("timestamps_updated", (n) -> { this.setTimestampsUpdated(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the timestamps_updated property value. The timestamps_updated property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTimestampsUpdated() {
        return this.timestampsUpdated;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("annotation_count", this.getAnnotationCount());
        writer.writeIntegerValue("timestamps_updated", this.getTimestampsUpdated());
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
     * Sets the annotation_count property value. The annotation_count property
     * @param value Value to set for the annotation_count property.
     */
    public void setAnnotationCount(@jakarta.annotation.Nullable final Integer value) {
        this.annotationCount = value;
    }
    /**
     * Sets the timestamps_updated property value. The timestamps_updated property
     * @param value Value to set for the timestamps_updated property.
     */
    public void setTimestampsUpdated(@jakarta.annotation.Nullable final Integer value) {
        this.timestampsUpdated = value;
    }
}
