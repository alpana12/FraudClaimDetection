/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public  abstract class Role {
        private String name;

    public enum RoleType{
        SystemAdmin("System Admin Role"),
        Customer("Customer"),
        HospitalAdmin("Hospital Admin"),
        InsuranceAdmin("Insurance Admin"),
        InsuranceAgent("Insurance Agent"),
        InsuranceApprover("Insurance Approver"),
        InsuranceInvestigator("Insurance Investigator");

        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

 @Override
        public String toString() {
            return value;
        }
    }
    
        public Role(String name)
    {
        this.name=name;
    }
    
    
            public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

     @Override
    public String toString() {
        return name;
    }
}
