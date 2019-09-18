/**
* GraphHopper Directions API
*  With the [GraphHopper Directions API](https://www.graphhopper.com/products/) you can integrate A-to-B route planning, turn-by-turn navigation, route optimization, isochrone calculations and other tools in your application.  The GraphHopper Directions API consists of the following RESTful web services:   * [Routing](#tag/Routing-API),  * [Route Optimization](#tag/Route-Optimization-API),  * [Isochrone](#tag/Isochrone-API),  * [Map Matching](#tag/Map-Matching-API),  * [Matrix](#tag/Matrix-API) and  * [Geocoding](#tag/Geocoding-API).  # Explore our APIs  To play and see the Route Optimization in action try our [route editor](https://graphhopper.com/blog/2015/07/21/graphhoppers-new-route-optimization-editor/)  which available in the [dashboard](https://graphhopper.com/dashboard/). See how the Routing and Geocoding is integrated in  our route planner website [GraphHopper Maps](https://graphhopper.com/maps) ([sources](https://github.com/graphhopper/graphhopper/tree/0.12/web/src/main/resources/assets)).  And [see below](#section/Explore-our-APIs/Insomnia) for a collection of requests for [Insomnia](https://insomnia.rest/) and [Postman](https://www.getpostman.com/). The request file contains all example requests from this documentation.  ## Get started  1. To use the GraphHopper Directions API you sign up [here](https://graphhopper.com/dashboard/#/register) and create an API key. 2. Read the documentation of the desired API part below. 3. Start using the GraphHopper Directions API. [Our API clients](#section/Explore-our-APIs/API-Clients) can speed up the integration.  To use the GraphHopper Directions API commercially, you can buy paid package [in the dashboard](https://graphhopper.com/dashboard/#/pricing).  ## Contact Us  If you have problems or questions see the following information:   * [FAQ](https://graphhopper.com/api/1/docs/FAQ/)  * [Public forum](https://discuss.graphhopper.com/c/directions-api)       * [Contact us](https://www.graphhopper.com/contact-form/)  To get informed about the newest features and development follow us at [twitter](https://twitter.com/graphhopper/) or [our blog](https://graphhopper.com/blog/).  Furthermore you can watch [this git repository](https://github.com/graphhopper/directions-api-doc) of this documentation, sign up at our [dashboard](https://graphhopper.com/dashboard/) to get the newsletter or sign up at [our forum](https://discuss.graphhopper.com/c/directions-api). Pick the channel you like most.  ## API Client Libraries  To speed up development and make coding easier, we offer the following client libraries:   * [JavaScript client](https://github.com/graphhopper/directions-api-js-client) - try the [live examples](https://graphhopper.com/api/1/examples/)  * [Others](https://github.com/graphhopper/directions-api-clients) like C#, Ruby, PHP, Python, ... automatically created for the Route Optimization  ### Bandwidth reduction  If you create your own client, make sure it supports http/2 and gzipped responses for best speed.  If you use the Matrix or Route Optimization and want to solve large problems, we recommend you to reduce bandwidth by [compressing your POST request](https://gist.github.com/karussell/82851e303ea7b3459b2dea01f18949f4) and specifying the header as follows: `Content-Encoding: gzip`.  ## Insomnia  To explore our APIs with [Insomnia](https://insomnia.rest/), follow these steps:  1. Open Insomnia and Import [our workspace](https://raw.githubusercontent.com/graphhopper/directions-api-doc/master/web/restclients/GraphHopper-Direction-API-Insomnia.json). 2. Specify [your API key](https://graphhopper.com/dashboard/#/register) in your workspace: Manage Environments -> Base Environment -> `\"api_key\": your API key` 3. Start exploring  ![Insomnia](./img/insomnia.png)  ## Postman  To explore our APIs with [Postman](https://www.getpostman.com/), follow these steps:  1. Import our [request collections](https://raw.githubusercontent.com/graphhopper/directions-api-doc/master/web/restclients/graphhopper_directions_api.postman_collection.json) as well as our [environment file](https://raw.githubusercontent.com/graphhopper/directions-api-doc/master/web/restclients/graphhopper_directions_api.postman_environment.json). 2. Specify [your API key](https://graphhopper.com/dashboard/#/register) in your environment: `\"api_key\": your API key` 3. Start exploring  ![Postman](./img/postman.png)  # Map Data and Routing Profiles  Currently, our main data source is [OpenStreetMap](https://www.openstreetmap.org). We also integrated other network data providers. This chapter gives an overview about the options you have.  ## OpenStreetMap  #### Geographical Coverage  [OpenStreetMap](https://www.openstreetmap.org) covers the entire world. If you want to convince yourself whether we can offer appropriate data for your region, please visit [GraphHopper Maps](https://graphhopper.com/maps/). You can edit and modify OpenStreetMap data if you find that important information is missing, for example, a weight restriction for a bridge. [Here](https://wiki.openstreetmap.org/wiki/Beginners%27_guide) is a beginner's guide that shows how to add data.  If you edited data, we usually consider your data after 1 week at latest.  #### Supported Vehicle Profiles  The Routing, Matrix and Route Optimizations support the following vehicle profiles:  Name       | Description           | Restrictions              | Icon -----------|:----------------------|:--------------------------|:--------------------------------------------------------- car        | Car mode              | car access                | ![car image](https://graphhopper.com/maps/img/car.png) small_truck| Small truck like a Mercedes Sprinter, Ford Transit or Iveco Daily | height=2.7m, width=2+0.4m, length=5.5m, weight=2080+1400 kg | ![small truck image](https://graphhopper.com/maps/img/small_truck.png) truck      | Truck like a MAN or Mercedes-Benz Actros | height=3.7m, width=2.6+0.5m, length=12m, weight=13000 + 13000 kg, hgv=yes, 3 Axes | ![truck image](https://graphhopper.com/maps/img/truck.png) scooter    | Moped mode | Fast inner city, often used for food delivery, is able to ignore certain bollards, maximum speed of roughly 50km/h | ![scooter image](https://graphhopper.com/maps/img/scooter.png) foot       | Pedestrian or walking | foot access         | ![foot image](https://graphhopper.com/maps/img/foot.png) hike       | Pedestrian or walking with priority for more beautiful hiking tours and potentially a bit longer than `foot`  | foot access         | ![hike image](https://graphhopper.com/maps/img/hike.png) bike       | Trekking bike avoiding hills | bike access  | ![bike image](https://graphhopper.com/maps/img/bike.png) mtb        | Mountainbike          | bike access         | ![Mountainbike image](https://graphhopper.com/maps/img/mtb.png) racingbike| Bike preferring roads | bike access         | ![racingbike image](https://graphhopper.com/maps/img/racingbike.png)  **Please note, that turn restrictions are considered only with `ch.disable=true`.**  For the free package you can only choose from `car`, `bike` or `foot`.  We also offer a sophisticated `motorcycle` profile powered by the [Kurviger](https://kurviger.de/en) Routing. Kurviger favors curves and slopes while avoiding cities and highways.  Also we offer custom vehicle profiles with different properties, different speed profiles or different access options. To find out more about custom profiles, please [contact us](https://www.graphhopper.com/contact-form/).  ## TomTom  If you need to consider traffic, you can purchase the TomTom add-on.  Please note:   * Currently we only offer this for our [Route Optimization](#tag/Route-Optimization-API).  * This add-on uses the TomTom road network and historical traffic information only. Live traffic is not yet considered. Read more about [how this works](https://www.graphhopper.com/blog/2017/11/06/time-dependent-optimization/).  * Additionally to our terms your end users need to accept the [TomTom Eula](https://www.graphhopper.com/tomtom-end-user-license-agreement/).  * We do *not* use the TomTom web services. We only use their data with our software.   [Contact us](https://www.graphhopper.com/contact-form/) for more details.  #### Geographical Coverage  We offer  - Europe including Russia - North, Central and South America - Saudi Arabia - United Arab Emirates - South Africa - Australia  #### Supported Vehicle Profiles  Name       | Description           | Restrictions              | Icon -----------|:----------------------|:--------------------------|:--------------------------------------------------------- car        | Car mode              | car access                | ![car image](https://graphhopper.com/maps/img/car.png) small_truck| Small truck like a Mercedes Sprinter, Ford Transit or Iveco Daily | height=2.7m, width=2+0.4m, length=5.5m, weight=2080+1400 kg | ![small truck image](https://graphhopper.com/maps/img/small_truck.png) 
*
* OpenAPI spec version: 1.0.0
* Contact: support@graphhopper.com
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.models

import io.swagger.client.models.Address
import io.swagger.client.models.TimeWindow

/**
 * 
 * @param id Specifies the id of the service. Ids need to be unique so there must not be two services/shipments with the same id.
 * @param type Specifies type of service. This makes a difference if items are loaded or unloaded, i.e. if one of the size dimensions > 0. If it is specified as `service` or `pickup`, items are loaded and will stay in the vehicle for the rest of the route (and thus consumes capacity for the rest of the route). If it is a `delivery`, items are implicitly loaded at the beginning of the route and will stay in the route until delivery (and thus releases capacity for the rest of the route).
 * @param priority Specifies the priority. Can be 1 = high priority to 10 = low priority. Often there are more services/shipments than the available vehicle fleet can handle. Then you could assign priorities to differentiate high priority tasks from those that can be served later or omitted at all.
 * @param name Meaningful name for service, e.g. `\"deliver pizza\"`.
 * @param address 
 * @param duration Specifies the duration of the service in seconds, i.e. how long it takes at the customer site.
 * @param preparationTime Specifies the preparation time in seconds. It can be used to model parking lot search time since if you have 3 identical locations in a row, it only falls due once.
 * @param timeWindows Specifies an array of time window objects (see time_window object below). Specify the time either with the recommended Unix time stamp (the number of seconds since 1970-01-01) or you can also count the seconds relative to Monday morning 00:00 and define the whole week in seconds. For example, Monday 9am is then represented by 9hour * 3600sec/hour = 32400. In turn, Wednesday 1pm corresponds to 2day * 24hour/day * 3600sec/hour + 1day * 13hour/day * 3600sec/hour = 219600. See this tutorial for more information.
 * @param size Size can have multiple dimensions and should be in line with the capacity dimension array of the vehicle type. For example, if the item that needs to be delivered has two size dimension, volume and weight, then specify it as follow [ 20, 5 ] assuming a volume of 20 and a weight of 5.
 * @param requiredSkills Specifies an array of required skills, i.e. array of string (not case sensitive). For example, if this service needs to be conducted by a technician having a `drilling_machine` and a `screw_driver` then specify the array as follows: `[\"drilling_machine\",\"screw_driver\"]`. This means that the service can only be done by a vehicle (technician) that has the skills `drilling_machine` AND `screw_driver` in its skill array. Otherwise it remains unassigned.
 * @param allowedVehicles Specifies an array of allowed vehicles, i.e. array of vehicle ids. For example, if this service can only be conducted EITHER by `technician_peter` OR `technician_stefan` specify this as follows: `[\"technician_peter\",\"technician_stefan\"]`.
 * @param disallowedVehicles Specifies an array of disallowed vehicles, i.e. array of vehicle ids.
 * @param maxTimeInVehicle Specifies the maximum time in seconds a delivery can stay in the vehicle. Currently, it only works with services of \"type\":\"delivery\".
 * @param group Group this service belongs to.
 */
