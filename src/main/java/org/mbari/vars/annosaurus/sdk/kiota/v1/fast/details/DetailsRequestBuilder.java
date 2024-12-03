package org.mbari.vars.annosaurus.sdk.kiota.v1.fast.details;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.details.item.WithLinkNameItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/fast/details
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DetailsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.fast.details.item collection
     * @param link_name Unique identifier of the item
     * @return a {@link WithLinkNameItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithLinkNameItemRequestBuilder byLink_name(@jakarta.annotation.Nonnull final String link_name) {
        Objects.requireNonNull(link_name);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("link_name", link_name);
        return new WithLinkNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link DetailsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DetailsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/fast/details", pathParameters);
    }
    /**
     * Instantiates a new {@link DetailsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DetailsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/fast/details", rawUrl);
    }
}
