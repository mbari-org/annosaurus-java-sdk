package org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.newtime.item;

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
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.newtime.item.item.WithTimeItemRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/imagedmoments/newtime/{videoReferenceUuid}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithVideoReferenceUuItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.newtime.item.item collection
     * @param time Use compact iso8601
     * @return a {@link WithTimeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithTimeItemRequestBuilder byTime(@jakarta.annotation.Nonnull final String time) {
        Objects.requireNonNull(time);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("time", time);
        return new WithTimeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithVideoReferenceUuItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithVideoReferenceUuItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/newtime/{videoReferenceUuid}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithVideoReferenceUuItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithVideoReferenceUuItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/imagedmoments/newtime/{videoReferenceUuid}", rawUrl);
    }
}
