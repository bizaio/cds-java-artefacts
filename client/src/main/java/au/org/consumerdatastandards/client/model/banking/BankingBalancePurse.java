/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingBalancePurse {

    private String amount;

    private String currency;

    /**
     * The balance available for this additional currency purse
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * The currency for the purse
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingBalancePurse bankingBalancePurse = (BankingBalancePurse) o;
        return Objects.equals(this.amount, bankingBalancePurse.amount) &&
            Objects.equals(this.currency, bankingBalancePurse.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            currency);
    }

    @Override
    public String toString() {
        return "class BankingBalancePurse {\n" +
            "   amount: " + toIndentedString(amount) + "\n" + 
            "   currency: " + toIndentedString(currency) + "\n" + 
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
