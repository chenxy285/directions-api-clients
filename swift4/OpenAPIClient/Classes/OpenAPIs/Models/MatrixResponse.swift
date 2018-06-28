//
// MatrixResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct MatrixResponse: Codable {

    public var distances: [[Double]]?
    public var times: [[Double]]?
    public var weights: [[Double]]?
    public var info: ResponseInfo?

    public init(distances: [[Double]]?, times: [[Double]]?, weights: [[Double]]?, info: ResponseInfo?) {
        self.distances = distances
        self.times = times
        self.weights = weights
        self.info = info
    }


}

