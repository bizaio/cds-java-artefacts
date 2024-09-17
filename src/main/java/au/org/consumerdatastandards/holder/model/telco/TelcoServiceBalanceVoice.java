package au.org.consumerdatastandards.holder.model.telco;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Summary of voice balances. Required if voice calls are included in product plan
 */
@ApiModel(description = "Summary of voice balances. Required if voice calls are included in product plan")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2022-12-23T11:32:06.900+11:00[Australia/Sydney]")
public class TelcoServiceBalanceVoice {
    @JsonProperty("planType")
    private TelcoPlanType planType;

    @JsonProperty("national")
    private TelcoServiceBalanceVoiceNational national;

    @JsonProperty("international")
    private TelcoServiceBalanceVoiceInternational international;

    @JsonProperty("roaming")
    private TelcoServiceBalanceVoiceRoaming roaming;

    public TelcoServiceBalanceVoice planType(TelcoPlanType planType) {
        this.planType = planType;
        return this;
    }

    /**
     * Get planType
     *
     * @return planType
     */
    @ApiModelProperty(required = true,
            value = "")
    @NotNull

    @Valid

    public TelcoPlanType getPlanType() {
        return planType;
    }

    public void setPlanType(TelcoPlanType planType) {
        this.planType = planType;
    }

    public TelcoServiceBalanceVoice national(TelcoServiceBalanceVoiceNational national) {
        this.national = national;
        return this;
    }

    /**
     * Get national
     *
     * @return national
     */
    @ApiModelProperty(value = "")

    @Valid

    public TelcoServiceBalanceVoiceNational getNational() {
        return national;
    }

    public void setNational(TelcoServiceBalanceVoiceNational national) {
        this.national = national;
    }

    public TelcoServiceBalanceVoice international(TelcoServiceBalanceVoiceInternational international) {
        this.international = international;
        return this;
    }

    /**
     * Get international
     *
     * @return international
     */
    @ApiModelProperty(value = "")

    @Valid

    public TelcoServiceBalanceVoiceInternational getInternational() {
        return international;
    }

    public void setInternational(TelcoServiceBalanceVoiceInternational international) {
        this.international = international;
    }

    public TelcoServiceBalanceVoice roaming(TelcoServiceBalanceVoiceRoaming roaming) {
        this.roaming = roaming;
        return this;
    }

    /**
     * Get roaming
     *
     * @return roaming
     */
    @ApiModelProperty(value = "")

    @Valid

    public TelcoServiceBalanceVoiceRoaming getRoaming() {
        return roaming;
    }

    public void setRoaming(TelcoServiceBalanceVoiceRoaming roaming) {
        this.roaming = roaming;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TelcoServiceBalanceVoice telcoServiceBalanceVoice = (TelcoServiceBalanceVoice) o;
        return Objects.equals(this.planType, telcoServiceBalanceVoice.planType) &&
                Objects.equals(this.national, telcoServiceBalanceVoice.national) &&
                Objects.equals(this.international, telcoServiceBalanceVoice.international) &&
                Objects.equals(this.roaming, telcoServiceBalanceVoice.roaming);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planType, national, international, roaming);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TelcoServiceBalanceVoice {\n");

        sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
        sb.append("    national: ").append(toIndentedString(national)).append("\n");
        sb.append("    international: ").append(toIndentedString(international)).append("\n");
        sb.append("    roaming: ").append(toIndentedString(roaming)).append("\n");
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

