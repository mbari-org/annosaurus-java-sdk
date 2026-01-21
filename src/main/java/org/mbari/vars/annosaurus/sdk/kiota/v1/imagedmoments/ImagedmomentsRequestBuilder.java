package org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments;

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
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.mbari.vars.annosaurus.sdk.kiota.models.BadRequest;
import org.mbari.vars.annosaurus.sdk.kiota.models.ImagedMomentSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.NotFound;
import org.mbari.vars.annosaurus.sdk.kiota.models.ServerError;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.bulk.BulkRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.concept.ConceptRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.count.CountRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.counts.CountsRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.find.FindRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.imagereference.ImagereferenceRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.item.WithImagedMomentUuItemRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.modified.ModifiedRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.newtime.NewtimeRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.observation.ObservationRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.tapetime.TapetimeRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.videoreference.VideoreferenceRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.windowrequest.WindowrequestRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/imagedmoments
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImagedmomentsRequestBuilder extends BaseRequestBuilder {
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
     * The count property
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
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
     * The find property
     * @return a {@link FindRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FindRequestBuilder find() {
        return new FindRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The imagereference property
     * @return a {@link ImagereferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImagereferenceRequestBuilder imagereference() {
        return new ImagereferenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The modified property
     * @return a {@link ModifiedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ModifiedRequestBuilder modified() {
        return new ModifiedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The newtime property
     * @return a {@link NewtimeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NewtimeRequestBuilder newtime() {
        return new NewtimeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The observation property
     * @return a {@link ObservationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ObservationRequestBuilder observation() {
        return new ObservationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The tapetime property
     * @return a {@link TapetimeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TapetimeRequestBuilder tapetime() {
        return new TapetimeRequestBuilder(pathParameters, requestAdapter);
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
     * The windowrequest property
     * @return a {@link WindowrequestRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WindowrequestRequestBuilder windowrequest() {
        return new WindowrequestRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.item collection
     * @param imagedMomentUuid Unique identifier of the item
     * @return a {@link WithImagedMomentUuItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithImagedMomentUuItemRequestBuilder byImagedMomentUuid(@jakarta.annotation.Nonnull final UUID imagedMomentUuid) {
        Objects.requireNonNull(imagedMomentUuid);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("imagedMomentUuid", imagedMomentUuid);
        return new WithImagedMomentUuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ImagedmomentsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ImagedmomentsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments{?limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link ImagedmomentsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ImagedmomentsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments{?limit*,offset*}", rawUrl);
    }
    /**
     * Find all imaged moments
     * @return a {@link java.util.List<ImagedMomentSC>}
     * @throws BadRequest When receiving a 400 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<ImagedMomentSC> get() {
        return get(null);
    }
    /**
     * Find all imaged moments
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link java.util.List<ImagedMomentSC>}
     * @throws BadRequest When receiving a 400 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<ImagedMomentSC> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", BadRequest::createFromDiscriminatorValue);
        errorMapping.put("404", NotFound::createFromDiscriminatorValue);
        errorMapping.put("500", ServerError::createFromDiscriminatorValue);
        return this.requestAdapter.sendCollection(requestInfo, errorMapping, ImagedMomentSC::createFromDiscriminatorValue);
    }
    /**
     * Find all imaged moments
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Find all imaged moments
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ImagedmomentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImagedmomentsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ImagedmomentsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Find all imaged moments
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public Integer limit;
        @jakarta.annotation.Nullable
        public Integer offset;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
