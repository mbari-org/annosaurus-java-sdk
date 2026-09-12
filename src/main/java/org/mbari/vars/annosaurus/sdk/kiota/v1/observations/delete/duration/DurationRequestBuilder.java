package org.mbari.vars.annosaurus.sdk.kiota.v1.observations.delete.duration;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import org.mbari.vars.annosaurus.sdk.kiota.v1.observations.delete.duration.item.WithObservationUuItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/observations/delete/duration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DurationRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.observations.delete.duration.item collection
     * @param observationUuid Unique identifier of the item
     * @return a {@link WithObservationUuItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithObservationUuItemRequestBuilder byObservationUuid(@jakarta.annotation.Nonnull final UUID observationUuid) {
        Objects.requireNonNull(observationUuid);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("observationUuid", observationUuid);
        return new WithObservationUuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link DurationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DurationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/observations/delete/duration", pathParameters);
    }
    /**
     * Instantiates a new {@link DurationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DurationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/observations/delete/duration", rawUrl);
    }
}
