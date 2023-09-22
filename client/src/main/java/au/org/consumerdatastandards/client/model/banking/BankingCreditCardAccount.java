/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.time.LocalDate;
import java.util.Objects;

public class BankingCreditCardAccount {

    private String minPaymentAmount;

    private String paymentDueAmount;

    private String paymentCurrency;

    private LocalDate paymentDueDate;

    /**
     * The minimum payment amount due for the next card payment
     * @return minPaymentAmount
     */
    public String getMinPaymentAmount() {
        return minPaymentAmount;
    }

    public void setMinPaymentAmount(String minPaymentAmount) {
        this.minPaymentAmount = minPaymentAmount;
    }

    /**
     * The amount due for the next card payment
     * @return paymentDueAmount
     */
    public String getPaymentDueAmount() {
        return paymentDueAmount;
    }

    public void setPaymentDueAmount(String paymentDueAmount) {
        this.paymentDueAmount = paymentDueAmount;
    }

    /**
     * If absent assumes AUD
     * @return paymentCurrency
     */
    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    /**
     * Date that the next payment for the card is due
     * @return paymentDueDate
     */
    public LocalDate getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setPaymentDueDate(LocalDate paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingCreditCardAccount bankingCreditCardAccount = (BankingCreditCardAccount) o;
        return Objects.equals(this.minPaymentAmount, bankingCreditCardAccount.minPaymentAmount) &&
            Objects.equals(this.paymentDueAmount, bankingCreditCardAccount.paymentDueAmount) &&
            Objects.equals(this.paymentCurrency, bankingCreditCardAccount.paymentCurrency) &&
            Objects.equals(this.paymentDueDate, bankingCreditCardAccount.paymentDueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            minPaymentAmount,
            paymentDueAmount,
            paymentCurrency,
            paymentDueDate);
    }

    @Override
    public String toString() {
        return "class BankingCreditCardAccount {\n" +
            "   minPaymentAmount: " + toIndentedString(minPaymentAmount) + "\n" + 
            "   paymentDueAmount: " + toIndentedString(paymentDueAmount) + "\n" + 
            "   paymentCurrency: " + toIndentedString(paymentCurrency) + "\n" + 
            "   paymentDueDate: " + toIndentedString(paymentDueDate) + "\n" + 
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
