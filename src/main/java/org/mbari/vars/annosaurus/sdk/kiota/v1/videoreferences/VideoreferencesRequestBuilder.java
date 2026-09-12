package org.mbari.vars.annosaurus.sdk.kiota.v1.videoreferences;

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
import org.mbari.vars.annosaurus.sdk.kiota.models.CachedVideoReferenceInfoCreateSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.CachedVideoReferenceInfoSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.NotFound;
import org.mbari.vars.annosaurus.sdk.kiota.models.ServerError;
import org.mbari.vars.annosaurus.sdk.kiota.models.Unauthorized;
import org.mbari.vars.annosaurus.sdk.kiota.v1.videoreferences.item.WithVideoInfoUuItemRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.videoreferences.missioncontact.MissioncontactRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.videoreferences.missioncontacts.MissioncontactsRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.videoreferences.missionid.MissionidRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.videoreferences.missionids.MissionidsRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.videoreferences.videoreference.VideoreferenceRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/videoreferences
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideoreferencesRequestBuilder extends BaseRequestBuilder {
    /**
     * The missioncontact property
     * @return a {@link MissioncontactRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MissioncontactRequestBuilder missioncontact() {
        return new MissioncontactRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The missioncontacts property
     * @return a {@link MissioncontactsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MissioncontactsRequestBuilder missioncontacts() {
        return new MissioncontactsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The missionid property
     * @return a {@link MissionidRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MissionidRequestBuilder missionid() {
        return new MissionidRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The missionids property
     * @return a {@link MissionidsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MissionidsRequestBuilder missionids() {
        return new MissionidsRequestBuilder(pathParameters, requestAdapter);
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
     * The videoreferences property
     * @return a {@link VideoreferencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VideoreferencesRequestBuilder videoreferences() {
        return new VideoreferencesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.videoreferences.item collection
     * @param videoInfoUuid Unique identifier of the item
     * @return a {@link WithVideoInfoUuItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithVideoInfoUuItemRequestBuilder byVideoInfoUuid(@jakarta.annotation.Nonnull final UUID videoInfoUuid) {
        Objects.requireNonNull(videoInfoUuid);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("videoInfoUuid", videoInfoUuid);
        return new WithVideoInfoUuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link VideoreferencesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VideoreferencesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/videoreferences{?limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link VideoreferencesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VideoreferencesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/videoreferences{?limit*,offset*}", rawUrl);
    }
    /**
     * Find all video references
     * @return a {@link java.util.List<CachedVideoReferenceInfoSC>}
     * @throws BadRequest When receiving a 400 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<CachedVideoReferenceInfoSC> get() {
        return get(null);
    }
    /**
     * Find all video references
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link java.util.List<CachedVideoReferenceInfoSC>}
     * @throws BadRequest When receiving a 400 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<CachedVideoReferenceInfoSC> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", BadRequest::createFromDiscriminatorValue);
        errorMapping.put("404", NotFound::createFromDiscriminatorValue);
        errorMapping.put("500", ServerError::createFromDiscriminatorValue);
        return this.requestAdapter.sendCollection(requestInfo, errorMapping, CachedVideoReferenceInfoSC::createFromDiscriminatorValue);
    }
    /**
     * Create a video reference
     * @param body The request body
     * @return a {@link CachedVideoReferenceInfoSC}
     * @throws BadRequest When receiving a 400 status code
     * @throws Unauthorized When receiving a 401 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public CachedVideoReferenceInfoSC post(@jakarta.annotation.Nonnull final CachedVideoReferenceInfoCreateSC body) {
        return post(body, null);
    }
    /**
     * Create a video reference
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CachedVideoReferenceInfoSC}
     * @throws BadRequest When receiving a 400 status code
     * @throws Unauthorized When receiving a 401 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public CachedVideoReferenceInfoSC post(@jakarta.annotation.Nonnull final CachedVideoReferenceInfoCreateSC body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", BadRequest::createFromDiscriminatorValue);
        errorMapping.put("401", Unauthorized::createFromDiscriminatorValue);
        errorMapping.put("404", NotFound::createFromDiscriminatorValue);
        errorMapping.put("500", ServerError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CachedVideoReferenceInfoSC::createFromDiscriminatorValue);
    }
    /**
     * Find all video references
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Find all video references
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
     * Create a video reference
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CachedVideoReferenceInfoCreateSC body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a video reference
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CachedVideoReferenceInfoCreateSC body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link VideoreferencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VideoreferencesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VideoreferencesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Find all video references
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
