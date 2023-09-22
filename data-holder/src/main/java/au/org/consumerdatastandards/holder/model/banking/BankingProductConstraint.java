/*
 * Consumer Data Standards
 * Sample Data Holder to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
  * Do not edit the class manually.
 */
package au.org.consumerdatastandards.holder.model.banking;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.net.URI;
import java.util.Objects;

@Entity
public class BankingProductConstraint {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @JsonIgnore
    private String constraintId;

    /**
     * The type of constraint described. See the next section for
     * an overview of valid values and their meaning
     */
    private ConstraintType constraintType;

    /**
     * Generic field containing additional information relevant to
     * the constraintType specified. Whether mandatory or not is
     * dependent on the value of constraintType
     */
    @Column(length = 2048)
    private String additionalValue;

    /**
     * Display text providing more information the constraint
     */
    @Column(length = 2048)
    private String additionalInfo;

    /**
     * Link to a web page with more information on the constraint
     */
    private URI additionalInfoUri;

    public ConstraintType getConstraintType() {
        return constraintType;
    }

    public void setConstraintType(ConstraintType constraintType) {
        this.constraintType = constraintType;
    }

    public String getAdditionalValue() {
        return additionalValue;
    }

    public void setAdditionalValue(String additionalValue) {
        this.additionalValue = additionalValue;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public URI getAdditionalInfoUri() {
        return additionalInfoUri;
    }

    public void setAdditionalInfoUri(URI additionalInfoUri) {
        this.additionalInfoUri = additionalInfoUri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankingProductConstraint that = (BankingProductConstraint) o;
        return Objects.equals(constraintId, that.constraintId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(constraintId);
    }

    @Override
    public String toString() {
        return "BankingProductConstraint{" +
                "productConstraintId='" + constraintId + '\'' +
                ", constraintType=" + constraintType +
                ", additionalValue='" + additionalValue + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", additionalInfoUri=" + additionalInfoUri +
                '}';
    }

    public enum ConstraintType {
        MIN_BALANCE,
        MIN_LIMIT,
        MAX_BALANCE,
        MAX_LIMIT,
        OPENING_BALANCE
    }
}
