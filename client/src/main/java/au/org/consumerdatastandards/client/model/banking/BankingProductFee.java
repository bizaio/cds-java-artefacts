/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.List;
import java.util.Objects;

public class BankingProductFee {

    public enum FeeType {
        DEPOSIT,
        EVENT,
        EXIT,
        PAYMENT,
        PERIODIC,
        PURCHASE,
        TRANSACTION,
        UPFRONT,
        VARIABLE,
        WITHDRAWAL
    }

    private String name;

    private FeeType feeType;

    private String amount;

    private String balanceRate;

    private String transactionRate;

    private String accruedRate;

    private String accrualFrequency;

    private String currency;

    private String additionalValue;

    private String additionalInfo;

    private String additionalInfoUri;

    private List<BankingProductDiscount> discounts;

    /**
     * Name of the fee
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The type of fee
     * @return feeType
     */
    public FeeType getFeeType() {
        return feeType;
    }

    public void setFeeType(FeeType feeType) {
        this.feeType = feeType;
    }

    /**
     * The amount charged for the fee. One of amount, balanceRate, transactionRate and accruedRate is mandatory
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * A fee rate calculated based on a proportion of the balance. One of amount, balanceRate, transactionRate and accruedRate is mandatory
     * @return balanceRate
     */
    public String getBalanceRate() {
        return balanceRate;
    }

    public void setBalanceRate(String balanceRate) {
        this.balanceRate = balanceRate;
    }

    /**
     * A fee rate calculated based on a proportion of a transaction. One of amount, balanceRate, transactionRate and accruedRate is mandatory
     * @return transactionRate
     */
    public String getTransactionRate() {
        return transactionRate;
    }

    public void setTransactionRate(String transactionRate) {
        this.transactionRate = transactionRate;
    }

    /**
     * A fee rate calculated based on a proportion of the calculated interest accrued on the account. One of amount, balanceRate, transactionRate and accruedRate is mandatory
     * @return accruedRate
     */
    public String getAccruedRate() {
        return accruedRate;
    }

    public void setAccruedRate(String accruedRate) {
        this.accruedRate = accruedRate;
    }

    /**
     * The indicative frequency with which the fee is calculated on the account. Only applies if balanceRate or accruedRate is also present. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
     * @return accrualFrequency
     */
    public String getAccrualFrequency() {
        return accrualFrequency;
    }

    public void setAccrualFrequency(String accrualFrequency) {
        this.accrualFrequency = accrualFrequency;
    }

    /**
     * The currency the fee will be charged in. Assumes AUD if absent
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Generic field containing additional information relevant to the [feeType](#tocSproductfeetypedoc) specified. Whether mandatory or not is dependent on the value of [feeType](#tocSproductfeetypedoc)
     * @return additionalValue
     */
    public String getAdditionalValue() {
        return additionalValue;
    }

    public void setAdditionalValue(String additionalValue) {
        this.additionalValue = additionalValue;
    }

    /**
     * Display text providing more information on the fee
     * @return additionalInfo
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * Link to a web page with more information on this fee
     * @return additionalInfoUri
     */
    public String getAdditionalInfoUri() {
        return additionalInfoUri;
    }

    public void setAdditionalInfoUri(String additionalInfoUri) {
        this.additionalInfoUri = additionalInfoUri;
    }

    /**
     * An optional list of discounts to this fee that may be available
     * @return discounts
     */
    public List<BankingProductDiscount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<BankingProductDiscount> discounts) {
        this.discounts = discounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingProductFee bankingProductFee = (BankingProductFee) o;
        return Objects.equals(this.name, bankingProductFee.name) &&
            Objects.equals(this.feeType, bankingProductFee.feeType) &&
            Objects.equals(this.amount, bankingProductFee.amount) &&
            Objects.equals(this.balanceRate, bankingProductFee.balanceRate) &&
            Objects.equals(this.transactionRate, bankingProductFee.transactionRate) &&
            Objects.equals(this.accruedRate, bankingProductFee.accruedRate) &&
            Objects.equals(this.accrualFrequency, bankingProductFee.accrualFrequency) &&
            Objects.equals(this.currency, bankingProductFee.currency) &&
            Objects.equals(this.additionalValue, bankingProductFee.additionalValue) &&
            Objects.equals(this.additionalInfo, bankingProductFee.additionalInfo) &&
            Objects.equals(this.additionalInfoUri, bankingProductFee.additionalInfoUri) &&
            Objects.equals(this.discounts, bankingProductFee.discounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            feeType,
            amount,
            balanceRate,
            transactionRate,
            accruedRate,
            accrualFrequency,
            currency,
            additionalValue,
            additionalInfo,
            additionalInfoUri,
            discounts);
    }

    @Override
    public String toString() {
        return "class BankingProductFee {\n" +
            "   name: " + toIndentedString(name) + "\n" + 
            "   feeType: " + toIndentedString(feeType) + "\n" + 
            "   amount: " + toIndentedString(amount) + "\n" + 
            "   balanceRate: " + toIndentedString(balanceRate) + "\n" + 
            "   transactionRate: " + toIndentedString(transactionRate) + "\n" + 
            "   accruedRate: " + toIndentedString(accruedRate) + "\n" + 
            "   accrualFrequency: " + toIndentedString(accrualFrequency) + "\n" + 
            "   currency: " + toIndentedString(currency) + "\n" + 
            "   additionalValue: " + toIndentedString(additionalValue) + "\n" + 
            "   additionalInfo: " + toIndentedString(additionalInfo) + "\n" + 
            "   additionalInfoUri: " + toIndentedString(additionalInfoUri) + "\n" + 
            "   discounts: " + toIndentedString(discounts) + "\n" + 
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
