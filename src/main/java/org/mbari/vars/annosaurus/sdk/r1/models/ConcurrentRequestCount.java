package org.mbari.vars.annosaurus.sdk.r1.models;

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

/**
 * @author Brian Schlining
 * @since 2019-05-28T11:03:00
 */
public class ConcurrentRequestCount {

    private ConcurrentRequest concurrentRequest;
    private Long count;

    public ConcurrentRequestCount(ConcurrentRequest concurrentRequest, Long count) {
        this.concurrentRequest = concurrentRequest;
        this.count = count;
    }

    public ConcurrentRequest getConcurrentRequest() {
        return concurrentRequest;
    }

    public Long getCount() {
        return count;
    }
}
