# GraphHopper Directions API
#
# You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' Stop Class
#'
#' @field address 
#' @field duration 
#' @field preparation_time 
#' @field time_windows 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Stop <- R6::R6Class(
  'Stop',
  public = list(
    `address` = NULL,
    `duration` = NULL,
    `preparation_time` = NULL,
    `time_windows` = NULL,
    initialize = function(`address`, `duration`, `preparation_time`, `time_windows`){
      if (!missing(`address`)) {
        stopifnot(R6::is.R6(`address`))
        self$`address` <- `address`
      }
      if (!missing(`duration`)) {
        stopifnot(is.numeric(`duration`), length(`duration`) == 1)
        self$`duration` <- `duration`
      }
      if (!missing(`preparation_time`)) {
        stopifnot(is.numeric(`preparation_time`), length(`preparation_time`) == 1)
        self$`preparation_time` <- `preparation_time`
      }
      if (!missing(`time_windows`)) {
        stopifnot(is.list(`time_windows`), length(`time_windows`) != 0)
        lapply(`time_windows`, function(x) stopifnot(R6::is.R6(x)))
        self$`time_windows` <- `time_windows`
      }
    },
    toJSON = function() {
      StopObject <- list()
      if (!is.null(self$`address`)) {
        StopObject[['address']] <- self$`address`$toJSON()
      }
      if (!is.null(self$`duration`)) {
        StopObject[['duration']] <- self$`duration`
      }
      if (!is.null(self$`preparation_time`)) {
        StopObject[['preparation_time']] <- self$`preparation_time`
      }
      if (!is.null(self$`time_windows`)) {
        StopObject[['time_windows']] <- lapply(self$`time_windows`, function(x) x$toJSON())
      }

      StopObject
    },
    fromJSON = function(StopJson) {
      StopObject <- jsonlite::fromJSON(StopJson)
      if (!is.null(StopObject$`address`)) {
        addressObject <- Address$new()
        addressObject$fromJSON(jsonlite::toJSON(StopObject$address, auto_unbox = TRUE))
        self$`address` <- addressObject
      }
      if (!is.null(StopObject$`duration`)) {
        self$`duration` <- StopObject$`duration`
      }
      if (!is.null(StopObject$`preparation_time`)) {
        self$`preparation_time` <- StopObject$`preparation_time`
      }
      if (!is.null(StopObject$`time_windows`)) {
        self$`time_windows` <- lapply(StopObject$`time_windows`, function(x) {
          time_windowsObject <- TimeWindow$new()
          time_windowsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          time_windowsObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "address": %s,
           "duration": %d,
           "preparation_time": %d,
           "time_windows": [%s]
        }',
        self$`address`$toJSON(),
        self$`duration`,
        self$`preparation_time`,
        lapply(self$`time_windows`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(StopJson) {
      StopObject <- jsonlite::fromJSON(StopJson)
      AddressObject <- Address$new()
      self$`address` <- AddressObject$fromJSON(jsonlite::toJSON(StopObject$address, auto_unbox = TRUE))
      self$`duration` <- StopObject$`duration`
      self$`preparation_time` <- StopObject$`preparation_time`
      self$`time_windows` <- lapply(StopObject$`time_windows`, function(x) TimeWindow$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
