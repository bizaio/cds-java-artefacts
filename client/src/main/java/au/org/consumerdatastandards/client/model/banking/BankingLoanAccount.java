/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class BankingLoanAccount {

    public enum RepaymentType {
        INTEREST_ONLY,
        PRINCIPAL_AND_INTEREST
    }

    private LocalDate originalStartDate;

    private String originalLoanAmount;

    private String originalLoanCurrency;

    private LocalDate loanEndDate;

    private LocalDate nextInstalmentDate;

    private String minInstalmentAmount;

    private String minInstalmentCurrency;

    private String maxRedraw;

    private String maxRedrawCurrency;

    private String minRedraw;

    private String minRedrawCurrency;

    private Boolean offsetAccountEnabled;

    private List<String> offsetAccountIds;

    private RepaymentType repaymentType = RepaymentType.PRINCIPAL_AND_INTEREST;

    private String repaymentFrequency;

    /**
     * Optional original start date for the loan
     * @return originalStartDate
     */
    public LocalDate getOriginalStartDate() {
        return originalStartDate;
    }

    public void setOriginalStartDate(LocalDate originalStartDate) {
        this.originalStartDate = originalStartDate;
    }

    /**
     * Optional original loan value
     * @return originalLoanAmount
     */
    public String getOriginalLoanAmount() {
        return originalLoanAmount;
    }

    public void setOriginalLoanAmount(String originalLoanAmount) {
        this.originalLoanAmount = originalLoanAmount;
    }

    /**
     * If absent assumes AUD
     * @return originalLoanCurrency
     */
    public String getOriginalLoanCurrency() {
        return originalLoanCurrency;
    }

    public void setOriginalLoanCurrency(String originalLoanCurrency) {
        this.originalLoanCurrency = originalLoanCurrency;
    }

    /**
     * Date that the loan is due to be repaid in full
     * @return loanEndDate
     */
    public LocalDate getLoanEndDate() {
        return loanEndDate;
    }

    public void setLoanEndDate(LocalDate loanEndDate) {
        this.loanEndDate = loanEndDate;
    }

    /**
     * Next date that an instalment is required
     * @return nextInstalmentDate
     */
    public LocalDate getNextInstalmentDate() {
        return nextInstalmentDate;
    }

    public void setNextInstalmentDate(LocalDate nextInstalmentDate) {
        this.nextInstalmentDate = nextInstalmentDate;
    }

    /**
     * Minimum amount of next instalment
     * @return minInstalmentAmount
     */
    public String getMinInstalmentAmount() {
        return minInstalmentAmount;
    }

    public void setMinInstalmentAmount(String minInstalmentAmount) {
        this.minInstalmentAmount = minInstalmentAmount;
    }

    /**
     * If absent assumes AUD
     * @return minInstalmentCurrency
     */
    public String getMinInstalmentCurrency() {
        return minInstalmentCurrency;
    }

    public void setMinInstalmentCurrency(String minInstalmentCurrency) {
        this.minInstalmentCurrency = minInstalmentCurrency;
    }

    /**
     * Maximum amount of funds that can be redrawn. If not present redraw is not available even if the feature exists for the account
     * @return maxRedraw
     */
    public String getMaxRedraw() {
        return maxRedraw;
    }

    public void setMaxRedraw(String maxRedraw) {
        this.maxRedraw = maxRedraw;
    }

    /**
     * If absent assumes AUD
     * @return maxRedrawCurrency
     */
    public String getMaxRedrawCurrency() {
        return maxRedrawCurrency;
    }

    public void setMaxRedrawCurrency(String maxRedrawCurrency) {
        this.maxRedrawCurrency = maxRedrawCurrency;
    }

    /**
     * Minimum redraw amount
     * @return minRedraw
     */
    public String getMinRedraw() {
        return minRedraw;
    }

    public void setMinRedraw(String minRedraw) {
        this.minRedraw = minRedraw;
    }

    /**
     * If absent assumes AUD
     * @return minRedrawCurrency
     */
    public String getMinRedrawCurrency() {
        return minRedrawCurrency;
    }

    public void setMinRedrawCurrency(String minRedrawCurrency) {
        this.minRedrawCurrency = minRedrawCurrency;
    }

    /**
     * Set to true if one or more offset accounts are configured for this loan account
     * @return offsetAccountEnabled
     */
    public Boolean getOffsetAccountEnabled() {
        return offsetAccountEnabled;
    }

    public void setOffsetAccountEnabled(Boolean offsetAccountEnabled) {
        this.offsetAccountEnabled = offsetAccountEnabled;
    }

    /**
     * The accountIDs of the configured offset accounts attached to this loan. Only offset accounts that can be accessed under the current authorisation should be included. It is expected behaviour that offsetAccountEnabled is set to true but the offsetAccountIds field is absent or empty. This represents a situation where an offset account exists but details can not be accessed under the current authorisation
     * @return offsetAccountIds
     */
    public List<String> getOffsetAccountIds() {
        return offsetAccountIds;
    }

    public void setOffsetAccountIds(List<String> offsetAccountIds) {
        this.offsetAccountIds = offsetAccountIds;
    }

    /**
     * Options in place for repayments. If absent defaults to PRINCIPAL_AND_INTEREST
     * @return repaymentType
     */
    public RepaymentType getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(RepaymentType repaymentType) {
        this.repaymentType = repaymentType;
    }

    /**
     * The expected or required repayment frequency. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
     * @return repaymentFrequency
     */
    public String getRepaymentFrequency() {
        return repaymentFrequency;
    }

    public void setRepaymentFrequency(String repaymentFrequency) {
        this.repaymentFrequency = repaymentFrequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingLoanAccount bankingLoanAccount = (BankingLoanAccount) o;
        return Objects.equals(this.originalStartDate, bankingLoanAccount.originalStartDate) &&
            Objects.equals(this.originalLoanAmount, bankingLoanAccount.originalLoanAmount) &&
            Objects.equals(this.originalLoanCurrency, bankingLoanAccount.originalLoanCurrency) &&
            Objects.equals(this.loanEndDate, bankingLoanAccount.loanEndDate) &&
            Objects.equals(this.nextInstalmentDate, bankingLoanAccount.nextInstalmentDate) &&
            Objects.equals(this.minInstalmentAmount, bankingLoanAccount.minInstalmentAmount) &&
            Objects.equals(this.minInstalmentCurrency, bankingLoanAccount.minInstalmentCurrency) &&
            Objects.equals(this.maxRedraw, bankingLoanAccount.maxRedraw) &&
            Objects.equals(this.maxRedrawCurrency, bankingLoanAccount.maxRedrawCurrency) &&
            Objects.equals(this.minRedraw, bankingLoanAccount.minRedraw) &&
            Objects.equals(this.minRedrawCurrency, bankingLoanAccount.minRedrawCurrency) &&
            Objects.equals(this.offsetAccountEnabled, bankingLoanAccount.offsetAccountEnabled) &&
            Objects.equals(this.offsetAccountIds, bankingLoanAccount.offsetAccountIds) &&
            Objects.equals(this.repaymentType, bankingLoanAccount.repaymentType) &&
            Objects.equals(this.repaymentFrequency, bankingLoanAccount.repaymentFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            originalStartDate,
            originalLoanAmount,
            originalLoanCurrency,
            loanEndDate,
            nextInstalmentDate,
            minInstalmentAmount,
            minInstalmentCurrency,
            maxRedraw,
            maxRedrawCurrency,
            minRedraw,
            minRedrawCurrency,
            offsetAccountEnabled,
            offsetAccountIds,
            repaymentType,
            repaymentFrequency);
    }

    @Override
    public String toString() {
        return "class BankingLoanAccount {\n" +
            "   originalStartDate: " + toIndentedString(originalStartDate) + "\n" + 
            "   originalLoanAmount: " + toIndentedString(originalLoanAmount) + "\n" + 
            "   originalLoanCurrency: " + toIndentedString(originalLoanCurrency) + "\n" + 
            "   loanEndDate: " + toIndentedString(loanEndDate) + "\n" + 
            "   nextInstalmentDate: " + toIndentedString(nextInstalmentDate) + "\n" + 
            "   minInstalmentAmount: " + toIndentedString(minInstalmentAmount) + "\n" + 
            "   minInstalmentCurrency: " + toIndentedString(minInstalmentCurrency) + "\n" + 
            "   maxRedraw: " + toIndentedString(maxRedraw) + "\n" + 
            "   maxRedrawCurrency: " + toIndentedString(maxRedrawCurrency) + "\n" + 
            "   minRedraw: " + toIndentedString(minRedraw) + "\n" + 
            "   minRedrawCurrency: " + toIndentedString(minRedrawCurrency) + "\n" + 
            "   offsetAccountEnabled: " + toIndentedString(offsetAccountEnabled) + "\n" + 
            "   offsetAccountIds: " + toIndentedString(offsetAccountIds) + "\n" + 
            "   repaymentType: " + toIndentedString(repaymentType) + "\n" + 
            "   repaymentFrequency: " + toIndentedString(repaymentFrequency) + "\n" + 
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
