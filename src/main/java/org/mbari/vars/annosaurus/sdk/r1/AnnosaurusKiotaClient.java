package org.mbari.vars.annosaurus.sdk.r1;

import java.net.URI;
import java.net.URL;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

import org.mbari.vars.annosaurus.sdk.AnnosaurusFactory;
import org.mbari.vars.annosaurus.sdk.kiota.Annosaurus;
import org.mbari.vars.annosaurus.sdk.kiota.models.CountForVideoReferenceSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.NotFound;
import org.mbari.vars.annosaurus.sdk.r1.models.AncillaryData;
import org.mbari.vars.annosaurus.sdk.r1.models.AncillaryDataDeleteCount;
import org.mbari.vars.annosaurus.sdk.r1.models.Annotation;
import org.mbari.vars.annosaurus.sdk.r1.models.AnnotationCount;
import org.mbari.vars.annosaurus.sdk.r1.models.Association;
import org.mbari.vars.annosaurus.sdk.r1.models.CachedVideoReference;
import org.mbari.vars.annosaurus.sdk.r1.models.ConceptAssociationRequest;
import org.mbari.vars.annosaurus.sdk.r1.models.ConceptAssociationResponse;
import org.mbari.vars.annosaurus.sdk.r1.models.ConceptCount;
import org.mbari.vars.annosaurus.sdk.r1.models.ConceptsRenamed;
import org.mbari.vars.annosaurus.sdk.r1.models.ConcurrentRequest;
import org.mbari.vars.annosaurus.sdk.r1.models.ConcurrentRequestCount;
import org.mbari.vars.annosaurus.sdk.r1.models.Count;
import org.mbari.vars.annosaurus.sdk.r1.models.DeleteCount;
import org.mbari.vars.annosaurus.sdk.r1.models.Image;
import org.mbari.vars.annosaurus.sdk.r1.models.ImagedMoment;
import org.mbari.vars.annosaurus.sdk.r1.models.Index;
import org.mbari.vars.annosaurus.sdk.r1.models.MultiRequest;
import org.mbari.vars.annosaurus.sdk.r1.models.MultiRequestCount;
import org.mbari.vars.annosaurus.sdk.r1.models.ObservationsUpdate;

public class AnnosaurusKiotaClient implements AnnotationService {

    private final Annosaurus annosaurus;
    protected final ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

    public AnnosaurusKiotaClient(URI baseUri, String apiKey) {
        this.annosaurus = AnnosaurusFactory.create(baseUri.toString(), apiKey);
    }

    @Override
    public CompletableFuture<AnnotationCount> countAnnotations(UUID videoReferenceUuid) {
        return findOne(() -> annosaurus.v1()
                .observations()
                .videoreference()
                .count()
                .byVideoReferenceUuid(videoReferenceUuid)
                .get()).thenApply((opt) -> {
                    if (opt.isEmpty()) {
                        return new AnnotationCount(videoReferenceUuid, 0);
                    }
                    else {
                        var response = opt.get();
                        return new AnnotationCount(response.getVideoReferenceUuid(), response.getCount());
                    }
                });
    }

    @Override
    public CompletableFuture<List<AnnotationCount>> countAnnotationsGroupByVideoReferenceUuid() {
        return CompletableFuture.supplyAsync(() -> {
            var response = annosaurus.v1()
                .observations()
                .counts()
                .get();
            
            return response.stream()
                .map(r -> new AnnotationCount(r.getVideoReferenceUuid(), r.getCount()))
                .toList();
        }, executor);
    }

    @Override
    public CompletableFuture<ConcurrentRequestCount> countByConcurrentRequest(ConcurrentRequest concurrentRequest) {
        
        var cr = new org.mbari.vars.annosaurus.sdk.kiota.models.ConcurrentRequest();
        cr.setVideoReferenceUuids(concurrentRequest.getVideoReferenceUuids());
        cr.setStartTimestamp(concurrentRequest.getStartTimestamp().toString());
        cr.setEndTimestamp(concurrentRequest.getEndTimestamp().toString());

        return findOne(() -> annosaurus.v1()
                .annotations()
                .concurrent()
                .count()
                .post(cr)
        ).thenApply((opt) -> {
            if (opt.isEmpty()) {
                return new ConcurrentRequestCount(concurrentRequest, 0L);
            }
            else {
                var response = opt.get();
                return new ConcurrentRequestCount(concurrentRequest, response.getCount());
            }
        });

    }

