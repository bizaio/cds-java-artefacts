/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingTransactionDetailExtendedDataX2p101Payload {

    private String extendedDescription;

    private String endToEndId;

    private String purposeCode;

    /**
     * An extended string description. Required if the extensionUType field is `x2p101Payload`
     * @return extendedDescription
     */
    public String getExtendedDescription() {
        return extendedDescription;
    }

    public void setExtendedDescription(String extendedDescription) {
        this.extendedDescription = extendedDescription;
    }

    /**
     * An end to end ID for the payment created at initiation
     * @return endToEndId
     */
    public String getEndToEndId() {
        return endToEndId;
    }

    public void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId;
    }

    /**
     * Purpose of the payment.  Format is defined by NPP standards for the x2p1.01 overlay service
     * @return purposeCode
     */
    public String getPurposeCode() {
        return purposeCode;
    }

    public void setPurposeCode(String purposeCode) {
        this.purposeCode = purposeCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingTransactionDetailExtendedDataX2p101Payload bankingTransactionDetailExtendedDataX2p101Payload = (BankingTransactionDetailExtendedDataX2p101Payload) o;
        return Objects.equals(this.extendedDescription, bankingTransactionDetailExtendedDataX2p101Payload.extendedDescription) &&
            Objects.equals(this.endToEndId, bankingTransactionDetailExtendedDataX2p101Payload.endToEndId) &&
            Objects.equals(this.purposeCode, bankingTransactionDetailExtendedDataX2p101Payload.purposeCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            extendedDescription,
            endToEndId,
            purposeCode);
    }

    @Override
    public String toString() {
        return "class BankingTransactionDetailExtendedDataX2p101Payload {\n" +
            "   extendedDescription: " + toIndentedString(extendedDescription) + "\n" + 
            "   endToEndId: " + toIndentedString(endToEndId) + "\n" + 
            "   purposeCode: " + toIndentedString(purposeCode) + "\n" + 
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
