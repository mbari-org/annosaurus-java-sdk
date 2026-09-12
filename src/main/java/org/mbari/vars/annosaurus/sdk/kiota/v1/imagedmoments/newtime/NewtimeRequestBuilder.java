package org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.newtime;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.newtime.item.WithVideoReferenceUuItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/imagedmoments/newtime
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NewtimeRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.newtime.item collection
     * @param videoReferenceUuid Unique identifier of the item
     * @return a {@link WithVideoReferenceUuItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithVideoReferenceUuItemRequestBuilder byVideoReferenceUuid(@jakarta.annotation.Nonnull final UUID videoReferenceUuid) {
        Objects.requireNonNull(videoReferenceUuid);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("videoReferenceUuid", videoReferenceUuid);
        return new WithVideoReferenceUuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link NewtimeRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NewtimeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/newtime", pathParameters);
    }
    /**
     * Instantiates a new {@link NewtimeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NewtimeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/newtime", rawUrl);
    }
}