data class Service (
    /* Specifies the id of the service. Ids need to be unique so there must not be two services/shipments with the same id. */
    val id: kotlin.String,
    val address: Address
,
    /* Specifies type of service. This makes a difference if items are loaded or unloaded, i.e. if one of the size dimensions > 0. If it is specified as `service` or `pickup`, items are loaded and will stay in the vehicle for the rest of the route (and thus consumes capacity for the rest of the route). If it is a `delivery`, items are implicitly loaded at the beginning of the route and will stay in the route until delivery (and thus releases capacity for the rest of the route). */
    val type: Service.Type? = null,
    /* Specifies the priority. Can be 1 = high priority to 10 = low priority. Often there are more services/shipments than the available vehicle fleet can handle. Then you could assign priorities to differentiate high priority tasks from those that can be served later or omitted at all. */
    val priority: kotlin.Int? = null,
    /* Meaningful name for service, e.g. `\"deliver pizza\"`. */
    val name: kotlin.String? = null,
    /* Specifies the duration of the service in seconds, i.e. how long it takes at the customer site. */
    val duration: kotlin.Long? = null,
    /* Specifies the preparation time in seconds. It can be used to model parking lot search time since if you have 3 identical locations in a row, it only falls due once. */
    val preparationTime: kotlin.Long? = null,
    /* Specifies an array of time window objects (see time_window object below). Specify the time either with the recommended Unix time stamp (the number of seconds since 1970-01-01) or you can also count the seconds relative to Monday morning 00:00 and define the whole week in seconds. For example, Monday 9am is then represented by 9hour * 3600sec/hour = 32400. In turn, Wednesday 1pm corresponds to 2day * 24hour/day * 3600sec/hour + 1day * 13hour/day * 3600sec/hour = 219600. See this tutorial for more information. */
    val timeWindows: kotlin.Array<TimeWindow>? = null,
    /* Size can have multiple dimensions and should be in line with the capacity dimension array of the vehicle type. For example, if the item that needs to be delivered has two size dimension, volume and weight, then specify it as follow [ 20, 5 ] assuming a volume of 20 and a weight of 5. */
    val size: kotlin.Array<kotlin.Int>? = null,
    /* Specifies an array of required skills, i.e. array of string (not case sensitive). For example, if this service needs to be conducted by a technician having a `drilling_machine` and a `screw_driver` then specify the array as follows: `[\"drilling_machine\",\"screw_driver\"]`. This means that the service can only be done by a vehicle (technician) that has the skills `drilling_machine` AND `screw_driver` in its skill array. Otherwise it remains unassigned. */
    val requiredSkills: kotlin.Array<kotlin.String>? = null,
    /* Specifies an array of allowed vehicles, i.e. array of vehicle ids. For example, if this service can only be conducted EITHER by `technician_peter` OR `technician_stefan` specify this as follows: `[\"technician_peter\",\"technician_stefan\"]`. */
    val allowedVehicles: kotlin.Array<kotlin.String>? = null,
    /* Specifies an array of disallowed vehicles, i.e. array of vehicle ids. */
    val disallowedVehicles: kotlin.Array<kotlin.String>? = null,
    /* Specifies the maximum time in seconds a delivery can stay in the vehicle. Currently, it only works with services of \"type\":\"delivery\". */
    val maxTimeInVehicle: kotlin.Long? = null,
    /* Group this service belongs to. */
    val group: kotlin.String? = null
) {
    /**
    * Specifies type of service. This makes a difference if items are loaded or unloaded, i.e. if one of the size dimensions > 0. If it is specified as `service` or `pickup`, items are loaded and will stay in the vehicle for the rest of the route (and thus consumes capacity for the rest of the route). If it is a `delivery`, items are implicitly loaded at the beginning of the route and will stay in the route until delivery (and thus releases capacity for the rest of the route).
    * Values: service,pickup,delivery
    */
    enum class Type(val value: kotlin.String){
        service("service"),
        pickup("pickup"),
        delivery("delivery");
    }
}