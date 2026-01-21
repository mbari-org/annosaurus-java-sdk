package org.mbari.vars.annosaurus.sdk.kiota.v1.histogram;

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
import org.mbari.vars.annosaurus.sdk.kiota.v1.histogram.depth.DepthRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.histogram.time.TimeRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/histogram
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HistogramRequestBuilder extends BaseRequestBuilder {
    /**
     * The depth property
     * @return a {@link DepthRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DepthRequestBuilder depth() {
        return new DepthRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The time property
     * @return a {@link TimeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TimeRequestBuilder time() {
        return new TimeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link HistogramRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public HistogramRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/histogram", pathParameters);
    }
    /**
     * Instantiates a new {@link HistogramRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public HistogramRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/histogram", rawUrl);
    }
}
