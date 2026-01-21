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
public class Metadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The columnClassName property
     */
    private String columnClassName;
    /**
     * The columnLabel property
     */
    private String columnLabel;
    /**
     * The columnName property
     */
    private String columnName;
    /**
     * The columnSize property
     */
    private Integer columnSize;
    /**
     * The columnType property
     */
    private String columnType;
    /**
     * Instantiates a new {@link Metadata} and sets the default values.
     */
    public Metadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Metadata}
     */
    @jakarta.annotation.Nonnull
    public static Metadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Metadata();
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
     * Gets the columnClassName property value. The columnClassName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getColumnClassName() {
        return this.columnClassName;
    }
    /**
     * Gets the columnLabel property value. The columnLabel property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getColumnLabel() {
        return this.columnLabel;
    }
    /**
     * Gets the columnName property value. The columnName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getColumnName() {
        return this.columnName;
    }
    /**
     * Gets the columnSize property value. The columnSize property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getColumnSize() {
        return this.columnSize;
    }
    /**
     * Gets the columnType property value. The columnType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getColumnType() {
        return this.columnType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("columnClassName", (n) -> { this.setColumnClassName(n.getStringValue()); });
        deserializerMap.put("columnLabel", (n) -> { this.setColumnLabel(n.getStringValue()); });
        deserializerMap.put("columnName", (n) -> { this.setColumnName(n.getStringValue()); });
        deserializerMap.put("columnSize", (n) -> { this.setColumnSize(n.getIntegerValue()); });
        deserializerMap.put("columnType", (n) -> { this.setColumnType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("columnClassName", this.getColumnClassName());
        writer.writeStringValue("columnLabel", this.getColumnLabel());
        writer.writeStringValue("columnName", this.getColumnName());
        writer.writeIntegerValue("columnSize", this.getColumnSize());
        writer.writeStringValue("columnType", this.getColumnType());
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
     * Sets the columnClassName property value. The columnClassName property
     * @param value Value to set for the columnClassName property.
     */
    public void setColumnClassName(@jakarta.annotation.Nullable final String value) {
        this.columnClassName = value;
    }
    /**
     * Sets the columnLabel property value. The columnLabel property
     * @param value Value to set for the columnLabel property.
     */
    public void setColumnLabel(@jakarta.annotation.Nullable final String value) {
        this.columnLabel = value;
    }
    /**
     * Sets the columnName property value. The columnName property
     * @param value Value to set for the columnName property.
     */
    public void setColumnName(@jakarta.annotation.Nullable final String value) {
        this.columnName = value;
    }
    /**
     * Sets the columnSize property value. The columnSize property
     * @param value Value to set for the columnSize property.
     */
    public void setColumnSize(@jakarta.annotation.Nullable final Integer value) {
        this.columnSize = value;
    }
    /**
     * Sets the columnType property value. The columnType property
     * @param value Value to set for the columnType property.
     */
    public void setColumnType(@jakarta.annotation.Nullable final String value) {
        this.columnType = value;
    }
}
