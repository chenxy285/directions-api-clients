# GraphHopper Directions API
#
# You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' Objective Class
#'
#' @field type 
#' @field value 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Objective <- R6::R6Class(
  'Objective',
  public = list(
    `type` = NULL,
    `value` = NULL,
    initialize = function(`type`, `value`){
      if (!missing(`type`)) {
        stopifnot(is.character(`type`), length(`type`) == 1)
        self$`type` <- `type`
      }
      if (!missing(`value`)) {
        stopifnot(is.character(`value`), length(`value`) == 1)
        self$`value` <- `value`
      }
    },
    toJSON = function() {
      ObjectiveObject <- list()
      if (!is.null(self$`type`)) {
        ObjectiveObject[['type']] <- self$`type`
      }
      if (!is.null(self$`value`)) {
        ObjectiveObject[['value']] <- self$`value`
      }

      ObjectiveObject
    },
    fromJSON = function(ObjectiveJson) {
      ObjectiveObject <- jsonlite::fromJSON(ObjectiveJson)
      if (!is.null(ObjectiveObject$`type`)) {
        self$`type` <- ObjectiveObject$`type`
      }
      if (!is.null(ObjectiveObject$`value`)) {
        self$`value` <- ObjectiveObject$`value`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "type": %s,
           "value": %s
        }',
        self$`type`,
        self$`value`
      )
    },
    fromJSONString = function(ObjectiveJson) {
      ObjectiveObject <- jsonlite::fromJSON(ObjectiveJson)
      self$`type` <- ObjectiveObject$`type`
      self$`value` <- ObjectiveObject$`value`
    }
  )
)
