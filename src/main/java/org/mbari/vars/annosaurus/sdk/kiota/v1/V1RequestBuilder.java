package org.mbari.vars.annosaurus.sdk.kiota.v1;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import org.mbari.vars.annosaurus.sdk.kiota.v1.ancillarydata.AncillarydataRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.annotations.AnnotationsRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.associations.AssociationsRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.auth.AuthRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.fast.FastRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.health.HealthRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.histogram.HistogramRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagedmoments.ImagedmomentsRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.imagereferences.ImagereferencesRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.images.ImagesRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.index.IndexRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.observations.ObservationsRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.query.QueryRequestBuilder;
import org.mbari.vars.annosaurus.sdk.kiota.v1.videoreferences.VideoreferencesRequestBuilder;
/**
 * Builds and executes requests for operations under /v1
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class V1RequestBuilder extends BaseRequestBuilder {
    /**
     * The ancillarydata property
     * @return a {@link AncillarydataRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AncillarydataRequestBuilder ancillarydata() {
        return new AncillarydataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The annotations property
     * @return a {@link AnnotationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AnnotationsRequestBuilder annotations() {
        return new AnnotationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The associations property
     * @return a {@link AssociationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssociationsRequestBuilder associations() {
        return new AssociationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The auth property
     * @return a {@link AuthRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthRequestBuilder auth() {
        return new AuthRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The fast property
     * @return a {@link FastRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FastRequestBuilder fast() {
        return new FastRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The health property
     * @return a {@link HealthRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HealthRequestBuilder health() {
        return new HealthRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The histogram property
     * @return a {@link HistogramRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HistogramRequestBuilder histogram() {
        return new HistogramRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The imagedmoments property
     * @return a {@link ImagedmomentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImagedmomentsRequestBuilder imagedmoments() {
        return new ImagedmomentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The imagereferences property
     * @return a {@link ImagereferencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImagereferencesRequestBuilder imagereferences() {
        return new ImagereferencesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The images property
     * @return a {@link ImagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImagesRequestBuilder images() {
        return new ImagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The index property
     * @return a {@link IndexRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IndexRequestBuilder index() {
        return new IndexRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The observations property
     * @return a {@link ObservationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ObservationsRequestBuilder observations() {
        return new ObservationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The query property
     * @return a {@link QueryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public QueryRequestBuilder query() {
        return new QueryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The videoreferences property
     * @return a {@link VideoreferencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VideoreferencesRequestBuilder videoreferences() {
        return new VideoreferencesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1", pathParameters);
    }
    /**
     * Instantiates a new {@link V1RequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V1RequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/v1", rawUrl);
    }
}
