#import <Foundation/Foundation.h>
#import "SWGObject.h"

/**
* GraphHopper Directions API
* You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/


#import "SWGResponseCoordinates.h"
#import "SWGResponseInstructions.h"
@protocol SWGResponseCoordinates;
@class SWGResponseCoordinates;
@protocol SWGResponseInstructions;
@class SWGResponseInstructions;



@protocol SWGRouteResponsePath
@end

@interface SWGRouteResponsePath : SWGObject

/* The total distance of the route, in meter [optional]
 */
@property(nonatomic) NSNumber* distance;
/* The total time of the route, in ms [optional]
 */
@property(nonatomic) NSNumber* time;

@property(nonatomic) NSNumber* ascend;
/* The total descend (downhill) of the route, in meter [optional]
 */
@property(nonatomic) NSNumber* descend;

@property(nonatomic) SWGResponseCoordinates* points;
/* Is true if the points are encoded, if not paths[0].points contains the geo json of the path (then order is lon,lat,elevation), which is easier to handle but consumes more bandwidth compared to encoded version [optional]
 */
@property(nonatomic) NSNumber* pointsEncoded;
/* The bounding box of the route, format <br> minLon, minLat, maxLon, maxLat [optional]
 */
@property(nonatomic) NSArray<NSNumber*>* bbox;

@property(nonatomic) SWGResponseCoordinates* snappedWaypoints;

@property(nonatomic) SWGResponseInstructions* instructions;

@property(nonatomic) NSObject* details;

@end
