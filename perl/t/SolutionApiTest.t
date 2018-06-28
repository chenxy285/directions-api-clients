=begin comment

GraphHopper Directions API

You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.

OpenAPI spec version: 1.0.0

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator
# Please update the test cases below to test the API endpoints.
# Ref: https://openapi-generator.tech
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::OpenAPIClient::SolutionApi');

my $api = WWW::OpenAPIClient::SolutionApi->new();
isa_ok($api, 'WWW::OpenAPIClient::SolutionApi');

#
# get_solution test
#
{
    my $key = undef; # replace NULL with a proper value
    my $job_id = undef; # replace NULL with a proper value
    my $result = $api->get_solution(key => $key, job_id => $job_id);
}


1;
