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
public class ConceptAssociationResponseSC implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The concept_association_request property
     */
    private ConceptAssociationRequestSC conceptAssociationRequest;
    /**
     * The concept_associations property
     */
    private java.util.List<ConceptAssociationSC> conceptAssociations;
    /**
     * Instantiates a new {@link ConceptAssociationResponseSC} and sets the default values.
     */
    public ConceptAssociationResponseSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConceptAssociationResponseSC}
     */
    @jakarta.annotation.Nonnull
    public static ConceptAssociationResponseSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConceptAssociationResponseSC();
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
     * Gets the concept_association_request property value. The concept_association_request property
     * @return a {@link ConceptAssociationRequestSC}
     */
    @jakarta.annotation.Nullable
    public ConceptAssociationRequestSC getConceptAssociationRequest() {
        return this.conceptAssociationRequest;
    }
    /**
     * Gets the concept_associations property value. The concept_associations property
     * @return a {@link java.util.List<ConceptAssociationSC>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConceptAssociationSC> getConceptAssociations() {
        return this.conceptAssociations;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("concept_association_request", (n) -> { this.setConceptAssociationRequest(n.getObjectValue(ConceptAssociationRequestSC::createFromDiscriminatorValue)); });
        deserializerMap.put("concept_associations", (n) -> { this.setConceptAssociations(n.getCollectionOfObjectValues(ConceptAssociationSC::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("concept_association_request", this.getConceptAssociationRequest());
        writer.writeCollectionOfObjectValues("concept_associations", this.getConceptAssociations());
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
     * Sets the concept_association_request property value. The concept_association_request property
     * @param value Value to set for the concept_association_request property.
     */
    public void setConceptAssociationRequest(@jakarta.annotation.Nullable final ConceptAssociationRequestSC value) {
        this.conceptAssociationRequest = value;
    }
    /**
     * Sets the concept_associations property value. The concept_associations property
     * @param value Value to set for the concept_associations property.
     */
    public void setConceptAssociations(@jakarta.annotation.Nullable final java.util.List<ConceptAssociationSC> value) {
        this.conceptAssociations = value;
    }
}
