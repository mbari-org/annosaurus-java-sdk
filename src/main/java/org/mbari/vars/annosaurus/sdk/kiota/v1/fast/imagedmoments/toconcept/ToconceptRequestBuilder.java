package org.mbari.vars.annosaurus.sdk.kiota.v1.fast.imagedmoments.toconcept;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.imagedmoments.toconcept.images.ImagesRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/fast/imagedmoments/toconcept
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ToconceptRequestBuilder extends BaseRequestBuilder {
    /**
     * The images property
     * @return a {@link ImagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImagesRequestBuilder images() {
        return new ImagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ToconceptRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ToconceptRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/fast/imagedmoments/toconcept", pathParameters);
    }
    /**
     * Instantiates a new {@link ToconceptRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ToconceptRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/fast/imagedmoments/toconcept", rawUrl);
    }
}
