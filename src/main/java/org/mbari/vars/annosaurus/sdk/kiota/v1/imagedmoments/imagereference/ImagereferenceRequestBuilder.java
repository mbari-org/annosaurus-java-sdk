package org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.imagereference;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.imagereference.item.WithImageReferenceUuItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/imagedmoments/imagereference
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImagereferenceRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.imagereference.item collection
     * @param imageReferenceUuid Unique identifier of the item
     * @return a {@link WithImageReferenceUuItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithImageReferenceUuItemRequestBuilder byImageReferenceUuid(@jakarta.annotation.Nonnull final UUID imageReferenceUuid) {
        Objects.requireNonNull(imageReferenceUuid);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("imageReferenceUuid", imageReferenceUuid);
        return new WithImageReferenceUuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ImagereferenceRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ImagereferenceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/imagereference", pathParameters);
    }
    /**
     * Instantiates a new {@link ImagereferenceRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ImagereferenceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/imagereference", rawUrl);
    }
}
