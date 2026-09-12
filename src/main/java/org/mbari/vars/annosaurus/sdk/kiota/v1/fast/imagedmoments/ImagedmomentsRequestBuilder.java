package org.mbari.vars.annosaurus.sdk.kiota.v1.fast.imagedmoments;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.imagedmoments.concept.ConceptRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.imagedmoments.toconcept.ToconceptRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/fast/imagedmoments
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImagedmomentsRequestBuilder extends BaseRequestBuilder {
    /**
     * The concept property
     * @return a {@link ConceptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConceptRequestBuilder concept() {
        return new ConceptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The toconcept property
     * @return a {@link ToconceptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ToconceptRequestBuilder toconcept() {
        return new ToconceptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ImagedmomentsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ImagedmomentsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/fast/imagedmoments", pathParameters);
    }
    /**
     * Instantiates a new {@link ImagedmomentsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ImagedmomentsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/fast/imagedmoments", rawUrl);
    }
}
