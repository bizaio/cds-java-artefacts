/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import au.org.consumerdatastandards.client.model.PaginatedResponse;

import java.util.Objects;

public class ResponseBankingProductList<T extends BankingProduct> extends PaginatedResponse {

    private ResponseBankingProductListData<T> data;

    /**
     * Get data
     * @return data
     */
    public ResponseBankingProductListData<T> getData() {
        return data;
    }

    public void setData(ResponseBankingProductListData<T> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseBankingProductList responseBankingProductList = (ResponseBankingProductList) o;
        return Objects.equals(this.data, responseBankingProductList.data) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            data,
            super.hashCode());
    }

    @Override
    public String toString() {
        return "class ResponseBankingProductList {\n" +
            "   data: " + toIndentedString(data) + "\n" +
            "   links: " + toIndentedString(getLinks()) + "\n" +
            "   meta: " + toIndentedString(getMeta()) + "\n" +
            "}";
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
