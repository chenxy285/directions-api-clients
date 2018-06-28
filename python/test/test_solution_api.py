# coding: utf-8

"""
    GraphHopper Directions API

    You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.  # noqa: E501

    OpenAPI spec version: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import openapi_client
from openapi_client.api.solution_api import SolutionApi  # noqa: E501
from openapi_client.rest import ApiException


class TestSolutionApi(unittest.TestCase):
    """SolutionApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.solution_api.SolutionApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_solution(self):
        """Test case for get_solution

        Return the solution associated to the jobId  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
