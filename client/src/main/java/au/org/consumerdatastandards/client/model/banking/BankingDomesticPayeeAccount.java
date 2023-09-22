/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingDomesticPayeeAccount {

    private String accountName;

    private String bsb;

    private String accountNumber;

    /**
     * Name of the account to pay to
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * BSB of the account to pay to
     * @return bsb
     */
    public String getBsb() {
        return bsb;
    }

    public void setBsb(String bsb) {
        this.bsb = bsb;
    }

    /**
     * Number of the account to pay to
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingDomesticPayeeAccount bankingDomesticPayeeAccount = (BankingDomesticPayeeAccount) o;
        return Objects.equals(this.accountName, bankingDomesticPayeeAccount.accountName) &&
            Objects.equals(this.bsb, bankingDomesticPayeeAccount.bsb) &&
            Objects.equals(this.accountNumber, bankingDomesticPayeeAccount.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            accountName,
            bsb,
            accountNumber);
    }

    @Override
    public String toString() {
        return "class BankingDomesticPayeeAccount {\n" +
            "   accountName: " + toIndentedString(accountName) + "\n" + 
            "   bsb: " + toIndentedString(bsb) + "\n" + 
            "   accountNumber: " + toIndentedString(accountNumber) + "\n" + 
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
