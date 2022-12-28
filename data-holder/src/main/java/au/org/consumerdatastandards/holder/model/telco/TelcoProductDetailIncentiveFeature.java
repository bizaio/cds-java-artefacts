package au.org.consumerdatastandards.holder.model.telco;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TelcoProductDetailIncentiveFeature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-23T11:32:06.900+11:00[Australia/Sydney]")
public class TelcoProductDetailIncentiveFeature   {
  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("description")
  private String description;

  public TelcoProductDetailIncentiveFeature displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the incentive feature
   * @return displayName
  */
  @ApiModelProperty(required = true, value = "The display name of the incentive feature")
  @NotNull


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public TelcoProductDetailIncentiveFeature description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the incentive feature
   * @return description
  */
  @ApiModelProperty(value = "The description of the incentive feature")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelcoProductDetailIncentiveFeature telcoProductDetailIncentiveFeature = (TelcoProductDetailIncentiveFeature) o;
    return Objects.equals(this.displayName, telcoProductDetailIncentiveFeature.displayName) &&
        Objects.equals(this.description, telcoProductDetailIncentiveFeature.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcoProductDetailIncentiveFeature {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
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

