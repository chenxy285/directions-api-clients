/*
 * GraphHopper Directions API
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.graphhopper.directions.api.client.api;

import com.graphhopper.directions.api.client.ApiCallback;
import com.graphhopper.directions.api.client.ApiClient;
import com.graphhopper.directions.api.client.ApiException;
import com.graphhopper.directions.api.client.ApiResponse;
import com.graphhopper.directions.api.client.Configuration;
import com.graphhopper.directions.api.client.Pair;
import com.graphhopper.directions.api.client.ProgressRequestBody;
import com.graphhopper.directions.api.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.graphhopper.directions.api.client.model.GHError;
import com.graphhopper.directions.api.client.model.RouteResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoutingApi {
    private ApiClient apiClient;

    public RoutingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RoutingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for routeGet
     * @param point Specify multiple points for which the route should be calculated. The order is important. Specify at least two points. (required)
     * @param pointsEncoded IMPORTANT- TODO - currently you have to pass false for the swagger client - Have not found a way to force add a parameter. If &#x60;false&#x60; the coordinates in &#x60;point&#x60; and &#x60;snapped_waypoints&#x60; are returned as array using the order [lon,lat,elevation] for every point. If &#x60;true&#x60; the coordinates will be encoded as string leading to less bandwith usage. You&#39;ll need a special handling for the decoding of this string on the client-side. We provide open source code in [Java](https://github.com/graphhopper/graphhopper/blob/d70b63660ac5200b03c38ba3406b8f93976628a6/web/src/main/java/com/graphhopper/http/WebHelper.java#L43) and [JavaScript](https://github.com/graphhopper/graphhopper/blob/d70b63660ac5200b03c38ba3406b8f93976628a6/web/src/main/webapp/js/ghrequest.js#L139). It is especially important to use no 3rd party client if you set &#x60;elevation&#x3D;true&#x60;! (required)
     * @param key Get your key at graphhopper.com (required)
     * @param locale The locale of the resulting turn instructions. E.g. &#x60;pt_PT&#x60; for Portuguese or &#x60;de&#x60; for German (optional)
     * @param instructions If instruction should be calculated and returned (optional)
     * @param vehicle The vehicle for which the route should be calculated. Other vehicles are foot, small_truck, ... (optional)
     * @param elevation If &#x60;true&#x60; a third dimension - the elevation - is included in the polyline or in the GeoJson. If enabled you have to use a modified version of the decoding method or set points_encoded to &#x60;false&#x60;. See the points_encoded attribute for more details. Additionally a request can fail if the vehicle does not support elevation. See the features object for every vehicle. (optional)
     * @param calcPoints If the points for the route should be calculated at all printing out only distance and time. (optional)
     * @param pointHint Optional parameter. Specifies a hint for each &#x60;point&#x60; parameter to prefer a certain street for the closest location lookup. E.g. if there is an address or house with two or more neighboring streets you can control for which street the closest location is looked up. (optional)
     * @param chDisable Use this parameter in combination with one or more parameters of this table (optional)
     * @param weighting Which kind of &#39;best&#39; route calculation you need. Other option is &#x60;shortest&#x60; (e.g. for &#x60;vehicle&#x3D;foot&#x60; or &#x60;bike&#x60;), &#x60;short_fastest&#x60; if time and distance is expensive e.g. for &#x60;vehicle&#x3D;truck&#x60; (optional)
     * @param edgeTraversal Use &#x60;true&#x60; if you want to consider turn restrictions for bike and motor vehicles. Keep in mind that the response time is roughly 2 times slower. (optional)
     * @param algorithm The algorithm to calculate the route. Other options are &#x60;dijkstra&#x60;, &#x60;astar&#x60;, &#x60;astarbi&#x60;, &#x60;alternative_route&#x60; and &#x60;round_trip&#x60; (optional)
     * @param heading Favour a heading direction for a certain point. Specify either one heading for the start point or as many as there are points. In this case headings are associated by their order to the specific points. Headings are given as north based clockwise angle between 0 and 360 degree. This parameter also influences the tour generated with &#x60;algorithm&#x3D;round_trip&#x60; and force the initial direction. (optional)
     * @param headingPenalty Penalty for omitting a specified heading. The penalty corresponds to the accepted time delay in seconds in comparison to the route without a heading. (optional)
     * @param passThrough If &#x60;true&#x60; u-turns are avoided at via-points with regard to the &#x60;heading_penalty&#x60;. (optional)
     * @param details List of additional trip attributes to be returned. Try some of the following: &#x60;average_speed&#x60;, &#x60;street_name&#x60;, &#x60;edge_id&#x60;, &#x60;time&#x60;, &#x60;distance&#x60;. (optional)
     * @param roundTripDistance If &#x60;algorithm&#x3D;round_trip&#x60; this parameter configures approximative length of the resulting round trip (optional)
     * @param roundTripSeed If &#x60;algorithm&#x3D;round_trip&#x60; this parameter introduces randomness if e.g. the first try wasn&#39;t good. (optional)
     * @param alternativeRouteMaxPaths If &#x60;algorithm&#x3D;alternative_route&#x60; this parameter sets the number of maximum paths which should be calculated. Increasing can lead to worse alternatives. (optional)
     * @param alternativeRouteMaxWeightFactor If &#x60;algorithm&#x3D;alternative_route&#x60; this parameter sets the factor by which the alternatives routes can be longer than the optimal route. Increasing can lead to worse alternatives. (optional)
     * @param alternativeRouteMaxShareFactor If &#x60;algorithm&#x3D;alternative_route&#x60; this parameter specifies how much alternatives routes can have maximum in common with the optimal route. Increasing can lead to worse alternatives. (optional)
     * @param avoid comma separate list to avoid certain roads. You can avoid motorway, ferry, tunnel or track (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call routeGetCall(List<String> point, Boolean pointsEncoded, String key, String locale, Boolean instructions, String vehicle, Boolean elevation, Boolean calcPoints, List<String> pointHint, Boolean chDisable, String weighting, Boolean edgeTraversal, String algorithm, Integer heading, Integer headingPenalty, Boolean passThrough, List<String> details, Integer roundTripDistance, Long roundTripSeed, Integer alternativeRouteMaxPaths, Integer alternativeRouteMaxWeightFactor, Integer alternativeRouteMaxShareFactor, String avoid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/route";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (point != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "point", point));
        if (locale != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("locale", locale));
        if (instructions != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("instructions", instructions));
        if (vehicle != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("vehicle", vehicle));
        if (elevation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("elevation", elevation));
        if (pointsEncoded != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("points_encoded", pointsEncoded));
        if (calcPoints != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("calc_points", calcPoints));
        if (pointHint != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "point_hint", pointHint));
        if (chDisable != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ch.disable", chDisable));
        if (weighting != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("weighting", weighting));
        if (edgeTraversal != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("edge_traversal", edgeTraversal));
        if (algorithm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("algorithm", algorithm));
        if (heading != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("heading", heading));
        if (headingPenalty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("heading_penalty", headingPenalty));
        if (passThrough != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pass_through", passThrough));
        if (details != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "details", details));
        if (roundTripDistance != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("round_trip.distance", roundTripDistance));
        if (roundTripSeed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("round_trip.seed", roundTripSeed));
        if (alternativeRouteMaxPaths != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("alternative_route.max_paths", alternativeRouteMaxPaths));
        if (alternativeRouteMaxWeightFactor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("alternative_route.max_weight_factor", alternativeRouteMaxWeightFactor));
        if (alternativeRouteMaxShareFactor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("alternative_route.max_share_factor", alternativeRouteMaxShareFactor));
        if (avoid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("avoid", avoid));
        if (key != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("key", key));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call routeGetValidateBeforeCall(List<String> point, Boolean pointsEncoded, String key, String locale, Boolean instructions, String vehicle, Boolean elevation, Boolean calcPoints, List<String> pointHint, Boolean chDisable, String weighting, Boolean edgeTraversal, String algorithm, Integer heading, Integer headingPenalty, Boolean passThrough, List<String> details, Integer roundTripDistance, Long roundTripSeed, Integer alternativeRouteMaxPaths, Integer alternativeRouteMaxWeightFactor, Integer alternativeRouteMaxShareFactor, String avoid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'point' is set
        if (point == null) {
            throw new ApiException("Missing the required parameter 'point' when calling routeGet(Async)");
        }
        
        // verify the required parameter 'pointsEncoded' is set
        if (pointsEncoded == null) {
            throw new ApiException("Missing the required parameter 'pointsEncoded' when calling routeGet(Async)");
        }
        
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new ApiException("Missing the required parameter 'key' when calling routeGet(Async)");
        }
        

        com.squareup.okhttp.Call call = routeGetCall(point, pointsEncoded, key, locale, instructions, vehicle, elevation, calcPoints, pointHint, chDisable, weighting, edgeTraversal, algorithm, heading, headingPenalty, passThrough, details, roundTripDistance, roundTripSeed, alternativeRouteMaxPaths, alternativeRouteMaxWeightFactor, alternativeRouteMaxShareFactor, avoid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Routing Request
     * The GraphHopper Routing API allows to calculate route and implement navigation via the turn instructions
     * @param point Specify multiple points for which the route should be calculated. The order is important. Specify at least two points. (required)
     * @param pointsEncoded IMPORTANT- TODO - currently you have to pass false for the swagger client - Have not found a way to force add a parameter. If &#x60;false&#x60; the coordinates in &#x60;point&#x60; and &#x60;snapped_waypoints&#x60; are returned as array using the order [lon,lat,elevation] for every point. If &#x60;true&#x60; the coordinates will be encoded as string leading to less bandwith usage. You&#39;ll need a special handling for the decoding of this string on the client-side. We provide open source code in [Java](https://github.com/graphhopper/graphhopper/blob/d70b63660ac5200b03c38ba3406b8f93976628a6/web/src/main/java/com/graphhopper/http/WebHelper.java#L43) and [JavaScript](https://github.com/graphhopper/graphhopper/blob/d70b63660ac5200b03c38ba3406b8f93976628a6/web/src/main/webapp/js/ghrequest.js#L139). It is especially important to use no 3rd party client if you set &#x60;elevation&#x3D;true&#x60;! (required)
     * @param key Get your key at graphhopper.com (required)
     * @param locale The locale of the resulting turn instructions. E.g. &#x60;pt_PT&#x60; for Portuguese or &#x60;de&#x60; for German (optional)
     * @param instructions If instruction should be calculated and returned (optional)
     * @param vehicle The vehicle for which the route should be calculated. Other vehicles are foot, small_truck, ... (optional)
     * @param elevation If &#x60;true&#x60; a third dimension - the elevation - is included in the polyline or in the GeoJson. If enabled you have to use a modified version of the decoding method or set points_encoded to &#x60;false&#x60;. See the points_encoded attribute for more details. Additionally a request can fail if the vehicle does not support elevation. See the features object for every vehicle. (optional)
     * @param calcPoints If the points for the route should be calculated at all printing out only distance and time. (optional)
     * @param pointHint Optional parameter. Specifies a hint for each &#x60;point&#x60; parameter to prefer a certain street for the closest location lookup. E.g. if there is an address or house with two or more neighboring streets you can control for which street the closest location is looked up. (optional)
     * @param chDisable Use this parameter in combination with one or more parameters of this table (optional)
     * @param weighting Which kind of &#39;best&#39; route calculation you need. Other option is &#x60;shortest&#x60; (e.g. for &#x60;vehicle&#x3D;foot&#x60; or &#x60;bike&#x60;), &#x60;short_fastest&#x60; if time and distance is expensive e.g. for &#x60;vehicle&#x3D;truck&#x60; (optional)
     * @param edgeTraversal Use &#x60;true&#x60; if you want to consider turn restrictions for bike and motor vehicles. Keep in mind that the response time is roughly 2 times slower. (optional)
     * @param algorithm The algorithm to calculate the route. Other options are &#x60;dijkstra&#x60;, &#x60;astar&#x60;, &#x60;astarbi&#x60;, &#x60;alternative_route&#x60; and &#x60;round_trip&#x60; (optional)
     * @param heading Favour a heading direction for a certain point. Specify either one heading for the start point or as many as there are points. In this case headings are associated by their order to the specific points. Headings are given as north based clockwise angle between 0 and 360 degree. This parameter also influences the tour generated with &#x60;algorithm&#x3D;round_trip&#x60; and force the initial direction. (optional)
     * @param headingPenalty Penalty for omitting a specified heading. The penalty corresponds to the accepted time delay in seconds in comparison to the route without a heading. (optional)
     * @param passThrough If &#x60;true&#x60; u-turns are avoided at via-points with regard to the &#x60;heading_penalty&#x60;. (optional)
     * @param details List of additional trip attributes to be returned. Try some of the following: &#x60;average_speed&#x60;, &#x60;street_name&#x60;, &#x60;edge_id&#x60;, &#x60;time&#x60;, &#x60;distance&#x60;. (optional)
     * @param roundTripDistance If &#x60;algorithm&#x3D;round_trip&#x60; this parameter configures approximative length of the resulting round trip (optional)
     * @param roundTripSeed If &#x60;algorithm&#x3D;round_trip&#x60; this parameter introduces randomness if e.g. the first try wasn&#39;t good. (optional)
     * @param alternativeRouteMaxPaths If &#x60;algorithm&#x3D;alternative_route&#x60; this parameter sets the number of maximum paths which should be calculated. Increasing can lead to worse alternatives. (optional)
     * @param alternativeRouteMaxWeightFactor If &#x60;algorithm&#x3D;alternative_route&#x60; this parameter sets the factor by which the alternatives routes can be longer than the optimal route. Increasing can lead to worse alternatives. (optional)
     * @param alternativeRouteMaxShareFactor If &#x60;algorithm&#x3D;alternative_route&#x60; this parameter specifies how much alternatives routes can have maximum in common with the optimal route. Increasing can lead to worse alternatives. (optional)
     * @param avoid comma separate list to avoid certain roads. You can avoid motorway, ferry, tunnel or track (optional)
     * @return RouteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RouteResponse routeGet(List<String> point, Boolean pointsEncoded, String key, String locale, Boolean instructions, String vehicle, Boolean elevation, Boolean calcPoints, List<String> pointHint, Boolean chDisable, String weighting, Boolean edgeTraversal, String algorithm, Integer heading, Integer headingPenalty, Boolean passThrough, List<String> details, Integer roundTripDistance, Long roundTripSeed, Integer alternativeRouteMaxPaths, Integer alternativeRouteMaxWeightFactor, Integer alternativeRouteMaxShareFactor, String avoid) throws ApiException {
        ApiResponse<RouteResponse> resp = routeGetWithHttpInfo(point, pointsEncoded, key, locale, instructions, vehicle, elevation, calcPoints, pointHint, chDisable, weighting, edgeTraversal, algorithm, heading, headingPenalty, passThrough, details, roundTripDistance, roundTripSeed, alternativeRouteMaxPaths, alternativeRouteMaxWeightFactor, alternativeRouteMaxShareFactor, avoid);
        return resp.getData();
    }

    /**
     * Routing Request
     * The GraphHopper Routing API allows to calculate route and implement navigation via the turn instructions
     * @param point Specify multiple points for which the route should be calculated. The order is important. Specify at least two points. (required)
     * @param pointsEncoded IMPORTANT- TODO - currently you have to pass false for the swagger client - Have not found a way to force add a parameter. If &#x60;false&#x60; the coordinates in &#x60;point&#x60; and &#x60;snapped_waypoints&#x60; are returned as array using the order [lon,lat,elevation] for every point. If &#x60;true&#x60; the coordinates will be encoded as string leading to less bandwith usage. You&#39;ll need a special handling for the decoding of this string on the client-side. We provide open source code in [Java](https://github.com/graphhopper/graphhopper/blob/d70b63660ac5200b03c38ba3406b8f93976628a6/web/src/main/java/com/graphhopper/http/WebHelper.java#L43) and [JavaScript](https://github.com/graphhopper/graphhopper/blob/d70b63660ac5200b03c38ba3406b8f93976628a6/web/src/main/webapp/js/ghrequest.js#L139). It is especially important to use no 3rd party client if you set &#x60;elevation&#x3D;true&#x60;! (required)
     * @param key Get your key at graphhopper.com (required)
     * @param locale The locale of the resulting turn instructions. E.g. &#x60;pt_PT&#x60; for Portuguese or &#x60;de&#x60; for German (optional)
     * @param instructions If instruction should be calculated and returned (optional)
     * @param vehicle The vehicle for which the route should be calculated. Other vehicles are foot, small_truck, ... (optional)
     * @param elevation If &#x60;true&#x60; a third dimension - the elevation - is included in the polyline or in the GeoJson. If enabled you have to use a modified version of the decoding method or set points_encoded to &#x60;false&#x60;. See the points_encoded attribute for more details. Additionally a request can fail if the vehicle does not support elevation. See the features object for every vehicle. (optional)
     * @param calcPoints If the points for the route should be calculated at all printing out only distance and time. (optional)
     * @param pointHint Optional parameter. Specifies a hint for each &#x60;point&#x60; parameter to prefer a certain street for the closest location lookup. E.g. if there is an address or house with two or more neighboring streets you can control for which street the closest location is looked up. (optional)
     * @param chDisable Use this parameter in combination with one or more parameters of this table (optional)
     * @param weighting Which kind of &#39;best&#39; route calculation you need. Other option is &#x60;shortest&#x60; (e.g. for &#x60;vehicle&#x3D;foot&#x60; or &#x60;bike&#x60;), &#x60;short_fastest&#x60; if time and distance is expensive e.g. for &#x60;vehicle&#x3D;truck&#x60; (optional)
     * @param edgeTraversal Use &#x60;true&#x60; if you want to consider turn restrictions for bike and motor vehicles. Keep in mind that the response time is roughly 2 times slower. (optional)
     * @param algorithm The algorithm to calculate the route. Other options are &#x60;dijkstra&#x60;, &#x60;astar&#x60;, &#x60;astarbi&#x60;, &#x60;alternative_route&#x60; and &#x60;round_trip&#x60; (optional)
     * @param heading Favour a heading direction for a certain point. Specify either one heading for the start point or as many as there are points. In this case headings are associated by their order to the specific points. Headings are given as north based clockwise angle between 0 and 360 degree. This parameter also influences the tour generated with &#x60;algorithm&#x3D;round_trip&#x60; and force the initial direction. (optional)
     * @param headingPenalty Penalty for omitting a specified heading. The penalty corresponds to the accepted time delay in seconds in comparison to the route without a heading. (optional)
     * @param passThrough If &#x60;true&#x60; u-turns are avoided at via-points with regard to the &#x60;heading_penalty&#x60;. (optional)
     * @param details List of additional trip attributes to be returned. Try some of the following: &#x60;average_speed&#x60;, &#x60;street_name&#x60;, &#x60;edge_id&#x60;, &#x60;time&#x60;, &#x60;distance&#x60;. (optional)
     * @param roundTripDistance If &#x60;algorithm&#x3D;round_trip&#x60; this parameter configures approximative length of the resulting round trip (optional)
     * @param roundTripSeed If &#x60;algorithm&#x3D;round_trip&#x60; this parameter introduces randomness if e.g. the first try wasn&#39;t good. (optional)
     * @param alternativeRouteMaxPaths If &#x60;algorithm&#x3D;alternative_route&#x60; this parameter sets the number of maximum paths which should be calculated. Increasing can lead to worse alternatives. (optional)
     * @param alternativeRouteMaxWeightFactor If &#x60;algorithm&#x3D;alternative_route&#x60; this parameter sets the factor by which the alternatives routes can be longer than the optimal route. Increasing can lead to worse alternatives. (optional)
     * @param alternativeRouteMaxShareFactor If &#x60;algorithm&#x3D;alternative_route&#x60; this parameter specifies how much alternatives routes can have maximum in common with the optimal route. Increasing can lead to worse alternatives. (optional)
     * @param avoid comma separate list to avoid certain roads. You can avoid motorway, ferry, tunnel or track (optional)
     * @return ApiResponse&lt;RouteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RouteResponse> routeGetWithHttpInfo(List<String> point, Boolean pointsEncoded, String key, String locale, Boolean instructions, String vehicle, Boolean elevation, Boolean calcPoints, List<String> pointHint, Boolean chDisable, String weighting, Boolean edgeTraversal, String algorithm, Integer heading, Integer headingPenalty, Boolean passThrough, List<String> details, Integer roundTripDistance, Long roundTripSeed, Integer alternativeRouteMaxPaths, Integer alternativeRouteMaxWeightFactor, Integer alternativeRouteMaxShareFactor, String avoid) throws ApiException {
        com.squareup.okhttp.Call call = routeGetValidateBeforeCall(point, pointsEncoded, key, locale, instructions, vehicle, elevation, calcPoints, pointHint, chDisable, weighting, edgeTraversal, algorithm, heading, headingPenalty, passThrough, details, roundTripDistance, roundTripSeed, alternativeRouteMaxPaths, alternativeRouteMaxWeightFactor, alternativeRouteMaxShareFactor, avoid, null, null);
        Type localVarReturnType = new TypeToken<RouteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Routing Request (asynchronously)
     * The GraphHopper Routing API allows to calculate route and implement navigation via the turn instructions
     * @param point Specify multiple points for which the route should be calculated. The order is important. Specify at least two points. (required)
     * @param pointsEncoded IMPORTANT- TODO - currently you have to pass false for the swagger client - Have not found a way to force add a parameter. If &#x60;false&#x60; the coordinates in &#x60;point&#x60; and &#x60;snapped_waypoints&#x60; are returned as array using the order [lon,lat,elevation] for every point. If &#x60;true&#x60; the coordinates will be encoded as string leading to less bandwith usage. You&#39;ll need a special handling for the decoding of this string on the client-side. We provide open source code in [Java](https://github.com/graphhopper/graphhopper/blob/d70b63660ac5200b03c38ba3406b8f93976628a6/web/src/main/java/com/graphhopper/http/WebHelper.java#L43) and [JavaScript](https://github.com/graphhopper/graphhopper/blob/d70b63660ac5200b03c38ba3406b8f93976628a6/web/src/main/webapp/js/ghrequest.js#L139). It is especially important to use no 3rd party client if you set &#x60;elevation&#x3D;true&#x60;! (required)
     * @param key Get your key at graphhopper.com (required)
     * @param locale The locale of the resulting turn instructions. E.g. &#x60;pt_PT&#x60; for Portuguese or &#x60;de&#x60; for German (optional)
     * @param instructions If instruction should be calculated and returned (optional)
     * @param vehicle The vehicle for which the route should be calculated. Other vehicles are foot, small_truck, ... (optional)
     * @param elevation If &#x60;true&#x60; a third dimension - the elevation - is included in the polyline or in the GeoJson. If enabled you have to use a modified version of the decoding method or set points_encoded to &#x60;false&#x60;. See the points_encoded attribute for more details. Additionally a request can fail if the vehicle does not support elevation. See the features object for every vehicle. (optional)
     * @param calcPoints If the points for the route should be calculated at all printing out only distance and time. (optional)
     * @param pointHint Optional parameter. Specifies a hint for each &#x60;point&#x60; parameter to prefer a certain street for the closest location lookup. E.g. if there is an address or house with two or more neighboring streets you can control for which street the closest location is looked up. (optional)
     * @param chDisable Use this parameter in combination with one or more parameters of this table (optional)
     * @param weighting Which kind of &#39;best&#39; route calculation you need. Other option is &#x60;shortest&#x60; (e.g. for &#x60;vehicle&#x3D;foot&#x60; or &#x60;bike&#x60;), &#x60;short_fastest&#x60; if time and distance is expensive e.g. for &#x60;vehicle&#x3D;truck&#x60; (optional)
     * @param edgeTraversal Use &#x60;true&#x60; if you want to consider turn restrictions for bike and motor vehicles. Keep in mind that the response time is roughly 2 times slower. (optional)
     * @param algorithm The algorithm to calculate the route. Other options are &#x60;dijkstra&#x60;, &#x60;astar&#x60;, &#x60;astarbi&#x60;, &#x60;alternative_route&#x60; and &#x60;round_trip&#x60; (optional)
     * @param heading Favour a heading direction for a certain point. Specify either one heading for the start point or as many as there are points. In this case headings are associated by their order to the specific points. Headings are given as north based clockwise angle between 0 and 360 degree. This parameter also influences the tour generated with &#x60;algorithm&#x3D;round_trip&#x60; and force the initial direction. (optional)
     * @param headingPenalty Penalty for omitting a specified heading. The penalty corresponds to the accepted time delay in seconds in comparison to the route without a heading. (optional)
     * @param passThrough If &#x60;true&#x60; u-turns are avoided at via-points with regard to the &#x60;heading_penalty&#x60;. (optional)
     * @param details List of additional trip attributes to be returned. Try some of the following: &#x60;average_speed&#x60;, &#x60;street_name&#x60;, &#x60;edge_id&#x60;, &#x60;time&#x60;, &#x60;distance&#x60;. (optional)
     * @param roundTripDistance If &#x60;algorithm&#x3D;round_trip&#x60; this parameter configures approximative length of the resulting round trip (optional)
     * @param roundTripSeed If &#x60;algorithm&#x3D;round_trip&#x60; this parameter introduces randomness if e.g. the first try wasn&#39;t good. (optional)
     * @param alternativeRouteMaxPaths If &#x60;algorithm&#x3D;alternative_route&#x60; this parameter sets the number of maximum paths which should be calculated. Increasing can lead to worse alternatives. (optional)
     * @param alternativeRouteMaxWeightFactor If &#x60;algorithm&#x3D;alternative_route&#x60; this parameter sets the factor by which the alternatives routes can be longer than the optimal route. Increasing can lead to worse alternatives. (optional)
     * @param alternativeRouteMaxShareFactor If &#x60;algorithm&#x3D;alternative_route&#x60; this parameter specifies how much alternatives routes can have maximum in common with the optimal route. Increasing can lead to worse alternatives. (optional)
     * @param avoid comma separate list to avoid certain roads. You can avoid motorway, ferry, tunnel or track (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call routeGetAsync(List<String> point, Boolean pointsEncoded, String key, String locale, Boolean instructions, String vehicle, Boolean elevation, Boolean calcPoints, List<String> pointHint, Boolean chDisable, String weighting, Boolean edgeTraversal, String algorithm, Integer heading, Integer headingPenalty, Boolean passThrough, List<String> details, Integer roundTripDistance, Long roundTripSeed, Integer alternativeRouteMaxPaths, Integer alternativeRouteMaxWeightFactor, Integer alternativeRouteMaxShareFactor, String avoid, final ApiCallback<RouteResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = routeGetValidateBeforeCall(point, pointsEncoded, key, locale, instructions, vehicle, elevation, calcPoints, pointHint, chDisable, weighting, edgeTraversal, algorithm, heading, headingPenalty, passThrough, details, roundTripDistance, roundTripSeed, alternativeRouteMaxPaths, alternativeRouteMaxWeightFactor, alternativeRouteMaxShareFactor, avoid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RouteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
