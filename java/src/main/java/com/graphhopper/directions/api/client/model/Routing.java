/*
 * GraphHopper Directions API
 *  With the [GraphHopper Directions API](https://www.graphhopper.com/products/) you can integrate A-to-B route planning, turn-by-turn navigation, route optimization, isochrone calculations and other tools in your application.  The GraphHopper Directions API consists of the following RESTful web services:   * [Routing](#tag/Routing-API),  * [Route Optimization](#tag/Route-Optimization-API),  * [Isochrone](#tag/Isochrone-API),  * [Map Matching](#tag/Map-Matching-API),  * [Matrix](#tag/Matrix-API) and  * [Geocoding](#tag/Geocoding-API).  # Explore our APIs  To play and see the Route Optimization in action try our [route editor](https://graphhopper.com/blog/2015/07/21/graphhoppers-new-route-optimization-editor/)  which available in the [dashboard](https://graphhopper.com/dashboard/). See how the Routing and Geocoding is integrated in  our route planner website [GraphHopper Maps](https://graphhopper.com/maps) ([sources](https://github.com/graphhopper/graphhopper/tree/0.12/web/src/main/resources/assets)).  And [see below](#section/Explore-our-APIs/Insomnia) for a collection of requests for [Insomnia](https://insomnia.rest/) and [Postman](https://www.getpostman.com/). The request file contains all example requests from this documentation.  ## Get started  1. To use the GraphHopper Directions API you sign up [here](https://graphhopper.com/dashboard/#/register) and create an API key. 2. Read the documentation of the desired API part below. 3. Start using the GraphHopper Directions API. [Our API clients](#section/Explore-our-APIs/API-Clients) can speed up the integration.  To use the GraphHopper Directions API commercially, you can buy paid package [in the dashboard](https://graphhopper.com/dashboard/#/pricing).  ## Contact Us  If you have problems or questions see the following information:   * [FAQ](https://graphhopper.com/api/1/docs/FAQ/)  * [Public forum](https://discuss.graphhopper.com/c/directions-api)       * [Contact us](https://www.graphhopper.com/contact-form/)  To get informed about the newest features and development follow us at [twitter](https://twitter.com/graphhopper/) or [our blog](https://graphhopper.com/blog/).  Furthermore you can watch [this git repository](https://github.com/graphhopper/directions-api-doc) of this documentation, sign up at our [dashboard](https://graphhopper.com/dashboard/) to get the newsletter or sign up at [our forum](https://discuss.graphhopper.com/c/directions-api). Pick the channel you like most.  ## API Clients  To speed up development and make coding easier, we offer the following clients:   * [JavaScript client](https://github.com/graphhopper/directions-api-js-client) - try the [live examples](https://graphhopper.com/api/1/examples/)  * [Others](https://github.com/graphhopper/directions-api-clients) like C#, Ruby, PHP, Python, ... automatically created for the Route Optimization  ### Bandwidth reduction  If you create your own client, make sure it supports http/2 and gzipped responses for best speed.  If you use the Matrix or Route Optimization and want to solve large problems, we recommend you to reduce bandwidth by [compressing your POST request](https://gist.github.com/karussell/82851e303ea7b3459b2dea01f18949f4) and specifying the header as follows: `Content-Encoding: gzip`.  ## Insomnia  To explore our APIs with [Insomnia](https://insomnia.rest/), follow these steps:  1. Open Insomnia and Import [our workspace](https://raw.githubusercontent.com/graphhopper/directions-api-doc/master/web/restclients/GraphHopper-Direction-API-Insomnia.json). 2. Specify [your API key](https://graphhopper.com/dashboard/#/register) in your workspace: Manage Environments -> Base Environment -> `\"api_key\": your API key` 3. Start exploring  ![Insomnia](./img/insomnia.png)  ## Postman  To explore our APIs with [Postman](https://www.getpostman.com/), follow these steps:  1. Import our [request collections](https://raw.githubusercontent.com/graphhopper/directions-api-doc/master/web/restclients/graphhopper_directions_api.postman_collection.json) as well as our [environment file](https://raw.githubusercontent.com/graphhopper/directions-api-doc/master/web/restclients/graphhopper_directions_api.postman_environment.json). 2. Specify [your API key](https://graphhopper.com/dashboard/#/register) in your environment: `\"api_key\": your API key` 3. Start exploring  ![Postman](./img/postman.png)  # Map Data and Routing Profiles  Currently, our main data source is [OpenStreetMap](https://www.openstreetmap.org). We also integrated other network data providers. This chapter gives an overview about the options you have.  ## OpenStreetMap  #### Geographical Coverage  [OpenStreetMap](https://www.openstreetmap.org) covers the entire world. If you want to convince yourself whether we can offer appropriate data for your region, please visit [GraphHopper Maps](https://graphhopper.com/maps/). You can edit and modify OpenStreetMap data if you find that important information is missing, for example, a weight restriction for a bridge. [Here](https://wiki.openstreetmap.org/wiki/Beginners%27_guide) is a beginner's guide that shows how to add data.  If you edited data, we usually consider your data after 1 week at latest.  #### Supported Vehicle Profiles  The Routing, Matrix and Route Optimizations support the following vehicle profiles:  Name       | Description           | Restrictions              | Icon -----------|:----------------------|:--------------------------|:--------------------------------------------------------- car        | Car mode              | car access                | ![car image](https://graphhopper.com/maps/img/car.png) small_truck| Small truck like a Mercedes Sprinter, Ford Transit or Iveco Daily | height=2.7m, width=2+0.4m, length=5.5m, weight=2080+1400 kg | ![small truck image](https://graphhopper.com/maps/img/small_truck.png) truck      | Truck like a MAN or Mercedes-Benz Actros | height=3.7m, width=2.6+0.5m, length=12m, weight=13000 + 13000 kg, hgv=yes, 3 Axes | ![truck image](https://graphhopper.com/maps/img/truck.png) scooter    | Moped mode | Fast inner city, often used for food delivery, is able to ignore certain bollards, maximum speed of roughly 50km/h | ![scooter image](https://graphhopper.com/maps/img/scooter.png) foot       | Pedestrian or walking | foot access         | ![foot image](https://graphhopper.com/maps/img/foot.png) hike       | Pedestrian or walking with priority for more beautiful hiking tours and potentially a bit longer than `foot`  | foot access         | ![hike image](https://graphhopper.com/maps/img/hike.png) bike       | Trekking bike avoiding hills | bike access  | ![bike image](https://graphhopper.com/maps/img/bike.png) mtb        | Mountainbike          | bike access         | ![Mountainbike image](https://graphhopper.com/maps/img/mtb.png) racingbike| Bike preferring roads | bike access         | ![racingbike image](https://graphhopper.com/maps/img/racingbike.png)  **Please note, that turn restrictions for motor vehicles such as `car` or `truck` are only considered with `edge_based=true` for the Routing (other APIs will follow).** Or if you already use `ch.disable=true` no additional parameter is required to consider turn restrictions for motor vehicles.  For the free package you can only choose from `car`, `bike` or `foot`.  We also offer a sophisticated `motorcycle` profile powered by the [Kurviger](https://kurviger.de/en) Routing. Kurviger favors curves and slopes while avoiding cities and highways.  Also we offer custom vehicle profiles with different properties, different speed profiles or different access options. To find out more about custom profiles, please [contact us](https://www.graphhopper.com/contact-form/).  ## TomTom  If you need to consider traffic, you can purchase the TomTom add-on.  Please note:   * Currently we only offer this for our [Route Optimization](#tag/Route-Optimization-API).  * This add-on uses the TomTom road network and historical traffic information only. Live traffic is not yet considered. Read more about [how this works](https://www.graphhopper.com/blog/2017/11/06/time-dependent-optimization/).  * Additionally to our terms your end users need to accept the [TomTom Eula](https://www.graphhopper.com/tomtom-end-user-license-agreement/).  * We do *not* use the TomTom web services. We only use their data with our software.   [Contact us](https://www.graphhopper.com/contact-form/) for more details.  #### Geographical Coverage  We offer  - Europe including Russia - North, Central and South America - Saudi Arabia - United Arab Emirates - South Africa - Australia  #### Supported Vehicle Profiles  Name       | Description           | Restrictions              | Icon -----------|:----------------------|:--------------------------|:--------------------------------------------------------- car        | Car mode              | car access                | ![car image](https://graphhopper.com/maps/img/car.png) small_truck| Small truck like a Mercedes Sprinter, Ford Transit or Iveco Daily | height=2.7m, width=2+0.4m, length=5.5m, weight=2080+1400 kg | ![small truck image](https://graphhopper.com/maps/img/small_truck.png) 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@graphhopper.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.graphhopper.directions.api.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * This contains all routing specific configurations.
 */
