package org.mbari.vars.annosaurus.sdk.kiota.v1.fast.concept;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.concept.images.ImagesRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.concept.item.WithConceptItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/fast/concept
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConceptRequestBuilder extends BaseRequestBuilder {
    /**
     * The images property
     * @return a {@link ImagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImagesRequestBuilder images() {
        return new ImagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.fast.concept.item collection
     * @param concept Unique identifier of the item
     * @return a {@link WithConceptItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithConceptItemRequestBuilder byConcept(@jakarta.annotation.Nonnull final String concept) {
        Objects.requireNonNull(concept);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("concept", concept);
        return new WithConceptItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ConceptRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConceptRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/fast/concept", pathParameters);
    }
    /**
     * Instantiates a new {@link ConceptRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConceptRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/fast/concept", rawUrl);
    }
}