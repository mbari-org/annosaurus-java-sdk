package org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.videoreference;

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
import org.mbari.vars.annosaurus.sdk.kiota.models.NotFound;
import org.mbari.vars.annosaurus.sdk.kiota.models.ServerError;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.videoreference.item.WithVideoReferenceUuItemRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.videoreference.modified.ModifiedRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/imagedmoments/videoreference
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideoreferenceRequestBuilder extends BaseRequestBuilder {
    /**
     * The modified property
     * @return a {@link ModifiedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ModifiedRequestBuilder modified() {
        return new ModifiedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.videoreference.item collection
     * @param videoReferenceUuid Unique identifier of the item
     * @return a {@link WithVideoReferenceUuItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithVideoReferenceUuItemRequestBuilder byVideoReferenceUuid(@jakarta.annotation.Nonnull final UUID videoReferenceUuid) {
        Objects.requireNonNull(videoReferenceUuid);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("videoReferenceUuid", videoReferenceUuid);
        return new WithVideoReferenceUuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link VideoreferenceRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VideoreferenceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/videoreference", pathParameters);
    }
    /**
     * Instantiates a new {@link VideoreferenceRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VideoreferenceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/videoreference", rawUrl);
    }
    /**
     * Find all video reference UUIDs
     * @return a {@link java.util.List<UUID>}
     * @throws BadRequest When receiving a 400 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> get() {
        return get(null);
    }
    /**
     * Find all video reference UUIDs
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link java.util.List<UUID>}
     * @throws BadRequest When receiving a 400 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", BadRequest::createFromDiscriminatorValue);
        errorMapping.put("404", NotFound::createFromDiscriminatorValue);
        errorMapping.put("500", ServerError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveCollection(requestInfo, errorMapping, UUID.class);
    }
    /**
     * Find all video reference UUIDs
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Find all video reference UUIDs
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link VideoreferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VideoreferenceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VideoreferenceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
