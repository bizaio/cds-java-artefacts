package au.org.consumerdatastandards.holder.model.energy;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Usage data registers available from the meter
 */
@ApiModel(description = "Usage data registers available from the meter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2022-01-11T14:03:27.755+11:00[Australia/Sydney]")
public class EnergyServicePointDetailMetersRegisters {
    @JsonProperty("registerId")
    private String registerId;

    @JsonProperty("registerSuffix")
    private String registerSuffix;

    @JsonProperty("averagedDailyLoad")
    private BigDecimal averagedDailyLoad;

    /**
     * Indicates the consumption type of register
     */
    public enum RegisterConsumptionTypeEnum {
        INTERVAL("INTERVAL"),

        BASIC("BASIC"),

        PROFILE_DATA("PROFILE_DATA"),

        ACTIVE_IMPORT("ACTIVE_IMPORT"),

        ACTIVE("ACTIVE"),

        REACTIVE_IMPORT("REACTIVE_IMPORT"),

        REACTIVE("REACTIVE");

        private String value;

        RegisterConsumptionTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RegisterConsumptionTypeEnum fromValue(String value) {
            for (RegisterConsumptionTypeEnum b : RegisterConsumptionTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("registerConsumptionType")
    private RegisterConsumptionTypeEnum registerConsumptionType;

    @JsonProperty("networkTariffCode")
    private String networkTariffCode;

    @JsonProperty("unitOfMeasure")
    private String unitOfMeasure;

    /**
     * Code to identify the time validity of register contents
     */
    public enum TimeOfDayEnum {
        ALLDAY("ALLDAY"),

        INTERVAL("INTERVAL"),

        PEAK("PEAK"),

        BUSINESS("BUSINESS"),

        SHOULDER("SHOULDER"),

        EVENING("EVENING"),

        OFFPEAK("OFFPEAK"),

        CONTROLLED("CONTROLLED"),

        DEMAND("DEMAND");

        private String value;

        TimeOfDayEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TimeOfDayEnum fromValue(String value) {
            for (TimeOfDayEnum b : TimeOfDayEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("timeOfDay")
    private TimeOfDayEnum timeOfDay;

    @JsonProperty("multiplier")
    private BigDecimal multiplier;

    @JsonProperty("controlledLoad")
    private Boolean controlledLoad;

    /**
     * Actual/Subtractive Indicator. Note the details of enumeration values below: <ul><li>**ACTUAL** implies volume of energy actually metered between two dates</li><li>**CUMULATIVE** indicates a meter reading for a specific date. A second Meter Reading is required to determine the consumption between those two Meter Reading dates</li></ul>
     */
    public enum ConsumptionTypeEnum {
        ACTUAL("ACTUAL"),

        CUMULATIVE("CUMULATIVE");

        private String value;

        ConsumptionTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ConsumptionTypeEnum fromValue(String value) {
            for (ConsumptionTypeEnum b : ConsumptionTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("consumptionType")
    private ConsumptionTypeEnum consumptionType;

    public EnergyServicePointDetailMetersRegisters registerId(String registerId) {
        this.registerId = registerId;
        return this;
    }

    /**
     * Unique identifier of the register within this service point.  Is not globally unique
     *
     * @return registerId
     */
    @ApiModelProperty(required = true,
            value = "Unique identifier of the register within this service point.  Is not globally unique")
    @NotNull


    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public EnergyServicePointDetailMetersRegisters registerSuffix(String registerSuffix) {
        this.registerSuffix = registerSuffix;
        return this;
    }

    /**
     * Register suffix of the meter register where the meter reads are obtained
     *
     * @return registerSuffix
     */
    @ApiModelProperty(required = true,
            value = "Register suffix of the meter register where the meter reads are obtained")
    @NotNull


    public String getRegisterSuffix() {
        return registerSuffix;
    }

    public void setRegisterSuffix(String registerSuffix) {
        this.registerSuffix = registerSuffix;
    }

    public EnergyServicePointDetailMetersRegisters averagedDailyLoad(BigDecimal averagedDailyLoad) {
        this.averagedDailyLoad = averagedDailyLoad;
        return this;
    }

    /**
     * The energy delivered through a connection point or metering point over an extended period normalised to a 'per day' basis (kWh). This value is calculated annually.
     *
     * @return averagedDailyLoad
     */
    @ApiModelProperty(value = "The energy delivered through a connection point or metering point over an extended period normalised to a 'per day' basis (kWh). This value is calculated annually.")

    @Valid

    public BigDecimal getAveragedDailyLoad() {
        return averagedDailyLoad;
    }

    public void setAveragedDailyLoad(BigDecimal averagedDailyLoad) {
        this.averagedDailyLoad = averagedDailyLoad;
    }

    public EnergyServicePointDetailMetersRegisters registerConsumptionType(RegisterConsumptionTypeEnum registerConsumptionType) {
        this.registerConsumptionType = registerConsumptionType;
        return this;
    }

    /**
     * Indicates the consumption type of register
     *
     * @return registerConsumptionType
     */
    @ApiModelProperty(required = true,
            value = "Indicates the consumption type of register")
    @NotNull


    public RegisterConsumptionTypeEnum getRegisterConsumptionType() {
        return registerConsumptionType;
    }

    public void setRegisterConsumptionType(RegisterConsumptionTypeEnum registerConsumptionType) {
        this.registerConsumptionType = registerConsumptionType;
    }

    public EnergyServicePointDetailMetersRegisters networkTariffCode(String networkTariffCode) {
        this.networkTariffCode = networkTariffCode;
        return this;
    }

    /**
     * The Network Tariff Code is a free text field containing a code supplied and published by the local network service provider
     *
     * @return networkTariffCode
     */
    @ApiModelProperty(value = "The Network Tariff Code is a free text field containing a code supplied and published by the local network service provider")


    public String getNetworkTariffCode() {
        return networkTariffCode;
    }

    public void setNetworkTariffCode(String networkTariffCode) {
        this.networkTariffCode = networkTariffCode;
    }

    public EnergyServicePointDetailMetersRegisters unitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
        return this;
    }

    /**
     * The unit of measure for data held in this register
     *
     * @return unitOfMeasure
     */
    @ApiModelProperty(value = "The unit of measure for data held in this register")


    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public EnergyServicePointDetailMetersRegisters timeOfDay(TimeOfDayEnum timeOfDay) {
        this.timeOfDay = timeOfDay;
        return this;
    }

    /**
     * Code to identify the time validity of register contents
     *
     * @return timeOfDay
     */
    @ApiModelProperty(value = "Code to identify the time validity of register contents")


    public TimeOfDayEnum getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(TimeOfDayEnum timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public EnergyServicePointDetailMetersRegisters multiplier(BigDecimal multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    /**
     * Multiplier required to take a register value and turn it into a value representing billable energy
     *
     * @return multiplier
     */
    @ApiModelProperty(value = "Multiplier required to take a register value and turn it into a value representing billable energy")

    @Valid

    public BigDecimal getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(BigDecimal multiplier) {
        this.multiplier = multiplier;
    }

    public EnergyServicePointDetailMetersRegisters controlledLoad(Boolean controlledLoad) {
        this.controlledLoad = controlledLoad;
        return this;
    }

    /**
     * Indicates whether the energy recorded by this register is created under a Controlled Load regime. ControlledLoad field will have 'No' if register does not relate to a Controlled Load.  If the register relates to a Controlled Load, it should contain a description of the Controlled Load regime. ControlledLoad field will have 'No' if register does not relate to a Controlled Load, “Yes” if register relates to a Controlled Load If absent the status is unknown.
     *
     * @return controlledLoad
     */
    @ApiModelProperty(value = "Indicates whether the energy recorded by this register is created under a Controlled Load regime. ControlledLoad field will have 'No' if register does not relate to a Controlled Load.  If the register relates to a Controlled Load, it should contain a description of the Controlled Load regime. ControlledLoad field will have 'No' if register does not relate to a Controlled Load, “Yes” if register relates to a Controlled Load If absent the status is unknown. ")


    public Boolean getControlledLoad() {
        return controlledLoad;
    }

    public void setControlledLoad(Boolean controlledLoad) {
        this.controlledLoad = controlledLoad;
    }

    public EnergyServicePointDetailMetersRegisters consumptionType(ConsumptionTypeEnum consumptionType) {
        this.consumptionType = consumptionType;
        return this;
    }

    /**
     * Actual/Subtractive Indicator. Note the details of enumeration values below: <ul><li>**ACTUAL** implies volume of energy actually metered between two dates</li><li>**CUMULATIVE** indicates a meter reading for a specific date. A second Meter Reading is required to determine the consumption between those two Meter Reading dates</li></ul>
     *
     * @return consumptionType
     */
    @ApiModelProperty(value = "Actual/Subtractive Indicator. Note the details of enumeration values below: <ul><li>**ACTUAL** implies volume of energy actually metered between two dates</li><li>**CUMULATIVE** indicates a meter reading for a specific date. A second Meter Reading is required to determine the consumption between those two Meter Reading dates</li></ul>")


    public ConsumptionTypeEnum getConsumptionType() {
        return consumptionType;
    }

    public void setConsumptionType(ConsumptionTypeEnum consumptionType) {
        this.consumptionType = consumptionType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnergyServicePointDetailMetersRegisters energyServicePointDetailMetersRegisters = (EnergyServicePointDetailMetersRegisters) o;
        return Objects.equals(this.registerId, energyServicePointDetailMetersRegisters.registerId) &&
                Objects.equals(this.registerSuffix, energyServicePointDetailMetersRegisters.registerSuffix) &&
                Objects.equals(this.averagedDailyLoad, energyServicePointDetailMetersRegisters.averagedDailyLoad) &&
                Objects.equals(this.registerConsumptionType, energyServicePointDetailMetersRegisters.registerConsumptionType) &&
                Objects.equals(this.networkTariffCode, energyServicePointDetailMetersRegisters.networkTariffCode) &&
                Objects.equals(this.unitOfMeasure, energyServicePointDetailMetersRegisters.unitOfMeasure) &&
                Objects.equals(this.timeOfDay, energyServicePointDetailMetersRegisters.timeOfDay) &&
                Objects.equals(this.multiplier, energyServicePointDetailMetersRegisters.multiplier) &&
                Objects.equals(this.controlledLoad, energyServicePointDetailMetersRegisters.controlledLoad) &&
                Objects.equals(this.consumptionType, energyServicePointDetailMetersRegisters.consumptionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registerId, registerSuffix, averagedDailyLoad, registerConsumptionType, networkTariffCode, unitOfMeasure, timeOfDay, multiplier, controlledLoad, consumptionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnergyServicePointDetailMetersRegisters {\n");

        sb.append("    registerId: ").append(toIndentedString(registerId)).append("\n");
        sb.append("    registerSuffix: ").append(toIndentedString(registerSuffix)).append("\n");
        sb.append("    averagedDailyLoad: ").append(toIndentedString(averagedDailyLoad)).append("\n");
        sb.append("    registerConsumptionType: ").append(toIndentedString(registerConsumptionType)).append("\n");
        sb.append("    networkTariffCode: ").append(toIndentedString(networkTariffCode)).append("\n");
        sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
        sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
        sb.append("    multiplier: ").append(toIndentedString(multiplier)).append("\n");
        sb.append("    controlledLoad: ").append(toIndentedString(controlledLoad)).append("\n");
        sb.append("    consumptionType: ").append(toIndentedString(consumptionType)).append("\n");
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
