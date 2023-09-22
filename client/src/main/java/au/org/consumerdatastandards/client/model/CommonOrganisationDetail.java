/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model;

import java.util.List;
import java.util.Objects;

public class CommonOrganisationDetail extends CommonOrganisation {

    private List<CommonPhysicalAddressWithPurpose> physicalAddresses;

    /**
     * Array is mandatory but may be empty if no valid addresses are held. One and only one address may have the purpose of REGISTERED. Zero or one, and no more than one, record may have the purpose of MAIL. If zero then the REGISTERED address is to be used for mail
     * @return physicalAddresses
     */
    public List<CommonPhysicalAddressWithPurpose> getPhysicalAddresses() {
        return physicalAddresses;
    }

    public void setPhysicalAddresses(List<CommonPhysicalAddressWithPurpose> physicalAddresses) {
        this.physicalAddresses = physicalAddresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommonOrganisationDetail commonOrganisationDetail = (CommonOrganisationDetail) o;
        return Objects.equals(this.physicalAddresses, commonOrganisationDetail.physicalAddresses) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            physicalAddresses,
            super.hashCode());
    }

    @Override
    public String toString() {
        return "class CommonOrganisationDetail {\n" +
            "   lastUpdateTime: " + toIndentedString(getLastUpdateTime()) + "\n" + 
            "   agentFirstName: " + toIndentedString(getAgentFirstName()) + "\n" + 
            "   agentLastName: " + toIndentedString(getAgentLastName()) + "\n" + 
            "   agentRole: " + toIndentedString(getAgentRole()) + "\n" + 
            "   businessName: " + toIndentedString(getBusinessName()) + "\n" + 
            "   legalName: " + toIndentedString(getLegalName()) + "\n" + 
            "   shortName: " + toIndentedString(getShortName()) + "\n" + 
            "   abn: " + toIndentedString(getAbn()) + "\n" + 
            "   acn: " + toIndentedString(getAcn()) + "\n" + 
            "   isACNCRegistered: " + toIndentedString(getIsACNCRegistered()) + "\n" + 
            "   industryCode: " + toIndentedString(getIndustryCode()) + "\n" + 
            "   organisationType: " + toIndentedString(getOrganisationType()) + "\n" + 
            "   registeredCountry: " + toIndentedString(getRegisteredCountry()) + "\n" + 
            "   establishmentDate: " + toIndentedString(getEstablishmentDate()) + "\n" + 
            "   physicalAddresses: " + toIndentedString(physicalAddresses) + "\n" + 
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
