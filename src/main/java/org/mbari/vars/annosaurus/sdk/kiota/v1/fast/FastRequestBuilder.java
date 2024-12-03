package org.mbari.vars.annosaurus.sdk.kiota.v1.fast;

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
import org.mbari.vars.annosaurus.sdk.kiota.models.AnnotationSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.BadRequest;
import org.mbari.vars.annosaurus.sdk.kiota.models.NotFound;
import org.mbari.vars.annosaurus.sdk.kiota.models.QueryConstraints;
import org.mbari.vars.annosaurus.sdk.kiota.models.QueryConstraintsResponseSCSeqAnnotationSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.ServerError;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.concept.ConceptRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.concurrent.ConcurrentRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.count.CountRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.details.DetailsRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.georange.GeorangeRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.imagedmoments.ImagedmomentsRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.images.ImagesRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.multi.MultiRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.toconcept.ToconceptRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.videoreference.VideoreferenceRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/fast
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FastRequestBuilder extends BaseRequestBuilder {
    /**
     * The concept property
     * @return a {@link ConceptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConceptRequestBuilder concept() {
        return new ConceptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The concurrent property
     * @return a {@link ConcurrentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConcurrentRequestBuilder concurrent() {
        return new ConcurrentRequestBuilder(pathParameters, requestAdapter);
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
     * The details property
     * @return a {@link DetailsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DetailsRequestBuilder details() {
        return new DetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The georange property
     * @return a {@link GeorangeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GeorangeRequestBuilder georange() {
        return new GeorangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The imagedmoments property
     * @return a {@link ImagedmomentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImagedmomentsRequestBuilder imagedmoments() {
        return new ImagedmomentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The images property
     * @return a {@link ImagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImagesRequestBuilder images() {
        return new ImagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The multi property
     * @return a {@link MultiRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MultiRequestBuilder multi() {
        return new MultiRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The toconcept property
     * @return a {@link ToconceptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ToconceptRequestBuilder toconcept() {
        return new ToconceptRequestBuilder(pathParameters, requestAdapter);
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
     * Instantiates a new {@link FastRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FastRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/fast{?data*,limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link FastRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FastRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/fast{?data*,limit*,offset*}", rawUrl);
    }
    /**
     * Find all annotations
     * @return a {@link java.util.List<AnnotationSC>}
     * @throws BadRequest When receiving a 400 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<AnnotationSC> get() {
        return get(null);
    }
    /**
     * Find all annotations
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link java.util.List<AnnotationSC>}
     * @throws BadRequest When receiving a 400 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<AnnotationSC> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", BadRequest::createFromDiscriminatorValue);
        errorMapping.put("404", NotFound::createFromDiscriminatorValue);
        errorMapping.put("500", ServerError::createFromDiscriminatorValue);
        return this.requestAdapter.sendCollection(requestInfo, errorMapping, AnnotationSC::createFromDiscriminatorValue);
    }
    /**
     * Find annotations by query constraints. Constraints can be snake_case or camelCase. The response will be in snake_case.
     * @param body The request body
     * @return a {@link QueryConstraintsResponseSCSeqAnnotationSC}
     * @throws BadRequest When receiving a 400 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public QueryConstraintsResponseSCSeqAnnotationSC post(@jakarta.annotation.Nonnull final QueryConstraints body) {
        return post(body, null);
    }
    /**
     * Find annotations by query constraints. Constraints can be snake_case or camelCase. The response will be in snake_case.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link QueryConstraintsResponseSCSeqAnnotationSC}
     * @throws BadRequest When receiving a 400 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public QueryConstraintsResponseSCSeqAnnotationSC post(@jakarta.annotation.Nonnull final QueryConstraints body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", BadRequest::createFromDiscriminatorValue);
        errorMapping.put("404", NotFound::createFromDiscriminatorValue);
        errorMapping.put("500", ServerError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, QueryConstraintsResponseSCSeqAnnotationSC::createFromDiscriminatorValue);
    }
    /**
     * Find all annotations
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Find all annotations
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
     * Find annotations by query constraints. Constraints can be snake_case or camelCase. The response will be in snake_case.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final QueryConstraints body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Find annotations by query constraints. Constraints can be snake_case or camelCase. The response will be in snake_case.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final QueryConstraints body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link FastRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FastRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FastRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Find all annotations
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public Boolean data;
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
            allQueryParams.put("data", data);
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
