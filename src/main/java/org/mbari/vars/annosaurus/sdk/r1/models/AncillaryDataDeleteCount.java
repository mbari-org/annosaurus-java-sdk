package org.mbari.vars.annosaurus.sdk.r1.models;

import java.util.UUID;

import org.mbari.vars.annosaurus.sdk.kiota.models.DeleteCountSC;

/**
 * @author Brian Schlining
 * @since 2018-07-05T15:30:00
 */
public class AncillaryDataDeleteCount {
    UUID videoReferenceUuid;
    Integer count;

    public AncillaryDataDeleteCount(UUID videoReferenceUuid, Integer count) {
        this.videoReferenceUuid = videoReferenceUuid;
        this.count = count;
    }

    public UUID getVideoReferenceUuid() {
        return videoReferenceUuid;
    }

    public Integer getCount() {
        return count;
    }

    public DeleteCountSC toKiota() {
        DeleteCountSC sc = new DeleteCountSC();
        sc.setVideoReferenceUuid(videoReferenceUuid);
        sc.setAncillaryDataCount(count);
        return sc;
    }

    public static AncillaryDataDeleteCount fromKiota(DeleteCountSC kiota) {
        return new AncillaryDataDeleteCount(kiota.getVideoReferenceUuid(), kiota.getAncillaryDataCount());
    }

}
