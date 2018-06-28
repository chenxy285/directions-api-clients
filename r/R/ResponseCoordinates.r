# GraphHopper Directions API
#
# You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' ResponseCoordinates Class
#'
#' @field coordinates 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ResponseCoordinates <- R6::R6Class(
  'ResponseCoordinates',
  public = list(
    `coordinates` = NULL,
    initialize = function(`coordinates`){
      if (!missing(`coordinates`)) {
        stopifnot(R6::is.R6(`coordinates`))
        self$`coordinates` <- `coordinates`
      }
    },
    toJSON = function() {
      ResponseCoordinatesObject <- list()
      if (!is.null(self$`coordinates`)) {
        ResponseCoordinatesObject[['coordinates']] <- self$`coordinates`$toJSON()
      }

      ResponseCoordinatesObject
    },
    fromJSON = function(ResponseCoordinatesJson) {
      ResponseCoordinatesObject <- jsonlite::fromJSON(ResponseCoordinatesJson)
      if (!is.null(ResponseCoordinatesObject$`coordinates`)) {
        coordinatesObject <- ResponseCoordinatesArray$new()
        coordinatesObject$fromJSON(jsonlite::toJSON(ResponseCoordinatesObject$coordinates, auto_unbox = TRUE))
        self$`coordinates` <- coordinatesObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "coordinates": %s
        }',
        self$`coordinates`$toJSON()
      )
    },
    fromJSONString = function(ResponseCoordinatesJson) {
      ResponseCoordinatesObject <- jsonlite::fromJSON(ResponseCoordinatesJson)
      ResponseCoordinatesArrayObject <- ResponseCoordinatesArray$new()
      self$`coordinates` <- ResponseCoordinatesArrayObject$fromJSON(jsonlite::toJSON(ResponseCoordinatesObject$coordinates, auto_unbox = TRUE))
    }
  )
)
