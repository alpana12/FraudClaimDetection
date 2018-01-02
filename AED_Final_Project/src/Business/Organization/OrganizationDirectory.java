/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
//        if (type.getValue().equals(Organization.Type.Customer.getValue())){
//           organization = new CustomerOrganization();
//            organizationList.add(organization);
//        }
//        else 
        if (type.getValue().equals(Organization.Type.HospitalAdmin.getValue())){
                organization = new HospitalAdminOrganization();
                organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.InsuranceAdmin.getValue())){
                organization = new InsuranceAdminOrganization();
                organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.InsuranceAgent.getValue())){
                organization = new InsuranceAgentOrganization();
                organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.InsuranceApprover.getValue())){
                organization = new InsuranceApproverOrganization();
                organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.InsuranceInvestigator.getValue())){
                organization = new InsuranceInvestigatorOrganization();
                organizationList.add(organization);
        }
       else if (type.getValue().equals(Organization.Type.Customer.getValue())){
                organization = new CustomerOrganization();
                organizationList.add(organization);
        }
        return organization;
    }
}
