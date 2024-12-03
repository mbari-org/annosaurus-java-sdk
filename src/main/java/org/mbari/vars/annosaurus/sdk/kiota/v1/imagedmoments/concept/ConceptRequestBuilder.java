package org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.concept;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.concept.count.CountRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.concept.images.ImagesRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.concept.item.WithConceptNameItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/imagedmoments/concept
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConceptRequestBuilder extends BaseRequestBuilder {
    /**
     * The count property
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The images property
     * @return a {@link ImagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImagesRequestBuilder images() {
        return new ImagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.concept.item collection
     * @param conceptName Unique identifier of the item
     * @return a {@link WithConceptNameItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithConceptNameItemRequestBuilder byConceptName(@jakarta.annotation.Nonnull final String conceptName) {
        Objects.requireNonNull(conceptName);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("conceptName", conceptName);
        return new WithConceptNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ConceptRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConceptRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/concept", pathParameters);
    }
    /**
     * Instantiates a new {@link ConceptRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConceptRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/concept", rawUrl);
    }
}