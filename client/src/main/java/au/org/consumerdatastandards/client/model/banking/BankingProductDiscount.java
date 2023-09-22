/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.List;
import java.util.Objects;

public class BankingProductDiscount {

    public enum DiscountType {
        BALANCE,
        DEPOSITS,
        ELIGIBILITY_ONLY,
        FEE_CAP,
        PAYMENTS
    }

    private String description;

    private DiscountType discountType;

    private String amount;

    private String balanceRate;

    private String transactionRate;

    private String accruedRate;

    private String feeRate;

    private String additionalValue;

    private String additionalInfo;

    private String additionalInfoUri;

    private List<BankingProductDiscountEligibility> eligibility;

    /**
     * Description of the discount
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The type of discount. See the next section for an overview of valid values and their meaning
     * @return discountType
     */
    public DiscountType getDiscountType() {
        return discountType;
    }

    public void setDiscountType(DiscountType discountType) {
        this.discountType = discountType;
    }

    /**
     * Dollar value of the discount.
     * One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory.
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * A discount rate calculated based on a proportion of the balance. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory. Unless noted in additionalInfo, assumes the application and calculation frequency are the same as the corresponding fee
     * @return balanceRate
     */
    public String getBalanceRate() {
        return balanceRate;
    }

    public void setBalanceRate(String balanceRate) {
        this.balanceRate = balanceRate;
    }

    /**
     * A discount rate calculated based on a proportion of a transaction. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory
     * @return transactionRate
     */
    public String getTransactionRate() {
        return transactionRate;
    }

    public void setTransactionRate(String transactionRate) {
        this.transactionRate = transactionRate;
    }

    /**
     * A discount rate calculated based on a proportion of the calculated interest accrued on the account. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory. Unless noted in additionalInfo, assumes the application and calculation frequency are the same as the corresponding fee
     * @return accruedRate
     */
    public String getAccruedRate() {
        return accruedRate;
    }

    public void setAccruedRate(String accruedRate) {
        this.accruedRate = accruedRate;
    }

    /**
     * A discount rate calculated based on a proportion of the fee to which this discount is attached. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory. Unless noted in additionalInfo, assumes the application and calculation frequency are the same as the corresponding fee
     * @return feeRate
     */
    public String getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(String feeRate) {
        this.feeRate = feeRate;
    }

    /**
     * Generic field containing additional information relevant to the [discountType](#tocSproductdiscounttypedoc) specified. Whether mandatory or not is dependent on the value of [discountType](#tocSproductdiscounttypedoc)
     * @return additionalValue
     */
    public String getAdditionalValue() {
        return additionalValue;
    }

    public void setAdditionalValue(String additionalValue) {
        this.additionalValue = additionalValue;
    }

    /**
     * Display text providing more information on the discount
     * @return additionalInfo
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * Link to a web page with more information on this discount
     * @return additionalInfoUri
     */
    public String getAdditionalInfoUri() {
        return additionalInfoUri;
    }

    public void setAdditionalInfoUri(String additionalInfoUri) {
        this.additionalInfoUri = additionalInfoUri;
    }

    /**
     * Eligibility constraints that apply to this discount.
     * Mandatory if discountType is ELIGIBILITY_ONLY.
     * @return eligibility
     */
    public List<BankingProductDiscountEligibility> getEligibility() {
        return eligibility;
    }

    public void setEligibility(List<BankingProductDiscountEligibility> eligibility) {
        this.eligibility = eligibility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingProductDiscount bankingProductDiscount = (BankingProductDiscount) o;
        return Objects.equals(this.description, bankingProductDiscount.description) &&
            Objects.equals(this.discountType, bankingProductDiscount.discountType) &&
            Objects.equals(this.amount, bankingProductDiscount.amount) &&
            Objects.equals(this.balanceRate, bankingProductDiscount.balanceRate) &&
            Objects.equals(this.transactionRate, bankingProductDiscount.transactionRate) &&
            Objects.equals(this.accruedRate, bankingProductDiscount.accruedRate) &&
            Objects.equals(this.feeRate, bankingProductDiscount.feeRate) &&
            Objects.equals(this.additionalValue, bankingProductDiscount.additionalValue) &&
            Objects.equals(this.additionalInfo, bankingProductDiscount.additionalInfo) &&
            Objects.equals(this.additionalInfoUri, bankingProductDiscount.additionalInfoUri) &&
            Objects.equals(this.eligibility, bankingProductDiscount.eligibility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            description,
            discountType,
            amount,
            balanceRate,
            transactionRate,
            accruedRate,
            feeRate,
            additionalValue,
            additionalInfo,
            additionalInfoUri,
            eligibility);
    }

    @Override
    public String toString() {
        return "class BankingProductDiscount {\n" +
            "   description: " + toIndentedString(description) + "\n" + 
            "   discountType: " + toIndentedString(discountType) + "\n" + 
            "   amount: " + toIndentedString(amount) + "\n" + 
            "   balanceRate: " + toIndentedString(balanceRate) + "\n" + 
            "   transactionRate: " + toIndentedString(transactionRate) + "\n" + 
            "   accruedRate: " + toIndentedString(accruedRate) + "\n" + 
            "   feeRate: " + toIndentedString(feeRate) + "\n" + 
            "   additionalValue: " + toIndentedString(additionalValue) + "\n" + 
            "   additionalInfo: " + toIndentedString(additionalInfo) + "\n" + 
            "   additionalInfoUri: " + toIndentedString(additionalInfoUri) + "\n" + 
            "   eligibility: " + toIndentedString(eligibility) + "\n" + 
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
