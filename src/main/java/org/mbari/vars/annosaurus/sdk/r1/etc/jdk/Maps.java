package org.mbari.vars.annosaurus.sdk.r1.etc.jdk;

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

import java.util.Map;

public class Maps {

    /**
     * Create a map from a list of key-value pairs. This is a convenience method to
     * create a map from a list of arguments. The arguments must be in pairs. The
     * first argument in the pair is the key, the second is the value. If the key or
     * value is null, it is ignored.
     *
     * @param args
     * @return
     */
    public static Map<String, Object> of(Object... args) {
        if (args.length % 2 != 0) {
            throw new IllegalArgumentException("You must provide an even number of arguments");
        }
        var map = new java.util.HashMap<String, Object>();
        for (int i = 0; i < args.length; i += 2) {
            var key = args[i];
            var value = args[i + 1];
            if (key != null && value != null) {
                map.put(key.toString(), value);
            }
        }
        return map;
    }

    public static String mapToQueryFragment(Map<String, ?> map) {
        return map.entrySet()
                .stream()
                .filter(e -> e.getValue() != null)
                .map(e -> e.getKey() + "=" + e.getValue())
                .reduce((a, b) -> a + "&" + b)
                .map(s -> "?" + s)
                .orElse("");
    }
}

