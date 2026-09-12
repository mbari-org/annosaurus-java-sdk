package org.mbari.vars.annosaurus.sdk.kiota.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AnnotationUpdateSC implements AdditionalDataHolder, Parsable {
    /**
     * The activity property
     */
    private String activity;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The concept property
     */
    private String concept;
    /**
     * The duration_millis property
     */
    private Long durationMillis;
    /**
     * The elapsed_time_millis property
     */
    private Long elapsedTimeMillis;
    /**
     * The group property
     */
    private String group;
    /**
     * The observation_timestamp property
     */
    private String observationTimestamp;
    /**
     * The observation_uuid property
     */
    private UUID observationUuid;
    /**
     * The observer property
     */
    private String observer;
    /**
     * The recorded_timestamp property
     */
    private String recordedTimestamp;
    /**
     * The timecode property
     */
    private String timecode;
    /**
     * The video_reference_uuid property
     */
    private UUID videoReferenceUuid;
    /**
     * Instantiates a new {@link AnnotationUpdateSC} and sets the default values.
     */
    public AnnotationUpdateSC() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AnnotationUpdateSC}
     */
    @jakarta.annotation.Nonnull
    public static AnnotationUpdateSC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnnotationUpdateSC();
    }
    /**
     * Gets the activity property value. The activity property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActivity() {
        return this.activity;
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
     * Gets the concept property value. The concept property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConcept() {
        return this.concept;
    }
    /**
     * Gets the duration_millis property value. The duration_millis property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getDurationMillis() {
        return this.durationMillis;
    }
    /**
     * Gets the elapsed_time_millis property value. The elapsed_time_millis property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getElapsedTimeMillis() {
        return this.elapsedTimeMillis;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getStringValue()); });
        deserializerMap.put("concept", (n) -> { this.setConcept(n.getStringValue()); });
        deserializerMap.put("duration_millis", (n) -> { this.setDurationMillis(n.getLongValue()); });
        deserializerMap.put("elapsed_time_millis", (n) -> { this.setElapsedTimeMillis(n.getLongValue()); });
        deserializerMap.put("group", (n) -> { this.setGroup(n.getStringValue()); });
        deserializerMap.put("observation_timestamp", (n) -> { this.setObservationTimestamp(n.getStringValue()); });
        deserializerMap.put("observation_uuid", (n) -> { this.setObservationUuid(n.getUUIDValue()); });
        deserializerMap.put("observer", (n) -> { this.setObserver(n.getStringValue()); });
        deserializerMap.put("recorded_timestamp", (n) -> { this.setRecordedTimestamp(n.getStringValue()); });
        deserializerMap.put("timecode", (n) -> { this.setTimecode(n.getStringValue()); });
        deserializerMap.put("video_reference_uuid", (n) -> { this.setVideoReferenceUuid(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. The group property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGroup() {
        return this.group;
    }
    /**
     * Gets the observation_timestamp property value. The observation_timestamp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getObservationTimestamp() {
        return this.observationTimestamp;
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
     * Gets the observer property value. The observer property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getObserver() {
        return this.observer;
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
     * Gets the timecode property value. The timecode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimecode() {
        return this.timecode;
    }
    /**
     * Gets the video_reference_uuid property value. The video_reference_uuid property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getVideoReferenceUuid() {
        return this.videoReferenceUuid;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("activity", this.getActivity());
        writer.writeStringValue("concept", this.getConcept());
        writer.writeLongValue("duration_millis", this.getDurationMillis());
        writer.writeLongValue("elapsed_time_millis", this.getElapsedTimeMillis());
        writer.writeStringValue("group", this.getGroup());
        writer.writeStringValue("observation_timestamp", this.getObservationTimestamp());
        writer.writeUUIDValue("observation_uuid", this.getObservationUuid());
        writer.writeStringValue("observer", this.getObserver());
        writer.writeStringValue("recorded_timestamp", this.getRecordedTimestamp());
        writer.writeStringValue("timecode", this.getTimecode());
        writer.writeUUIDValue("video_reference_uuid", this.getVideoReferenceUuid());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activity property value. The activity property
     * @param value Value to set for the activity property.
     */
    public void setActivity(@jakarta.annotation.Nullable final String value) {
        this.activity = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the concept property value. The concept property
     * @param value Value to set for the concept property.
     */
    public void setConcept(@jakarta.annotation.Nullable final String value) {
        this.concept = value;
    }
    /**
     * Sets the duration_millis property value. The duration_millis property
     * @param value Value to set for the duration_millis property.
     */
    public void setDurationMillis(@jakarta.annotation.Nullable final Long value) {
        this.durationMillis = value;
    }
    /**
     * Sets the elapsed_time_millis property value. The elapsed_time_millis property
     * @param value Value to set for the elapsed_time_millis property.
     */
    public void setElapsedTimeMillis(@jakarta.annotation.Nullable final Long value) {
        this.elapsedTimeMillis = value;
    }
    /**
     * Sets the group property value. The group property
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final String value) {
        this.group = value;
    }
    /**
     * Sets the observation_timestamp property value. The observation_timestamp property
     * @param value Value to set for the observation_timestamp property.
     */
    public void setObservationTimestamp(@jakarta.annotation.Nullable final String value) {
        this.observationTimestamp = value;
    }
    /**
     * Sets the observation_uuid property value. The observation_uuid property
     * @param value Value to set for the observation_uuid property.
     */
    public void setObservationUuid(@jakarta.annotation.Nullable final UUID value) {
        this.observationUuid = value;
    }
    /**
     * Sets the observer property value. The observer property
     * @param value Value to set for the observer property.
     */
    public void setObserver(@jakarta.annotation.Nullable final String value) {
        this.observer = value;
    }
    /**
     * Sets the recorded_timestamp property value. The recorded_timestamp property
     * @param value Value to set for the recorded_timestamp property.
     */
    public void setRecordedTimestamp(@jakarta.annotation.Nullable final String value) {
        this.recordedTimestamp = value;
    }
    /**
     * Sets the timecode property value. The timecode property
     * @param value Value to set for the timecode property.
     */
    public void setTimecode(@jakarta.annotation.Nullable final String value) {
        this.timecode = value;
    }
    /**
     * Sets the video_reference_uuid property value. The video_reference_uuid property
     * @param value Value to set for the video_reference_uuid property.
     */
    public void setVideoReferenceUuid(@jakarta.annotation.Nullable final UUID value) {
        this.videoReferenceUuid = value;
    }
}
