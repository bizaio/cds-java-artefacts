/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;
/**
 * The set of payment amounts and destination accounts for this payment accommodating multi-part payments. A single entry indicates a simple payment with one destination account. Must have at least one entry
 */
public class BankingScheduledPaymentSet<T extends BankingScheduledPaymentTo> {

    private T to;

    private Boolean isAmountCalculated;

    private String amount;

    private String currency;

    /**
     * Get to
     * @return to
     */
    public T getTo() {
        return to;
    }

    public void setTo(T to) {
        this.to = to;
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
     * The amount of the next payment if known. Mandatory unless the isAmountCalculated field is set to true. Must be zero or positive if present
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingScheduledPaymentSet<T> bankingScheduledPaymentSet = (BankingScheduledPaymentSet<T>) o;
        return Objects.equals(this.to, bankingScheduledPaymentSet.to) &&
            Objects.equals(this.isAmountCalculated, bankingScheduledPaymentSet.isAmountCalculated) &&
            Objects.equals(this.amount, bankingScheduledPaymentSet.amount) &&
            Objects.equals(this.currency, bankingScheduledPaymentSet.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            to,
            isAmountCalculated,
            amount,
            currency);
    }

    @Override
    public String toString() {
        return "class BankingScheduledPaymentSet {\n" +
            "   to: " + toIndentedString(to) + "\n" + 
            "   isAmountCalculated: " + toIndentedString(isAmountCalculated) + "\n" + 
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
