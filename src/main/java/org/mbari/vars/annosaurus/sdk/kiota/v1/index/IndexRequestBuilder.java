package org.mbari.vars.annosaurus.sdk.kiota.v1.index;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.index.tapetime.TapetimeRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.index.videoreference.VideoreferenceRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/index
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IndexRequestBuilder extends BaseRequestBuilder {
    /**
     * The tapetime property
     * @return a {@link TapetimeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TapetimeRequestBuilder tapetime() {
        return new TapetimeRequestBuilder(pathParameters, requestAdapter);
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
     * Instantiates a new {@link IndexRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IndexRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/index", pathParameters);
    }
    /**
     * Instantiates a new {@link IndexRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IndexRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/index", rawUrl);
    }
}
