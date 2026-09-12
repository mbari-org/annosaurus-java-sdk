/*
 * Copyright © 2025 MBARI (brian@mbari.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mbari.vars.annosaurus.sdk.r1;

import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
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
import org.mbari.vars.annosaurus.sdk.kiota.models.AnnotationCreateSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.AnnotationSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.AnnotationUpdateSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.AssociationSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.AssociationUpdateSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.BulkAnnotationSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.CachedVideoReferenceInfoCreateSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.CachedVideoReferenceInfoSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.CachedVideoReferenceInfoUpdateSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.ConceptAssociationRequestSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.ImageCreateSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.ImageSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.ImageUpdateSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.ImagedMomentSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.IndexSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.IndexUpdateSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.MoveImagedMoments;
import org.mbari.vars.annosaurus.sdk.kiota.models.NotFound;
import org.mbari.vars.annosaurus.sdk.kiota.models.ObservationSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.RenameConcept;
import org.mbari.vars.annosaurus.sdk.kiota.models.VideoTimestampSC;
import org.mbari.vars.annosaurus.sdk.r1.models.AncillaryData;
import org.mbari.vars.annosaurus.sdk.r1.models.AncillaryDataDeleteCount;
import org.mbari.vars.annosaurus.sdk.r1.models.Annotation;
import org.mbari.vars.annosaurus.sdk.r1.models.AnnotationCount;
import org.mbari.vars.annosaurus.sdk.r1.models.Association;
import org.mbari.vars.annosaurus.sdk.r1.models.CachedVideoReference;
import org.mbari.vars.annosaurus.sdk.r1.models.ConceptAssociation;
import org.mbari.vars.annosaurus.sdk.r1.models.ConceptAssociationRequest;
import org.mbari.vars.annosaurus.sdk.r1.models.ConceptAssociationResponse;
import org.mbari.vars.annosaurus.sdk.r1.models.ConceptCount;
import org.mbari.vars.annosaurus.sdk.r1.models.ConceptsRenamed;
import org.mbari.vars.annosaurus.sdk.r1.models.ConcurrentRequest;
import org.mbari.vars.annosaurus.sdk.r1.models.ConcurrentRequestCount;
import org.mbari.vars.annosaurus.sdk.r1.models.Count;
import org.mbari.vars.annosaurus.sdk.r1.models.DeleteCount;
import org.mbari.vars.annosaurus.sdk.r1.models.Image;
import org.mbari.vars.annosaurus.sdk.r1.models.ImageReference;
import org.mbari.vars.annosaurus.sdk.r1.models.ImagedMoment;
import org.mbari.vars.annosaurus.sdk.r1.models.Index;
import org.mbari.vars.annosaurus.sdk.r1.models.MultiRequest;
import org.mbari.vars.annosaurus.sdk.r1.models.MultiRequestCount;
import org.mbari.vars.annosaurus.sdk.r1.models.ObservationsUpdate;
import org.mbari.vcr4j.time.Timecode;

public class AnnosaurusKiotaClient implements AnnotationService {

    private final Annosaurus annosaurus;
    protected final ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

    public AnnosaurusKiotaClient(URI baseUri, String apiKey) {
        this.annosaurus = AnnosaurusFactory.create(baseUri.toString(), apiKey);
    }

    public AnnosaurusKiotaClient(Annosaurus annosaurus) {
        this.annosaurus = annosaurus;
    }

    public Annosaurus getAnnosaurus() {
        return annosaurus;
    }

    @Override
    public CompletableFuture<Count> bulkMove(UUID videoReferenceUuid, List<UUID> imagedMomentUuids, Instant videoReferenceStartTimestamp) {
        var body = new MoveImagedMoments();
        body.setVideoReferenceUuid(videoReferenceUuid);
        body.setImagedMomentUuids(new ArrayList<>(imagedMomentUuids));
        return CompletableFuture.supplyAsync(() -> {
            var response = annosaurus.v1().imagedmoments().bulk().move().put(body);
            return new Count(response.getCount());
        }, executor);
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
        ).thenApply((opt) -> {
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
        var body = annotationToCreateSC(annotation);
        return findOneOrNull(() -> annosaurus.v1().annotations().post(body))
                .thenApply(sc -> sc == null ? null : annotationFromSC(sc));
    }

    @Override
    public CompletableFuture<Collection<Annotation>> createAnnotations(Collection<Annotation> annotations) {
        var body = annotations.stream().map(AnnosaurusKiotaClient::annotationToBulkSC).toList();
        return findMany(() -> annosaurus.v1().annotations().bulk().post(body))
                .thenApply(list -> (Collection<Annotation>) list.stream().map(AnnosaurusKiotaClient::annotationFromSC).toList());
    }

    @Override
    public CompletableFuture<Association> createAssociation(UUID observationUuid, Association association) {
        var body = Association.fromKiota(association);
        body.setObservationUuid(observationUuid);
        return findOneOrNull(() -> annosaurus.v1().associations().post(body))
                .thenApply(sc -> sc == null ? null : Association.toKiota(sc));
    }

    @Override
    public CompletableFuture<Association> createAssociation(UUID observationUuid, Association association, UUID associationUuid) {
        var body = Association.fromKiota(association);
        body.setObservationUuid(observationUuid);
        if (associationUuid != null) body.setUuid(associationUuid);
        return findOneOrNull(() -> annosaurus.v1().associations().post(body))
                .thenApply(sc -> sc == null ? null : Association.toKiota(sc));
    }

    @Override
    public CompletableFuture<Image> createImage(Image image) {
        var body = imageToCreateSC(image);
        return findOneOrNull(() -> annosaurus.v1().images().post(body))
                .thenApply(sc -> sc == null ? null : imageFromSC(sc));
    }

    @Override
    public CompletableFuture<List<AncillaryData>> createOrUpdateAncillaryData(List<AncillaryData> ancillaryData) {
        var body = ancillaryData.stream().map(AncillaryData::toKiota).toList();
        return findMany(() -> annosaurus.v1().ancillarydata().bulk().post(body))
                .thenApply(list -> list.stream().map(AncillaryData::fromKiota).toList());
    }

    @Override
    public CompletableFuture<CachedVideoReference> createCachedVideoReference(CachedVideoReference cvr) {
        var body = cvrToCreateSC(cvr);
        return findOneOrNull(() -> annosaurus.v1().videoreferences().post(body))
                .thenApply(sc -> sc == null ? null : cvrFromSC(sc));
    }

    @Override
    public CompletableFuture<AncillaryDataDeleteCount> deleteAncillaryDataByVideoReference(UUID videoReferenceUuid) {
        return CompletableFuture.supplyAsync(() -> {
            var response = annosaurus.v1().ancillarydata().videoreference().byVideoReferenceUuid(videoReferenceUuid).delete();
            return new AncillaryDataDeleteCount(response.getVideoReferenceUuid(), response.getCount());
        }, executor);
    }

    @Override
    public CompletableFuture<Boolean> deleteAnnotation(UUID observationUuid) {
        return CompletableFuture.supplyAsync(() -> {
            annosaurus.v1().observations().byObservationUuid(observationUuid).delete();
            return true;
        }, executor);
    }

    @Override
    public CompletableFuture<Boolean> deleteAnnotations(Collection<UUID> observationUuids) {
        var body = new ArrayList<>(observationUuids);
        return CompletableFuture.supplyAsync(() -> {
            annosaurus.v1().observations().deletePath().post(body);
            return true;
        }, executor);
    }

    @Override
    public CompletableFuture<DeleteCount> deleteAnnotationsByVideoReferenceUuid(UUID videoReferenceUuid) {
        return CompletableFuture.supplyAsync(() -> {
            var response = annosaurus.v1()
                .fast()
                .videoreference()
                .byVideoReferenceUuid(videoReferenceUuid)
                .delete();
            return DeleteCount.fromKiota(response);
        }, executor);
    }

    @Override
    public CompletableFuture<Boolean> deleteAssociation(UUID associationUuid) {
        return CompletableFuture.supplyAsync(() -> {
            annosaurus.v1().associations().byAssociationUuId(associationUuid).delete();
            return true;
        }, executor);
    }

    @Override
    public CompletableFuture<Boolean> deleteAssociations(Collection<UUID> associationUuids) {
        var body = new ArrayList<>(associationUuids);
        return CompletableFuture.supplyAsync(() -> {
            annosaurus.v1().associations().deletePath().post(body);
            return true;
        }, executor);
    }

    @Override
    public CompletableFuture<Boolean> deleteImage(UUID imageReferenceUuid) {
        return CompletableFuture.supplyAsync(() -> {
            annosaurus.v1().imagereferences().byImageReferenceUuid(imageReferenceUuid).delete();
            return true;
        }, executor);
    }

    @Override
    public CompletableFuture<Annotation> deleteDuration(UUID observationUuid) {
        return findOneOrNull(() -> annosaurus.v1().observations().deletePath().duration().byObservationUuid(observationUuid).put())
                .thenApply(sc -> sc == null ? null : annotationFromObservationSC(sc));
    }

    @Override
    public CompletableFuture<Boolean> deleteCacheVideoReference(UUID uuid) {
        return CompletableFuture.supplyAsync(() -> {
            annosaurus.v1().videoreferences().byVideoInfoUuid(uuid).delete();
            return true;
        }, executor);
    }

    @Override
    public CompletableFuture<List<String>> findActivities() {
        return findMany(() -> annosaurus.v1().observations().activities().get());
    }

    @Override
    public CompletableFuture<List<UUID>> findAllVideoReferenceUuids() {
        return findMany(() -> annosaurus.v1().imagedmoments().videoreference().get());
    }

    @Override
    public CompletableFuture<AncillaryData> findAncillaryData(UUID observationUuid) {
        return findOneOrNull(() -> annosaurus.v1().ancillarydata().observation().byObservationUuid(observationUuid).get())
                .thenApply(sc -> sc == null ? null : AncillaryData.fromKiota(sc));
    }

    @Override
    public CompletableFuture<List<AncillaryData>> findAncillaryDataByVideoReference(UUID videoReferenceUuid) {
        return findMany(() -> annosaurus.v1().ancillarydata().videoreference().byVideoReferenceUuid(videoReferenceUuid).get())
                .thenApply(list -> list.stream().map(AncillaryData::fromKiota).toList());
    }

    @Override
    public CompletableFuture<List<Annotation>> findByConcept(String concept, Boolean data) {
        return findMany(() -> annosaurus.v1().fast().concept().byConcept(concept).get(config -> config.queryParameters.data = data))
                .thenApply(list -> list.stream().map(AnnosaurusKiotaClient::annotationFromSC).toList());
    }

    @Override
    public CompletableFuture<List<Annotation>> findByConcept(String concept, Long limit, Long offset, Boolean data) {
        return findMany(() -> annosaurus.v1().fast().concept().byConcept(concept).get(config -> {
            config.queryParameters.data = data;
            if (limit != null) config.queryParameters.limit = limit.intValue();
            if (offset != null) config.queryParameters.offset = offset.intValue();
        })).thenApply(list -> list.stream().map(AnnosaurusKiotaClient::annotationFromSC).toList());
    }

    @Override
    public CompletableFuture<List<Annotation>> findAnnotations(UUID videoReferenceUuid) {
        return findAnnotations(videoReferenceUuid, null, null, false);
    }

    @Override
    public CompletableFuture<List<Annotation>> findAnnotations(UUID videoReferenceUuid, boolean data) {
        return findAnnotations(videoReferenceUuid, null, null, data);
    }

    @Override
    public CompletableFuture<List<Annotation>> findAnnotations(UUID videoReferenceUuid, Long limit, Long offset) {
        return findAnnotations(videoReferenceUuid, limit, offset, false);
    }

    @Override
    public CompletableFuture<List<Annotation>> findAnnotations(UUID videoReferenceUuid, Long limit, Long offset, Boolean data) {
        return findMany(() -> annosaurus.v1().fast().videoreference().byVideoReferenceUuid(videoReferenceUuid).get(config -> {
            config.queryParameters.data = data;
            if (limit != null) config.queryParameters.limit = limit.intValue();
            if (offset != null) config.queryParameters.offset = offset.intValue();
        })).thenApply(list -> list.stream().map(AnnosaurusKiotaClient::annotationFromSC).toList());
    }

    @Override
    public CompletableFuture<Association> findAssociationByUuid(UUID associationUuid) {
        return findOneOrNull(() -> annosaurus.v1().associations().byAssociationUuId(associationUuid).get())
                .thenApply(sc -> sc == null ? null : Association.toKiota(sc));
    }

    @Override
    public CompletableFuture<ConceptAssociationResponse> findByConceptAssociationRequest(ConceptAssociationRequest request) {
        var body = new org.mbari.vars.annosaurus.sdk.kiota.models.ConceptAssociationRequest();
        body.setLinkName(request.getLinkName());
        body.setVideoReferenceUuids(new ArrayList<>(request.getVideoReferenceUuids()));
        return findOneOrNull(() -> annosaurus.v1().associations().conceptassociations().post(body))
                .thenApply(sc -> {
                    if (sc == null) return null;
                    var reqSC = sc.getConceptAssociationRequest();
                    ConceptAssociationRequest r1Req = reqSC == null ? request :
                            new ConceptAssociationRequest(reqSC.getLinkName(), reqSC.getVideoReferenceUuids());
                    var conceptAssociations = sc.getConceptAssociations() == null ? List.<ConceptAssociation>of() :
                            sc.getConceptAssociations().stream()
                                    .map(ca -> new ConceptAssociation(ca.getUuid(), ca.getVideoReferenceUuid(),
                                            ca.getConcept(), ca.getLinkName(), ca.getToConcept(),
                                            ca.getLinkValue(), ca.getMimeType()))
                                    .toList();
                    return new ConceptAssociationResponse(r1Req, conceptAssociations);
                });
    }

    @Override
    public CompletableFuture<List<Annotation>> findByConcurrentRequest(ConcurrentRequest concurrentRequest, long limit, long offset) {
        var body = new org.mbari.vars.annosaurus.sdk.kiota.models.ConcurrentRequestSC();
        body.setVideoReferenceUuids(concurrentRequest.getVideoReferenceUuids());
        body.setStartTimestamp(concurrentRequest.getStartTimestamp().toString());
        body.setEndTimestamp(concurrentRequest.getEndTimestamp().toString());
        return findMany(() -> annosaurus.v1().fast().concurrent().post(body, config -> {
            config.queryParameters.limit = (int) limit;
            config.queryParameters.offset = (int) offset;
        })).thenApply(list -> list.stream().map(AnnosaurusKiotaClient::annotationFromSC).toList());
    }

    @Override
    public CompletableFuture<List<Annotation>> findByImageReference(UUID imageReferenceUuid) {
        return findMany(() -> annosaurus.v1().annotations().imagereference().byImageReferenceUuid(imageReferenceUuid).get())
                .thenApply(list -> list.stream().map(AnnosaurusKiotaClient::annotationFromSC).toList());
    }

    @Override
    public CompletableFuture<List<Annotation>> findByMultiRequest(MultiRequest multiRequest, long limit, long offset) {
        var body = new org.mbari.vars.annosaurus.sdk.kiota.models.MultiRequestSC();
        body.setVideoReferenceUuids(multiRequest.getVideoReferenceUuids());
        return findMany(() -> annosaurus.v1().fast().multi().post(body, config -> {
            config.queryParameters.limit = (int) limit;
            config.queryParameters.offset = (int) offset;
        })).thenApply(list -> list.stream().map(AnnosaurusKiotaClient::annotationFromSC).toList());
    }

    @Override
    public CompletableFuture<Annotation> findByUuid(UUID observationUuid) {
        return findOneOrNull(() -> annosaurus.v1().annotations().byObservationUuid(observationUuid).get())
                .thenApply(sc -> sc == null ? null : annotationFromSC(sc));
    }

    @Override
    public CompletableFuture<List<Association>> findByVideoReferenceAndLinkName(UUID videoReferenceUuid, String linkName) {
        return findMany(() -> annosaurus.v1().associations().byAssociationUuId(videoReferenceUuid).byLinkName(linkName).get())
                .thenApply(list -> list.stream().map(Association::toKiota).toList());
    }

    @Override
    public CompletableFuture<List<Association>> findByVideoReferenceAndLinkNameAndConcept(UUID videoReferenceUuid, String linkName, String concept) {
        return findMany(() -> annosaurus.v1().associations().byAssociationUuId(videoReferenceUuid).byLinkName(linkName).get(config -> config.queryParameters.concept = concept))
                .thenApply(list -> list.stream().map(Association::toKiota).toList());
    }

    @Override
    public CompletableFuture<List<String>> findGroups() {
        return findMany(() -> annosaurus.v1().observations().groups().get());
    }

    @Override
    public CompletableFuture<Image> findImageByUrl(URL url) {
        return findOneOrNull(() -> annosaurus.v1().images().url().byUrl(url.toString()).get())
                .thenApply(sc -> sc == null ? null : imageFromSC(sc));
    }

    @Override
    public CompletableFuture<Image> findImageByUuid(UUID imageReferenceUuid) {
        return findOneOrNull(() -> annosaurus.v1().images().byImageReferenceUuid(imageReferenceUuid).get())
                .thenApply(sc -> sc == null ? null : imageFromSC(sc));
    }

    @Override
    public CompletableFuture<List<Image>> findImagesByVideoReferenceUuid(UUID videoReferenceUuid) {
        return findMany(() -> annosaurus.v1().fast().images().videoreference().byVideoReferenceUuid(videoReferenceUuid).get())
                .thenApply(list -> list.stream().map(AnnosaurusKiotaClient::imageFromSC).toList());
    }

    @Override
    public CompletableFuture<List<Image>> findImagesByVideoReferenceUuid(UUID videoReferenceUuid, Long limit, Long offset) {
        return findMany(() -> annosaurus.v1().fast().images().videoreference().byVideoReferenceUuid(videoReferenceUuid).get(config -> {
            if (limit != null) config.queryParameters.limit = limit.intValue();
            if (offset != null) config.queryParameters.offset = offset.intValue();
        })).thenApply(list -> list.stream().map(AnnosaurusKiotaClient::imageFromSC).toList());
    }

    @Override
    public CompletableFuture<List<ImagedMoment>> findImagedMomentsByVideoReferenceUuid(UUID videoReferenceUuid) {
        return findMany(() -> annosaurus.v1().imagedmoments().videoreference().byVideoReferenceUuid(videoReferenceUuid).get())
                .thenApply(list -> (List<ImagedMoment>) list.stream()
                        .map(AnnosaurusKiotaClient::imagedMomentFromSC)
                        .map(a -> (ImagedMoment) a)
                        .toList());
    }

    @Override
    public CompletableFuture<List<Index>> findIndicesByVideoReferenceUuid(UUID videoReferenceUuid) {
        return findMany(() -> annosaurus.v1().index().videoreference().byVideoReferenceUuid(videoReferenceUuid).get())
                .thenApply(list -> list.stream().map(AnnosaurusKiotaClient::indexFromSC).toList());
    }

    @Override
    public CompletableFuture<CachedVideoReference> findVideoReferenceByVideoReferenceUuid(UUID videoReferenceUuid) {
        return findOneOrNull(() -> annosaurus.v1().videoreferences().videoreference().byVideoReferenceUuid(videoReferenceUuid).get())
                .thenApply(sc -> sc == null ? null : cvrFromSC(sc));
    }

    @Override
    public CompletableFuture<Collection<AncillaryData>> merge(UUID videoReferenceUuid, Collection<AncillaryData> data) {
        var body = data.stream().map(AncillaryData::toKiota).toList();
        return findMany(() -> annosaurus.v1().ancillarydata().merge().byVideoReferenceUuid(videoReferenceUuid).put(body))
                .thenApply(list -> (Collection<AncillaryData>) list.stream().map(AncillaryData::fromKiota).toList());
    }

    @Override
    public CompletableFuture<ConceptsRenamed> renameConcepts(String oldConcept, String newConcept) {
        var body = new RenameConcept();
        body.setOld(oldConcept);
        body.setNew(newConcept);
        return findOneOrNull(() -> annosaurus.v1().observations().concept().rename().put(body))
                .thenApply(sc -> sc == null ? null :
                        new ConceptsRenamed(sc.getOldConcept(), sc.getNewConcept(), sc.getCount() == null ? 0 : sc.getCount().intValue()));
    }

    @Override
    public CompletableFuture<ConceptsRenamed> renameToConcepts(String oldConcept, String newConcept) {
        var body = new RenameConcept();
        body.setOld(oldConcept);
        body.setNew(newConcept);
        return findOneOrNull(() -> annosaurus.v1().associations().toconcept().rename().put(body))
                .thenApply(sc -> sc == null ? null :
                        new ConceptsRenamed(sc.getOldConcept(), sc.getNewConcept(), sc.getCount() == null ? 0 : sc.getCount().intValue()));
    }

    @Override
    public CompletableFuture<Annotation> updateAnnotation(Annotation annotation) {
        var body = annotationToUpdateSC(annotation);
        return findOneOrNull(() -> annosaurus.v1().annotations().byObservationUuid(annotation.getObservationUuid()).put(body))
                .thenApply(sc -> sc == null ? null : annotationFromSC(sc));
    }

    @Override
    public CompletableFuture<Collection<Annotation>> updateAnnotations(Collection<Annotation> annotations) {
        var body = annotations.stream().map(AnnosaurusKiotaClient::annotationToUpdateSC).toList();
        return findMany(() -> annosaurus.v1().annotations().bulk().put(body))
                .thenApply(list -> (Collection<Annotation>) list.stream().map(AnnosaurusKiotaClient::annotationFromSC).toList());
    }

    @Override
    public CompletableFuture<Association> updateAssociation(Association association) {
        var body = new AssociationUpdateSC();
        body.setLinkName(association.getLinkName());
        body.setToConcept(association.getToConcept());
        body.setLinkValue(association.getLinkValue());
        body.setMimeType(association.getMimeType());
        return findOneOrNull(() -> annosaurus.v1().associations().byAssociationUuId(association.getUuid()).put(body))
                .thenApply(sc -> sc == null ? null : Association.toKiota(sc));
    }

    @Override
    public CompletableFuture<Collection<Association>> updateAssociations(Collection<Association> associations) {
        var body = associations.stream().map(a -> {
            var sc = Association.fromKiota(a);
            return sc;
        }).toList();
        return findMany(() -> annosaurus.v1().associations().bulk().put(body))
                .thenApply(list -> (Collection<Association>) list.stream().map(Association::toKiota).toList());
    }

    @Override
    public CompletableFuture<Image> updateImage(Image image) {
        var body = imageToUpdateSC(image);
        return findOneOrNull(() -> annosaurus.v1().images().byImageReferenceUuid(image.getImageReferenceUuid()).put(body))
                .thenApply(sc -> sc == null ? null : imageFromSC(sc));
    }

    @Override
    public CompletableFuture<List<Index>> updateIndexRecordedTimestamps(Collection<Index> indices) {
        var body = indices.stream().map(AnnosaurusKiotaClient::indexToUpdateSC).toList();
        return findMany(() -> annosaurus.v1().index().tapetime().put(body))
                .thenApply(list -> list.stream().map(AnnosaurusKiotaClient::indexFromSC).toList());
    }

    @Override
    public CompletableFuture<Count> updateObservations(ObservationsUpdate update) {
        var body = new org.mbari.vars.annosaurus.sdk.kiota.models.ObservationsUpdate();
        body.setObservationUuids(update.observationUuids() == null ? null : new ArrayList<>(update.observationUuids()));
        body.setConcept(update.concept());
        body.setObserver(update.observer());
        body.setGroup(update.group());
        body.setActivity(update.activity());
        return CompletableFuture.supplyAsync(() -> {
            var response = annosaurus.v1().observations().bulk().put(body);
            return new Count(response.getCount());
        }, executor);
    }

    @Override
    public CompletableFuture<Collection<Annotation>> updateRecordedTimestampsForTapes(Collection<Annotation> annotations) {
        throw new UnsupportedOperationException("Use updateIndexRecordedTimestamps instead");
    }

    @Override
    public CompletableFuture<Optional<Index>> updateRecordedTimestamp(UUID imagedMomentUuid, Instant recordedTimestamp) {
        var body = new VideoTimestampSC();
        body.setRecordedTimestamp(recordedTimestamp.toString());
        return findOneOrNull(() -> annosaurus.v1().imagedmoments().byImagedMomentUuid(imagedMomentUuid).put(body))
                .thenApply(sc -> Optional.ofNullable(sc == null ? null : indexFromImagedMomentSC(sc)));
    }

    @Override
    public CompletableFuture<CachedVideoReference> updateCachedVideoReference(CachedVideoReference cvr) {
        var body = cvrToUpdateSC(cvr);
        return findOneOrNull(() -> annosaurus.v1().videoreferences().byVideoInfoUuid(cvr.getUuid()).put(body))
                .thenApply(sc -> sc == null ? null : cvrFromSC(sc));
    }

    @Override
    public CompletableFuture<Count> countImagesByVideoReferenceUuid(UUID videoReferenceUuid) {
        return findOneOrNull(() -> annosaurus.v1().fast().images().count().videoreference().byVideoReferenceUuid(videoReferenceUuid).get())
                .thenApply(sc -> sc == null ? new Count(0L) : new Count(sc.getCount() == null ? 0L : sc.getCount().longValue()));
    }

    // --- Private static model conversion helpers ---

    private static Annotation annotationFromSC(AnnotationSC sc) {
        if (sc == null) return null;
        var a = new Annotation();
        a.setObservationUuid(sc.getObservationUuid());
        a.setConcept(sc.getConcept());
        a.setObserver(sc.getObserver());
        a.setGroup(sc.getGroup());
        a.setActivity(sc.getActivity());
        a.setVideoReferenceUuid(sc.getVideoReferenceUuid());
        a.setImagedMomentUuid(sc.getImagedMomentUuid());
        if (sc.getTimecode() != null) a.setTimecode(new Timecode(sc.getTimecode()));
        if (sc.getElapsedTimeMillis() != null) a.setElapsedTime(Duration.ofMillis(sc.getElapsedTimeMillis()));
        if (sc.getRecordedTimestamp() != null) a.setRecordedTimestamp(Instant.parse(sc.getRecordedTimestamp()));
        if (sc.getDurationMillis() != null) a.setDuration(Duration.ofMillis(sc.getDurationMillis()));
        if (sc.getObservationTimestamp() != null) {
            try { a.setObservationTimestamp(Instant.parse(sc.getObservationTimestamp())); } catch (Exception ignored) {}
        }
        if (sc.getAssociations() != null) {
            a.setAssociations(sc.getAssociations().stream().map(Association::toKiota).toList());
        }
        else {
            a.setAssociations(List.of());
        }
        if (sc.getAncillaryData() != null) {
            a.setAncillaryData(AncillaryData.fromKiota(sc.getAncillaryData()));
        }
        if (sc.getImageReferences() != null) {
            a.setImageReferences(sc.getImageReferences().stream().map(ImageReference::fromKiota).toList());
        }
        return a;
    }

    private static AnnotationCreateSC annotationToCreateSC(Annotation a) {
        var sc = new AnnotationCreateSC();
        sc.setVideoReferenceUuid(a.getVideoReferenceUuid());
        sc.setImagedMomentUuid(a.getImagedMomentUuid());
        sc.setConcept(a.getConcept());
        sc.setObserver(a.getObserver());
        sc.setGroup(a.getGroup());
        sc.setActivity(a.getActivity());
        sc.setObservationUuid(a.getObservationUuid());
        if (a.getTimecode() != null) sc.setTimecode(a.getTimecode().toString());
        if (a.getElapsedTime() != null) sc.setElapsedTimeMillis(a.getElapsedTime().toMillis());
        if (a.getRecordedTimestamp() != null) sc.setRecordedTimestamp(a.getRecordedTimestamp().toString());
        if (a.getDuration() != null) sc.setDurationMillis(a.getDuration().toMillis());
        if (a.getObservationTimestamp() != null) sc.setObservationTimestamp(a.getObservationTimestamp().toString());
        return sc;
    }

    private static AnnotationUpdateSC annotationToUpdateSC(Annotation a) {
        var sc = new AnnotationUpdateSC();
        sc.setObservationUuid(a.getObservationUuid());
        sc.setVideoReferenceUuid(a.getVideoReferenceUuid());
        sc.setConcept(a.getConcept());
        sc.setObserver(a.getObserver());
        sc.setGroup(a.getGroup());
        sc.setActivity(a.getActivity());
        if (a.getTimecode() != null) sc.setTimecode(a.getTimecode().toString());
        if (a.getElapsedTime() != null) sc.setElapsedTimeMillis(a.getElapsedTime().toMillis());
        if (a.getRecordedTimestamp() != null) sc.setRecordedTimestamp(a.getRecordedTimestamp().toString());
        if (a.getDuration() != null) sc.setDurationMillis(a.getDuration().toMillis());
        if (a.getObservationTimestamp() != null) sc.setObservationTimestamp(a.getObservationTimestamp().toString());
        return sc;
    }

    private static BulkAnnotationSC annotationToBulkSC(Annotation a) {
        var sc = new BulkAnnotationSC();
        sc.setObservationUuid(a.getObservationUuid());
        sc.setVideoReferenceUuid(a.getVideoReferenceUuid());
        sc.setImagedMomentUuid(a.getImagedMomentUuid());
        sc.setConcept(a.getConcept());
        sc.setObserver(a.getObserver());
        sc.setGroup(a.getGroup());
        sc.setActivity(a.getActivity());
        if (a.getTimecode() != null) sc.setTimecode(a.getTimecode().toString());
        if (a.getElapsedTime() != null) sc.setElapsedTimeMillis(a.getElapsedTime().toMillis());
        if (a.getRecordedTimestamp() != null) sc.setRecordedTimestamp(a.getRecordedTimestamp().toString());
        if (a.getDuration() != null) sc.setDurationMillis(a.getDuration().toMillis());
        if (a.getObservationTimestamp() != null) sc.setObservationTimestamp(a.getObservationTimestamp().toString());
        if (a.getAssociations() != null) {
            sc.setAssociations(a.getAssociations().stream().map(Association::fromKiota).toList());
        }
        if (a.getAncillaryData() != null) {
            sc.setAncillaryData(a.getAncillaryData().toKiota());
        }
        return sc;
    }

    private static Annotation annotationFromObservationSC(ObservationSC sc) {
        if (sc == null) return null;
        var a = new Annotation();
        a.setObservationUuid(sc.getUuid());
        a.setConcept(sc.getConcept());
        a.setObserver(sc.getObserver());
        a.setGroup(sc.getGroup());
        a.setActivity(sc.getActivity());
        if (sc.getDurationMillis() != null) a.setDuration(Duration.ofMillis(sc.getDurationMillis()));
        if (sc.getObservationTimestamp() != null) {
            try { a.setObservationTimestamp(Instant.parse(sc.getObservationTimestamp())); } catch (Exception ignored) {}
        }
        if (sc.getAssociations() != null) {
            a.setAssociations(sc.getAssociations().stream().map(Association::toKiota).toList());
        }
        return a;
    }

    private static Image imageFromSC(ImageSC sc) {
        if (sc == null) return null;
        var i = new Image();
        i.setImageReferenceUuid(sc.getImageReferenceUuid());
        i.setVideoReferenceUuid(sc.getVideoReferenceUuid());
        i.setImagedMomentUuid(sc.getImagedMomentUuid());
        i.setFormat(sc.getFormat());
        i.setDescription(sc.getDescription());
        i.setWidth(sc.getWidthPixels());
        i.setHeight(sc.getHeightPixels());
        if (sc.getUrl() != null) {
            try { i.setUrl(URI.create(sc.getUrl()).toURL()); } catch (Exception ignored) {}
        }
        if (sc.getTimecode() != null) i.setTimecode(new Timecode(sc.getTimecode()));
        if (sc.getElapsedTimeMillis() != null) i.setElapsedTime(Duration.ofMillis(sc.getElapsedTimeMillis()));
        if (sc.getRecordedTimestamp() != null) i.setRecordedTimestamp(Instant.parse(sc.getRecordedTimestamp()));
        return i;
    }

    private static ImageCreateSC imageToCreateSC(Image i) {
        var sc = new ImageCreateSC();
        sc.setVideoReferenceUuid(i.getVideoReferenceUuid());
        sc.setFormat(i.getFormat());
        sc.setDescription(i.getDescription());
        sc.setWidthPixels(i.getWidth());
        sc.setHeightPixels(i.getHeight());
        if (i.getUrl() != null) sc.setUrl(i.getUrl().toString());
        if (i.getTimecode() != null) sc.setTimecode(i.getTimecode().toString());
        if (i.getElapsedTime() != null) sc.setElapsedTimeMillis(i.getElapsedTime().toMillis());
        if (i.getRecordedTimestamp() != null) sc.setRecordedTimestamp(i.getRecordedTimestamp().toString());
        return sc;
    }

    private static ImageUpdateSC imageToUpdateSC(Image i) {
        var sc = new ImageUpdateSC();
        sc.setVideoReferenceUuid(i.getVideoReferenceUuid());
        sc.setFormat(i.getFormat());
        sc.setDescription(i.getDescription());
        sc.setWidthPixels(i.getWidth());
        sc.setHeightPixels(i.getHeight());
        if (i.getUrl() != null) sc.setUrl(i.getUrl().toString());
        if (i.getTimecode() != null) sc.setTimecode(i.getTimecode().toString());
        if (i.getElapsedTime() != null) sc.setElapsedTimeMillis(i.getElapsedTime().toMillis());
        if (i.getRecordedTimestamp() != null) sc.setRecordedTimestamp(i.getRecordedTimestamp().toString());
        return sc;
    }

    private static Index indexFromSC(IndexSC sc) {
        if (sc == null) return null;
        var i = new Index();
        i.setUuid(sc.getUuid());
        i.setVideoReferenceUuid(sc.getVideoReferenceUuid());
        if (sc.getTimecode() != null) i.setTimecode(new Timecode(sc.getTimecode()));
        if (sc.getElapsedTimeMillis() != null) i.setElapsedTime(Duration.ofMillis(sc.getElapsedTimeMillis()));
        if (sc.getRecordedTimestamp() != null) i.setRecordedTimestamp(Instant.parse(sc.getRecordedTimestamp()));
        return i;
    }

    private static IndexUpdateSC indexToUpdateSC(Index i) {
        var sc = new IndexUpdateSC();
        sc.setUuid(i.getUuid());
        if (i.getTimecode() != null) sc.setTimecode(i.getTimecode().toString());
        if (i.getElapsedTime() != null) sc.setElapsedTimeMillis(i.getElapsedTime().toMillis());
        if (i.getRecordedTimestamp() != null) sc.setRecordedTimestamp(i.getRecordedTimestamp().toString());
        return sc;
    }

    private static Index indexFromImagedMomentSC(ImagedMomentSC sc) {
        if (sc == null) return null;
        var i = new Index();
        i.setUuid(sc.getUuid());
        i.setVideoReferenceUuid(sc.getVideoReferenceUuid());
        if (sc.getTimecode() != null) i.setTimecode(new Timecode(sc.getTimecode()));
        if (sc.getElapsedTimeMillis() != null) i.setElapsedTime(Duration.ofMillis(sc.getElapsedTimeMillis()));
        if (sc.getRecordedTimestamp() != null) i.setRecordedTimestamp(Instant.parse(sc.getRecordedTimestamp()));
        return i;
    }

    private static Annotation imagedMomentFromSC(ImagedMomentSC sc) {
        if (sc == null) return null;
        var a = new Annotation();
        a.setImagedMomentUuid(sc.getUuid());
        a.setVideoReferenceUuid(sc.getVideoReferenceUuid());
        if (sc.getTimecode() != null) a.setTimecode(new Timecode(sc.getTimecode()));
        if (sc.getElapsedTimeMillis() != null) a.setElapsedTime(Duration.ofMillis(sc.getElapsedTimeMillis()));
        if (sc.getRecordedTimestamp() != null) a.setRecordedTimestamp(Instant.parse(sc.getRecordedTimestamp()));
        if (sc.getAncillaryData() != null) a.setAncillaryData(AncillaryData.fromKiota(sc.getAncillaryData()));
        return a;
    }

    private static CachedVideoReference cvrFromSC(CachedVideoReferenceInfoSC sc) {
        if (sc == null) return null;
        return new CachedVideoReference(sc.getMissionContact(), sc.getPlatformName(),
                sc.getVideoReferenceUuid(), sc.getMissionId(), sc.getUuid());
    }

    private static CachedVideoReferenceInfoCreateSC cvrToCreateSC(CachedVideoReference cvr) {
        var sc = new CachedVideoReferenceInfoCreateSC();
        sc.setVideoReferenceUuid(cvr.getVideoReferenceUuid());
        sc.setPlatformName(cvr.getPlatformName());
        sc.setMissionId(cvr.getMissionId());
        sc.setMissionContact(cvr.getMissionContact());
        return sc;
    }

    private static CachedVideoReferenceInfoUpdateSC cvrToUpdateSC(CachedVideoReference cvr) {
        var sc = new CachedVideoReferenceInfoUpdateSC();
        sc.setVideoReferenceUuid(cvr.getVideoReferenceUuid());
        sc.setPlatformName(cvr.getPlatformName());
        sc.setMissionId(cvr.getMissionId());
        sc.setMissionContact(cvr.getMissionContact());
        return sc;
    }

    // --- Async helpers ---

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
