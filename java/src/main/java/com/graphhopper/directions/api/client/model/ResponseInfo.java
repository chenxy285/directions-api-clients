/*
 * GraphHopper Directions API
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.graphhopper.directions.api.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Additional information for your request
 */
@ApiModel(description = "Additional information for your request")

public class ResponseInfo {
  public static final String SERIALIZED_NAME_COPYRIGHTS = "copyrights";
  @SerializedName(SERIALIZED_NAME_COPYRIGHTS)
  private List<String> copyrights = null;

  public static final String SERIALIZED_NAME_TOOK = "took";
  @SerializedName(SERIALIZED_NAME_TOOK)
  private Double took = null;

  public ResponseInfo copyrights(List<String> copyrights) {
    this.copyrights = copyrights;
    return this;
  }

  public ResponseInfo addCopyrightsItem(String copyrightsItem) {
    if (this.copyrights == null) {
      this.copyrights = new ArrayList<String>();
    }
    this.copyrights.add(copyrightsItem);
    return this;
  }

   /**
   * Get copyrights
   * @return copyrights
  **/
  @ApiModelProperty(value = "")
  public List<String> getCopyrights() {
    return copyrights;
  }

  public void setCopyrights(List<String> copyrights) {
    this.copyrights = copyrights;
  }

  public ResponseInfo took(Double took) {
    this.took = took;
    return this;
  }

   /**
   * Get took
   * @return took
  **/
  @ApiModelProperty(value = "")
  public Double getTook() {
    return took;
  }

  public void setTook(Double took) {
    this.took = took;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseInfo responseInfo = (ResponseInfo) o;
    return Objects.equals(this.copyrights, responseInfo.copyrights) &&
        Objects.equals(this.took, responseInfo.took);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyrights, took);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseInfo {\n");
    
    sb.append("    copyrights: ").append(toIndentedString(copyrights)).append("\n");
    sb.append("    took: ").append(toIndentedString(took)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

