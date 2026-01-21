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

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class Instants {

    private static ZoneId utcZone  = ZoneId.of("UTC");
    public static DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ISO_DATE_TIME.withZone(utcZone);
    public static DateTimeFormatter COMPACT_TIME_FORMATTER   =
            DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmssX").withZone(utcZone);
    public static DateTimeFormatter COMPACT_TIME_FORMATTER_MS =
            DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss.SSSX").withZone(utcZone);
    public static DateTimeFormatter COMPACT_TIME_FORMATTER_NS =
            DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss.SSSSSSX").withZone(utcZone);

    public static Optional<Instant> parseIso8601(String s) {
        return  parse(s, TIME_FORMATTER)
                .or(() -> parse(s, COMPACT_TIME_FORMATTER))
                .or(() -> parse(s, COMPACT_TIME_FORMATTER_MS))
                .or(() -> parse(s, COMPACT_TIME_FORMATTER_NS));
    }

    private static Optional<Instant> parse(String s, DateTimeFormatter formatter) {
        try {
            return Optional.of(Instant.from(formatter.parse(s)));
        }
        catch (Exception e) {
            return Optional.empty();
        }
    }
}
