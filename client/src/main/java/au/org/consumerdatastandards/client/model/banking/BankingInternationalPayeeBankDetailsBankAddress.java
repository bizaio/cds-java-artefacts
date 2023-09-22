/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingInternationalPayeeBankDetailsBankAddress {

    private String name;

    private String address;

    /**
     * Name of the recipient Bank
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Address of the recipient Bank
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingInternationalPayeeBankDetailsBankAddress bankingInternationalPayeeBankDetailsBankAddress = (BankingInternationalPayeeBankDetailsBankAddress) o;
        return Objects.equals(this.name, bankingInternationalPayeeBankDetailsBankAddress.name) &&
            Objects.equals(this.address, bankingInternationalPayeeBankDetailsBankAddress.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            address);
    }

    @Override
    public String toString() {
        return "class BankingInternationalPayeeBankDetailsBankAddress {\n" +
            "   name: " + toIndentedString(name) + "\n" + 
            "   address: " + toIndentedString(address) + "\n" + 
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
