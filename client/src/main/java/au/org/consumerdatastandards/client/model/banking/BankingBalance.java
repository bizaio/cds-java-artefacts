/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.List;
import java.util.Objects;

public class BankingBalance {

    private String accountId;

    private String currentBalance;

    private String availableBalance;

    private String creditLimit;

    private String amortisedLimit;

    private String currency;

    private List<BankingBalancePurse> purses;

    /**
     * A unique ID of the account adhering to the standards for ID permanence
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * The balance of the account at this time. Should align to the balance available via other channels such as Internet Banking. Assumed to be negative if the customer has money owing
     * @return currentBalance
     */
    public String getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
    }

    /**
     * Balance representing the amount of funds available for transfer. Assumed to be zero or positive
     * @return availableBalance
     */
    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    /**
     * Object representing the maximum amount of credit that is available for this account. Assumed to be zero if absent
     * @return creditLimit
     */
    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    /**
     * Object representing the available limit amortised according to payment schedule. Assumed to be zero if absent
     * @return amortisedLimit
     */
    public String getAmortisedLimit() {
        return amortisedLimit;
    }

    public void setAmortisedLimit(String amortisedLimit) {
        this.amortisedLimit = amortisedLimit;
    }

    /**
     * The currency for the balance amounts. If absent assumed to be AUD
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Optional array of balances for the account in other currencies. Included to support accounts that support multi-currency purses such as Travel Cards
     * @return purses
     */
    public List<BankingBalancePurse> getPurses() {
        return purses;
    }

    public void setPurses(List<BankingBalancePurse> purses) {
        this.purses = purses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingBalance bankingBalance = (BankingBalance) o;
        return Objects.equals(this.accountId, bankingBalance.accountId) &&
            Objects.equals(this.currentBalance, bankingBalance.currentBalance) &&
            Objects.equals(this.availableBalance, bankingBalance.availableBalance) &&
            Objects.equals(this.creditLimit, bankingBalance.creditLimit) &&
            Objects.equals(this.amortisedLimit, bankingBalance.amortisedLimit) &&
            Objects.equals(this.currency, bankingBalance.currency) &&
            Objects.equals(this.purses, bankingBalance.purses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            currentBalance,
            availableBalance,
            creditLimit,
            amortisedLimit,
            currency,
            purses);
    }

    @Override
    public String toString() {
        return "class BankingBalance {\n" +
            "   accountId: " + toIndentedString(accountId) + "\n" + 
            "   currentBalance: " + toIndentedString(currentBalance) + "\n" + 
            "   availableBalance: " + toIndentedString(availableBalance) + "\n" + 
            "   creditLimit: " + toIndentedString(creditLimit) + "\n" + 
            "   amortisedLimit: " + toIndentedString(amortisedLimit) + "\n" + 
            "   currency: " + toIndentedString(currency) + "\n" + 
            "   purses: " + toIndentedString(purses) + "\n" + 
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
