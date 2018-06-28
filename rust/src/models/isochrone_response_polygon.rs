/* 
 * GraphHopper Directions API
 *
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// IsochroneResponsePolygon : A found path

#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct IsochroneResponsePolygon {
  #[serde(rename = "properties")]
  properties: Option<Value>,
  #[serde(rename = "type")]
  _type: Option<String>,
  #[serde(rename = "geometry")]
  geometry: Option<Value>
}

impl IsochroneResponsePolygon {
  /// A found path
  pub fn new() -> IsochroneResponsePolygon {
    IsochroneResponsePolygon {
      properties: None,
      _type: None,
      geometry: None
    }
  }

  pub fn set_properties(&mut self, properties: Value) {
    self.properties = Some(properties);
  }

  pub fn with_properties(mut self, properties: Value) -> IsochroneResponsePolygon {
    self.properties = Some(properties);
    self
  }

  pub fn properties(&self) -> Option<&Value> {
    self.properties.as_ref()
  }

  pub fn reset_properties(&mut self) {
    self.properties = None;
  }

  pub fn set__type(&mut self, _type: String) {
    self._type = Some(_type);
  }

  pub fn with__type(mut self, _type: String) -> IsochroneResponsePolygon {
    self._type = Some(_type);
    self
  }

  pub fn _type(&self) -> Option<&String> {
    self._type.as_ref()
  }

  pub fn reset__type(&mut self) {
    self._type = None;
  }

  pub fn set_geometry(&mut self, geometry: Value) {
    self.geometry = Some(geometry);
  }

  pub fn with_geometry(mut self, geometry: Value) -> IsochroneResponsePolygon {
    self.geometry = Some(geometry);
    self
  }

  pub fn geometry(&self) -> Option<&Value> {
    self.geometry.as_ref()
  }

  pub fn reset_geometry(&mut self) {
    self.geometry = None;
  }

}



