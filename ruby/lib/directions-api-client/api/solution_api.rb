=begin
#GraphHopper Directions API

#You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.

OpenAPI spec version: 1.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.0-SNAPSHOT

=end

require "uri"

module GraphHopperClient
  class SolutionApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # Return the solution associated to the jobId
    # This endpoint returns the solution of a large problems. You can fetch it with the job_id, you have been sent. 
    # @param key your API key
    # @param job_id Request solution with jobId
    # @param [Hash] opts the optional parameters
    # @return [Response]
    def get_solution(key, job_id, opts = {})
      data, _status_code, _headers = get_solution_with_http_info(key, job_id, opts)
      return data
    end

    # Return the solution associated to the jobId
    # This endpoint returns the solution of a large problems. You can fetch it with the job_id, you have been sent. 
    # @param key your API key
    # @param job_id Request solution with jobId
    # @param [Hash] opts the optional parameters
    # @return [Array<(Response, Fixnum, Hash)>] Response data, response status code and response headers
    def get_solution_with_http_info(key, job_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: SolutionApi.get_solution ..."
      end
      # verify the required parameter 'key' is set
      if @api_client.config.client_side_validation && key.nil?
        fail ArgumentError, "Missing the required parameter 'key' when calling SolutionApi.get_solution"
      end
      # verify the required parameter 'job_id' is set
      if @api_client.config.client_side_validation && job_id.nil?
        fail ArgumentError, "Missing the required parameter 'job_id' when calling SolutionApi.get_solution"
      end
      # resource path
      local_var_path = "/vrp/solution/{jobId}".sub('{' + 'jobId' + '}', job_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'key'] = key

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Response')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SolutionApi#get_solution\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
