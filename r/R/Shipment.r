# GraphHopper Directions API
#
# You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' Shipment Class
#'
#' @field id 
#' @field name 
#' @field priority 
#' @field pickup 
#' @field delivery 
#' @field size 
#' @field required_skills 
#' @field allowed_vehicles 
#' @field disallowed_vehicles 
#' @field max_time_in_vehicle 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Shipment <- R6::R6Class(
  'Shipment',
  public = list(
    `id` = NULL,
    `name` = NULL,
    `priority` = NULL,
    `pickup` = NULL,
    `delivery` = NULL,
    `size` = NULL,
    `required_skills` = NULL,
    `allowed_vehicles` = NULL,
    `disallowed_vehicles` = NULL,
    `max_time_in_vehicle` = NULL,
    initialize = function(`id`, `name`, `priority`, `pickup`, `delivery`, `size`, `required_skills`, `allowed_vehicles`, `disallowed_vehicles`, `max_time_in_vehicle`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`priority`)) {
        stopifnot(is.numeric(`priority`), length(`priority`) == 1)
        self$`priority` <- `priority`
      }
      if (!missing(`pickup`)) {
        stopifnot(R6::is.R6(`pickup`))
        self$`pickup` <- `pickup`
      }
      if (!missing(`delivery`)) {
        stopifnot(R6::is.R6(`delivery`))
        self$`delivery` <- `delivery`
      }
      if (!missing(`size`)) {
        stopifnot(is.list(`size`), length(`size`) != 0)
        lapply(`size`, function(x) stopifnot(is.character(x)))
        self$`size` <- `size`
      }
      if (!missing(`required_skills`)) {
        stopifnot(is.list(`required_skills`), length(`required_skills`) != 0)
        lapply(`required_skills`, function(x) stopifnot(is.character(x)))
        self$`required_skills` <- `required_skills`
      }
      if (!missing(`allowed_vehicles`)) {
        stopifnot(is.list(`allowed_vehicles`), length(`allowed_vehicles`) != 0)
        lapply(`allowed_vehicles`, function(x) stopifnot(is.character(x)))
        self$`allowed_vehicles` <- `allowed_vehicles`
      }
      if (!missing(`disallowed_vehicles`)) {
        stopifnot(is.list(`disallowed_vehicles`), length(`disallowed_vehicles`) != 0)
        lapply(`disallowed_vehicles`, function(x) stopifnot(is.character(x)))
        self$`disallowed_vehicles` <- `disallowed_vehicles`
      }
      if (!missing(`max_time_in_vehicle`)) {
        stopifnot(is.numeric(`max_time_in_vehicle`), length(`max_time_in_vehicle`) == 1)
        self$`max_time_in_vehicle` <- `max_time_in_vehicle`
      }
    },
    toJSON = function() {
      ShipmentObject <- list()
      if (!is.null(self$`id`)) {
        ShipmentObject[['id']] <- self$`id`
      }
      if (!is.null(self$`name`)) {
        ShipmentObject[['name']] <- self$`name`
      }
      if (!is.null(self$`priority`)) {
        ShipmentObject[['priority']] <- self$`priority`
      }
      if (!is.null(self$`pickup`)) {
        ShipmentObject[['pickup']] <- self$`pickup`$toJSON()
      }
      if (!is.null(self$`delivery`)) {
        ShipmentObject[['delivery']] <- self$`delivery`$toJSON()
      }
      if (!is.null(self$`size`)) {
        ShipmentObject[['size']] <- self$`size`
      }
      if (!is.null(self$`required_skills`)) {
        ShipmentObject[['required_skills']] <- self$`required_skills`
      }
      if (!is.null(self$`allowed_vehicles`)) {
        ShipmentObject[['allowed_vehicles']] <- self$`allowed_vehicles`
      }
      if (!is.null(self$`disallowed_vehicles`)) {
        ShipmentObject[['disallowed_vehicles']] <- self$`disallowed_vehicles`
      }
      if (!is.null(self$`max_time_in_vehicle`)) {
        ShipmentObject[['max_time_in_vehicle']] <- self$`max_time_in_vehicle`
      }

      ShipmentObject
    },
    fromJSON = function(ShipmentJson) {
      ShipmentObject <- jsonlite::fromJSON(ShipmentJson)
      if (!is.null(ShipmentObject$`id`)) {
        self$`id` <- ShipmentObject$`id`
      }
      if (!is.null(ShipmentObject$`name`)) {
        self$`name` <- ShipmentObject$`name`
      }
      if (!is.null(ShipmentObject$`priority`)) {
        self$`priority` <- ShipmentObject$`priority`
      }
      if (!is.null(ShipmentObject$`pickup`)) {
        pickupObject <- Stop$new()
        pickupObject$fromJSON(jsonlite::toJSON(ShipmentObject$pickup, auto_unbox = TRUE))
        self$`pickup` <- pickupObject
      }
      if (!is.null(ShipmentObject$`delivery`)) {
        deliveryObject <- Stop$new()
        deliveryObject$fromJSON(jsonlite::toJSON(ShipmentObject$delivery, auto_unbox = TRUE))
        self$`delivery` <- deliveryObject
      }
      if (!is.null(ShipmentObject$`size`)) {
        self$`size` <- ShipmentObject$`size`
      }
      if (!is.null(ShipmentObject$`required_skills`)) {
        self$`required_skills` <- ShipmentObject$`required_skills`
      }
      if (!is.null(ShipmentObject$`allowed_vehicles`)) {
        self$`allowed_vehicles` <- ShipmentObject$`allowed_vehicles`
      }
      if (!is.null(ShipmentObject$`disallowed_vehicles`)) {
        self$`disallowed_vehicles` <- ShipmentObject$`disallowed_vehicles`
      }
      if (!is.null(ShipmentObject$`max_time_in_vehicle`)) {
        self$`max_time_in_vehicle` <- ShipmentObject$`max_time_in_vehicle`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "name": %s,
           "priority": %d,
           "pickup": %s,
           "delivery": %s,
           "size": [%s],
           "required_skills": [%s],
           "allowed_vehicles": [%s],
           "disallowed_vehicles": [%s],
           "max_time_in_vehicle": %d
        }',
        self$`id`,
        self$`name`,
        self$`priority`,
        self$`pickup`$toJSON(),
        self$`delivery`$toJSON(),
        lapply(self$`size`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`required_skills`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`allowed_vehicles`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`disallowed_vehicles`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`max_time_in_vehicle`
      )
    },
    fromJSONString = function(ShipmentJson) {
      ShipmentObject <- jsonlite::fromJSON(ShipmentJson)
      self$`id` <- ShipmentObject$`id`
      self$`name` <- ShipmentObject$`name`
      self$`priority` <- ShipmentObject$`priority`
      StopObject <- Stop$new()
      self$`pickup` <- StopObject$fromJSON(jsonlite::toJSON(ShipmentObject$pickup, auto_unbox = TRUE))
      StopObject <- Stop$new()
      self$`delivery` <- StopObject$fromJSON(jsonlite::toJSON(ShipmentObject$delivery, auto_unbox = TRUE))
      self$`size` <- ShipmentObject$`size`
      self$`required_skills` <- ShipmentObject$`required_skills`
      self$`allowed_vehicles` <- ShipmentObject$`allowed_vehicles`
      self$`disallowed_vehicles` <- ShipmentObject$`disallowed_vehicles`
      self$`max_time_in_vehicle` <- ShipmentObject$`max_time_in_vehicle`
    }
  )
)
