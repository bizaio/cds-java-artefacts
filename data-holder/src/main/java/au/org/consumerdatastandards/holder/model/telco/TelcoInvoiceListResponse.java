package au.org.consumerdatastandards.holder.model.telco;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TelcoInvoiceListResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2022-12-23T11:32:06.900+11:00[Australia/Sydney]")
public class TelcoInvoiceListResponse {
    @JsonProperty("invoices")
    @Valid
    private List<TelcoInvoice> invoices = new ArrayList<>();

    public TelcoInvoiceListResponse invoices(List<TelcoInvoice> invoices) {
        this.invoices = invoices;
        return this;
    }

    public TelcoInvoiceListResponse addInvoicesItem(TelcoInvoice invoicesItem) {
        this.invoices.add(invoicesItem);
        return this;
    }

    /**
     * Array of invoices sorted by issue date in descending order
     *
     * @return invoices
     */
    @ApiModelProperty(required = true,
            value = "Array of invoices sorted by issue date in descending order")
    @NotNull

    @Valid

    public List<TelcoInvoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<TelcoInvoice> invoices) {
        this.invoices = invoices;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TelcoInvoiceListResponse telcoInvoiceListResponse = (TelcoInvoiceListResponse) o;
        return Objects.equals(this.invoices, telcoInvoiceListResponse.invoices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TelcoInvoiceListResponse {\n");

        sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

