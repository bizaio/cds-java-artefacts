/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingProductDiscountEligibility {

    public enum DiscountEligibilityType {
        BUSINESS,
        EMPLOYMENT_STATUS,
        INTRODUCTORY,
        MAX_AGE,
        MIN_AGE,
        MIN_INCOME,
        MIN_TURNOVER,
        NATURAL_PERSON,
        PENSION_RECIPIENT,
        RESIDENCY_STATUS,
        STAFF,
        STUDENT,
        OTHER
    }

    private DiscountEligibilityType discountEligibilityType;

    private String additionalValue;

    private String additionalInfo;

    private String additionalInfoUri;

    /**
     * The type of the specific eligibility constraint for a discount
     * @return discountEligibilityType
     */
    public DiscountEligibilityType getDiscountEligibilityType() {
        return discountEligibilityType;
    }

    public void setDiscountEligibilityType(DiscountEligibilityType discountEligibilityType) {
        this.discountEligibilityType = discountEligibilityType;
    }

    /**
     * Generic field containing additional information relevant to the [discountEligibilityType](#tocSproductdiscounteligibilitydoc) specified. Whether mandatory or not is dependent on the value of [discountEligibilityType](#tocSproductdiscounteligibilitydoc)
     * @return additionalValue
     */
    public String getAdditionalValue() {
        return additionalValue;
    }

    public void setAdditionalValue(String additionalValue) {
        this.additionalValue = additionalValue;
    }

    /**
     * Display text providing more information on this eligibility constraint.
     * Whether mandatory or not is dependent on the value of discountEligibilityType
     * @return additionalInfo
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * Link to a web page with more information on this eligibility constraint
     * @return additionalInfoUri
     */
    public String getAdditionalInfoUri() {
        return additionalInfoUri;
    }

    public void setAdditionalInfoUri(String additionalInfoUri) {
        this.additionalInfoUri = additionalInfoUri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingProductDiscountEligibility bankingProductDiscountEligibility = (BankingProductDiscountEligibility) o;
        return Objects.equals(this.discountEligibilityType, bankingProductDiscountEligibility.discountEligibilityType) &&
            Objects.equals(this.additionalValue, bankingProductDiscountEligibility.additionalValue) &&
            Objects.equals(this.additionalInfo, bankingProductDiscountEligibility.additionalInfo) &&
            Objects.equals(this.additionalInfoUri, bankingProductDiscountEligibility.additionalInfoUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            discountEligibilityType,
            additionalValue,
            additionalInfo,
            additionalInfoUri);
    }

    @Override
    public String toString() {
        return "class BankingProductDiscountEligibility {\n" +
            "   discountEligibilityType: " + toIndentedString(discountEligibilityType) + "\n" + 
            "   additionalValue: " + toIndentedString(additionalValue) + "\n" + 
            "   additionalInfo: " + toIndentedString(additionalInfo) + "\n" + 
            "   additionalInfoUri: " + toIndentedString(additionalInfoUri) + "\n" + 
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