    @Override
    public CompletableFuture<MultiRequestCount> countByMultiRequest(MultiRequest multiRequest) {
        var mr = new org.mbari.vars.annosaurus.sdk.kiota.models.MultiRequest();
        mr.setVideoReferenceUuids(multiRequest.getVideoReferenceUuids());

        return CompletableFuture.supplyAsync(() -> {
            var response = annosaurus.v1()
                .annotations()
                .multi()
                .count()
                .post(mr);
            
            return new MultiRequestCount(multiRequest, response.getCount());
        }, executor);

    }

    @Override
    public CompletableFuture<List<AnnotationCount>> countImagedMomentsGroupByVideoReferenceUuid() {
        return CompletableFuture.supplyAsync(() -> {
            var response = annosaurus.v1()
                .observations()
                .counts()
                .get();
            
            return response.stream()
                .map(r -> new AnnotationCount(r.getVideoReferenceUuid(), r.getCount()))
                .toList();
        }, executor);

    }

    @Override
    public CompletableFuture<ConceptCount> countObservationsByConcept(String concept) {
        return findOne(() -> annosaurus.v1()
                .observations()
                .concept()
                .count()
                .byConcept(concept)
                .get()
        ).thenAccept((opt) -> {
            if (opt.isEmpty()) {
                return new ConceptCount(concept, 0);
            }
            else {
                var response = opt.get();
                return new ConceptCount(response.getConcept(), response.getCount().intValue());
            }
        });
    }

    @Override
    public CompletableFuture<AnnotationCount> countImagedMomentsModifiedBefore(UUID videoReferenceUuid, Instant date) {

        return findOne(() -> annosaurus.v1()
                .imagedmoments()
                .videoreference()
                .modified()
                .byUuid(videoReferenceUuid)
                .byDate(date.toString())
                .get()
        ).thenApply((opt) -> {
            if (opt.isEmpty()) {
                return new AnnotationCount(videoReferenceUuid, 0);
            }
            else {
                var response = opt.get();
                return new AnnotationCount(response.getVideoReferenceUuid(), response.getCount());
            }
        });
    }

