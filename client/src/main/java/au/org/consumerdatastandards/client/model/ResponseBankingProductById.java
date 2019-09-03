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

public class ResponseBankingProductById extends BaseResponse {

  @SerializedName("data")
  private BankingProductDetail data;

  public BankingProductDetail getData() {
    return data;
  }

  public void setData(BankingProductDetail data) {
    this.data = data;
  }

  public ResponseBankingProductById data(BankingProductDetail data) {
    this.data = data;
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

    if (!super.equals(o)) {
      return false;
    }
    ResponseBankingProductById inputModel = (ResponseBankingProductById) o;
    return data.equals(inputModel.getData());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        super.hashCode(),
        data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("class %s {\n", getClass()));
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
