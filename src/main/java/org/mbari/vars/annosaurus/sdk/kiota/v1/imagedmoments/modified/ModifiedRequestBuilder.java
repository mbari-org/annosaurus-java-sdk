package org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.modified;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.modified.count.CountRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.modified.item.WithStartItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/imagedmoments/modified
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ModifiedRequestBuilder extends BaseRequestBuilder {
    /**
     * The count property
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.modified.item collection
     * @param start Unique identifier of the item
     * @return a {@link WithStartItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithStartItemRequestBuilder byStart(@jakarta.annotation.Nonnull final String start) {
        Objects.requireNonNull(start);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("start", start);
        return new WithStartItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ModifiedRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ModifiedRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/modified", pathParameters);
    }
    /**
     * Instantiates a new {@link ModifiedRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ModifiedRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/modified", rawUrl);
    }
}
