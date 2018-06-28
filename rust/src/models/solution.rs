/* 
 * GraphHopper Directions API
 *
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct Solution {
  /// overall costs of solution
  #[serde(rename = "costs")]
  costs: Option<i32>,
  /// overall travel distance in meters
  #[serde(rename = "distance")]
  distance: Option<i32>,
  /// overall transport time in seconds
  #[serde(rename = "time")]
  time: Option<i64>,
  /// overall transport time in seconds
  #[serde(rename = "transport_time")]
  transport_time: Option<i64>,
  /// operation time of the longest route in seconds
  #[serde(rename = "max_operation_time")]
  max_operation_time: Option<i64>,
  /// total waiting time in seconds
  #[serde(rename = "waiting_time")]
  waiting_time: Option<i64>,
  /// number of employed vehicles
  #[serde(rename = "no_vehicles")]
  no_vehicles: Option<i32>,
  /// number of jobs that could not be assigned to final solution
  #[serde(rename = "no_unassigned")]
  no_unassigned: Option<i32>,
  /// An array of routes
  #[serde(rename = "routes")]
  routes: Option<Vec<::models::Route>>,
  #[serde(rename = "unassigned")]
  unassigned: Option<Value>
}

impl Solution {
  pub fn new() -> Solution {
    Solution {
      costs: None,
      distance: None,
      time: None,
      transport_time: None,
      max_operation_time: None,
      waiting_time: None,
      no_vehicles: None,
      no_unassigned: None,
      routes: None,
      unassigned: None
    }
  }

  pub fn set_costs(&mut self, costs: i32) {
    self.costs = Some(costs);
  }

  pub fn with_costs(mut self, costs: i32) -> Solution {
    self.costs = Some(costs);
    self
  }

  pub fn costs(&self) -> Option<&i32> {
    self.costs.as_ref()
  }

  pub fn reset_costs(&mut self) {
    self.costs = None;
  }

  pub fn set_distance(&mut self, distance: i32) {
    self.distance = Some(distance);
  }

  pub fn with_distance(mut self, distance: i32) -> Solution {
    self.distance = Some(distance);
    self
  }

  pub fn distance(&self) -> Option<&i32> {
    self.distance.as_ref()
  }

  pub fn reset_distance(&mut self) {
    self.distance = None;
  }

  pub fn set_time(&mut self, time: i64) {
    self.time = Some(time);
  }

  pub fn with_time(mut self, time: i64) -> Solution {
    self.time = Some(time);
    self
  }

  pub fn time(&self) -> Option<&i64> {
    self.time.as_ref()
  }

  pub fn reset_time(&mut self) {
    self.time = None;
  }

  pub fn set_transport_time(&mut self, transport_time: i64) {
    self.transport_time = Some(transport_time);
  }

  pub fn with_transport_time(mut self, transport_time: i64) -> Solution {
    self.transport_time = Some(transport_time);
    self
  }

  pub fn transport_time(&self) -> Option<&i64> {
    self.transport_time.as_ref()
  }

  pub fn reset_transport_time(&mut self) {
    self.transport_time = None;
  }

  pub fn set_max_operation_time(&mut self, max_operation_time: i64) {
    self.max_operation_time = Some(max_operation_time);
  }

  pub fn with_max_operation_time(mut self, max_operation_time: i64) -> Solution {
    self.max_operation_time = Some(max_operation_time);
    self
  }

  pub fn max_operation_time(&self) -> Option<&i64> {
    self.max_operation_time.as_ref()
  }

  pub fn reset_max_operation_time(&mut self) {
    self.max_operation_time = None;
  }

  pub fn set_waiting_time(&mut self, waiting_time: i64) {
    self.waiting_time = Some(waiting_time);
  }

  pub fn with_waiting_time(mut self, waiting_time: i64) -> Solution {
    self.waiting_time = Some(waiting_time);
    self
  }

  pub fn waiting_time(&self) -> Option<&i64> {
    self.waiting_time.as_ref()
  }

  pub fn reset_waiting_time(&mut self) {
    self.waiting_time = None;
  }

  pub fn set_no_vehicles(&mut self, no_vehicles: i32) {
    self.no_vehicles = Some(no_vehicles);
  }

  pub fn with_no_vehicles(mut self, no_vehicles: i32) -> Solution {
    self.no_vehicles = Some(no_vehicles);
    self
  }

  pub fn no_vehicles(&self) -> Option<&i32> {
    self.no_vehicles.as_ref()
  }

  pub fn reset_no_vehicles(&mut self) {
    self.no_vehicles = None;
  }

  pub fn set_no_unassigned(&mut self, no_unassigned: i32) {
    self.no_unassigned = Some(no_unassigned);
  }

  pub fn with_no_unassigned(mut self, no_unassigned: i32) -> Solution {
    self.no_unassigned = Some(no_unassigned);
    self
  }

  pub fn no_unassigned(&self) -> Option<&i32> {
    self.no_unassigned.as_ref()
  }

  pub fn reset_no_unassigned(&mut self) {
    self.no_unassigned = None;
  }

  pub fn set_routes(&mut self, routes: Vec<::models::Route>) {
    self.routes = Some(routes);
  }

  pub fn with_routes(mut self, routes: Vec<::models::Route>) -> Solution {
    self.routes = Some(routes);
    self
  }

  pub fn routes(&self) -> Option<&Vec<::models::Route>> {
    self.routes.as_ref()
  }

  pub fn reset_routes(&mut self) {
    self.routes = None;
  }

  pub fn set_unassigned(&mut self, unassigned: Value) {
    self.unassigned = Some(unassigned);
  }

  pub fn with_unassigned(mut self, unassigned: Value) -> Solution {
    self.unassigned = Some(unassigned);
    self
  }

  pub fn unassigned(&self) -> Option<&Value> {
    self.unassigned.as_ref()
  }

  pub fn reset_unassigned(&mut self) {
    self.unassigned = None;
  }

}



