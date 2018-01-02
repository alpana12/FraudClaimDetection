/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class EcoSystem extends Organization {
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    public boolean checkIfUsernameIsUnique(String username) {

      /**  if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }*/ //need to correct this
        UserAccount ua = this.getUserAccountDirectory().checkIfUsernameIsUnique(username);
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        if(ua == null){
            for(Network network : this.getNetworkList()){
                for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                    ua = enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(username);
                    if(ua == null){
                        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                            ua = organization.getUserAccountDirectory().checkIfUsernameIsUnique(username);
                            if(ua != null){
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }
                    }else{
                        inEnterprise = enterprise;
                        break;
                    }
                    if(inOrganization != null){
                        break;
                    }
                }
                if(inEnterprise != null){
                    break;
                }
            }
        }    
            
        if(ua == null){
            return true;
        }else{
            return false;
        }
        
    }
    
}
