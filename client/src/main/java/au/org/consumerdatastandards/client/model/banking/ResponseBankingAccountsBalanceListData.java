/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.List;
import java.util.Objects;

public class ResponseBankingAccountsBalanceListData {

    private List<BankingBalance> balances;

    /**
     * The list of balances returned
     * @return balances
     */
    public List<BankingBalance> getBalances() {
        return balances;
    }

    public void setBalances(List<BankingBalance> balances) {
        this.balances = balances;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseBankingAccountsBalanceListData responseBankingAccountsBalanceListData = (ResponseBankingAccountsBalanceListData) o;
        return Objects.equals(this.balances, responseBankingAccountsBalanceListData.balances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            balances);
    }

    @Override
    public String toString() {
        return "class ResponseBankingAccountsBalanceListData {\n" +
            "   balances: " + toIndentedString(balances) + "\n" + 
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
