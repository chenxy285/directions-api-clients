/*
 * GraphHopper Directions API
 *
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package graphhopper

type VehicleType struct {
	// Unique identifier for the vehicle type
	TypeId string `json:"type_id,omitempty"`
	// Profile of vehicle type
	Profile string `json:"profile,omitempty"`
	// array of capacity dimensions
	Capacity []int32 `json:"capacity,omitempty"`
	// speed_factor of vehicle type
	SpeedFactor float64 `json:"speed_factor,omitempty"`
	// service time factor of vehicle type
	ServiceTimeFactor float64 `json:"service_time_factor,omitempty"`
	// cost parameter per distance unit, here meter is used
	CostPerMeter float64 `json:"cost_per_meter,omitempty"`
	// cost parameter per time unit, here second is used
	CostPerSecond float64 `json:"cost_per_second,omitempty"`
	// cost parameter vehicle activation, i.e. fixed costs per vehicle
	CostPerActivation float64 `json:"cost_per_activation,omitempty"`
}
