package org.mbari.vars.annosaurus.sdk.kiota.v1.fast.details.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.details.item.item.WithLinkValueItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/fast/details/{link_name}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithLinkNameItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.fast.details.item.item collection
     * @param link_value Unique identifier of the item
     * @return a {@link WithLinkValueItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithLinkValueItemRequestBuilder byLink_value(@jakarta.annotation.Nonnull final String link_value) {
        Objects.requireNonNull(link_value);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("link_value", link_value);
        return new WithLinkValueItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithLinkNameItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithLinkNameItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/fast/details/{link_name}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithLinkNameItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithLinkNameItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/fast/details/{link_name}", rawUrl);
    }
}
