package org.mbari.vars.annosaurus.sdk.r1;

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

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

import org.mbari.vars.annosaurus.sdk.r1.models.Authorization;

public class JwtHttpClient extends BaseHttpClient {

    private final AtomicReference<Authorization> authorization = new AtomicReference<>();
    private final String authHeaderKey;
    private final String authHeaderValue;
    private final Function<String, Authorization> bodyToAuthFn;


    public JwtHttpClient(HttpClient client,
                         URI authUri,
                         String authHeaderKey,
                         String authHeaderValue,
                         Function<String, Authorization> bodyToAuthFn) {
        super(client, authUri);
        this.authHeaderKey = authHeaderKey;
        this.authHeaderValue = authHeaderValue;
        this.bodyToAuthFn = bodyToAuthFn;
    }

    // --- Authorization
    private boolean isExpired(Authorization a) {
        try {
            DecodedJWT jwt = JWT.decode(a.getAccessToken());
            Instant iat = jwt.getExpiresAt().toInstant();
            return iat.isBefore(Instant.now());
        }
        catch (Exception e) {
            return true;
        }
    }

    public Authorization authorizeIfNeeded() {
        return authorization.updateAndGet(this::reauthorize);
    }

    protected Authorization reauthorize(Authorization a) {
        if ((a == null) || isExpired(a)) {
            return authorize().join();
        }
        return a;
    }


    public CompletableFuture<Authorization> authorize() {
        var request = HttpRequest.newBuilder()
                .uri(getBaseUri())
                .header(authHeaderKey, authHeaderValue) // .header("Authorization", "APIKEY " + apikey)
                .header("Accept", "application/json")
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();
        debugLog.logRequest(request, null);
        return submit(request, 200, bodyToAuthFn);
    }



}
