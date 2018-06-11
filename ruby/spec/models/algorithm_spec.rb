=begin
#GraphHopper Directions API

#You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.

OpenAPI spec version: 1.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.0-SNAPSHOT

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for GraphHopperClient::Algorithm
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'Algorithm' do
  before do
    # run before each test
    @instance = GraphHopperClient::Algorithm.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of Algorithm' do
    it 'should create an instance of Algorithm' do
      expect(@instance).to be_instance_of(GraphHopperClient::Algorithm)
    end
  end
  describe 'test attribute "problem_type"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["min", "min-max"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.problem_type = value }.not_to raise_error
       #end
    end
  end

  describe 'test attribute "objective"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["transport_time", "completion_time"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.objective = value }.not_to raise_error
       #end
    end
  end

end

