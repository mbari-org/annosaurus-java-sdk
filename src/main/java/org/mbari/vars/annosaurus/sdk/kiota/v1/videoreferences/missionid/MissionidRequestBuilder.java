package org.mbari.vars.annosaurus.sdk.kiota.v1.videoreferences.missionid;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.videoreferences.missionid.item.WithMissionItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/videoreferences/missionid
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MissionidRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.videoreferences.missionid.item collection
     * @param missionid Unique identifier of the item
     * @return a {@link WithMissionItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithMissionItemRequestBuilder byMissionid(@jakarta.annotation.Nonnull final String missionid) {
        Objects.requireNonNull(missionid);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("missionid", missionid);
        return new WithMissionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link MissionidRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MissionidRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/videoreferences/missionid", pathParameters);
    }
    /**
     * Instantiates a new {@link MissionidRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MissionidRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/videoreferences/missionid", rawUrl);
    }
}
