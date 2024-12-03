package org.mbari.vars.annosaurus.sdk.kiota.v1.query;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.query.columns.ColumnsRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.query.count.CountRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.query.run.RunRequestBuilder;
/**
 * Builds and executes requests for operations under /v1/query
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QueryRequestBuilder extends BaseRequestBuilder {
    /**
     * The columns property
     * @return a {@link ColumnsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ColumnsRequestBuilder columns() {
        return new ColumnsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The count property
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The run property
     * @return a {@link RunRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RunRequestBuilder run() {
        return new RunRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link QueryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public QueryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/query", pathParameters);
    }
    /**
     * Instantiates a new {@link QueryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public QueryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1/query", rawUrl);
    }
}
