/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.api;

import au.org.consumerdatastandards.client.*;
import au.org.consumerdatastandards.client.model.*;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonCustomerAPI extends ProtectedAPI {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommonCustomerAPI.class);

    /**
     * Build call for getCustomer
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>

*/
    public okhttp3.Call getCustomerCall(final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/common/customer";

        LOGGER.trace("Building Call for getCustomer with path: {}",
            path);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        addCdsProtectedApiHeaders(headerParams);
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCustomerValidateBeforeCall(final ApiCallback _callback) throws ApiException {


        return getCustomerCall(_callback);
    }

    /**
     * Get Customer
     * Obtain basic information on the customer that has authorised the current session
     * @return ResponseCommonCustomer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>

*/
    public ResponseCommonCustomer getCustomer() throws ApiException {

        LOGGER.trace("getCustomer");

        ApiResponse<ResponseCommonCustomer> resp = getCustomerWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get Customer
     * Obtain basic information on the customer that has authorised the current session
     * @return ApiResponse&lt;ResponseCommonCustomer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>

*/
    public ApiResponse<ResponseCommonCustomer> getCustomerWithHttpInfo() throws ApiException {
        okhttp3.Call call = getCustomerValidateBeforeCall(null);
        Type returnType = new TypeToken<ResponseCommonCustomer>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get Customer (asynchronously)
     * Obtain basic information on the customer that has authorised the current session
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  </td>
     *    </tr>
     * </table>


*/
    public okhttp3.Call getCustomerAsync(final ApiCallback<ResponseCommonCustomer> _callback) throws ApiException {

        LOGGER.trace("Asynchronously getCustomer");

        okhttp3.Call call = getCustomerValidateBeforeCall(_callback);
        Type returnType = new TypeToken<ResponseCommonCustomer>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }
    /**
     * Build call for getCustomerDetail
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *    </tr>
     * </table>
*/
    public okhttp3.Call getCustomerDetailCall(final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/common/customer/detail";

        LOGGER.trace("Building Call for getCustomerDetail with path: {}",
            path);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        addCdsProtectedApiHeaders(headerParams);
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCustomerDetailValidateBeforeCall(final ApiCallback _callback) throws ApiException {


        return getCustomerDetailCall(_callback);
    }

    /**
     * Get Customer Detail
     * Obtain detailed information on the authorised customer within the current session.
     * @return ResponseCommonCustomerDetail
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *    </tr>
     * </table>
*/
    public ResponseCommonCustomerDetail getCustomerDetail() throws ApiException {

        LOGGER.trace("getCustomerDetail");

        ApiResponse<ResponseCommonCustomerDetail> resp = getCustomerDetailWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get Customer Detail
     * Obtain detailed information on the authorised customer within the current session.
     * @return ApiResponse&lt;ResponseCommonCustomerDetail&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *    </tr>
     * </table>
*/
    public ApiResponse<ResponseCommonCustomerDetail> getCustomerDetailWithHttpInfo() throws ApiException {
        okhttp3.Call call = getCustomerDetailValidateBeforeCall(null);
        Type returnType = new TypeToken<ResponseCommonCustomerDetail>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get Customer Detail (asynchronously)
     * Obtain detailed information on the authorised customer within the current session.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
     * <table summary="Response Details" border="1">
     *    <tr>
     *        <td> Status Code </td>
     *        <td> Description </td>
     *        <td> Response Headers </td>
     *    </tr>
     *    <tr>
     *        <td> 200 </td>
     *        <td> Success </td>
     *        <td>  * x-v - The [version](#response-headers) of the API end point that the data holder has responded with. <br>  * x-fapi-interaction-id - An [RFC4122](https://tools.ietf.org/html/rfc4122) UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction. <br>  </td>
     *    </tr>
     * </table>
     */
    public okhttp3.Call getCustomerDetailAsync(final ApiCallback<ResponseCommonCustomerDetail> _callback) throws ApiException {

        LOGGER.trace("Asynchronously getCustomerDetail");

        okhttp3.Call call = getCustomerDetailValidateBeforeCall(_callback);
        Type returnType = new TypeToken<ResponseCommonCustomerDetail>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }

    private void addQueryParam(List<Pair> queryParams, String paramName, Object paramValue) {
        if (paramValue != null) {
            LOGGER.trace("Adding query parameter of {} with value of {}", paramName, paramValue);
            queryParams.addAll(apiClient.parameterToPair(paramName, paramValue));
        }
    }
}