    @Override
    public CompletableFuture<Annotation> createAnnotation(Annotation annotation) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createAnnotation'");
    }

    @Override
    public CompletableFuture<Collection<Annotation>> createAnnotations(Collection<Annotation> annotations) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createAnnotations'");
    }

    @Override
    public CompletableFuture<Association> createAssociation(UUID observationUuid, Association association) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createAssociation'");
    }

    @Override
    public CompletableFuture<Association> createAssociation(UUID observationUuid, Association association,
            UUID associationUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createAssociation'");
    }

    @Override
    public CompletableFuture<Image> createImage(Image image) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createImage'");
    }

    @Override
    public CompletableFuture<List<AncillaryData>> createOrUpdateAncillaryData(List<AncillaryData> ancillaryData) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createOrUpdateAncillaryData'");
    }

    @Override
    public CompletableFuture<CachedVideoReference> createCachedVideoReference(CachedVideoReference cvr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCachedVideoReference'");
    }

    @Override
    public CompletableFuture<AncillaryDataDeleteCount> deleteAncillaryDataByVideoReference(UUID videoReferenceUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAncillaryDataByVideoReference'");
    }

    @Override
    public CompletableFuture<Boolean> deleteAnnotation(UUID observationUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAnnotation'");
    }

    @Override
    public CompletableFuture<Boolean> deleteAnnotations(Collection<UUID> observationUuids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAnnotations'");
    }

    @Override
    public CompletableFuture<DeleteCount> deleteAnnotationsByVideoReferenceUuid(UUID videoReferenceUuid) {
        return CompletableFuture.supplyAsync(() -> {
            var response = annosaurus.v1()
                .fast()
                .videoreference()
                .byVideoReferenceUuid(videoReferenceUuid)
                .delete();
            return DeleteCount.fromKiota(response); // No Content
        }, executor);
    }

    @Override
    public CompletableFuture<Boolean> deleteAssociation(UUID associationUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAssociation'");
    }

    @Override
    public CompletableFuture<Boolean> deleteAssociations(Collection<UUID> associationUuids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAssociations'");
    }

    @Override
    public CompletableFuture<Boolean> deleteImage(UUID imageReferenceUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteImage'");
    }

    @Override
    public CompletableFuture<Annotation> deleteDuration(UUID observationUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDuration'");
    }

    @Override
    public CompletableFuture<Boolean> deleteCacheVideoReference(UUID uuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCacheVideoReference'");
    }

    @Override
    public CompletableFuture<List<String>> findActivities() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findActivities'");
    }

    @Override
    public CompletableFuture<List<UUID>> findAllVideoReferenceUuids() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllVideoReferenceUuids'");
    }

    @Override
    public CompletableFuture<AncillaryData> findAncillaryData(UUID observationUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAncillaryData'");
    }

    @Override
    public CompletableFuture<List<AncillaryData>> findAncillaryDataByVideoReference(UUID videoReferenceUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAncillaryDataByVideoReference'");
    }

    @Override
    public CompletableFuture<List<Annotation>> findByConcept(String concept, Boolean data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByConcept'");
    }

    @Override
    public CompletableFuture<List<Annotation>> findByConcept(String concept, Long limit, Long offset, Boolean data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByConcept'");
    }

    @Override
    public CompletableFuture<List<Annotation>> findAnnotations(UUID videoReferenceUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAnnotations'");
    }

    @Override
    public CompletableFuture<List<Annotation>> findAnnotations(UUID videoReferenceUuid, boolean data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAnnotations'");
    }

    @Override
    public CompletableFuture<List<Annotation>> findAnnotations(UUID videoReferenceUuid, Long limit, Long offset) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAnnotations'");
    }

    @Override
    public CompletableFuture<List<Annotation>> findAnnotations(UUID videoReferenceUuid, Long limit, Long offset,
            Boolean data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAnnotations'");
    }

    @Override
    public CompletableFuture<Association> findAssociationByUuid(UUID associationUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAssociationByUuid'");
    }

    @Override
    public CompletableFuture<ConceptAssociationResponse> findByConceptAssociationRequest(
            ConceptAssociationRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByConceptAssociationRequest'");
    }

    @Override
    public CompletableFuture<List<Annotation>> findByConcurrentRequest(ConcurrentRequest concurrentRequest, long limit,
            long offset) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByConcurrentRequest'");
    }

    @Override
    public CompletableFuture<List<Annotation>> findByImageReference(UUID imageReferenceUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByImageReference'");
    }

    @Override
    public CompletableFuture<List<Annotation>> findByMultiRequest(MultiRequest multiRequest, long limit, long offset) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByMultiRequest'");
    }

    @Override
    public CompletableFuture<Annotation> findByUuid(UUID observationUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByUuid'");
    }

    @Override
    public CompletableFuture<List<Association>> findByVideoReferenceAndLinkName(UUID videoReferenceUuid,
            String linkName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByVideoReferenceAndLinkName'");
    }

    @Override
    public CompletableFuture<List<Association>> findByVideoReferenceAndLinkNameAndConcept(UUID videoReferenceUuid,
            String linkName, String concept) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByVideoReferenceAndLinkNameAndConcept'");
    }

    @Override
    public CompletableFuture<List<String>> findGroups() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findGroups'");
    }

    @Override
    public CompletableFuture<Image> findImageByUrl(URL url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findImageByUrl'");
    }

    @Override
    public CompletableFuture<Image> findImageByUuid(UUID imageReferenceUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findImageByUuid'");
    }

    @Override
    public CompletableFuture<List<Image>> findImagesByVideoReferenceUuid(UUID videoReferenceUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findImagesByVideoReferenceUuid'");
    }

    @Override
    public CompletableFuture<List<ImagedMoment>> findImagedMomentsByVideoReferenceUuid(UUID videoReferenceUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findImagedMomentsByVideoReferenceUuid'");
    }

    @Override
    public CompletableFuture<List<Index>> findIndicesByVideoReferenceUuid(UUID videoReferenceUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findIndicesByVideoReferenceUuid'");
    }

    @Override
    public CompletableFuture<CachedVideoReference> findVideoReferenceByVideoReferenceUuid(UUID videoReferenceUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findVideoReferenceByVideoReferenceUuid'");
    }

    @Override
    public CompletableFuture<Collection<AncillaryData>> merge(UUID videoReferenceUuid, Collection<AncillaryData> data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'merge'");
    }

    @Override
    public CompletableFuture<ConceptsRenamed> renameConcepts(String oldConcept, String newConcept) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'renameConcepts'");
    }

    @Override
    public CompletableFuture<ConceptsRenamed> renameToConcepts(String oldConcept, String newConcept) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'renameToConcepts'");
    }

    @Override
    public CompletableFuture<Annotation> updateAnnotation(Annotation annotation) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAnnotation'");
    }

    @Override
    public CompletableFuture<Collection<Annotation>> updateAnnotations(Collection<Annotation> annotations) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAnnotations'");
    }

    @Override
    public CompletableFuture<Association> updateAssociation(Association association) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAssociation'");
    }

    @Override
    public CompletableFuture<Collection<Association>> updateAssociations(Collection<Association> associations) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAssociations'");
    }

    @Override
    public CompletableFuture<Image> updateImage(Image image) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateImage'");
    }

    @Override
    public CompletableFuture<List<Index>> updateIndexRecordedTimestamps(Collection<Index> indices) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateIndexRecordedTimestamps'");
    }

    @Override
    public CompletableFuture<Count> updateObservations(ObservationsUpdate update) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateObservations'");
    }

    @Override
    public CompletableFuture<Collection<Annotation>> updateRecordedTimestampsForTapes(
            Collection<Annotation> annotations) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateRecordedTimestampsForTapes'");
    }

    @Override
    public CompletableFuture<Optional<Index>> updateRecordedTimestamp(UUID imagedMomentUuid,
            Instant recordedTimestamp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateRecordedTimestamp'");
    }

    @Override
    public CompletableFuture<CachedVideoReference> updateCachedVideoReference(CachedVideoReference cvr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCachedVideoReference'");
    }

    @Override
    public CompletableFuture<Count> countImagesByVideoReferenceUuid(UUID videoReferenceUuid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'countImagesByVideoReferenceUuid'");
    }

    @Override
    public CompletableFuture<List<Image>> findImagesByVideoReferenceUuid(UUID videoReferenceUuid, Long limit,
            Long offset) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findImagesByVideoReferenceUuid'");
    }

    /**
     * Helper method that executes a supplier and wraps the result in an Optional.
     * <p>
     * Handles {@link NotFound} exceptions by returning an empty Optional instead
     * of propagating the exception. Executes asynchronously using virtual threads.
     * </p>
     *
     * @param <A> the type of the result
     * @param supplier the supplier to execute
     * @return a CompletableFuture containing an Optional with the result, or empty if not found
     */
    private <A> CompletableFuture<Optional<A>> findOne(Supplier<A> supplier) {
        return findOneOrNull(supplier).thenApply(Optional::ofNullable);
    }

    /**
     * Helper method that executes a supplier and returns null on NotFound.
     * <p>
     * Handles {@link NotFound} exceptions by returning null instead of propagating
     * the exception. This simplifies error handling for callers who expect nullable
     * results. Executes asynchronously using virtual threads.
     * </p>
     *
     * @param <A> the type of the result
     * @param supplier the supplier to execute
     * @return a CompletableFuture containing the result, or null if not found
     */
    private <A> CompletableFuture<A> findOneOrNull(Supplier<A> supplier) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return supplier.get();
            } catch (NotFound e) {
                return null;
            }
        }, executor);
    }

    /**
     * Helper method that executes a supplier and returns an empty list on NotFound.
     * <p>
     * Handles {@link NotFound} exceptions by returning an empty list instead of
     * propagating the exception. This simplifies error handling for callers who
     * expect list results. Executes asynchronously using virtual threads.
     * </p>
     *
     * @param <A> the type of elements in the result list
     * @param supplier the supplier to execute
     * @return a CompletableFuture containing the result list, or an empty list if not found
     */
    private <A> CompletableFuture<List<A>> findMany(Supplier<List<A>> supplier) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return supplier.get();
            } catch (NotFound e) {
                return List.of();
            }
        }, executor);
    }
    
}
