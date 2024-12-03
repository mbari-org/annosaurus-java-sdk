package org.mbari.vars.annosaurus.sdk.kiota.v1.ancillarydata;

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
import org.mbari.vars.annosaurus.sdk.kiota.models.BadRequest;
import org.mbari.vars.annosaurus.sdk.kiota.models.CachedAncillaryDatumSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.NotFound;
import org.mbari.vars.annosaurus.sdk.kiota.models.ServerError;
import org.mbari.vars.annosaurus.sdk.kiota.models.Unauthorized;
import org.mbari.vars.annosaurus.sdk.kiota.v1.ancillarydata.bulk.BulkRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.ancillarydata.imagedmoment.ImagedmomentRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.ancillarydata.item.WithAncillaryDataUuItemRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.ancillarydata.merge.MergeRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.ancillarydata.observation.ObservationRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.ancillarydata.videoreference.VideoreferenceRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/ancillarydata
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AncillarydataRequestBuilder extends BaseRequestBuilder {
    /**
     * The bulk property
     * @return a {@link BulkRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkRequestBuilder bulk() {
        return new BulkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The imagedmoment property
     * @return a {@link ImagedmomentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImagedmomentRequestBuilder imagedmoment() {
        return new ImagedmomentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The merge property
     * @return a {@link MergeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MergeRequestBuilder merge() {
        return new MergeRequestBuilder(pathParameters, requestAdapter);
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
     * The videoreference property
     * @return a {@link VideoreferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VideoreferenceRequestBuilder videoreference() {
        return new VideoreferenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.ancillarydata.item collection
     * @param ancillaryDataUuid Unique identifier of the item
     * @return a {@link WithAncillaryDataUuItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithAncillaryDataUuItemRequestBuilder byAncillaryDataUuid(@jakarta.annotation.Nonnull final UUID ancillaryDataUuid) {
        Objects.requireNonNull(ancillaryDataUuid);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ancillaryDataUuid", ancillaryDataUuid);
        return new WithAncillaryDataUuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AncillarydataRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AncillarydataRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/ancillarydata", pathParameters);
    }
    /**
     * Instantiates a new {@link AncillarydataRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AncillarydataRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/ancillarydata", rawUrl);
    }
    /**
     * Create one ancillary data
     * @param body The request body
     * @return a {@link CachedAncillaryDatumSC}
     * @throws BadRequest When receiving a 400 status code
     * @throws Unauthorized When receiving a 401 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public CachedAncillaryDatumSC post(@jakarta.annotation.Nonnull final CachedAncillaryDatumSC body) {
        return post(body, null);
    }
    /**
     * Create one ancillary data
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CachedAncillaryDatumSC}
     * @throws BadRequest When receiving a 400 status code
     * @throws Unauthorized When receiving a 401 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public CachedAncillaryDatumSC post(@jakarta.annotation.Nonnull final CachedAncillaryDatumSC body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", BadRequest::createFromDiscriminatorValue);
        errorMapping.put("401", Unauthorized::createFromDiscriminatorValue);
        errorMapping.put("404", NotFound::createFromDiscriminatorValue);
        errorMapping.put("500", ServerError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CachedAncillaryDatumSC::createFromDiscriminatorValue);
    }
    /**
     * Create one ancillary data
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CachedAncillaryDatumSC body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create one ancillary data
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CachedAncillaryDatumSC body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AncillarydataRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AncillarydataRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AncillarydataRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
