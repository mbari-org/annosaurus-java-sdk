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
public class RenameCountSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The count property
     */
    private Long count;
    /**
     * The new_concept property
     */
    private String newConcept;
    /**
     * The old_concept property
     */
    private String oldConcept;
    /**
     * Instantiates a new {@link RenameCountSC} and sets the default values.
     */
    public RenameCountSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RenameCountSC}
     */
    @jakarta.annotation.Nonnull
    public static RenameCountSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RenameCountSC();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("count", (n) -> { this.setCount(n.getLongValue()); });
        deserializerMap.put("new_concept", (n) -> { this.setNewConcept(n.getStringValue()); });
        deserializerMap.put("old_concept", (n) -> { this.setOldConcept(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the new_concept property value. The new_concept property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNewConcept() {
        return this.newConcept;
    }
    /**
     * Gets the old_concept property value. The old_concept property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOldConcept() {
        return this.oldConcept;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("count", this.getCount());
        writer.writeStringValue("new_concept", this.getNewConcept());
        writer.writeStringValue("old_concept", this.getOldConcept());
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
     * Sets the count property value. The count property
     * @param value Value to set for the count property.
     */
    public void setCount(@jakarta.annotation.Nullable final Long value) {
        this.count = value;
    }
    /**
     * Sets the new_concept property value. The new_concept property
     * @param value Value to set for the new_concept property.
     */
    public void setNewConcept(@jakarta.annotation.Nullable final String value) {
        this.newConcept = value;
    }
    /**
     * Sets the old_concept property value. The old_concept property
     * @param value Value to set for the old_concept property.
     */
    public void setOldConcept(@jakarta.annotation.Nullable final String value) {
        this.oldConcept = value;
    }
}
