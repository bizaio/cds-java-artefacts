/*
 * Consumer Data Standards
 * Sample CLI tool to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.cli.banking;

import au.org.consumerdatastandards.client.ApiResponse;
import au.org.consumerdatastandards.client.ConformanceError;
import au.org.consumerdatastandards.client.api.banking.BankingProductsAPI;
import au.org.consumerdatastandards.client.api.banking.BankingProductsAPI.ParamEffective;
import au.org.consumerdatastandards.client.cli.ApiCliBase;
import au.org.consumerdatastandards.client.cli.support.JsonPrinter;
import au.org.consumerdatastandards.client.model.banking.BankingProduct;
import au.org.consumerdatastandards.client.model.banking.BankingProductCategory;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingProductById;
import au.org.consumerdatastandards.client.model.banking.ResponseBankingProductList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.time.OffsetDateTime;
import java.util.List;

@ShellComponent
@ShellCommandGroup("BankingProducts")
public class BankingProducts extends ApiCliBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankingProducts.class);

    private final BankingProductsAPI api = new BankingProductsAPI();

    @ShellMethod("Get product detail")
    public String getProductDetail(@ShellOption(defaultValue = "false") boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) String productId,
        @ShellOption(defaultValue = "1") Integer version) throws Exception {

        LOGGER.info("Get product detail CLI initiated with productId: {}, version: {}",
            productId, version);

        api.setApiClient(clientFactory.create(false, check));
        ApiResponse<ResponseBankingProductById> response = api.getProductDetailWithHttpInfo(productId, version);
        if (clientFactory.isValidationEnabled() || check) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.getProductDetailCall(productId, version, null);
            String requestUrl = call.request().url().toString();
            List<ConformanceError> conformanceErrors = validateMetadata(requestUrl, response);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("List products")
    public String listProducts(@ShellOption(defaultValue = "false") boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) String brand,
        @ShellOption(defaultValue = ShellOption.NULL) ParamEffective effective,
        @ShellOption(defaultValue = ShellOption.NULL) Integer page,
        @ShellOption(defaultValue = ShellOption.NULL) Integer pageSize,
        @ShellOption(defaultValue = ShellOption.NULL) BankingProductCategory productCategory,
        @ShellOption(defaultValue = ShellOption.NULL) OffsetDateTime updatedSince,
        @ShellOption(defaultValue = "1") Integer version) throws Exception {

        LOGGER.info("List products CLI initiated with brand: {}, effective: {}, page: {}, page-size: {}, product-category: {}, updated-since: {}, version: {}",
            brand,
            effective,
            page,
            pageSize,
            productCategory,
            updatedSince,
            version);

        api.setApiClient(clientFactory.create(false, check));
        ApiResponse<ResponseBankingProductList<BankingProduct>> response =
                api.listProductsWithHttpInfo(effective, updatedSince, brand, productCategory, version, page, pageSize);
        if (clientFactory.isValidationEnabled() || check) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.listProductsCall(effective, updatedSince, brand, productCategory, version, page, pageSize, null);
            String requestUrl = call.request().url().toString();
            List<ConformanceError> conformanceErrors = validateMetadata(requestUrl, response);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }
}
