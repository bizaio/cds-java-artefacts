package au.org.consumerdatastandards.holder.model.energy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Detail on the plan applicable to this account
 */
@ApiModel(description = "Detail on the plan applicable to this account")
@Entity
@Table(name = "e_account_plan_detail")
public class EnergyAccountDetailPlanDetailV3 {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @JsonIgnore
    private String id;

    private FuelTypeEnum fuelType;

    private Boolean isContingentPlan = false;

    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "e_account_plan_metering_charges",
            joinColumns = @JoinColumn(name = "acct_plan_detail_id"),
            inverseJoinColumns = @JoinColumn(name = "metering_charge_id"))
    private List<MeteringCharges> meteringCharges = null;

    @OneToOne(cascade = CascadeType.ALL)
    private EnergyPlanContractV2 gasContract;

    @OneToOne(cascade = CascadeType.ALL)
    private EnergyPlanContractV2 electricityContract;

    public EnergyAccountDetailPlanDetailV3 fuelType(FuelTypeEnum fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The fuel types covered by the plan
     *
     * @return fuelType
     */
    @ApiModelProperty(required = true, value = "The fuel types covered by the plan")
    @NotNull
    public FuelTypeEnum getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelTypeEnum fuelType) {
        this.fuelType = fuelType;
    }

    public EnergyAccountDetailPlanDetailV3 isContingentPlan(Boolean isContingentPlan) {
        this.isContingentPlan = isContingentPlan;
        return this;
    }

    /**
     * Flag that indicates that the plan is contingent on the customer taking up an alternate fuel plan from the same retailer (for instance, if the fuelType is ELECTRICITY then a GAS plan from the same retailer must be taken up). Has no meaning if the plan has a fuelType of DUAL. If absent the value is assumed to be false
     *
     * @return isContingentPlan
     */
    @ApiModelProperty(value = "Flag that indicates that the plan is contingent on the customer taking up an alternate fuel plan from the same retailer (for instance, if the fuelType is ELECTRICITY then a GAS plan from the same retailer must be taken up). Has no meaning if the plan has a fuelType of DUAL. If absent the value is assumed to be false")
    public Boolean getIsContingentPlan() {
        return isContingentPlan;
    }

    public void setIsContingentPlan(Boolean isContingentPlan) {
        this.isContingentPlan = isContingentPlan;
    }

    public EnergyAccountDetailPlanDetailV3 meteringCharges(List<MeteringCharges> meteringCharges) {
        this.meteringCharges = meteringCharges;
        return this;
    }

    public EnergyAccountDetailPlanDetailV3 addMeteringChargesItem(MeteringCharges meteringChargesItem) {
        if (this.meteringCharges == null) {
            this.meteringCharges = new ArrayList<>();
        }
        this.meteringCharges.add(meteringChargesItem);
        return this;
    }

    /**
     * Charges for metering included in the plan
     *
     * @return meteringCharges
     */
    @ApiModelProperty(value = "Charges for metering included in the plan")
    @Valid
    public List<MeteringCharges> getMeteringCharges() {
        return meteringCharges;
    }

    public void setMeteringCharges(List<MeteringCharges> meteringCharges) {
        this.meteringCharges = meteringCharges;
    }

    public EnergyAccountDetailPlanDetailV3 gasContract(EnergyPlanContractV2 gasContract) {
        this.gasContract = gasContract;
        return this;
    }

    /**
     * Get gasContract
     *
     * @return gasContract
     */
    @ApiModelProperty(value = "")
    @Valid
    public EnergyPlanContractV2 getGasContract() {
        return gasContract;
    }

    public void setGasContract(EnergyPlanContractV2 gasContract) {
        this.gasContract = gasContract;
    }

    public EnergyAccountDetailPlanDetailV3 electricityContract(EnergyPlanContractV2 electricityContract) {
        this.electricityContract = electricityContract;
        return this;
    }

    /**
     * Get electricityContract
     *
     * @return electricityContract
     */
    @ApiModelProperty(value = "")
    @Valid
    public EnergyPlanContractV2 getElectricityContract() {
        return electricityContract;
    }

    public void setElectricityContract(EnergyPlanContractV2 electricityContract) {
        this.electricityContract = electricityContract;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnergyAccountDetailPlanDetailV3 energyAccountDetailPlanDetail = (EnergyAccountDetailPlanDetailV3) o;
        return Objects.equals(this.fuelType, energyAccountDetailPlanDetail.fuelType) &&
                Objects.equals(this.isContingentPlan, energyAccountDetailPlanDetail.isContingentPlan) &&
                Objects.equals(this.meteringCharges, energyAccountDetailPlanDetail.meteringCharges) &&
                Objects.equals(this.gasContract, energyAccountDetailPlanDetail.gasContract) &&
                Objects.equals(this.electricityContract, energyAccountDetailPlanDetail.electricityContract);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuelType, isContingentPlan, meteringCharges, gasContract, electricityContract);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnergyAccountDetailPlanDetailV3 {\n");
        sb.append("    fuelType: ").append(toIndentedString(fuelType)).append("\n");
        sb.append("    isContingentPlan: ").append(toIndentedString(isContingentPlan)).append("\n");
        sb.append("    meteringCharges: ").append(toIndentedString(meteringCharges)).append("\n");
        sb.append("    gasContract: ").append(toIndentedString(gasContract)).append("\n");
        sb.append("    electricityContract: ").append(toIndentedString(electricityContract)).append("\n");
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
