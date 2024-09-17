package au.org.consumerdatastandards.holder.api;

import au.org.consumerdatastandards.holder.model.Error;
import au.org.consumerdatastandards.holder.model.ErrorListResponse;
import au.org.consumerdatastandards.holder.model.LinksPaginated;
import au.org.consumerdatastandards.holder.model.MetaPaginated;
import au.org.consumerdatastandards.holder.model.TxMetaPaginated;
import au.org.consumerdatastandards.holder.util.WebUtil;
import org.apache.commons.validator.routines.InetAddressValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.NativeWebRequest;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class ApiControllerBase {
    private final static String BASE64_PATTERN = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)?$";

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    protected Integer getPagingValue(Integer page, int defaultValue) {
        return page != null && page > 0 ? page : defaultValue;
    }

    protected void throwCDSUnprocessableErrors(UUID interactionId, List<Error> errorList) {
        throwCDSErrors(interactionId, errorList, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    protected void throwCDSErrors(UUID interactionId, List<Error> errorList, HttpStatus httpStatus) {
        ErrorListResponse errors = new ErrorListResponse();
        errors.setErrors(errorList);
        throw new CDSException(errors, interactionId, httpStatus);
    }

    protected void throwInvalidResource(String resourceId) {
        throwInvalidResource(resourceId, UUID.randomUUID());
    }

    protected void throwInvalidResource(String resourceId, UUID interactionId) {
        throwCDSErrors(interactionId, Collections.singletonList(new Error("Invalid Resource",
                "urn:au-cds:error:cds-all:Resource/Invalid", resourceId)), HttpStatus.NOT_FOUND);
    }

    protected void validatePageRange(Integer page, int totalPages, UUID interactionId) {
        if (totalPages > 0 && page != null && page > totalPages) {
            throwCDSUnprocessableErrors(interactionId, Collections.singletonList(
                    new Error("Invalid Page", "urn:au-cds:error:cds-all:Field/InvalidPage", String.valueOf(totalPages))));
        }
    }

    protected void validatePageSize(Integer pageSize, UUID interactionId) {
        if (pageSize != null && pageSize > 1000) {
            String message = String.format(
                    "Invalid page size requested: %d. Page size has to be between 1 and 1000",
                    pageSize);
            throwCDSErrors(interactionId, Collections.singletonList(
                    new Error("Invalid Page Size", "urn:au-cds:error:cds-all:Field/InvalidPageSize", message)),
                    HttpStatus.BAD_REQUEST);
        }
    }

    protected void validateUpdatedSince(OffsetDateTime updatedSince, UUID interactionId) {
        if (updatedSince != null && !updatedSince.isBefore(OffsetDateTime.now())) {
            throwInvalidDate("updated-since is not in the past", interactionId);
        }
    }

    protected void validateOldestNewestOffsetDateTime(OffsetDateTime oldestTime, OffsetDateTime newestTime, UUID interactionId) {
        if (newestTime != null && !newestTime.isBefore(OffsetDateTime.now())) {
            throwInvalidDate("newest-time is not in the past", interactionId);
        }
        if (oldestTime != null) {
            if (!oldestTime.isBefore(OffsetDateTime.now())) {
                throwInvalidDate("oldest-time is not in the past", interactionId);
            }
            if (newestTime != null && newestTime.isBefore(oldestTime)) {
                throwInvalidDate("newest-time is before oldest-time", interactionId);
            }
        }
    }

    protected void validateOldestNewestLocalDate(LocalDate oldestDate, LocalDate newestDate, UUID interactionId) {
        if (newestDate != null && !newestDate.isBefore(LocalDate.now())) {
            throwInvalidDate("newest-date is not in the past", interactionId);
        }
        if (oldestDate != null) {
            if (!oldestDate.isBefore(LocalDate.now())) {
                throwInvalidDate("oldest-date is not in the past", interactionId);
            }
            if (newestDate != null && newestDate.isBefore(oldestDate)) {
                throwInvalidDate("newest-date is before oldest-date", interactionId);
            }
        }
    }

    protected void throwInvalidDate(String message, UUID interactionId) {
        throwCDSErrors(interactionId, Collections.singletonList(
                new Error("Invalid Page Size", "urn:au-cds:error:cds-all:Field/InvalidDateTime", message)),
                HttpStatus.BAD_REQUEST);
    }

    protected boolean hasSupportedVersion(Integer xMinV, Integer xV, int maxSupportedVersion) {
        if (xMinV == null || xMinV > xV) {
            return (maxSupportedVersion >= xV);
        }
        return (maxSupportedVersion >= xMinV);
    }

    protected int getSupportedVersion(Integer xMinV, Integer xV, int maxSupportedVersion) {
        if (xMinV == null) return xV;
        return Math.min(xV, maxSupportedVersion);
    }

    protected HttpHeaders generateResponseHeaders(UUID fapiInteractionId, int supportedVersion) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("content-type", "application/json");
        responseHeaders.set("x-v", "" + supportedVersion);
        responseHeaders.set("x-fapi-interaction-id", (fapiInteractionId == null ? UUID.randomUUID() : fapiInteractionId).toString());
        return responseHeaders;
    }

    protected int validateSupportedVersion(Integer xMinV, Integer xV, UUID interactionId, int maxSupportedVersion) {
        if (xV == null) {
            Error error = new Error("Missing Required Header", "urn:au-cds:error:cds-all:Header/Missing", "x-v");
            throwCDSErrors(interactionId, Collections.singletonList(error), HttpStatus.BAD_REQUEST);
        }
        if (!hasSupportedVersion(xMinV, xV, maxSupportedVersion)) {
            String message = String.format(
                "Unsupported version requested, minimum version specified is %d, maximum version specified is %d, current version is %d",
                xMinV, xV, maxSupportedVersion);
            Error error = new Error("Unsupported Version", "urn:au-cds:error:cds-all:Header/UnsupportedVersion", message);
            throwCDSErrors(interactionId, Collections.singletonList(error), HttpStatus.NOT_ACCEPTABLE);
        }
        return getSupportedVersion(xMinV, xV, maxSupportedVersion);
    }

    protected int validateHeaders(String xCdsClientHeaders,
                                   String xFapiCustomerIpAddress,
                                   UUID interactionId,
                                   Integer xMinV, Integer xV, int maxSupportedVersion) {
        int supportedVersion = validateSupportedVersion(xMinV, xV, interactionId, maxSupportedVersion);
        if (StringUtils.hasText(xFapiCustomerIpAddress)) {
            ArrayList<Error> errorList = new ArrayList<>();
            InetAddressValidator inetAddressValidator = InetAddressValidator.getInstance();
            if (!inetAddressValidator.isValid(xFapiCustomerIpAddress)) {
                errorList.add(new Error("Invalid Header", "urn:au-cds:error:cds-all:Header/Invalid", "x-fapi-customer-ip-address: request header value is not a valid IP address"));
            }
            if (StringUtils.isEmpty(xCdsClientHeaders)) {
                errorList.add(new Error("Missing Required Header", "urn:au-cds:error:cds-all:Header/Missing", "x-cds-client-headers: request header is not present"));
            } else if (!xCdsClientHeaders.matches(BASE64_PATTERN)) {
                errorList.add(new Error("Invalid Header", "urn:au-cds:error:cds-all:Header/Invalid", "x-cds-client-headers: request header value is not Base64 encoded"));
            }
            if (!errorList.isEmpty()) {
                throwCDSErrors(interactionId, errorList, HttpStatus.BAD_REQUEST);
            }
        }
        return supportedVersion;
    }

    protected LinksPaginated getLinkData(NativeWebRequest request, @SuppressWarnings("rawtypes") Page page, Integer actualPage, Integer actualPageSize) {
        LinksPaginated linkData = new LinksPaginated();
        linkData.setSelf(WebUtil.getOriginalUrl(request));

        if (page.getTotalPages() == 0) {
            linkData.setFirst(null);
            linkData.setLast(null);
        } else {
            linkData.setFirst(WebUtil.getPaginatedLink(request, 1, actualPageSize));
            linkData.setLast(WebUtil.getPaginatedLink(request, page.getTotalPages(), actualPageSize));
        }

        if (page.hasPrevious()) {
            linkData.setPrev(WebUtil.getPaginatedLink(request, actualPage - 1, actualPageSize));
        }

        if (page.hasNext()) {
            linkData.setNext(WebUtil.getPaginatedLink(request, actualPage + 1, actualPageSize));
        }
        return linkData;
    }

    protected MetaPaginated getMetaData(@SuppressWarnings("rawtypes") Page page) {
        MetaPaginated metaData = new MetaPaginated();
        metaData.setTotalPages(page.getTotalPages());
        metaData.setTotalRecords((int)page.getTotalElements());
        return metaData;
    }

    protected TxMetaPaginated getTxMetaData(@SuppressWarnings("rawtypes") Page page, boolean isQueryParamUnsupported) {
        TxMetaPaginated metaData = new TxMetaPaginated();
        metaData.setTotalPages(page.getTotalPages());
        metaData.setTotalRecords((int)page.getTotalElements());
        metaData.setIsQueryParamUnsupported(isQueryParamUnsupported);
        return metaData;
    }
}
