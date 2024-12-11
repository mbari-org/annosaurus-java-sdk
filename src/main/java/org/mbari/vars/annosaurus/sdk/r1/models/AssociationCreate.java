package org.mbari.vars.annosaurus.sdk.r1.models;

import java.util.UUID;

public record AssociationCreate(UUID observationUuid,
                                String linkName,
                                String toConcept,
                                String linkValue,
                                String mimeType) {

    public AssociationCreate(UUID observationUuid, Association a) {
        this(observationUuid, a.getLinkName(), a.getToConcept(), a.getLinkValue(), a.getMimeType());
    }
}
