//
// Request.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct Request: Codable {

    /** An array of vehicles that can be employed */
    public var vehicles: [Vehicle]?
    /** An array of vehicle types */
    public var vehicleTypes: [VehicleType]?
    /** An array of services */
    public var services: [Service]?
    /** An array of shipments */
    public var shipments: [Shipment]?
    /** An array of relations */
    public var relations: [Relation]?
    public var algorithm: Algorithm?
    /** An array of objectives */
    public var objectives: [Objective]?
    /** An array of cost matrices */
    public var costMatrices: [CostMatrix]?
    public var configuration: Configuration?

    public init(vehicles: [Vehicle]?, vehicleTypes: [VehicleType]?, services: [Service]?, shipments: [Shipment]?, relations: [Relation]?, algorithm: Algorithm?, objectives: [Objective]?, costMatrices: [CostMatrix]?, configuration: Configuration?) {
        self.vehicles = vehicles
        self.vehicleTypes = vehicleTypes
        self.services = services
        self.shipments = shipments
        self.relations = relations
        self.algorithm = algorithm
        self.objectives = objectives
        self.costMatrices = costMatrices
        self.configuration = configuration
    }

    public enum CodingKeys: String, CodingKey { 
        case vehicles
        case vehicleTypes = "vehicle_types"
        case services
        case shipments
        case relations
        case algorithm
        case objectives
        case costMatrices = "cost_matrices"
        case configuration
    }


}

