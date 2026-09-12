package org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.bulk;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.bulk.move.MoveRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/imagedmoments/bulk
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkRequestBuilder extends BaseRequestBuilder {
    /**
     * The move property
     * @return a {@link MoveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MoveRequestBuilder move() {
        return new MoveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link BulkRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/bulk", pathParameters);
    }
    /**
     * Instantiates a new {@link BulkRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/bulk", rawUrl);
    }
}
