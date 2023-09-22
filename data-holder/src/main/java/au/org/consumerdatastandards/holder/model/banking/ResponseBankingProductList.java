/*
 * Consumer Data Standards
 * Sample Data Holder to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 * Do not edit the class manually.
 */
package au.org.consumerdatastandards.holder.model.banking;

import au.org.consumerdatastandards.holder.model.PaginatedResponse;

import java.util.Objects;

public class ResponseBankingProductList extends PaginatedResponse {

    private ResponseBankingProductListData data;

    public ResponseBankingProductListData getData() {
        return data;
    }

    public void setData(ResponseBankingProductListData data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResponseBankingProductList)) return false;
        if (!super.equals(o)) return false;
        ResponseBankingProductList that = (ResponseBankingProductList) o;
        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), data);
    }

    @Override
    public String toString() {
        return "ResponseBankingProductList{" +
            "data=" + data +
            '}';
    }
}
