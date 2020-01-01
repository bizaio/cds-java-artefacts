/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model;

import java.util.Objects;
/**
 * The set of payment amounts and destination accounts for this payment accommodating multi-part payments. A single entry indicates a simple payment with one destination account. Must have at least one entry
 */
public class BankingScheduledPaymentSet {

    private String amount;

    private String currency;

    private Boolean isAmountCalculated;

    private BankingScheduledPaymentTo to;

    /**
     * Flag indicating whether the amount of the payment is calculated based on the context of the event. For instance a payment to reduce the balance of a credit card to zero. If absent then false is assumed
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * The currency for the payment. AUD assumed if not present
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Flag indicating whether the amount of the payment is calculated based on the context of the event. For instance a payment to reduce the balance of a credit card to zero. If absent then false is assumed
     * @return isAmountCalculated
     */
    public Boolean getIsAmountCalculated() {
        return isAmountCalculated;
    }

    public void setIsAmountCalculated(Boolean isAmountCalculated) {
        this.isAmountCalculated = isAmountCalculated;
    }

    /**
     * Get to
     * @return to
     */
    public BankingScheduledPaymentTo getTo() {
        return to;
    }

    public void setTo(BankingScheduledPaymentTo to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingScheduledPaymentSet bankingScheduledPaymentSet = (BankingScheduledPaymentSet) o;
        return Objects.equals(this.amount, bankingScheduledPaymentSet.amount) &&
            Objects.equals(this.currency, bankingScheduledPaymentSet.currency) &&
            Objects.equals(this.isAmountCalculated, bankingScheduledPaymentSet.isAmountCalculated) &&
            Objects.equals(this.to, bankingScheduledPaymentSet.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            currency,
            isAmountCalculated,
            to);
    }

    @Override
    public String toString() {
        return "class BankingScheduledPaymentSet {\n" +
            "   amount: " + toIndentedString(amount) + "\n" + 
            "   currency: " + toIndentedString(currency) + "\n" + 
            "   isAmountCalculated: " + toIndentedString(isAmountCalculated) + "\n" + 
            "   to: " + toIndentedString(to) + "\n" + 
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
