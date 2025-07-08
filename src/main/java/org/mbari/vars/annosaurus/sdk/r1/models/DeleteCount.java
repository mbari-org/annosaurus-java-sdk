package org.mbari.vars.annosaurus.sdk.r1.models;

import java.util.UUID;

import org.mbari.vars.annosaurus.sdk.kiota.models.DeleteCountSC;

public record DeleteCount(
    UUID videoReferenceUuid,
    Integer ancillaryDataCount,
    Integer imageReferenceCount,
    Integer associationCount, 
    Integer observationCount) {


    public static DeleteCount fromKiota(DeleteCountSC sc) {
        return new DeleteCount(
            sc.getVideoReferenceUuid(),
            sc.getAncillaryDataCount(),
            sc.getImageReferenceCount(),
            sc.getAssociationCount(),
            sc.getObservationCount()
        );
    }
    
}
