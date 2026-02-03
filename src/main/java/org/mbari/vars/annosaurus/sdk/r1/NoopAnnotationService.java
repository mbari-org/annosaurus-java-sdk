package org.mbari.vars.annosaurus.sdk.r1;

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

import java.net.URL;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

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

public class NoopAnnotationService implements AnnotationService, VideoReferenceService {

    @Override
    public CompletableFuture<List<String>> findAllMissionIds() {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findAllMissionIds` is not implemented"));
    }

    @Override
    public CompletableFuture<List<String>> findAllMissionContacts() {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findAllMissionContacts` is not implemented"));
    }

    @Override
    public CompletableFuture<CachedVideoReference> findVideoReferenceByUuid(UUID videoReferenceUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findVideoReferenceByUuid` is not implemented"));
    }

    @Override
    public CompletableFuture<List<UUID>> findAllCachedVideoVideoReferenceUuids() {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findAllCachedVideoVideoReferenceUuids` is not implemented"));
    }

    @Override
    public CompletableFuture<CachedVideoReference> create(CachedVideoReference videoReference) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`create` is not implemented"));
    }

    @Override
    public CompletableFuture<CachedVideoReference> update(UUID videoReferenceUuid,
            CachedVideoReference videoReference) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`update` is not implemented"));
    }

    @Override
    public CompletableFuture<Void> delete(UUID videoReferenceUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`delete` is not implemented"));
    }

    @Override
    public CompletableFuture<AnnotationCount> countAnnotations(UUID videoReferenceUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`countAnnotations` is not implemented"));
    }

    @Override
    public CompletableFuture<List<AnnotationCount>> countAnnotationsGroupByVideoReferenceUuid() {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`countAnnotationsGroupByVideoReferenceUuid` is not implemented"));
    }

    @Override
    public CompletableFuture<ConcurrentRequestCount> countByConcurrentRequest(ConcurrentRequest concurrentRequest) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`countByConcurrentRequest` is not implemented"));
    }

    @Override
    public CompletableFuture<MultiRequestCount> countByMultiRequest(MultiRequest multiRequest) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`countByMultiRequest` is not implemented"));
    }

    @Override
    public CompletableFuture<List<AnnotationCount>> countImagedMomentsGroupByVideoReferenceUuid() {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`countImagedMomentsGroupByVideoReferenceUuid` is not implemented"));
    }

    @Override
    public CompletableFuture<ConceptCount> countObservationsByConcept(String concept) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`countObservationsByConcept` is not implemented"));
    }

    @Override
    public CompletableFuture<AnnotationCount> countImagedMomentsModifiedBefore(UUID videoReferenceUuid, Instant date) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`countImagedMomentsModifiedBefore` is not implemented"));
    }

    @Override
    public CompletableFuture<Annotation> createAnnotation(Annotation annotation) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`createAnnotation` is not implemented"));
    }

    @Override
    public CompletableFuture<Collection<Annotation>> createAnnotations(Collection<Annotation> annotations) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`createAnnotations` is not implemented"));
    }

    @Override
    public CompletableFuture<Association> createAssociation(UUID observationUuid, Association association) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`createAssociation` is not implemented"));
    }

    @Override
    public CompletableFuture<Association> createAssociation(UUID observationUuid, Association association,
            UUID associationUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`createAssociation` is not implemented"));
    }

    @Override
    public CompletableFuture<Image> createImage(Image image) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`createImage` is not implemented"));
    }

    @Override
    public CompletableFuture<List<AncillaryData>> createOrUpdateAncillaryData(List<AncillaryData> ancillaryData) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`createOrUpdateAncillaryData` is not implemented"));
    }

    @Override
    public CompletableFuture<CachedVideoReference> createCachedVideoReference(CachedVideoReference cvr) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`createCachedVideoReference` is not implemented"));
    }

    @Override
    public CompletableFuture<AncillaryDataDeleteCount> deleteAncillaryDataByVideoReference(UUID videoReferenceUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`deleteAncillaryDataByVideoReference` is not implemented"));
    }

    @Override
    public CompletableFuture<Boolean> deleteAnnotation(UUID observationUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`deleteAnnotation` is not implemented"));
    }

    @Override
    public CompletableFuture<Boolean> deleteAnnotations(Collection<UUID> observationUuids) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`deleteAnnotations` is not implemented"));
    }

    @Override
    public CompletableFuture<DeleteCount> deleteAnnotationsByVideoReferenceUuid(UUID videoReferenceUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`deleteAnnotationsByVideoReferenceUuid` is not implemented"));
    }

    @Override
    public CompletableFuture<Boolean> deleteAssociation(UUID associationUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`deleteAssociation` is not implemented"));
    }

    @Override
    public CompletableFuture<Boolean> deleteAssociations(Collection<UUID> associationUuids) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`deleteAssociations` is not implemented"));
    }

    @Override
    public CompletableFuture<Boolean> deleteImage(UUID imageReferenceUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`deleteImage` is not implemented"));
    }

    @Override
    public CompletableFuture<Annotation> deleteDuration(UUID observationUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`deleteDuration` is not implemented"));
    }

    @Override
    public CompletableFuture<Boolean> deleteCacheVideoReference(UUID uuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`deleteCacheVideoReference` is not implemented"));
    }

    @Override
    public CompletableFuture<List<String>> findActivities() {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findActivities` is not implemented"));
    }

    @Override
    public CompletableFuture<List<UUID>> findAllVideoReferenceUuids() {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findAllVideoReferenceUuids` is not implemented"));
    }

    @Override
    public CompletableFuture<AncillaryData> findAncillaryData(UUID observationUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findAncillaryData` is not implemented"));
    }

    @Override
    public CompletableFuture<List<AncillaryData>> findAncillaryDataByVideoReference(UUID videoReferenceUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findAncillaryDataByVideoReference` is not implemented"));
    }

    @Override
    public CompletableFuture<List<Annotation>> findByConcept(String concept, Boolean data) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findByConcept` is not implemented"));
    }

    @Override
    public CompletableFuture<List<Annotation>> findByConcept(String concept, Long limit, Long offset, Boolean data) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findByConcept` is not implemented"));
    }

    @Override
    public CompletableFuture<List<Annotation>> findAnnotations(UUID videoReferenceUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findAnnotations` is not implemented"));
    }

    @Override
    public CompletableFuture<List<Annotation>> findAnnotations(UUID videoReferenceUuid, boolean data) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findAnnotations` is not implemented"));
    }

    @Override
    public CompletableFuture<List<Annotation>> findAnnotations(UUID videoReferenceUuid, Long limit, Long offset) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findAnnotations` is not implemented"));
    }

    @Override
    public CompletableFuture<List<Annotation>> findAnnotations(UUID videoReferenceUuid, Long limit, Long offset,
            Boolean data) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findAnnotations` is not implemented"));
    }

    @Override
    public CompletableFuture<Association> findAssociationByUuid(UUID associationUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findAssociationByUuid` is not implemented"));
    }

    @Override
    public CompletableFuture<ConceptAssociationResponse> findByConceptAssociationRequest(
            ConceptAssociationRequest request) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findByConceptAssociationRequest` is not implemented"));
    }

    @Override
    public CompletableFuture<List<Annotation>> findByConcurrentRequest(ConcurrentRequest concurrentRequest, long limit,
            long offset) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findByConcurrentRequest` is not implemented"));
    }

    @Override
    public CompletableFuture<List<Annotation>> findByImageReference(UUID imageReferenceUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findByImageReference` is not implemented"));
    }

    @Override
    public CompletableFuture<List<Annotation>> findByMultiRequest(MultiRequest multiRequest, long limit, long offset) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findByMultiRequest` is not implemented"));
    }

    @Override
    public CompletableFuture<Annotation> findByUuid(UUID observationUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findByUuid` is not implemented"));
    }

    @Override
    public CompletableFuture<List<Association>> findByVideoReferenceAndLinkName(UUID videoReferenceUuid,
            String linkName) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findByVideoReferenceAndLinkName` is not implemented"));
    }

    @Override
    public CompletableFuture<List<Association>> findByVideoReferenceAndLinkNameAndConcept(UUID videoReferenceUuid,
            String linkName, String concept) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findByVideoReferenceAndLinkNameAndConcept` is not implemented"));
    }

    @Override
    public CompletableFuture<List<String>> findGroups() {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findGroups` is not implemented"));
    }

    @Override
    public CompletableFuture<Image> findImageByUrl(URL url) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findImageByUrl` is not implemented"));
    }

    @Override
    public CompletableFuture<Image> findImageByUuid(UUID imageReferenceUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findImageByUuid` is not implemented"));
    }

    @Override
    public CompletableFuture<List<Image>> findImagesByVideoReferenceUuid(UUID videoReferenceUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findImagesByVideoReferenceUuid` is not implemented"));
    }

    @Override
    public CompletableFuture<List<ImagedMoment>> findImagedMomentsByVideoReferenceUuid(UUID videoReferenceUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findImagedMomentsByVideoReferenceUuid` is not implemented"));
    }

    @Override
    public CompletableFuture<List<Index>> findIndicesByVideoReferenceUuid(UUID videoReferenceUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findIndicesByVideoReferenceUuid` is not implemented"));
    }

    @Override
    public CompletableFuture<CachedVideoReference> findVideoReferenceByVideoReferenceUuid(UUID videoReferenceUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`findVideoReferenceByVideoReferenceUuid` is not implemented"));
    }

    @Override
    public CompletableFuture<Collection<AncillaryData>> merge(UUID videoReferenceUuid, Collection<AncillaryData> data) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`merge` is not implemented"));
    }

    @Override
    public CompletableFuture<ConceptsRenamed> renameConcepts(String oldConcept, String newConcept) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`renameConcepts` is not implemented"));
    }

    @Override
    public CompletableFuture<ConceptsRenamed> renameToConcepts(String oldConcept, String newConcept) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`renameToConcepts` is not implemented"));
    }

    @Override
    public CompletableFuture<Annotation> updateAnnotation(Annotation annotation) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`updateAnnotation` is not implemented"));
    }

    @Override
    public CompletableFuture<Collection<Annotation>> updateAnnotations(Collection<Annotation> annotations) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`updateAnnotations` is not implemented"));
    }

    @Override
    public CompletableFuture<Association> updateAssociation(Association association) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`updateAssociation` is not implemented"));
    }

    @Override
    public CompletableFuture<Collection<Association>> updateAssociations(Collection<Association> associations) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`updateAssociations` is not implemented"));
    }

    @Override
    public CompletableFuture<Image> updateImage(Image image) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`updateImage` is not implemented"));
    }

    @Override
    public CompletableFuture<List<Index>> updateIndexRecordedTimestamps(Collection<Index> indices) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`updateIndexRecordedTimestamps` is not implemented"));
    }

    @Override
    public CompletableFuture<Count> updateObservations(ObservationsUpdate update) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`updateObservations` is not implemented"));
    }

    @Override
    public CompletableFuture<Collection<Annotation>> updateRecordedTimestampsForTapes(
            Collection<Annotation> annotations) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`updateRecordedTimestampsForTapes` is not implemented"));
    }

    @Override
    public CompletableFuture<Optional<Index>> updateRecordedTimestamp(UUID imagedMomentUuid,
            Instant recordedTimestamp) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`updateRecordedTimestamp` is not implemented"));
    }

    @Override
    public CompletableFuture<CachedVideoReference> updateCachedVideoReference(CachedVideoReference cvr) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("`updateCachedVideoReference` is not implemented"));
    }

    @Override
    public CompletableFuture<Count> countImagesByVideoReferenceUuid(UUID videoReferenceUuid) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("Unimplemented method 'countImagesByVideoReferenceUuid'"));

    }

    @Override
    public CompletableFuture<List<Image>> findImagesByVideoReferenceUuid(UUID videoReferenceUuid, Long limit,
            Long offset) {

        return CompletableFuture.failedFuture(new UnsupportedOperationException("Unimplemented method 'findImagesByVideoReferenceUuid'"));
    }
    
}
