package org.mbari.vars.annosaurus.sdk;

import com.microsoft.kiota.authentication.AnonymousAuthenticationProvider;
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;
import com.microsoft.kiota.http.KiotaClientFactory;
import com.microsoft.kiota.http.OkHttpRequestAdapter;
import okhttp3.logging.HttpLoggingInterceptor;
import org.mbari.vars.annosaurus.sdk.kiota.Annosaurus;

import java.util.Arrays;


public class AnnosaurusFactory {

    private static final System.Logger log = System.getLogger(AnnosaurusFactory.class.getName());

    public static Annosaurus create(String baseUrl, String apiKey) {

        // Set up the authentication provider
        var tokenProvider = new AnnosaurusAccessTokenProvider(baseUrl + "/v1/auth", apiKey);
        var authProvider = new BaseBearerTokenAuthenticationProvider(tokenProvider);

        // Set up the request adapter. This is where we configure the HTTP client and add logging if needed
        var interceptors = KiotaClientFactory.createDefaultInterceptors();
        if (log.isLoggable(System.Logger.Level.DEBUG)) {
            log.log(System.Logger.Level.DEBUG, "Creating new Annosaurus instance with base URL: " + baseUrl);
            var loggingInterceptor = new HttpLoggingInterceptor(s -> log.log(System.Logger.Level.DEBUG, s));
            loggingInterceptor.redactHeader("Authorization");
            interceptors = Arrays.copyOf(interceptors, interceptors.length + 1);
            interceptors[interceptors.length - 1] = loggingInterceptor;
        }
        var client = KiotaClientFactory.create(interceptors).build();
        var adapter = new OkHttpRequestAdapter(authProvider, null, null, client);
        adapter.setBaseUrl(baseUrl);

        // Create the Annosaurus instance
        return new Annosaurus(adapter);
    }

    public static Annosaurus create(String baseUrl) {

        // Set up the authentication provider
        // NO authentication needed if we are doing read-only operations
        var authProvider = new AnonymousAuthenticationProvider();

        // Set up the request adapter. This is where we configure the HTTP client and add logging if needed
        var interceptors = KiotaClientFactory.createDefaultInterceptors();
        if (log.isLoggable(System.Logger.Level.DEBUG)) {
            log.log(System.Logger.Level.DEBUG, "Creating new Annosaurus instance with base URL: " + baseUrl);
            var loggingInterceptor = new HttpLoggingInterceptor(s -> log.log(System.Logger.Level.DEBUG, s));
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            interceptors = Arrays.copyOf(interceptors, interceptors.length + 1);
            interceptors[interceptors.length - 1] = loggingInterceptor;
        }
        var client = KiotaClientFactory.create(interceptors).build();
        var adapter = new OkHttpRequestAdapter(authProvider, null, null, client);
        adapter.setBaseUrl(baseUrl);

        // Create the Annosaurus instance
        return new Annosaurus(adapter);
    }
}
