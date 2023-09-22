/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.Objects;

public class BankingDomesticPayeePayId {

    public enum Type {
        ABN,
        EMAIL,
        ORG_IDENTIFIER,
        TELEPHONE
    }

    private String name;

    private String identifier;

    private Type type;

    /**
     * The name assigned to the PayID by the owner of the PayID
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The identifier of the PayID (dependent on type)
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * The type of the PayID
     * @return type
     */
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingDomesticPayeePayId bankingDomesticPayeePayId = (BankingDomesticPayeePayId) o;
        return Objects.equals(this.name, bankingDomesticPayeePayId.name) &&
            Objects.equals(this.identifier, bankingDomesticPayeePayId.identifier) &&
            Objects.equals(this.type, bankingDomesticPayeePayId.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            identifier,
            type);
    }

    @Override
    public String toString() {
        return "class BankingDomesticPayeePayId {\n" +
            "   name: " + toIndentedString(name) + "\n" + 
            "   identifier: " + toIndentedString(identifier) + "\n" + 
            "   type: " + toIndentedString(type) + "\n" + 
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
