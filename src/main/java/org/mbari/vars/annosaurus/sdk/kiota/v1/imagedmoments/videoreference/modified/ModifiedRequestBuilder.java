package org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.videoreference.modified;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.videoreference.modified.item.WithUuItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/imagedmoments/videoreference/modified
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ModifiedRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.videoreference.modified.item collection
     * @param uuid Unique identifier of the item
     * @return a {@link WithUuItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithUuItemRequestBuilder byUuid(@jakarta.annotation.Nonnull final UUID uuid) {
        Objects.requireNonNull(uuid);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("uuid", uuid);
        return new WithUuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ModifiedRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ModifiedRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/videoreference/modified", pathParameters);
    }
    /**
     * Instantiates a new {@link ModifiedRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ModifiedRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/videoreference/modified", rawUrl);
    }
}
