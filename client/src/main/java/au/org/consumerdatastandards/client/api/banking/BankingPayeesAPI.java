/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.api.banking;

import au.org.consumerdatastandards.client.ApiCallback;
import au.org.consumerdatastandards.client.ApiException;
import au.org.consumerdatastandards.client.ApiResponse;
import au.org.consumerdatastandards.client.Pair;
import au.org.consumerdatastandards.client.api.ProtectedAPI;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingPayeeById;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingPayeeList;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingPayeesAPI extends ProtectedAPI {

    public enum ParamType {
        DOMESTIC,
        INTERNATIONAL,
        BILLER,
        ALL
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(BankingPayeesAPI.class);

    /**
     * Build call for getPayeeDetail
     * @param payeeId The ID used to locate the details of a particular payee (required)
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
    public okhttp3.Call getPayeeDetailCall(String payeeId, final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/banking/payees/{payeeId}"
            .replaceAll("\\{" + "payeeId" + "\\}", apiClient.escapeString(payeeId));

        LOGGER.trace("Building Call for getPayeeDetail with path: {}, payeeId: {}",
            path,
            payeeId);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        addCdsProtectedApiHeaders(headerParams);
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPayeeDetailValidateBeforeCall(String payeeId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'payeeId' is set
        if (payeeId == null) {
            throw new ApiException("Missing the required parameter 'payeeId' when calling getPayeeDetail(Async)");
        }

        return getPayeeDetailCall(payeeId, _callback);
    }

    /**
     * Get Payee Detail
     * Obtain detailed information on a single payee.  Note that the payee sub-structure should be selected to represent the payment destination only rather than any known characteristics of the payment recipient
     * @param payeeId The ID used to locate the details of a particular payee (required)
     * @return ResponseBankingPayeeById
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
    public ResponseBankingPayeeById getPayeeDetail(String payeeId) throws ApiException {

        LOGGER.trace("getPayeeDetail with payeeId: {}",
            payeeId);

        ApiResponse<ResponseBankingPayeeById> resp = getPayeeDetailWithHttpInfo(payeeId);
        return resp.getBody();
    }

    /**
     * Get Payee Detail
     * Obtain detailed information on a single payee.  Note that the payee sub-structure should be selected to represent the payment destination only rather than any known characteristics of the payment recipient
     * @param payeeId The ID used to locate the details of a particular payee (required)
     * @return ApiResponse&lt;ResponseBankingPayeeById&gt;
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
    public ApiResponse<ResponseBankingPayeeById> getPayeeDetailWithHttpInfo(String payeeId) throws ApiException {
        okhttp3.Call call = getPayeeDetailValidateBeforeCall(payeeId, null);
        Type returnType = new TypeToken<ResponseBankingPayeeById>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get Payee Detail (asynchronously)
     * Obtain detailed information on a single payee.  Note that the payee sub-structure should be selected to represent the payment destination only rather than any known characteristics of the payment recipient
     * @param payeeId The ID used to locate the details of a particular payee (required)
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
    public okhttp3.Call getPayeeDetailAsync(String payeeId, final ApiCallback<ResponseBankingPayeeById> _callback) throws ApiException {

        LOGGER.trace("Asynchronously getPayeeDetail with payeeId: {}",
            payeeId);

        okhttp3.Call call = getPayeeDetailValidateBeforeCall(payeeId, _callback);
        Type returnType = new TypeToken<ResponseBankingPayeeById>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }
    /**
     * Build call for listPayees
     * @param type Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL (optional, default to ALL)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
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
    public okhttp3.Call listPayeesCall(ParamType type, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {

        Object postBody = null;

        // create path and map variables
        String path = "/banking/payees";

        LOGGER.trace("Building Call for listPayees with path: {}, type: {}, page: {}, page-size: {}",
            path,
            type,
            page,
            pageSize);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        addQueryParam(queryParams, "type", type);
        addQueryParam(queryParams, "page", page);
        addQueryParam(queryParams, "page-size", pageSize);
        Map<String, String> headerParams = new HashMap<>();
        addCdsProtectedApiHeaders(headerParams);
        String[] authNames = new String[] {  };
        return apiClient.buildCall(path, "GET", queryParams, collectionQueryParams, postBody, headerParams, authNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listPayeesValidateBeforeCall(ParamType type, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {


        return listPayeesCall(type, page, pageSize, _callback);
    }

    /**
     * Get Payees
     * Obtain a list of pre-registered payees
     * @param type Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL (optional, default to ALL)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ResponseBankingPayeeList
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
    public ResponseBankingPayeeList listPayees(ParamType type, Integer page, Integer pageSize) throws ApiException {

        LOGGER.trace("listPayees with type: {}, page: {}, page-size: {}",
            type,
            page,
            pageSize);

        ApiResponse<ResponseBankingPayeeList> resp = listPayeesWithHttpInfo(type, page, pageSize);
        return resp.getBody();
    }

    /**
     * Get Payees
     * Obtain a list of pre-registered payees
     * @param type Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL (optional, default to ALL)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     * @return ApiResponse&lt;ResponseBankingPayeeList&gt;
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
    public ApiResponse<ResponseBankingPayeeList> listPayeesWithHttpInfo(ParamType type, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call call = listPayeesValidateBeforeCall(type, page, pageSize, null);
        Type returnType = new TypeToken<ResponseBankingPayeeList>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get Payees (asynchronously)
     * Obtain a list of pre-registered payees
     * @param type Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL (optional, default to ALL)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
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
    public okhttp3.Call listPayeesAsync(ParamType type, Integer page, Integer pageSize, final ApiCallback<ResponseBankingPayeeList> _callback) throws ApiException {

        LOGGER.trace("Asynchronously listPayees with type: {}, page: {}, page-size: {}",
            type,
            page,
            pageSize);

        okhttp3.Call call = listPayeesValidateBeforeCall(type, page, pageSize, _callback);
        Type returnType = new TypeToken<ResponseBankingPayeeList>(){}.getType();
        apiClient.executeAsync(call, returnType, _callback);
        return call;
    }
}
