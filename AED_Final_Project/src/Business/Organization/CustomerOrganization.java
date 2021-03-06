/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.Role.CustomerRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class CustomerOrganization extends Organization {
        private ArrayList<Role> roles;
        
    public CustomerOrganization() {
        super(Organization.Type.Customer.getValue());
   
    }
    
    @Override
    public ArrayList<Role> getSupportedRole()  {
        roles = new ArrayList<>();
        roles.add(new CustomerRole());
        return (ArrayList<Role>) roles;
	}
}
