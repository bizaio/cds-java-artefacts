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

public class BankingProductFeature {

  /**
   * The type of feature described
   */
  @SerializedName("featureType")
  private FeatureType featureType;

  /**
   * Generic field containing additional information relevant to
   * the featureType specified. Whether mandatory or not is
   * dependent on the value of featureType
   */
  @SerializedName("additionalValue")
  private String additionalValue;

  /**
   * Display text providing more information on the feature.
   * Mandatory if the feature type is set to OTHER
   */
  @SerializedName("additionalInfo")
  private String additionalInfo;

  /**
   * Link to a web page with more information on this feature
   */
  @SerializedName("additionalInfoUri")
  private String additionalInfoUri;

  public FeatureType getFeatureType() {
    return featureType;
  }

  public void setFeatureType(FeatureType featureType) {
    this.featureType = featureType;
  }

  public BankingProductFeature featureType(FeatureType featureType) {
    this.featureType = featureType;
    return this;
  }

  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public BankingProductFeature additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BankingProductFeature additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  public BankingProductFeature additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
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

    BankingProductFeature inputModel = (BankingProductFeature) o;
    if (!(featureType.equals(inputModel.getFeatureType()))) {
      return false;
    }
    if (!(additionalValue.equals(inputModel.getAdditionalValue()))) {
      return false;
    }
    if (!(additionalInfo.equals(inputModel.getAdditionalInfo()))) {
      return false;
    }
    return additionalInfoUri.equals(inputModel.getAdditionalInfoUri());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        featureType,
        additionalValue,
        additionalInfo,
        additionalInfoUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("class %s {\n", getClass()));
    sb.append("    featureType: ").append(toIndentedString(featureType)).append("\n");
    sb.append("    additionalValue: ").append(toIndentedString(additionalValue)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    additionalInfoUri: ").append(toIndentedString(additionalInfoUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public enum FeatureType {
    CARD_ACCESS,
    ADDITIONAL_CARDS,
    UNLIMITED_TXNS,
    FREE_TXNS,
    FREE_TXNS_ALLOWANCE,
    LOYALTY_PROGRAM,
    OFFSET,
    OVERDRAFT,
    REDRAW,
    INSURANCE,
    BALANCE_TRANSFERS,
    INTEREST_FREE,
    INTEREST_FREE_TRANSFERS,
    DIGITAL_WALLET,
    DIGITAL_BANKING,
    NPP_PAYID,
    NPP_ENABLED,
    DONATE_INTEREST,
    BILL_PAYMENT,
    COMPLEMENTARY_PRODUCT_DISCOUNTS,
    BONUS_REWARDS,
    NOTIFICATIONS,
    OTHER
  }
}
