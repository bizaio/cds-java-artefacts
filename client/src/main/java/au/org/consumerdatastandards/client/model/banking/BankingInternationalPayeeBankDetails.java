/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingInternationalPayeeBankDetails {

    private String country;

    private String accountNumber;

    private BankingInternationalPayeeBankDetailsBankAddress bankAddress;

    private String beneficiaryBankBIC;

    private String fedWireNumber;

    private String sortCode;

    private String chipNumber;

    private String routingNumber;

    private String legalEntityIdentifier;

    /**
     * Country of the recipient institution. A valid [ISO 3166 Alpha-3](https://www.iso.org/iso-3166-country-codes.html) country code
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Account Targeted for payment
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Get bankAddress
     * @return bankAddress
     */
    public BankingInternationalPayeeBankDetailsBankAddress getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(BankingInternationalPayeeBankDetailsBankAddress bankAddress) {
        this.bankAddress = bankAddress;
    }

    /**
     * Swift bank code.  Aligns with standard [ISO 9362](https://www.iso.org/standard/60390.html)
     * @return beneficiaryBankBIC
     */
    public String getBeneficiaryBankBIC() {
        return beneficiaryBankBIC;
    }

    public void setBeneficiaryBankBIC(String beneficiaryBankBIC) {
        this.beneficiaryBankBIC = beneficiaryBankBIC;
    }

    /**
     * Number for Fedwire payment (Federal Reserve Wire Network)
     * @return fedWireNumber
     */
    public String getFedWireNumber() {
        return fedWireNumber;
    }

    public void setFedWireNumber(String fedWireNumber) {
        this.fedWireNumber = fedWireNumber;
    }

    /**
     * Sort code used for account identification in some jurisdictions
     * @return sortCode
     */
    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    /**
     * Number for the Clearing House Interbank Payments System
     * @return chipNumber
     */
    public String getChipNumber() {
        return chipNumber;
    }

    public void setChipNumber(String chipNumber) {
        this.chipNumber = chipNumber;
    }

    /**
     * International bank routing number
     * @return routingNumber
     */
    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    /**
     * The legal entity identifier (LEI) for the beneficiary.  Aligns with [ISO 17442](https://www.iso.org/standard/59771.html)
     * @return legalEntityIdentifier
     */
    public String getLegalEntityIdentifier() {
        return legalEntityIdentifier;
    }

    public void setLegalEntityIdentifier(String legalEntityIdentifier) {
        this.legalEntityIdentifier = legalEntityIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingInternationalPayeeBankDetails bankingInternationalPayeeBankDetails = (BankingInternationalPayeeBankDetails) o;
        return Objects.equals(this.country, bankingInternationalPayeeBankDetails.country) &&
            Objects.equals(this.accountNumber, bankingInternationalPayeeBankDetails.accountNumber) &&
            Objects.equals(this.bankAddress, bankingInternationalPayeeBankDetails.bankAddress) &&
            Objects.equals(this.beneficiaryBankBIC, bankingInternationalPayeeBankDetails.beneficiaryBankBIC) &&
            Objects.equals(this.fedWireNumber, bankingInternationalPayeeBankDetails.fedWireNumber) &&
            Objects.equals(this.sortCode, bankingInternationalPayeeBankDetails.sortCode) &&
            Objects.equals(this.chipNumber, bankingInternationalPayeeBankDetails.chipNumber) &&
            Objects.equals(this.routingNumber, bankingInternationalPayeeBankDetails.routingNumber) &&
            Objects.equals(this.legalEntityIdentifier, bankingInternationalPayeeBankDetails.legalEntityIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            country,
            accountNumber,
            bankAddress,
            beneficiaryBankBIC,
            fedWireNumber,
            sortCode,
            chipNumber,
            routingNumber,
            legalEntityIdentifier);
    }

    @Override
    public String toString() {
        return "class BankingInternationalPayeeBankDetails {\n" +
            "   country: " + toIndentedString(country) + "\n" + 
            "   accountNumber: " + toIndentedString(accountNumber) + "\n" + 
            "   bankAddress: " + toIndentedString(bankAddress) + "\n" + 
            "   beneficiaryBankBIC: " + toIndentedString(beneficiaryBankBIC) + "\n" + 
            "   fedWireNumber: " + toIndentedString(fedWireNumber) + "\n" + 
            "   sortCode: " + toIndentedString(sortCode) + "\n" + 
            "   chipNumber: " + toIndentedString(chipNumber) + "\n" + 
            "   routingNumber: " + toIndentedString(routingNumber) + "\n" + 
            "   legalEntityIdentifier: " + toIndentedString(legalEntityIdentifier) + "\n" + 
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
