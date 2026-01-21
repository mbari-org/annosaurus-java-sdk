package org.mbari.vars.annosaurus.sdk.kiota.v1.observations;

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

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import org.mbari.vars.annosaurus.sdk.kiota.v1.observations.activities.ActivitiesRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.observations.association.AssociationRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.observations.bulk.BulkRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.observations.concept.ConceptRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.observations.concepts.ConceptsRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.observations.counts.CountsRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.observations.delete.DeleteRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.observations.groups.GroupsRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.observations.item.WithObservationUuItemRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.observations.videoreference.VideoreferenceRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/observations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ObservationsRequestBuilder extends BaseRequestBuilder {
    /**
     * The activities property
     * @return a {@link ActivitiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActivitiesRequestBuilder activities() {
        return new ActivitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The association property
     * @return a {@link AssociationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssociationRequestBuilder association() {
        return new AssociationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk property
     * @return a {@link BulkRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkRequestBuilder bulk() {
        return new BulkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The concept property
     * @return a {@link ConceptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConceptRequestBuilder concept() {
        return new ConceptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The concepts property
     * @return a {@link ConceptsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConceptsRequestBuilder concepts() {
        return new ConceptsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The counts property
     * @return a {@link CountsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountsRequestBuilder counts() {
        return new CountsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The deletePath property
     * @return a {@link DeleteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeleteRequestBuilder deletePath() {
        return new DeleteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The groups property
     * @return a {@link GroupsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GroupsRequestBuilder groups() {
        return new GroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The videoreference property
     * @return a {@link VideoreferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VideoreferenceRequestBuilder videoreference() {
        return new VideoreferenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.observations.item collection
     * @param observationUuid Unique identifier of the item
     * @return a {@link WithObservationUuItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithObservationUuItemRequestBuilder byObservationUuid(@jakarta.annotation.Nonnull final UUID observationUuid) {
        Objects.requireNonNull(observationUuid);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("observationUuid", observationUuid);
        return new WithObservationUuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ObservationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ObservationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/observations", pathParameters);
    }
    /**
     * Instantiates a new {@link ObservationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ObservationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/observations", rawUrl);
    }
}
