package org.mbari.vars.annosaurus.sdk.kiota.v1.observations.concept;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.observations.concept.count.CountRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.observations.concept.images.ImagesRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.observations.concept.rename.RenameRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/observations/concept
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
     * The rename property
     * @return a {@link RenameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RenameRequestBuilder rename() {
        return new RenameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ConceptRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConceptRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/observations/concept", pathParameters);
    }
    /**
     * Instantiates a new {@link ConceptRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConceptRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/observations/concept", rawUrl);
    }
}