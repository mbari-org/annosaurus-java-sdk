package org.mbari.vars.annosaurus.sdk.kiota.v1.fast.georange;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.models.BadRequest;
import org.mbari.vars.annosaurus.sdk.kiota.models.NotFound;
import org.mbari.vars.annosaurus.sdk.kiota.models.QueryConstraints;
import org.mbari.vars.annosaurus.sdk.kiota.models.QueryConstraintsResponseSCGeographicRangeSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.ServerError;
/**
 * Builds and executes requests for operations under /v1/fast/georange
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GeorangeRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GeorangeRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GeorangeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/fast/georange", pathParameters);
    }
    /**
     * Instantiates a new {@link GeorangeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GeorangeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/fast/georange", rawUrl);
    }
    /**
     * Find annotations by query constraints. Constraints can be snake_case or camelCase. The response will be in snake_case.
     * @param body The request body
     * @return a {@link QueryConstraintsResponseSCGeographicRangeSC}
     * @throws BadRequest When receiving a 400 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public QueryConstraintsResponseSCGeographicRangeSC post(@jakarta.annotation.Nonnull final QueryConstraints body) {
        return post(body, null);
    }
    /**
     * Find annotations by query constraints. Constraints can be snake_case or camelCase. The response will be in snake_case.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link QueryConstraintsResponseSCGeographicRangeSC}
     * @throws BadRequest When receiving a 400 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public QueryConstraintsResponseSCGeographicRangeSC post(@jakarta.annotation.Nonnull final QueryConstraints body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", BadRequest::createFromDiscriminatorValue);
        errorMapping.put("404", NotFound::createFromDiscriminatorValue);
        errorMapping.put("500", ServerError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, QueryConstraintsResponseSCGeographicRangeSC::createFromDiscriminatorValue);
    }
    /**
     * Find annotations by query constraints. Constraints can be snake_case or camelCase. The response will be in snake_case.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final QueryConstraints body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Find annotations by query constraints. Constraints can be snake_case or camelCase. The response will be in snake_case.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final QueryConstraints body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GeorangeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GeorangeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GeorangeRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
