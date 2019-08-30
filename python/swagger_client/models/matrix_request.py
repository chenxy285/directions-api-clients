# coding: utf-8

"""
    GraphHopper Directions API

     With the [GraphHopper Directions API](https://www.graphhopper.com/products/) you can integrate A-to-B route planning, turn-by-turn navigation, route optimization, isochrone calculations and other tools in your application.  The GraphHopper Directions API consists of the following RESTful web services:   * [Routing](#tag/Routing-API),  * [Route Optimization](#tag/Route-Optimization-API),  * [Isochrone](#tag/Isochrone-API),  * [Map Matching](#tag/Map-Matching-API),  * [Matrix](#tag/Matrix-API) and  * [Geocoding](#tag/Geocoding-API).  # Explore our APIs  To play and see the Route Optimization in action try our [route editor](https://graphhopper.com/blog/2015/07/21/graphhoppers-new-route-optimization-editor/)  which available in the [dashboard](https://graphhopper.com/dashboard/). See how the Routing and Geocoding is integrated in  our route planner website [GraphHopper Maps](https://graphhopper.com/maps) ([sources](https://github.com/graphhopper/graphhopper/tree/0.12/web/src/main/resources/assets)).  And [see below](#section/Explore-our-APIs/Insomnia) for a collection of requests for [Insomnia](https://insomnia.rest/) and [Postman](https://www.getpostman.com/). The request file contains all example requests from this documentation.  ## Get started  1. To use the GraphHopper Directions API you sign up [here](https://graphhopper.com/dashboard/#/register) and create an API key. 2. Read the documentation of the desired API part below. 3. Start using the GraphHopper Directions API. [Our API clients](#section/Explore-our-APIs/API-Clients) can speed up the integration.  To use the GraphHopper Directions API commercially, you can buy paid package [in the dashboard](https://graphhopper.com/dashboard/#/pricing).  ## Contact Us  If you have problems or questions see the following information:   * [FAQ](https://graphhopper.com/api/1/docs/FAQ/)  * [Public forum](https://discuss.graphhopper.com/c/directions-api)       * [Contact us](https://www.graphhopper.com/contact-form/)  To get informed about the newest features and development follow us at [twitter](https://twitter.com/graphhopper/) or [our blog](https://graphhopper.com/blog/).  Furthermore you can watch [this git repository](https://github.com/graphhopper/directions-api-doc) of this documentation, sign up at our [dashboard](https://graphhopper.com/dashboard/) to get the newsletter or sign up at [our forum](https://discuss.graphhopper.com/c/directions-api). Pick the channel you like most.  ## API Clients  To speed up development and make coding easier, we offer the following clients:   * [JavaScript client](https://github.com/graphhopper/directions-api-js-client) - try the [live examples](https://graphhopper.com/api/1/examples/)  * [Others](https://github.com/graphhopper/directions-api-clients) like C#, Ruby, PHP, Python, ... automatically created for the Route Optimization  ### Bandwidth reduction  If you create your own client, make sure it supports http/2 and gzipped responses for best speed.  If you use the Matrix or Route Optimization and want to solve large problems, we recommend you to reduce bandwidth by [compressing your POST request](https://gist.github.com/karussell/82851e303ea7b3459b2dea01f18949f4) and specifying the header as follows: `Content-Encoding: gzip`.  ## Insomnia  To explore our APIs with [Insomnia](https://insomnia.rest/), follow these steps:  1. Open Insomnia and Import [our workspace](https://raw.githubusercontent.com/graphhopper/directions-api-doc/master/web/restclients/GraphHopper-Direction-API-Insomnia.json). 2. Specify [your API key](https://graphhopper.com/dashboard/#/register) in your workspace: Manage Environments -> Base Environment -> `\"api_key\": your API key` 3. Start exploring  ![Insomnia](./img/insomnia.png)  ## Postman  To explore our APIs with [Postman](https://www.getpostman.com/), follow these steps:  1. Import our [request collections](https://raw.githubusercontent.com/graphhopper/directions-api-doc/master/web/restclients/graphhopper_directions_api.postman_collection.json) as well as our [environment file](https://raw.githubusercontent.com/graphhopper/directions-api-doc/master/web/restclients/graphhopper_directions_api.postman_environment.json). 2. Specify [your API key](https://graphhopper.com/dashboard/#/register) in your environment: `\"api_key\": your API key` 3. Start exploring  ![Postman](./img/postman.png)  # Map Data and Routing Profiles  Currently, our main data source is [OpenStreetMap](https://www.openstreetmap.org). We also integrated other network data providers. This chapter gives an overview about the options you have.  ## OpenStreetMap  #### Geographical Coverage  [OpenStreetMap](https://www.openstreetmap.org) covers the entire world. If you want to convince yourself whether we can offer appropriate data for your region, please visit [GraphHopper Maps](https://graphhopper.com/maps/). You can edit and modify OpenStreetMap data if you find that important information is missing, for example, a weight restriction for a bridge. [Here](https://wiki.openstreetmap.org/wiki/Beginners%27_guide) is a beginner's guide that shows how to add data.  If you edited data, we usually consider your data after 1 week at latest.  #### Supported Vehicle Profiles  The Routing, Matrix and Route Optimizations support the following vehicle profiles:  Name       | Description           | Restrictions              | Icon -----------|:----------------------|:--------------------------|:--------------------------------------------------------- car        | Car mode              | car access                | ![car image](https://graphhopper.com/maps/img/car.png) small_truck| Small truck like a Mercedes Sprinter, Ford Transit or Iveco Daily | height=2.7m, width=2+0.4m, length=5.5m, weight=2080+1400 kg | ![small truck image](https://graphhopper.com/maps/img/small_truck.png) truck      | Truck like a MAN or Mercedes-Benz Actros | height=3.7m, width=2.6+0.5m, length=12m, weight=13000 + 13000 kg, hgv=yes, 3 Axes | ![truck image](https://graphhopper.com/maps/img/truck.png) scooter    | Moped mode | Fast inner city, often used for food delivery, is able to ignore certain bollards, maximum speed of roughly 50km/h | ![scooter image](https://graphhopper.com/maps/img/scooter.png) foot       | Pedestrian or walking | foot access         | ![foot image](https://graphhopper.com/maps/img/foot.png) hike       | Pedestrian or walking with priority for more beautiful hiking tours and potentially a bit longer than `foot`  | foot access         | ![hike image](https://graphhopper.com/maps/img/hike.png) bike       | Trekking bike avoiding hills | bike access  | ![bike image](https://graphhopper.com/maps/img/bike.png) mtb        | Mountainbike          | bike access         | ![Mountainbike image](https://graphhopper.com/maps/img/mtb.png) racingbike| Bike preferring roads | bike access         | ![racingbike image](https://graphhopper.com/maps/img/racingbike.png)  **Please note, that turn restrictions for motor vehicles such as `car` or `truck` are only considered with `edge_based=true` for the Routing (other APIs will follow).** Or if you already use `ch.disable=true` no additional parameter is required to consider turn restrictions for motor vehicles.  For the free package you can only choose from `car`, `bike` or `foot`.  We also offer a sophisticated `motorcycle` profile powered by the [Kurviger](https://kurviger.de/en) Routing. Kurviger favors curves and slopes while avoiding cities and highways.  Also we offer custom vehicle profiles with different properties, different speed profiles or different access options. To find out more about custom profiles, please [contact us](https://www.graphhopper.com/contact-form/).  ## TomTom  If you need to consider traffic, you can purchase the TomTom add-on.  Please note:   * Currently we only offer this for our [Route Optimization](#tag/Route-Optimization-API).  * This add-on uses the TomTom road network and historical traffic information only. Live traffic is not yet considered. Read more about [how this works](https://www.graphhopper.com/blog/2017/11/06/time-dependent-optimization/).  * Additionally to our terms your end users need to accept the [TomTom Eula](https://www.graphhopper.com/tomtom-end-user-license-agreement/).  * We do *not* use the TomTom web services. We only use their data with our software.   [Contact us](https://www.graphhopper.com/contact-form/) for more details.  #### Geographical Coverage  We offer  - Europe including Russia - North, Central and South America - Saudi Arabia - United Arab Emirates - South Africa - Australia  #### Supported Vehicle Profiles  Name       | Description           | Restrictions              | Icon -----------|:----------------------|:--------------------------|:--------------------------------------------------------- car        | Car mode              | car access                | ![car image](https://graphhopper.com/maps/img/car.png) small_truck| Small truck like a Mercedes Sprinter, Ford Transit or Iveco Daily | height=2.7m, width=2+0.4m, length=5.5m, weight=2080+1400 kg | ![small truck image](https://graphhopper.com/maps/img/small_truck.png)   # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: support@graphhopper.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six
from swagger_client.models.object import Object  # noqa: F401,E501


class MatrixRequest(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'from_points': 'list[list[float]]',
        'to_points': 'list[list[float]]',
        'from_point_hints': 'list[str]',
        'to_point_hints': 'list[str]',
        'out_arrays': 'list[str]',
        'vehicle': 'Object',
        'fail_fast': 'bool'
    }

    attribute_map = {
        'from_points': 'from_points',
        'to_points': 'to_points',
        'from_point_hints': 'from_point_hints',
        'to_point_hints': 'to_point_hints',
        'out_arrays': 'out_arrays',
        'vehicle': 'vehicle',
        'fail_fast': 'fail_fast'
    }

    def __init__(self, from_points=None, to_points=None, from_point_hints=None, to_point_hints=None, out_arrays=None, vehicle=None, fail_fast=True):  # noqa: E501
        """MatrixRequest - a model defined in Swagger"""  # noqa: E501
        self._from_points = None
        self._to_points = None
        self._from_point_hints = None
        self._to_point_hints = None
        self._out_arrays = None
        self._vehicle = None
        self._fail_fast = None
        self.discriminator = None
        if from_points is not None:
            self.from_points = from_points
        if to_points is not None:
            self.to_points = to_points
        if from_point_hints is not None:
            self.from_point_hints = from_point_hints
        if to_point_hints is not None:
            self.to_point_hints = to_point_hints
        if out_arrays is not None:
            self.out_arrays = out_arrays
        if vehicle is not None:
            self.vehicle = vehicle
        if fail_fast is not None:
            self.fail_fast = fail_fast

    @property
    def from_points(self):
        """Gets the from_points of this MatrixRequest.  # noqa: E501

        The starting points for the routes in an array of `[longitude,latitude]`. For instance, if you want to calculate three routes from point A such as A->1, A->2, A->3 then you have one `from_point` parameter and three `to_point` parameters.  # noqa: E501

        :return: The from_points of this MatrixRequest.  # noqa: E501
        :rtype: list[list[float]]
        """
        return self._from_points

    @from_points.setter
    def from_points(self, from_points):
        """Sets the from_points of this MatrixRequest.

        The starting points for the routes in an array of `[longitude,latitude]`. For instance, if you want to calculate three routes from point A such as A->1, A->2, A->3 then you have one `from_point` parameter and three `to_point` parameters.  # noqa: E501

        :param from_points: The from_points of this MatrixRequest.  # noqa: E501
        :type: list[list[float]]
        """

        self._from_points = from_points

    @property
    def to_points(self):
        """Gets the to_points of this MatrixRequest.  # noqa: E501

        The destination points for the routes in an array of `[longitude,latitude]`.  # noqa: E501

        :return: The to_points of this MatrixRequest.  # noqa: E501
        :rtype: list[list[float]]
        """
        return self._to_points

    @to_points.setter
    def to_points(self, to_points):
        """Sets the to_points of this MatrixRequest.

        The destination points for the routes in an array of `[longitude,latitude]`.  # noqa: E501

        :param to_points: The to_points of this MatrixRequest.  # noqa: E501
        :type: list[list[float]]
        """

        self._to_points = to_points

    @property
    def from_point_hints(self):
        """Gets the from_point_hints of this MatrixRequest.  # noqa: E501

        See `point_hints`  # noqa: E501

        :return: The from_point_hints of this MatrixRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._from_point_hints

    @from_point_hints.setter
    def from_point_hints(self, from_point_hints):
        """Sets the from_point_hints of this MatrixRequest.

        See `point_hints`  # noqa: E501

        :param from_point_hints: The from_point_hints of this MatrixRequest.  # noqa: E501
        :type: list[str]
        """

        self._from_point_hints = from_point_hints

    @property
    def to_point_hints(self):
        """Gets the to_point_hints of this MatrixRequest.  # noqa: E501

        See `point_hints`  # noqa: E501

        :return: The to_point_hints of this MatrixRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._to_point_hints

    @to_point_hints.setter
    def to_point_hints(self, to_point_hints):
        """Sets the to_point_hints of this MatrixRequest.

        See `point_hints`  # noqa: E501

        :param to_point_hints: The to_point_hints of this MatrixRequest.  # noqa: E501
        :type: list[str]
        """

        self._to_point_hints = to_point_hints

    @property
    def out_arrays(self):
        """Gets the out_arrays of this MatrixRequest.  # noqa: E501

        Specifies which matrices should be included in the response. Specify one or more of the following options `weights`, `times`, `distances`. The units of the entries of `distances` are meters, of `times` are seconds and of `weights` is arbitrary and it can differ for different vehicles or versions of this API.  # noqa: E501

        :return: The out_arrays of this MatrixRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._out_arrays

    @out_arrays.setter
    def out_arrays(self, out_arrays):
        """Sets the out_arrays of this MatrixRequest.

        Specifies which matrices should be included in the response. Specify one or more of the following options `weights`, `times`, `distances`. The units of the entries of `distances` are meters, of `times` are seconds and of `weights` is arbitrary and it can differ for different vehicles or versions of this API.  # noqa: E501

        :param out_arrays: The out_arrays of this MatrixRequest.  # noqa: E501
        :type: list[str]
        """

        self._out_arrays = out_arrays

    @property
    def vehicle(self):
        """Gets the vehicle of this MatrixRequest.  # noqa: E501


        :return: The vehicle of this MatrixRequest.  # noqa: E501
        :rtype: Object
        """
        return self._vehicle

    @vehicle.setter
    def vehicle(self, vehicle):
        """Sets the vehicle of this MatrixRequest.


        :param vehicle: The vehicle of this MatrixRequest.  # noqa: E501
        :type: Object
        """

        self._vehicle = vehicle

    @property
    def fail_fast(self):
        """Gets the fail_fast of this MatrixRequest.  # noqa: E501

        Specifies whether or not the matrix calculation should return with an error as soon as possible in case some points cannot be found or some points are not connected. If set to `false` the time/weight/distance matrix will be calculated for all valid points and contain the `null` value for all entries that could not be calculated. The `hint` field of the response will also contain additional information about what went wrong (see its documentation).  # noqa: E501

        :return: The fail_fast of this MatrixRequest.  # noqa: E501
        :rtype: bool
        """
        return self._fail_fast

    @fail_fast.setter
    def fail_fast(self, fail_fast):
        """Sets the fail_fast of this MatrixRequest.

        Specifies whether or not the matrix calculation should return with an error as soon as possible in case some points cannot be found or some points are not connected. If set to `false` the time/weight/distance matrix will be calculated for all valid points and contain the `null` value for all entries that could not be calculated. The `hint` field of the response will also contain additional information about what went wrong (see its documentation).  # noqa: E501

        :param fail_fast: The fail_fast of this MatrixRequest.  # noqa: E501
        :type: bool
        """

        self._fail_fast = fail_fast

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(MatrixRequest, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, MatrixRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
