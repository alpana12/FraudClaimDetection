/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class PolicyDirectory {
       private ArrayList<Policy> policyList;
    
    public PolicyDirectory(){
        policyList = new ArrayList<Policy>();
    }

    public ArrayList<Policy> getPolicyList() {
        return policyList;
    }

    public void setPolicyList(ArrayList<Policy> policyList) {
        this.policyList = policyList;
    }
    
    public Policy addPolicy() {
        Policy p = new Policy();
        policyList.add(p);
        return p;
    }
}
