//
// Stop.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct Stop: Codable {

    public var address: Address?
    /** duration of stop, i.e. time in seconds the corresponding activity takes */
    public var duration: Int64?
    /** preparation time of service, e.g. search for a parking space. it only falls due if the location of previous activity differs from this location */
    public var preparationTime: Int64?
    /** array of time windows. currently, only a single time window is allowed */
    public var timeWindows: [TimeWindow]?

    public init(address: Address?, duration: Int64?, preparationTime: Int64?, timeWindows: [TimeWindow]?) {
        self.address = address
        self.duration = duration
        self.preparationTime = preparationTime
        self.timeWindows = timeWindows
    }

    public enum CodingKeys: String, CodingKey { 
        case address
        case duration
        case preparationTime = "preparation_time"
        case timeWindows = "time_windows"
    }


}

