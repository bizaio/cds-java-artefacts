package au.org.consumerdatastandards.holder.api.banking;

import au.org.consumerdatastandards.holder.api.DateFormat;
import au.org.consumerdatastandards.holder.model.ErrorListResponse;
import au.org.consumerdatastandards.holder.model.banking.ParamAccountOpenStatus;
import au.org.consumerdatastandards.holder.model.banking.ParamProductCategory;
import au.org.consumerdatastandards.holder.model.banking.RequestAccountIds;
import au.org.consumerdatastandards.holder.model.banking.ResponseBankingScheduledPaymentsList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ResponseHeader;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Api(value = "BankingScheduledPayments", description = "the BankingScheduledPayments API")
public interface BankingScheduledPaymentsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(
        value = "Get Scheduled Payments for Account",
        nickname = "listScheduledPayments",
        notes = "Obtain scheduled, outgoing payments for a specific account",
        response = ResponseBankingScheduledPaymentsList.class,
        tags = {"ScheduledPayments", "Banking"}
    )
    @ApiResponses(value = {
        @ApiResponse(
            code = 200,
            message = "Success",
            responseHeaders = @ResponseHeader(name = "x-v", response = Integer.class, description = "The [version](#response-headers) of the API end point that the data holder has responded with."),
            response = ResponseBankingScheduledPaymentsList.class
        ),
        @ApiResponse(
            code = 400,
            message = "Invalid Version / Invalid Page Size / Invalid Field / Missing Field",
            responseHeaders = @ResponseHeader(name = "x-fapi-interaction-id", response = UUID.class, description = "An **[[RFC4122]](#nref-RFC4122)** UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a **[[RFC4122]](#nref-RFC4122)** UUID value is required to be provided in the response header to track the interaction."),
            response = ErrorListResponse.class
        ),
        @ApiResponse(
            code = 404,
            message = "Invalid Banking Account / Unavailable Banking Account",
            responseHeaders = @ResponseHeader(name = "x-fapi-interaction-id", response = UUID.class, description = "An **[[RFC4122]](#nref-RFC4122)** UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a **[[RFC4122]](#nref-RFC4122)** UUID value is required to be provided in the response header to track the interaction."),
            response = ErrorListResponse.class
        ),
        @ApiResponse(
            code = 406,
            message = "Unsupported Version",
            responseHeaders = @ResponseHeader(name = "x-fapi-interaction-id", response = UUID.class, description = "An **[[RFC4122]](#nref-RFC4122)** UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a **[[RFC4122]](#nref-RFC4122)** UUID value is required to be provided in the response header to track the interaction."),
            response = ErrorListResponse.class
        ),
        @ApiResponse(
            code = 422,
            message = "Invalid Page",
            responseHeaders = @ResponseHeader(name = "x-fapi-interaction-id", response = UUID.class, description = "An **[[RFC4122]](#nref-RFC4122)** UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a **[[RFC4122]](#nref-RFC4122)** UUID value is required to be provided in the response header to track the interaction."),
            response = ErrorListResponse.class
        )
    })
    @RequestMapping(
        value = "/banking/accounts/{accountId}/payments/scheduled",
        method = RequestMethod.GET
    )
    @PreAuthorize("hasAuthority('SCOPE_bank:regular_payments:read')")
    ResponseEntity<ResponseBankingScheduledPaymentsList> listScheduledPayments(
        @ApiParam(
            value = "ID of the account to get scheduled payments for. Must have previously been returned by one of the account list end points. The account specified is the source account for the payment",
            required = true
        )
        @PathVariable("accountId") @NotBlank String accountId,
        @ApiParam(
            value = "Page of results to request (standard pagination)",
            defaultValue = "1"
        ) @RequestParam(value = "page", required = false, defaultValue = "1") @Min(1) Integer page,
        @ApiParam(
            value = "Page size to request. Default is 25 (standard pagination)",
            defaultValue = "25"
        ) @RequestParam(value = "page-size", required = false, defaultValue = "25") @Min(1) Integer pageSize,
        @ApiParam(
            value = "The customer's original standard http headers [Base64](#common-field-types) encoded, including the original User Agent header, if the customer is currently logged in to the Data Recipient Software Product. Mandatory for customer present calls. Not required for unattended or unauthenticated calls."
        )
        @RequestHeader(value = "x-cds-client-headers", required = false) String xCdsClientHeaders,
        @ApiParam(
            value = "The time when the customer last logged in to the Data Recipient Software Product as described in **[[FAPI-1.0-Baseline]](#nref-FAPI-1-0-Baseline)**.  Required for all resource calls (customer present and unattended). Not required for unauthenticated calls."
        )
        @RequestHeader(value = "x-fapi-auth-date", required = false) @NotNull @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME, fallbackPatterns = DateFormat.HTTP) Date xFapiAuthDate,
        @ApiParam(
            value = "The customer's original IP address if the customer is currently logged in to the Data Recipient Software Product. The presence of this header indicates that the API is being called in a customer present context. Not to be included for unauthenticated calls."
        )
        @RequestHeader(value = "x-fapi-customer-ip-address", required = false) String xFapiCustomerIpAddress,
        @ApiParam(
            value = "An [RFC4122](https://tools.ietf.org/html/rfc4122) UID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction."
        )
        @RequestHeader(value = "x-fapi-interaction-id", required = false) UUID xFapiInteractionId,
        @ApiParam(
            value = "Minimum version of the API end point requested by the client. Must be set to a positive integer if provided. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If all versions requested are not supported then the data holder must respond with a 406 Not Acceptable."
        )
        @RequestHeader(value = "x-min-v", required = false) @Min(1) Integer xMinV,
        @ApiParam(
            value = "Version of the API end point requested by the client. Must be set to a positive integer. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If the value of [x-min-v](#request-headers) is equal to or higher than the value of [x-v](#request-headers) then the [x-min-v](#request-headers) header should be treated as absent. If all versions requested are not supported then the data holder must respond with a 406 Not Acceptable. See [HTTP Headers](#request-headers)"
        )
        @RequestHeader(value = "x-v", required = false) @Min(1) Integer xV
    );

    @ApiOperation(
        value = "Get Scheduled Payments Bulk",
        nickname = "listScheduledPaymentsSpecificAccounts",
        notes = "Obtain scheduled payments for multiple, filtered accounts that are the source of funds for the payments",
        response = ResponseBankingScheduledPaymentsList.class,
        tags = {"ScheduledPayments", "Banking"}
    )
    @ApiResponses(value = {
        @ApiResponse(
            code = 200,
            message = "Success",
            responseHeaders = @ResponseHeader(name = "x-v", response = Integer.class, description = "The [version](#response-headers) of the API end point that the data holder has responded with."),
            response = ResponseBankingScheduledPaymentsList.class
        ),
        @ApiResponse(
            code = 400,
            message = "Invalid Page Size / Invalid Field / Missing Field",
            responseHeaders = @ResponseHeader(name = "x-fapi-interaction-id", response = UUID.class, description = "An **[[RFC4122]](#nref-RFC4122)** UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a **[[RFC4122]](#nref-RFC4122)** UUID value is required to be provided in the response header to track the interaction."),
            response = ErrorListResponse.class
        ),
        @ApiResponse(
            code = 406,
            message = "Unsupported Version",
            responseHeaders = @ResponseHeader(name = "x-fapi-interaction-id", response = UUID.class, description = "An **[[RFC4122]](#nref-RFC4122)** UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a **[[RFC4122]](#nref-RFC4122)** UUID value is required to be provided in the response header to track the interaction."),
            response = ErrorListResponse.class
        ),
        @ApiResponse(
            code = 422,
            message = "Invalid Page",
            responseHeaders = @ResponseHeader(name = "x-fapi-interaction-id", response = UUID.class, description = "An **[[RFC4122]](#nref-RFC4122)** UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a **[[RFC4122]](#nref-RFC4122)** UUID value is required to be provided in the response header to track the interaction."),
            response = ErrorListResponse.class
        )
    })
    @RequestMapping(
        value = "/banking/payments/scheduled",
        method = RequestMethod.GET
    )
    @PreAuthorize("hasAuthority('SCOPE_bank:regular_payments:read')")
    ResponseEntity<ResponseBankingScheduledPaymentsList> listScheduledPaymentsBulk(
        @ApiParam(
            value = "Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned."
        ) @RequestParam(value = "product-category", required = false) ParamProductCategory productCategory,
        @ApiParam(
            value = "Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed.",
            allowableValues = "OPEN, CLOSED, ALL",
            defaultValue = "ALL"
        ) @RequestParam(value = "open-status", required = false, defaultValue = "ALL") ParamAccountOpenStatus openStatus,
        @ApiParam(
            value = "Filters accounts based on whether they are owned by the authorised customer.  True for owned accounts, false for unowned accounts and absent for all accounts."
        ) @RequestParam(value = "is-owned", required = false) Boolean isOwned,
        @ApiParam(
            value = "Page of results to request (standard pagination)",
            defaultValue = "1"
        ) @RequestParam(value = "page", required = false, defaultValue = "1") @Min(1) Integer page,
        @ApiParam(
            value = "Page size to request. Default is 25 (standard pagination)",
            defaultValue = "25"
        ) @RequestParam(value = "page-size", required = false, defaultValue = "25") @Min(1) Integer pageSize,
        @ApiParam(
            value = "The customer's original standard http headers [Base64](#common-field-types) encoded, including the original User Agent header, if the customer is currently logged in to the Data Recipient Software Product. Mandatory for customer present calls. Not required for unattended or unauthenticated calls."
        )
        @RequestHeader(value = "x-cds-client-headers", required = false) String xCdsClientHeaders,
        @ApiParam(
            value = "The time when the customer last logged in to the Data Recipient Software Product as described in **[[FAPI-1.0-Baseline]](#nref-FAPI-1-0-Baseline)**.  Required for all resource calls (customer present and unattended). Not required for unauthenticated calls."
        )
        @RequestHeader(value = "x-fapi-auth-date", required = false) @NotNull @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME, fallbackPatterns = DateFormat.HTTP) Date xFapiAuthDate,
        @ApiParam(
            value = "The customer's original IP address if the customer is currently logged in to the Data Recipient Software Product. The presence of this header indicates that the API is being called in a customer present context. Not to be included for unauthenticated calls."
        )
        @RequestHeader(value = "x-fapi-customer-ip-address", required = false) String xFapiCustomerIpAddress,
        @ApiParam(
            value = "An [RFC4122](https://tools.ietf.org/html/rfc4122) UID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction."
        )
        @RequestHeader(value = "x-fapi-interaction-id", required = false) UUID xFapiInteractionId,
        @ApiParam(
            value = "Minimum version of the API end point requested by the client. Must be set to a positive integer if provided. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If all versions requested are not supported then the data holder must respond with a 406 Not Acceptable."
        )
        @RequestHeader(value = "x-min-v", required = false) @Min(1) Integer xMinV,
        @ApiParam(
            value = "Version of the API end point requested by the client. Must be set to a positive integer. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If the value of [x-min-v](#request-headers) is equal to or higher than the value of [x-v](#request-headers) then the [x-min-v](#request-headers) header should be treated as absent. If all versions requested are not supported then the data holder must respond with a 406 Not Acceptable. See [HTTP Headers](#request-headers)"
        )
        @RequestHeader(value = "x-v", required = false) @Min(1) Integer xV
    );


    @ApiOperation(
        value = "Get Scheduled Payments For Specific Accounts",
        nickname = "listScheduledPaymentsSpecificAccounts",
        notes = "Obtain scheduled payments for a specified list of accounts",
        response = ResponseBankingScheduledPaymentsList.class,
        tags = {"ScheduledPayments", "Banking"}
    )
    @ApiResponses(value = {
        @ApiResponse(
            code = 200,
            message = "Success",
            responseHeaders = @ResponseHeader(name = "x-v", response = Integer.class, description = "The [version](#response-headers) of the API end point that the data holder has responded with."),
            response = ResponseBankingScheduledPaymentsList.class
        ),
        @ApiResponse(
            code = 400,
            message = "Invalid Page Size / Invalid Field / Missing Field",
            responseHeaders = @ResponseHeader(name = "x-fapi-interaction-id", response = UUID.class, description = "An **[[RFC4122]](#nref-RFC4122)** UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a **[[RFC4122]](#nref-RFC4122)** UUID value is required to be provided in the response header to track the interaction."),
            response = ErrorListResponse.class
        ),
        @ApiResponse(
            code = 406,
            message = "Unsupported Version",
            responseHeaders = @ResponseHeader(name = "x-fapi-interaction-id", response = UUID.class, description = "An **[[RFC4122]](#nref-RFC4122)** UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a **[[RFC4122]](#nref-RFC4122)** UUID value is required to be provided in the response header to track the interaction."),
            response = ErrorListResponse.class
        ),
        @ApiResponse(
            code = 422,
            message = "Invalid Banking Account / Unavailable Banking Account / Invalid Page",
            responseHeaders = @ResponseHeader(name = "x-fapi-interaction-id", response = UUID.class, description = "An **[[RFC4122]](#nref-RFC4122)** UUID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a **[[RFC4122]](#nref-RFC4122)** UUID value is required to be provided in the response header to track the interaction."),
            response = ErrorListResponse.class
        )
    })
    @RequestMapping(
        value = "/banking/payments/scheduled",
        method = RequestMethod.POST
    )
    @PreAuthorize("hasAuthority('SCOPE_bank:regular_payments:read')")
    ResponseEntity<ResponseBankingScheduledPaymentsList> listScheduledPaymentsSpecificAccounts(
        @ApiParam(
            value = "Array of specific accountIds to obtain scheduled payments for.  The accounts specified are the source of funds for the payments returned"
        )
        @RequestBody @NotNull RequestAccountIds accountIds,
        @ApiParam(
            value = "Page of results to request (standard pagination)",
            defaultValue = "1"
        ) @RequestParam(value = "page", required = false, defaultValue = "1") @Min(1) Integer page,
        @ApiParam(
            value = "Page size to request. Default is 25 (standard pagination)",
            defaultValue = "25"
        ) @RequestParam(value = "page-size", required = false, defaultValue = "25") @Min(1) Integer pageSize,
        @ApiParam(
            value = "The customer's original standard http headers [Base64](#common-field-types) encoded, including the original User Agent header, if the customer is currently logged in to the Data Recipient Software Product. Mandatory for customer present calls. Not required for unattended or unauthenticated calls."
        )
        @RequestHeader(value = "x-cds-client-headers", required = false) String xCdsClientHeaders,
        @ApiParam(
            value = "The time when the customer last logged in to the Data Recipient Software Product as described in **[[FAPI-1.0-Baseline]](#nref-FAPI-1-0-Baseline)**.  Required for all resource calls (customer present and unattended). Not required for unauthenticated calls."
        )
        @RequestHeader(value = "x-fapi-auth-date", required = false) @NotNull @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME, fallbackPatterns = DateFormat.HTTP) Date xFapiAuthDate,
        @ApiParam(
            value = "The customer's original IP address if the customer is currently logged in to the Data Recipient Software Product. The presence of this header indicates that the API is being called in a customer present context. Not to be included for unauthenticated calls."
        )
        @RequestHeader(value = "x-fapi-customer-ip-address", required = false) String xFapiCustomerIpAddress,
        @ApiParam(
            value = "An [RFC4122](https://tools.ietf.org/html/rfc4122) UID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction."
        )
        @RequestHeader(value = "x-fapi-interaction-id", required = false) UUID xFapiInteractionId,
        @ApiParam(
            value = "Minimum version of the API end point requested by the client. Must be set to a positive integer if provided. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If all versions requested are not supported then the data holder must respond with a 406 Not Acceptable."
        )
        @RequestHeader(value = "x-min-v", required = false) @Min(1) Integer xMinV,
        @ApiParam(
            value = "Version of the API end point requested by the client. Must be set to a positive integer. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If the value of [x-min-v](#request-headers) is equal to or higher than the value of [x-v](#request-headers) then the [x-min-v](#request-headers) header should be treated as absent. If all versions requested are not supported then the data holder must respond with a 406 Not Acceptable. See [HTTP Headers](#request-headers)"
        )
        @RequestHeader(value = "x-v", required = false) @Min(1) Integer xV
    );
}
