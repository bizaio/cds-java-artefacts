/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingDomesticPayeeCard {

    private String cardNumber;

    /**
     * Name of the account to pay to
     * @return cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingDomesticPayeeCard bankingDomesticPayeeCard = (BankingDomesticPayeeCard) o;
        return Objects.equals(this.cardNumber, bankingDomesticPayeeCard.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            cardNumber);
    }

    @Override
    public String toString() {
        return "class BankingDomesticPayeeCard {\n" +
            "   cardNumber: " + toIndentedString(cardNumber) + "\n" + 
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
