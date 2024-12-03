package org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.find;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.find.images.ImagesRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.find.linkname.LinknameRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/imagedmoments/find
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FindRequestBuilder extends BaseRequestBuilder {
    /**
     * The images property
     * @return a {@link ImagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImagesRequestBuilder images() {
        return new ImagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The linkname property
     * @return a {@link LinknameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LinknameRequestBuilder linkname() {
        return new LinknameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link FindRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FindRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/find", pathParameters);
    }
    /**
     * Instantiates a new {@link FindRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FindRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/find", rawUrl);
    }
}
