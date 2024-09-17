/*
 * Consumer Data Standards
 * Sample Data Holder to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 * Do not edit the class manually.
 */
package au.org.consumerdatastandards.holder.model.banking;

import au.org.consumerdatastandards.holder.model.BaseResponse;

import java.util.Objects;

public class ResponseBankingProductById extends BaseResponse {

    private BankingProductDetail data;

    public BankingProductDetail getData() {
        return data;
    }

    public void setData(BankingProductDetail data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResponseBankingProductById)) return false;
        if (!super.equals(o)) return false;
        ResponseBankingProductById that = (ResponseBankingProductById) o;
        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), data);
    }

    @Override
    public String toString() {
        return "ResponseBankingProductById{" +
            "data=" + data +
            '}';
    }
}
