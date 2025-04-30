package org.mbari.vars.annosaurus.sdk.r1;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.mbari.vars.annosaurus.sdk.r1.models.CachedVideoReference;

public interface VideoReferenceService {

    CompletableFuture<List<String>> findAllMissionIds();

    CompletableFuture<List<String>> findAllMissionContacts();

    CompletableFuture<CachedVideoReference> findVideoReferenceByUuid(UUID videoReferenceUuid);

    CompletableFuture<List<UUID>> findAlLVideoReferenceUuids();

    CompletableFuture<CachedVideoReference> create(CachedVideoReference videoReference);

    CompletableFuture<CachedVideoReference> update(UUID videoReferenceUuid, CachedVideoReference videoReference);

    CompletableFuture<Void> delete(UUID videoReferenceUuid);

}