# GraphHopper Directions API
#
# You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' Address Class
#'
#' @field location_id 
#' @field name 
#' @field lon 
#' @field lat 
#' @field street_hint 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Address <- R6::R6Class(
  'Address',
  public = list(
    `location_id` = NULL,
    `name` = NULL,
    `lon` = NULL,
    `lat` = NULL,
    `street_hint` = NULL,
    initialize = function(`location_id`, `name`, `lon`, `lat`, `street_hint`){
      if (!missing(`location_id`)) {
        stopifnot(is.character(`location_id`), length(`location_id`) == 1)
        self$`location_id` <- `location_id`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`lon`)) {
        stopifnot(is.numeric(`lon`), length(`lon`) == 1)
        self$`lon` <- `lon`
      }
      if (!missing(`lat`)) {
        stopifnot(is.numeric(`lat`), length(`lat`) == 1)
        self$`lat` <- `lat`
      }
      if (!missing(`street_hint`)) {
        stopifnot(is.character(`street_hint`), length(`street_hint`) == 1)
        self$`street_hint` <- `street_hint`
      }
    },
    toJSON = function() {
      AddressObject <- list()
      if (!is.null(self$`location_id`)) {
        AddressObject[['location_id']] <- self$`location_id`
      }
      if (!is.null(self$`name`)) {
        AddressObject[['name']] <- self$`name`
      }
      if (!is.null(self$`lon`)) {
        AddressObject[['lon']] <- self$`lon`
      }
      if (!is.null(self$`lat`)) {
        AddressObject[['lat']] <- self$`lat`
      }
      if (!is.null(self$`street_hint`)) {
        AddressObject[['street_hint']] <- self$`street_hint`
      }

      AddressObject
    },
    fromJSON = function(AddressJson) {
      AddressObject <- jsonlite::fromJSON(AddressJson)
      if (!is.null(AddressObject$`location_id`)) {
        self$`location_id` <- AddressObject$`location_id`
      }
      if (!is.null(AddressObject$`name`)) {
        self$`name` <- AddressObject$`name`
      }
      if (!is.null(AddressObject$`lon`)) {
        self$`lon` <- AddressObject$`lon`
      }
      if (!is.null(AddressObject$`lat`)) {
        self$`lat` <- AddressObject$`lat`
      }
      if (!is.null(AddressObject$`street_hint`)) {
        self$`street_hint` <- AddressObject$`street_hint`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "location_id": %s,
           "name": %s,
           "lon": %d,
           "lat": %d,
           "street_hint": %s
        }',
        self$`location_id`,
        self$`name`,
        self$`lon`,
        self$`lat`,
        self$`street_hint`
      )
    },
    fromJSONString = function(AddressJson) {
      AddressObject <- jsonlite::fromJSON(AddressJson)
      self$`location_id` <- AddressObject$`location_id`
      self$`name` <- AddressObject$`name`
      self$`lon` <- AddressObject$`lon`
      self$`lat` <- AddressObject$`lat`
      self$`street_hint` <- AddressObject$`street_hint`
    }
  )
)