@Schema(description = "This contains all routing specific configurations.")

public class Routing {
  @SerializedName("calc_points")
  private Boolean calcPoints = false;

  @SerializedName("consider_traffic")
  private Boolean considerTraffic = false;

  /**
   * specifies the data provider, read more about it [here](#section/Map-Data-and-Routing-Profiles).
   */
  @JsonAdapter(NetworkDataProviderEnum.Adapter.class)
  public enum NetworkDataProviderEnum {
    OPENSTREETMAP("openstreetmap"),
    TOMTOM("tomtom");

    private String value;

    NetworkDataProviderEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static NetworkDataProviderEnum fromValue(String text) {
      for (NetworkDataProviderEnum b : NetworkDataProviderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<NetworkDataProviderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NetworkDataProviderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NetworkDataProviderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NetworkDataProviderEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("network_data_provider")
  private NetworkDataProviderEnum networkDataProvider = NetworkDataProviderEnum.OPENSTREETMAP;

  @SerializedName("fail_fast")
  private Boolean failFast = true;

  @SerializedName("return_snapped_waypoints")
  private Boolean returnSnappedWaypoints = false;

  public Routing calcPoints(Boolean calcPoints) {
    this.calcPoints = calcPoints;
    return this;
  }

   /**
   * It lets you specify whether the API should provide you with route geometries for vehicle routes or not. Thus, you do not need to do extra routing to get the polyline for each route.
   * @return calcPoints
  **/
  @Schema(description = "It lets you specify whether the API should provide you with route geometries for vehicle routes or not. Thus, you do not need to do extra routing to get the polyline for each route.")
  public Boolean isCalcPoints() {
    return calcPoints;
  }

  public void setCalcPoints(Boolean calcPoints) {
    this.calcPoints = calcPoints;
  }

  public Routing considerTraffic(Boolean considerTraffic) {
    this.considerTraffic = considerTraffic;
    return this;
  }

   /**
   * indicates whether historical traffic information should be considered
   * @return considerTraffic
  **/
  @Schema(description = "indicates whether historical traffic information should be considered")
  public Boolean isConsiderTraffic() {
    return considerTraffic;
  }

  public void setConsiderTraffic(Boolean considerTraffic) {
    this.considerTraffic = considerTraffic;
  }

  public Routing networkDataProvider(NetworkDataProviderEnum networkDataProvider) {
    this.networkDataProvider = networkDataProvider;
    return this;
  }

   /**
   * specifies the data provider, read more about it [here](#section/Map-Data-and-Routing-Profiles).
   * @return networkDataProvider
  **/
  @Schema(description = "specifies the data provider, read more about it [here](#section/Map-Data-and-Routing-Profiles).")
  public NetworkDataProviderEnum getNetworkDataProvider() {
    return networkDataProvider;
  }

  public void setNetworkDataProvider(NetworkDataProviderEnum networkDataProvider) {
    this.networkDataProvider = networkDataProvider;
  }

  public Routing failFast(Boolean failFast) {
    this.failFast = failFast;
    return this;
  }

   /**
   * indicates whether matrix calculation should fail fast when points cannot be connected
   * @return failFast
  **/
  @Schema(description = "indicates whether matrix calculation should fail fast when points cannot be connected")
  public Boolean isFailFast() {
    return failFast;
  }

  public void setFailFast(Boolean failFast) {
    this.failFast = failFast;
  }

  public Routing returnSnappedWaypoints(Boolean returnSnappedWaypoints) {
    this.returnSnappedWaypoints = returnSnappedWaypoints;
    return this;
  }

   /**
   * Indicates whether a solution includes snapped waypoints. In contrary to the address coordinate a snapped waypoint is the access point to the (road) network.
   * @return returnSnappedWaypoints
  **/
  @Schema(description = "Indicates whether a solution includes snapped waypoints. In contrary to the address coordinate a snapped waypoint is the access point to the (road) network.")
  public Boolean isReturnSnappedWaypoints() {
    return returnSnappedWaypoints;
  }

  public void setReturnSnappedWaypoints(Boolean returnSnappedWaypoints) {
    this.returnSnappedWaypoints = returnSnappedWaypoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Routing routing = (Routing) o;
    return Objects.equals(this.calcPoints, routing.calcPoints) &&
        Objects.equals(this.considerTraffic, routing.considerTraffic) &&
        Objects.equals(this.networkDataProvider, routing.networkDataProvider) &&
        Objects.equals(this.failFast, routing.failFast) &&
        Objects.equals(this.returnSnappedWaypoints, routing.returnSnappedWaypoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calcPoints, considerTraffic, networkDataProvider, failFast, returnSnappedWaypoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Routing {\n");
    
    sb.append("    calcPoints: ").append(toIndentedString(calcPoints)).append("\n");
    sb.append("    considerTraffic: ").append(toIndentedString(considerTraffic)).append("\n");
    sb.append("    networkDataProvider: ").append(toIndentedString(networkDataProvider)).append("\n");
    sb.append("    failFast: ").append(toIndentedString(failFast)).append("\n");
    sb.append("    returnSnappedWaypoints: ").append(toIndentedString(returnSnappedWaypoints)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
