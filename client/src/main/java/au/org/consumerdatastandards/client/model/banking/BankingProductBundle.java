/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.util.List;
import java.util.Objects;

public class BankingProductBundle {

    private String name;

    private String description;

    private String additionalInfo;

    private String additionalInfoUri;

    private List<String> productIds;

    /**
     * Name of the bundle
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description of the bundle
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Display text providing more information on the bundle
     * @return additionalInfo
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * Link to a web page with more information on the bundle criteria and benefits
     * @return additionalInfoUri
     */
    public String getAdditionalInfoUri() {
        return additionalInfoUri;
    }

    public void setAdditionalInfoUri(String additionalInfoUri) {
        this.additionalInfoUri = additionalInfoUri;
    }

    /**
     * Array of product IDs for products included in the bundle that are available via the product end points.  Note that this array is not intended to represent a comprehensive model of the products included in the bundle and some products available for the bundle may not be available via the product reference end points
     * @return productIds
     */
    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingProductBundle bankingProductBundle = (BankingProductBundle) o;
        return Objects.equals(this.name, bankingProductBundle.name) &&
            Objects.equals(this.description, bankingProductBundle.description) &&
            Objects.equals(this.additionalInfo, bankingProductBundle.additionalInfo) &&
            Objects.equals(this.additionalInfoUri, bankingProductBundle.additionalInfoUri) &&
            Objects.equals(this.productIds, bankingProductBundle.productIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            description,
            additionalInfo,
            additionalInfoUri,
            productIds);
    }

    @Override
    public String toString() {
        return "class BankingProductBundle {\n" +
            "   name: " + toIndentedString(name) + "\n" + 
            "   description: " + toIndentedString(description) + "\n" + 
            "   additionalInfo: " + toIndentedString(additionalInfo) + "\n" + 
            "   additionalInfoUri: " + toIndentedString(additionalInfoUri) + "\n" + 
            "   productIds: " + toIndentedString(productIds) + "\n" + 
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
