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


#import "SWGStop.h"
@protocol SWGStop;
@class SWGStop;



@protocol SWGShipment
@end

@interface SWGShipment : SWGObject

/* Unique identifier of service [optional]
 */
@property(nonatomic) NSString* _id;
/* name of shipment [optional]
 */
@property(nonatomic) NSString* name;
/* priority of service, i.e. 1 = high, 2 = normal, 3 = low. default is 2. [optional]
 */
@property(nonatomic) NSNumber* priority;

@property(nonatomic) SWGStop* pickup;

@property(nonatomic) SWGStop* delivery;
/* array of capacity dimensions [optional]
 */
@property(nonatomic) NSArray<NSNumber*>* size;
/* array of required skills [optional]
 */
@property(nonatomic) NSArray<NSString*>* requiredSkills;
/* array of allowed vehicle ids [optional]
 */
@property(nonatomic) NSArray<NSString*>* allowedVehicles;
/* array of disallowed vehicle ids [optional]
 */
@property(nonatomic) NSArray<NSString*>* disallowedVehicles;
/* max time shipment can stay in vehicle [optional]
 */
@property(nonatomic) NSNumber* maxTimeInVehicle;

@end
