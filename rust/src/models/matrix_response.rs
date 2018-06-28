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
pub struct MatrixResponse {
  #[serde(rename = "distances")]
  distances: Option<Vec<Vec<f64>>>,
  #[serde(rename = "times")]
  times: Option<Vec<Vec<f64>>>,
  #[serde(rename = "weights")]
  weights: Option<Vec<Vec<f64>>>,
  #[serde(rename = "info")]
  info: Option<::models::ResponseInfo>
}

impl MatrixResponse {
  pub fn new() -> MatrixResponse {
    MatrixResponse {
      distances: None,
      times: None,
      weights: None,
      info: None
    }
  }

  pub fn set_distances(&mut self, distances: Vec<Vec<f64>>) {
    self.distances = Some(distances);
  }

  pub fn with_distances(mut self, distances: Vec<Vec<f64>>) -> MatrixResponse {
    self.distances = Some(distances);
    self
  }

  pub fn distances(&self) -> Option<&Vec<Vec<f64>>> {
    self.distances.as_ref()
  }

  pub fn reset_distances(&mut self) {
    self.distances = None;
  }

  pub fn set_times(&mut self, times: Vec<Vec<f64>>) {
    self.times = Some(times);
  }

  pub fn with_times(mut self, times: Vec<Vec<f64>>) -> MatrixResponse {
    self.times = Some(times);
    self
  }

  pub fn times(&self) -> Option<&Vec<Vec<f64>>> {
    self.times.as_ref()
  }

  pub fn reset_times(&mut self) {
    self.times = None;
  }

  pub fn set_weights(&mut self, weights: Vec<Vec<f64>>) {
    self.weights = Some(weights);
  }

  pub fn with_weights(mut self, weights: Vec<Vec<f64>>) -> MatrixResponse {
    self.weights = Some(weights);
    self
  }

  pub fn weights(&self) -> Option<&Vec<Vec<f64>>> {
    self.weights.as_ref()
  }

  pub fn reset_weights(&mut self) {
    self.weights = None;
  }

  pub fn set_info(&mut self, info: ::models::ResponseInfo) {
    self.info = Some(info);
  }

  pub fn with_info(mut self, info: ::models::ResponseInfo) -> MatrixResponse {
    self.info = Some(info);
    self
  }

  pub fn info(&self) -> Option<&::models::ResponseInfo> {
    self.info.as_ref()
  }

  pub fn reset_info(&mut self) {
    self.info = None;
  }

}



