package org.mbari.vars.annosaurus.sdk.kiota.v1.associations;

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
import java.util.UUID;
import org.mbari.vars.annosaurus.sdk.kiota.models.AssociationSC;
import org.mbari.vars.annosaurus.sdk.kiota.models.BadRequest;
import org.mbari.vars.annosaurus.sdk.kiota.models.NotFound;
import org.mbari.vars.annosaurus.sdk.kiota.models.ServerError;
import org.mbari.vars.annosaurus.sdk.kiota.models.Unauthorized;
import org.mbari.vars.annosaurus.sdk.kiota.v1.associations.bulk.BulkRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.associations.conceptassociations.ConceptassociationsRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.associations.delete.DeleteRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.associations.item.AssociationUuItemRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.associations.toconcept.ToconceptRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/associations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssociationsRequestBuilder extends BaseRequestBuilder {
    /**
     * The bulk property
     * @return a {@link BulkRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkRequestBuilder bulk() {
        return new BulkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The conceptassociations property
     * @return a {@link ConceptassociationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConceptassociationsRequestBuilder conceptassociations() {
        return new ConceptassociationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The deletePath property
     * @return a {@link DeleteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeleteRequestBuilder deletePath() {
        return new DeleteRequestBuilder(pathParameters, requestAdapter);
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
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.associations.item collection
     * @param associationUuId Unique identifier of the item
     * @return a {@link AssociationUuItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssociationUuItemRequestBuilder byAssociationUuId(@jakarta.annotation.Nonnull final UUID associationUuId) {
        Objects.requireNonNull(associationUuId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("associationUu%2Did", associationUuId);
        return new AssociationUuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AssociationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssociationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/associations", pathParameters);
    }
    /**
     * Instantiates a new {@link AssociationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssociationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/associations", rawUrl);
    }
    /**
     * Create an association
     * @param body The request body
     * @return a {@link AssociationSC}
     * @throws BadRequest When receiving a 400 status code
     * @throws Unauthorized When receiving a 401 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AssociationSC post(@jakarta.annotation.Nonnull final AssociationSC body) {
        return post(body, null);
    }
    /**
     * Create an association
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AssociationSC}
     * @throws BadRequest When receiving a 400 status code
     * @throws Unauthorized When receiving a 401 status code
     * @throws NotFound When receiving a 404 status code
     * @throws ServerError When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AssociationSC post(@jakarta.annotation.Nonnull final AssociationSC body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", BadRequest::createFromDiscriminatorValue);
        errorMapping.put("401", Unauthorized::createFromDiscriminatorValue);
        errorMapping.put("404", NotFound::createFromDiscriminatorValue);
        errorMapping.put("500", ServerError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AssociationSC::createFromDiscriminatorValue);
    }
    /**
     * Create an association
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AssociationSC body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create an association
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AssociationSC body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AssociationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssociationsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AssociationsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
