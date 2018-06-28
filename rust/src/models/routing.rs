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
pub struct Routing {
  /// indicates whether solution should come with route geometries
  #[serde(rename = "calc_points")]
  calc_points: Option<bool>,
  /// indicates whether historical traffic information should be considered
  #[serde(rename = "consider_traffic")]
  consider_traffic: Option<bool>,
  /// specifies the data provider
  #[serde(rename = "network_data_provider")]
  network_data_provider: Option<String>,
  /// indicates whether matrix calculation should fail fast when points cannot be connected
  #[serde(rename = "fail_fast")]
  fail_fast: Option<bool>
}

impl Routing {
  pub fn new() -> Routing {
    Routing {
      calc_points: None,
      consider_traffic: None,
      network_data_provider: None,
      fail_fast: None
    }
  }

  pub fn set_calc_points(&mut self, calc_points: bool) {
    self.calc_points = Some(calc_points);
  }

  pub fn with_calc_points(mut self, calc_points: bool) -> Routing {
    self.calc_points = Some(calc_points);
    self
  }

  pub fn calc_points(&self) -> Option<&bool> {
    self.calc_points.as_ref()
  }

  pub fn reset_calc_points(&mut self) {
    self.calc_points = None;
  }

  pub fn set_consider_traffic(&mut self, consider_traffic: bool) {
    self.consider_traffic = Some(consider_traffic);
  }

  pub fn with_consider_traffic(mut self, consider_traffic: bool) -> Routing {
    self.consider_traffic = Some(consider_traffic);
    self
  }

  pub fn consider_traffic(&self) -> Option<&bool> {
    self.consider_traffic.as_ref()
  }

  pub fn reset_consider_traffic(&mut self) {
    self.consider_traffic = None;
  }

  pub fn set_network_data_provider(&mut self, network_data_provider: String) {
    self.network_data_provider = Some(network_data_provider);
  }

  pub fn with_network_data_provider(mut self, network_data_provider: String) -> Routing {
    self.network_data_provider = Some(network_data_provider);
    self
  }

  pub fn network_data_provider(&self) -> Option<&String> {
    self.network_data_provider.as_ref()
  }

  pub fn reset_network_data_provider(&mut self) {
    self.network_data_provider = None;
  }

  pub fn set_fail_fast(&mut self, fail_fast: bool) {
    self.fail_fast = Some(fail_fast);
  }

  pub fn with_fail_fast(mut self, fail_fast: bool) -> Routing {
    self.fail_fast = Some(fail_fast);
    self
  }

  pub fn fail_fast(&self) -> Option<&bool> {
    self.fail_fast.as_ref()
  }

  pub fn reset_fail_fast(&mut self) {
    self.fail_fast = None;
  }

}



