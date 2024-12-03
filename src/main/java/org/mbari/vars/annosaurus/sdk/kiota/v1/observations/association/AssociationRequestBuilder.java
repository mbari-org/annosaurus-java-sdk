package org.mbari.vars.annosaurus.sdk.kiota.v1.observations.association;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import org.mbari.vars.annosaurus.sdk.kiota.v1.observations.association.item.WithAssociationUuItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/observations/association
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssociationRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.observations.association.item collection
     * @param associationUuid Unique identifier of the item
     * @return a {@link WithAssociationUuItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithAssociationUuItemRequestBuilder byAssociationUuid(@jakarta.annotation.Nonnull final UUID associationUuid) {
        Objects.requireNonNull(associationUuid);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("associationUuid", associationUuid);
        return new WithAssociationUuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AssociationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssociationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/observations/association", pathParameters);
    }
    /**
     * Instantiates a new {@link AssociationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssociationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/observations/association", rawUrl);
    }
}
