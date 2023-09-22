/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.math.BigDecimal;
import java.util.Objects;
/**
 * Defines the sub-tier criteria and conditions for which a rate applies
 */
public class BankingProductRateTierSubTier {

    public enum UnitOfMeasure {
        DOLLAR,
        PERCENT,
        DAY,
        MONTH
    }

    public enum RateApplicationMethod {
        PER_TIER,
        WHOLE_BALANCE
    }

    private String name;

    private UnitOfMeasure unitOfMeasure;

    private BigDecimal minimumValue;

    private BigDecimal maximumValue;

    private RateApplicationMethod rateApplicationMethod;

    private BankingProductRateCondition applicabilityConditions;

    /**
     * A display name for the tier
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The unit of measure that applies to the tierValueMinimum and tierValueMaximum values e.g. a **DOLLAR** amount. **PERCENT** (in the case of loan-to-value ratio or LVR). Tier term period representing a discrete number of **MONTH**'s or **DAY**'s (in the case of term deposit tiers)
     * @return unitOfMeasure
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    /**
     * The number of tierUnitOfMeasure units that form the lower bound of the tier. The tier should be inclusive of this value
     * @return minimumValue
     */
    public BigDecimal getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(BigDecimal minimumValue) {
        this.minimumValue = minimumValue;
    }

    /**
     * The number of tierUnitOfMeasure units that form the upper bound of the tier or band. For a tier with a discrete value (as opposed to a range of values e.g. 1 month) this must be the same as tierValueMinimum. Where this is the same as the tierValueMinimum value of the next-higher tier the referenced tier should be exclusive of this value. For example a term deposit of 2 months falls into the upper tier of the following tiers: (1 – 2 months, 2 – 3 months)
     * @return maximumValue
     */
    public BigDecimal getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(BigDecimal maximumValue) {
        this.maximumValue = maximumValue;
    }

    /**
     * The method used to calculate the amount to be applied using one or more tiers. A single rate may be applied to the entire balance or each applicable tier rate is applied to the portion of the balance that falls into that tier (referred to as 'bands' or 'steps')
     * @return rateApplicationMethod
     */
    public RateApplicationMethod getRateApplicationMethod() {
        return rateApplicationMethod;
    }

    public void setRateApplicationMethod(RateApplicationMethod rateApplicationMethod) {
        this.rateApplicationMethod = rateApplicationMethod;
    }

    /**
     * Get applicabilityConditions
     * @return applicabilityConditions
     */
    public BankingProductRateCondition getApplicabilityConditions() {
        return applicabilityConditions;
    }

    public void setApplicabilityConditions(BankingProductRateCondition applicabilityConditions) {
        this.applicabilityConditions = applicabilityConditions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingProductRateTierSubTier bankingProductRateTierSubTier = (BankingProductRateTierSubTier) o;
        return Objects.equals(this.name, bankingProductRateTierSubTier.name) &&
            Objects.equals(this.unitOfMeasure, bankingProductRateTierSubTier.unitOfMeasure) &&
            Objects.equals(this.minimumValue, bankingProductRateTierSubTier.minimumValue) &&
            Objects.equals(this.maximumValue, bankingProductRateTierSubTier.maximumValue) &&
            Objects.equals(this.rateApplicationMethod, bankingProductRateTierSubTier.rateApplicationMethod) &&
            Objects.equals(this.applicabilityConditions, bankingProductRateTierSubTier.applicabilityConditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            unitOfMeasure,
            minimumValue,
            maximumValue,
            rateApplicationMethod,
            applicabilityConditions);
    }

    @Override
    public String toString() {
        return "class BankingProductRateTierSubTier {\n" +
            "   name: " + toIndentedString(name) + "\n" + 
            "   unitOfMeasure: " + toIndentedString(unitOfMeasure) + "\n" + 
            "   minimumValue: " + toIndentedString(minimumValue) + "\n" + 
            "   maximumValue: " + toIndentedString(maximumValue) + "\n" + 
            "   rateApplicationMethod: " + toIndentedString(rateApplicationMethod) + "\n" + 
            "   applicabilityConditions: " + toIndentedString(applicabilityConditions) + "\n" + 
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
