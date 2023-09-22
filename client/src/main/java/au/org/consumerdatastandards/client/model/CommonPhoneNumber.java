/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model;

import java.util.Objects;

public class CommonPhoneNumber {

    public enum Purpose {
        MOBILE,
        HOME,
        INTERNATIONAL,
        WORK,
        OTHER,
        UNSPECIFIED
    }

    private Boolean isPreferred;

    private Purpose purpose;

    private String countryCode;

    private String areaCode;

    private String number;

    private String extension;

    private String fullNumber;

    /**
     * May be true for one and only one entry to indicate the preferred phone number. Assumed to be 'false' if not present
     * @return isPreferred
     */
    public Boolean getIsPreferred() {
        return isPreferred;
    }

    public void setIsPreferred(Boolean isPreferred) {
        this.isPreferred = isPreferred;
    }

    /**
     * The purpose of the number as specified by the customer
     * @return purpose
     */
    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    /**
     * If absent, assumed to be Australia (+61). The + should be included
     * @return countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted.
     * @return areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * The actual phone number, with leading zeros as appropriate
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * An extension number (if applicable)
     * @return extension
     */
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of [RFC 3966](https://www.ietf.org/rfc/rfc3966.txt)
     * @return fullNumber
     */
    public String getFullNumber() {
        return fullNumber;
    }

    public void setFullNumber(String fullNumber) {
        this.fullNumber = fullNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommonPhoneNumber commonPhoneNumber = (CommonPhoneNumber) o;
        return Objects.equals(this.isPreferred, commonPhoneNumber.isPreferred) &&
            Objects.equals(this.purpose, commonPhoneNumber.purpose) &&
            Objects.equals(this.countryCode, commonPhoneNumber.countryCode) &&
            Objects.equals(this.areaCode, commonPhoneNumber.areaCode) &&
            Objects.equals(this.number, commonPhoneNumber.number) &&
            Objects.equals(this.extension, commonPhoneNumber.extension) &&
            Objects.equals(this.fullNumber, commonPhoneNumber.fullNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            isPreferred,
            purpose,
            countryCode,
            areaCode,
            number,
            extension,
            fullNumber);
    }

    @Override
    public String toString() {
        return "class CommonPhoneNumber {\n" +
            "   isPreferred: " + toIndentedString(isPreferred) + "\n" + 
            "   purpose: " + toIndentedString(purpose) + "\n" + 
            "   countryCode: " + toIndentedString(countryCode) + "\n" + 
            "   areaCode: " + toIndentedString(areaCode) + "\n" + 
            "   number: " + toIndentedString(number) + "\n" + 
            "   extension: " + toIndentedString(extension) + "\n" + 
            "   fullNumber: " + toIndentedString(fullNumber) + "\n" + 
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
