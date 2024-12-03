package org.mbari.vars.annosaurus.sdk.kiota.v1.annotations.concurrent;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.annotations.concurrent.count.CountRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/annotations/concurrent
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConcurrentRequestBuilder extends BaseRequestBuilder {
    /**
     * The count property
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ConcurrentRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConcurrentRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/annotations/concurrent", pathParameters);
    }
    /**
     * Instantiates a new {@link ConcurrentRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConcurrentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/annotations/concurrent", rawUrl);
    }
}
