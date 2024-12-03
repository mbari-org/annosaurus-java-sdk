package org.mbari.vars.annosaurus.sdk.kiota.v1.annotations;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
import org.mbari.vars.annosaurus.sdk.kiota.models.AnnotationCreateSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.AnnotationSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.BadRequest;
import org.mbari.vars.annosaurus.sdk.kiota.models.NotFound;
import org.mbari.vars.annosaurus.sdk.kiota.models.ServerError;
import org.mbari.vars.annosaurus.sdk.kiota.models.Unauthorized;
import org.mbari.vars.annosaurus.sdk.kiota.v1.annotations.bulk.BulkRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.annotations.concurrent.ConcurrentRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.annotations.imagereference.ImagereferenceRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.annotations.item.WithObservationUuItemRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.annotations.multi.MultiRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.annotations.videoreference.VideoreferenceRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/annotations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AnnotationsRequestBuilder extends BaseRequestBuilder {
    /**
     * The bulk property
     * @return a {@link BulkRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkRequestBuilder bulk() {
        return new BulkRequestBuilder(pathParameters, requestAdapter);
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
     * The imagereference property
     * @return a {@link ImagereferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImagereferenceRequestBuilder imagereference() {
        return new ImagereferenceRequestBuilder(pathParameters, requestAdapter);
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
     * The videoreference property
     * @return a {@link VideoreferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VideoreferenceRequestBuilder videoreference() {
        return new VideoreferenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.annotations.item collection
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
     * Instantiates a new {@link AnnotationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AnnotationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/annotations", pathParameters);
    }
    /**
     * Instantiates a new {@link AnnotationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AnnotationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/annotations", rawUrl);
    }
    /**
     * Create a new annotation
     * @param body The request body
     * @return a {@link AnnotationSC}
     * @throws BadRequest When receiving a 400 status code
     * @throws Unauthorized When receiving a 401 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AnnotationSC post(@jakarta.annotation.Nonnull final AnnotationCreateSC body) {
        return post(body, null);
    }
    /**
     * Create a new annotation
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AnnotationSC}
     * @throws BadRequest When receiving a 400 status code
     * @throws Unauthorized When receiving a 401 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AnnotationSC post(@jakarta.annotation.Nonnull final AnnotationCreateSC body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", BadRequest::createFromDiscriminatorValue);
        errorMapping.put("401", Unauthorized::createFromDiscriminatorValue);
        errorMapping.put("404", NotFound::createFromDiscriminatorValue);
        errorMapping.put("500", ServerError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AnnotationSC::createFromDiscriminatorValue);
    }
    /**
     * Create a new annotation
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AnnotationCreateSC body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new annotation
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AnnotationCreateSC body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AnnotationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AnnotationsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AnnotationsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
