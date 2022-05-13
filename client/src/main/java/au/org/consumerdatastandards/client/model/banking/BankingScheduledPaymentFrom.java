/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;
/**
 * Object containing details of the source of the payment. Currently only specifies an account ID but provided as an object to facilitate future extensibility and consistency with the to object
 */
public class BankingScheduledPaymentFrom {

    private String accountId;

    /**
     * ID of the account that is the source of funds for the payment
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingScheduledPaymentFrom bankingScheduledPaymentFrom = (BankingScheduledPaymentFrom) o;
        return Objects.equals(this.accountId, bankingScheduledPaymentFrom.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            accountId);
    }

    @Override
    public String toString() {
        return "class BankingScheduledPaymentFrom {\n" +
            "   accountId: " + toIndentedString(accountId) + "\n" + 
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