/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.time.LocalDate;
import java.util.Objects;

public class BankingTermDepositAccount {

    public enum MaturityInstructions {
        ROLLED_OVER,
        PAID_OUT_AT_MATURITY,
        HOLD_ON_MATURITY
    }

    private LocalDate lodgementDate;

    private LocalDate maturityDate;

    private String maturityAmount;

    private String maturityCurrency;

    private MaturityInstructions maturityInstructions;

    /**
     * The lodgement date of the original deposit
     * @return lodgementDate
     */
    public LocalDate getLodgementDate() {
        return lodgementDate;
    }

    public void setLodgementDate(LocalDate lodgementDate) {
        this.lodgementDate = lodgementDate;
    }

    /**
     * Maturity date for the term deposit
     * @return maturityDate
     */
    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
    }

    /**
     * Amount to be paid upon maturity. If absent it implies the amount to paid is variable and cannot currently be calculated
     * @return maturityAmount
     */
    public String getMaturityAmount() {
        return maturityAmount;
    }

    public void setMaturityAmount(String maturityAmount) {
        this.maturityAmount = maturityAmount;
    }

    /**
     * If absent assumes AUD
     * @return maturityCurrency
     */
    public String getMaturityCurrency() {
        return maturityCurrency;
    }

    public void setMaturityCurrency(String maturityCurrency) {
        this.maturityCurrency = maturityCurrency;
    }

    /**
     * Current instructions on action to be taken at maturity.
     * This includes default actions that may be specified in the terms and conditions for the product
     * e.g. roll-over to the same term and frequency of interest payments
     * @return maturityInstructions
     */
    public MaturityInstructions getMaturityInstructions() {
        return maturityInstructions;
    }

    public void setMaturityInstructions(MaturityInstructions maturityInstructions) {
        this.maturityInstructions = maturityInstructions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingTermDepositAccount bankingTermDepositAccount = (BankingTermDepositAccount) o;
        return Objects.equals(this.lodgementDate, bankingTermDepositAccount.lodgementDate) &&
            Objects.equals(this.maturityDate, bankingTermDepositAccount.maturityDate) &&
            Objects.equals(this.maturityAmount, bankingTermDepositAccount.maturityAmount) &&
            Objects.equals(this.maturityCurrency, bankingTermDepositAccount.maturityCurrency) &&
            Objects.equals(this.maturityInstructions, bankingTermDepositAccount.maturityInstructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            lodgementDate,
            maturityDate,
            maturityAmount,
            maturityCurrency,
            maturityInstructions);
    }

    @Override
    public String toString() {
        return "class BankingTermDepositAccount {\n" +
            "   lodgementDate: " + toIndentedString(lodgementDate) + "\n" + 
            "   maturityDate: " + toIndentedString(maturityDate) + "\n" + 
            "   maturityAmount: " + toIndentedString(maturityAmount) + "\n" + 
            "   maturityCurrency: " + toIndentedString(maturityCurrency) + "\n" + 
            "   maturityInstructions: " + toIndentedString(maturityInstructions) + "\n" + 
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
