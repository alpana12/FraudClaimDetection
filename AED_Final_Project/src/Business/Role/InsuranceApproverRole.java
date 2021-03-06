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
import Business.WorkQueue.CustomerPolicyRequest;
import UserInterface.InsuranceApproverRole.InsuranceApproverWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class InsuranceApproverRole extends Role {

    public InsuranceApproverRole() {
        super(RoleType.InsuranceApprover.getValue());
    }
        
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InsuranceApproverWorkAreaJPanel(userProcessContainer, enterprise, business, account, organization);
    }
}
