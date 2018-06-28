=begin
#GraphHopper Directions API

#You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.

OpenAPI spec version: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 3.0.3

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for GraphHopperClient::ResponseCoordinates
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'ResponseCoordinates' do
  before do
    # run before each test
    @instance = GraphHopperClient::ResponseCoordinates.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ResponseCoordinates' do
    it 'should create an instance of ResponseCoordinates' do
      expect(@instance).to be_instance_of(GraphHopperClient::ResponseCoordinates)
    end
  end
  describe 'test attribute "coordinates"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
