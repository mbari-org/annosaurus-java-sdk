package org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.modified.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.modified.item.item.WithEndItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/imagedmoments/modified/{start}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithStartItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.modified.item.item collection
     * @param end Unique identifier of the item
     * @return a {@link WithEndItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithEndItemRequestBuilder byEnd(@jakarta.annotation.Nonnull final String end) {
        Objects.requireNonNull(end);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("end", end);
        return new WithEndItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithStartItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithStartItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/modified/{start}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithStartItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithStartItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/modified/{start}", rawUrl);
    }
}
