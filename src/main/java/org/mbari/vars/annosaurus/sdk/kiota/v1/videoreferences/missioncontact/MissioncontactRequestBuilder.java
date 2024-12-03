package org.mbari.vars.annosaurus.sdk.kiota.v1.videoreferences.missioncontact;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.videoreferences.missioncontact.item.WithMissioncontactItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/videoreferences/missioncontact
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MissioncontactRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.videoreferences.missioncontact.item collection
     * @param missioncontact Unique identifier of the item
     * @return a {@link WithMissioncontactItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithMissioncontactItemRequestBuilder byMissioncontact(@jakarta.annotation.Nonnull final String missioncontact) {
        Objects.requireNonNull(missioncontact);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("missioncontact", missioncontact);
        return new WithMissioncontactItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link MissioncontactRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MissioncontactRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/videoreferences/missioncontact", pathParameters);
    }
    /**
     * Instantiates a new {@link MissioncontactRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MissioncontactRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/videoreferences/missioncontact", rawUrl);
    }
}
