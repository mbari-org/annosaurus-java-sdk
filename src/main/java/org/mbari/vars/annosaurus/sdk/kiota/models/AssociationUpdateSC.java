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
public class AssociationUpdateSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The link_name property
     */
    private String linkName;
    /**
     * The link_value property
     */
    private String linkValue;
    /**
     * The mime_type property
     */
    private String mimeType;
    /**
     * The observation_uuid property
     */
    private UUID observationUuid;
    /**
     * The to_concept property
     */
    private String toConcept;
    /**
     * Instantiates a new {@link AssociationUpdateSC} and sets the default values.
     */
    public AssociationUpdateSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AssociationUpdateSC}
     */
    @jakarta.annotation.Nonnull
    public static AssociationUpdateSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssociationUpdateSC();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("link_name", (n) -> { this.setLinkName(n.getStringValue()); });
        deserializerMap.put("link_value", (n) -> { this.setLinkValue(n.getStringValue()); });
        deserializerMap.put("mime_type", (n) -> { this.setMimeType(n.getStringValue()); });
        deserializerMap.put("observation_uuid", (n) -> { this.setObservationUuid(n.getUUIDValue()); });
        deserializerMap.put("to_concept", (n) -> { this.setToConcept(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the mime_type property value. The mime_type property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMimeType() {
        return this.mimeType;
    }
    /**
     * Gets the observation_uuid property value. The observation_uuid property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getObservationUuid() {
        return this.observationUuid;
    }
    /**
     * Gets the to_concept property value. The to_concept property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getToConcept() {
        return this.toConcept;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("link_name", this.getLinkName());
        writer.writeStringValue("link_value", this.getLinkValue());
        writer.writeStringValue("mime_type", this.getMimeType());
        writer.writeUUIDValue("observation_uuid", this.getObservationUuid());
        writer.writeStringValue("to_concept", this.getToConcept());
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
     * Sets the mime_type property value. The mime_type property
     * @param value Value to set for the mime_type property.
     */
    public void setMimeType(@jakarta.annotation.Nullable final String value) {
        this.mimeType = value;
    }
    /**
     * Sets the observation_uuid property value. The observation_uuid property
     * @param value Value to set for the observation_uuid property.
     */
    public void setObservationUuid(@jakarta.annotation.Nullable final UUID value) {
        this.observationUuid = value;
    }
    /**
     * Sets the to_concept property value. The to_concept property
     * @param value Value to set for the to_concept property.
     */
    public void setToConcept(@jakarta.annotation.Nullable final String value) {
        this.toConcept = value;
    }
}
