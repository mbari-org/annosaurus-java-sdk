package org.mbari.vars.annosaurus.sdk.kiota.v1.images.url;

/*-
 * #%L
 * org.mbari.vars:annosaurus-java-sdk
 * %%
 * Copyright (C) 2025 - 2026 Monterey Bay Aquarium Research Institute
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.images.url.item.WithUrlItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/images/url
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UrlRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.images.url.item collection
     * @param url Unique identifier of the item
     * @return a {@link WithUrlItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithUrlItemRequestBuilder byUrl(@jakarta.annotation.Nonnull final String url) {
        Objects.requireNonNull(url);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("url", url);
        return new WithUrlItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link UrlRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UrlRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/images/url", pathParameters);
    }
    /**
     * Instantiates a new {@link UrlRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UrlRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/images/url", rawUrl);
    }
}
