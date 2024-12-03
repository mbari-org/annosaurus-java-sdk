package org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.newtime.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.newtime.item.item.WithTimeItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/imagedmoments/newtime/{videoReferenceUuid}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithVideoReferenceUuItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.newtime.item.item collection
     * @param time Use compact iso8601
     * @return a {@link WithTimeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithTimeItemRequestBuilder byTime(@jakarta.annotation.Nonnull final String time) {
        Objects.requireNonNull(time);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("time", time);
        return new WithTimeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithVideoReferenceUuItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithVideoReferenceUuItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/newtime/{videoReferenceUuid}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithVideoReferenceUuItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithVideoReferenceUuItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/newtime/{videoReferenceUuid}", rawUrl);
    }
}
