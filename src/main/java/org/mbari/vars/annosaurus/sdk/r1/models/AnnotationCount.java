package org.mbari.vars.annosaurus.sdk.r1.models;

import java.util.UUID;

/**
 * @author Brian Schlining
 * @since 2017-05-25T10:21:00
 */
public class AnnotationCount {
    private UUID videoReferenceUuid;
    private Integer count;

    public AnnotationCount(UUID videoReferenceUuid, Integer count) {
        this.videoReferenceUuid = videoReferenceUuid;
        this.count = count;
    }

    public UUID getVideoReferenceUuid() {
        return videoReferenceUuid;
    }

    public Integer getCount() {
        return count;
    }
}
