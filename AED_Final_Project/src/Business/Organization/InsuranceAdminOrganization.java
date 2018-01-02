/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InsuranceAdminRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class InsuranceAdminOrganization extends Organization {
    private ArrayList<Role> roles;        
    public InsuranceAdminOrganization() {
        super(Organization.Type.InsuranceAdmin.getValue());
 
    }
    
    @Override
    public ArrayList<Role> getSupportedRole()  {
        roles = new ArrayList<>();
        roles.add(new InsuranceAdminRole());
        return (ArrayList<Role>) roles;
	}
}
