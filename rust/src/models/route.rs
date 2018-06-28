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
pub struct Route {
  /// id of vehicle that operates route
  #[serde(rename = "vehicle_id")]
  vehicle_id: Option<String>,
  /// distance of route in meter
  #[serde(rename = "distance")]
  distance: Option<i64>,
  /// transport time of route in seconds
  #[serde(rename = "transport_time")]
  transport_time: Option<i64>,
  /// completion time of route in seconds
  #[serde(rename = "completion_time")]
  completion_time: Option<i64>,
  /// waiting time of route in seconds
  #[serde(rename = "waiting_time")]
  waiting_time: Option<i64>,
  /// array of activities
  #[serde(rename = "activities")]
  activities: Option<Vec<::models::Activity>>,
  /// array of route planning points
  #[serde(rename = "points")]
  points: Option<Vec<::models::RoutePoint>>
}

impl Route {
  pub fn new() -> Route {
    Route {
      vehicle_id: None,
      distance: None,
      transport_time: None,
      completion_time: None,
      waiting_time: None,
      activities: None,
      points: None
    }
  }

  pub fn set_vehicle_id(&mut self, vehicle_id: String) {
    self.vehicle_id = Some(vehicle_id);
  }

  pub fn with_vehicle_id(mut self, vehicle_id: String) -> Route {
    self.vehicle_id = Some(vehicle_id);
    self
  }

  pub fn vehicle_id(&self) -> Option<&String> {
    self.vehicle_id.as_ref()
  }

  pub fn reset_vehicle_id(&mut self) {
    self.vehicle_id = None;
  }

  pub fn set_distance(&mut self, distance: i64) {
    self.distance = Some(distance);
  }

  pub fn with_distance(mut self, distance: i64) -> Route {
    self.distance = Some(distance);
    self
  }

  pub fn distance(&self) -> Option<&i64> {
    self.distance.as_ref()
  }

  pub fn reset_distance(&mut self) {
    self.distance = None;
  }

  pub fn set_transport_time(&mut self, transport_time: i64) {
    self.transport_time = Some(transport_time);
  }

  pub fn with_transport_time(mut self, transport_time: i64) -> Route {
    self.transport_time = Some(transport_time);
    self
  }

  pub fn transport_time(&self) -> Option<&i64> {
    self.transport_time.as_ref()
  }

  pub fn reset_transport_time(&mut self) {
    self.transport_time = None;
  }

  pub fn set_completion_time(&mut self, completion_time: i64) {
    self.completion_time = Some(completion_time);
  }

  pub fn with_completion_time(mut self, completion_time: i64) -> Route {
    self.completion_time = Some(completion_time);
    self
  }

  pub fn completion_time(&self) -> Option<&i64> {
    self.completion_time.as_ref()
  }

  pub fn reset_completion_time(&mut self) {
    self.completion_time = None;
  }

  pub fn set_waiting_time(&mut self, waiting_time: i64) {
    self.waiting_time = Some(waiting_time);
  }

  pub fn with_waiting_time(mut self, waiting_time: i64) -> Route {
    self.waiting_time = Some(waiting_time);
    self
  }

  pub fn waiting_time(&self) -> Option<&i64> {
    self.waiting_time.as_ref()
  }

  pub fn reset_waiting_time(&mut self) {
    self.waiting_time = None;
  }

  pub fn set_activities(&mut self, activities: Vec<::models::Activity>) {
    self.activities = Some(activities);
  }

  pub fn with_activities(mut self, activities: Vec<::models::Activity>) -> Route {
    self.activities = Some(activities);
    self
  }

  pub fn activities(&self) -> Option<&Vec<::models::Activity>> {
    self.activities.as_ref()
  }

  pub fn reset_activities(&mut self) {
    self.activities = None;
  }

  pub fn set_points(&mut self, points: Vec<::models::RoutePoint>) {
    self.points = Some(points);
  }

  pub fn with_points(mut self, points: Vec<::models::RoutePoint>) -> Route {
    self.points = Some(points);
    self
  }

  pub fn points(&self) -> Option<&Vec<::models::RoutePoint>> {
    self.points.as_ref()
  }

  pub fn reset_points(&mut self) {
    self.points = None;
  }

}



