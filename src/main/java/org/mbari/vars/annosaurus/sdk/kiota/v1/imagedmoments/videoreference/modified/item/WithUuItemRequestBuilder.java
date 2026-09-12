package org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.videoreference.modified.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.videoreference.modified.item.item.WithDateItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/imagedmoments/videoreference/modified/{uuid}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithUuItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.videoreference.modified.item.item collection
     * @param date Unique identifier of the item
     * @return a {@link WithDateItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithDateItemRequestBuilder byDate(@jakarta.annotation.Nonnull final String date) {
        Objects.requireNonNull(date);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("date", date);
        return new WithDateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithUuItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithUuItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/videoreference/modified/{uuid}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithUuItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithUuItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/videoreference/modified/{uuid}", rawUrl);
    }
}
