/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


//import Business.Role.HospitalAdminRole;
import Business.Hospital.Treatment;
import Business.Role.HospitalAdminRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class HospitalAdminOrganization extends Organization {
      private ArrayList<Role> roles;
            public HospitalAdminOrganization() {
        super(Organization.Type.HospitalAdmin.getValue());

    }
            
    
    
    @Override
    public ArrayList<Role> getSupportedRole()  {
        roles = new ArrayList<>();
        roles.add(new HospitalAdminRole());
        return (ArrayList<Role>) roles;
	}
}
