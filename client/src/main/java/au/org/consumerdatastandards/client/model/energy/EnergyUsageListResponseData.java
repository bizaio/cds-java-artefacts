package au.org.consumerdatastandards.client.model.energy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EnergyUsageListResponseData
 */
public class EnergyUsageListResponseData {
    private List<EnergyUsageRead> reads = new ArrayList<>();

    public EnergyUsageListResponseData reads(List<EnergyUsageRead> reads) {
        this.reads = reads;
        return this;
    }

    public EnergyUsageListResponseData addReadsItem(EnergyUsageRead readsItem) {
        this.reads.add(readsItem);
        return this;
    }

    /**
     * Array of meter reads
     *
     * @return reads
     */
    public List<EnergyUsageRead> getReads() {
        return reads;
    }

    public void setReads(List<EnergyUsageRead> reads) {
        this.reads = reads;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnergyUsageListResponseData energyUsageListResponseData = (EnergyUsageListResponseData) o;
        return Objects.equals(this.reads, energyUsageListResponseData.reads);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reads);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnergyUsageListResponseData {\n");
        sb.append("    reads: ").append(toIndentedString(reads)).append("\n");
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