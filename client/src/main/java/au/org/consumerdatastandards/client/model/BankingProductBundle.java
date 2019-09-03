/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 * Do not edit the class manually.
 */
package au.org.consumerdatastandards.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
import java.util.List;

public class BankingProductBundle {

  /**
   * Name of the bundle
   */
  @SerializedName("name")
  private String name;

  /**
   * Description of the bundle
   */
  @SerializedName("description")
  private String description;

  /**
   * Display text providing more information on the bundle
   */
  @SerializedName("additionalInfo")
  private String additionalInfo;

  /**
   * Link to a web page with more information on the bundle
   * criteria and benefits
   */
  @SerializedName("additionalInfoUri")
  private String additionalInfoUri;

  /**
   * Array of product IDs for products included in the bundle
   */
  @SerializedName("productIds")
  private List<String> productIds;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BankingProductBundle name(String name) {
    this.name = name;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BankingProductBundle description(String description) {
    this.description = description;
    return this;
  }

  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BankingProductBundle additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  public BankingProductBundle additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

  public List<String> getProductIds() {
    return productIds;
  }

  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }

  public BankingProductBundle productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    BankingProductBundle inputModel = (BankingProductBundle) o;
    if (!(name.equals(inputModel.getName()))) {
      return false;
    }
    if (!(description.equals(inputModel.getDescription()))) {
      return false;
    }
    if (!(additionalInfo.equals(inputModel.getAdditionalInfo()))) {
      return false;
    }
    if (!(additionalInfoUri.equals(inputModel.getAdditionalInfoUri()))) {
      return false;
    }
    return productIds.equals(inputModel.getProductIds());
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
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("class %s {\n", getClass()));
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    additionalInfoUri: ").append(toIndentedString(additionalInfoUri)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
