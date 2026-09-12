package org.mbari.vars.annosaurus.sdk.kiota.v1.images.name;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.images.name.item.WithImageFileNameItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/images/name
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NameRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.images.name.item collection
     * @param imageFileName Unique identifier of the item
     * @return a {@link WithImageFileNameItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithImageFileNameItemRequestBuilder byImageFileName(@jakarta.annotation.Nonnull final String imageFileName) {
        Objects.requireNonNull(imageFileName);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("imageFileName", imageFileName);
        return new WithImageFileNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link NameRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NameRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/images/name", pathParameters);
    }
    /**
     * Instantiates a new {@link NameRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NameRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/images/name", rawUrl);
    }
}
