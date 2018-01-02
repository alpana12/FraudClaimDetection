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
public class ClaimDirectory {
       private ArrayList<Claim> claimList;
    
    public ClaimDirectory(){
        claimList = new ArrayList<Claim>();
    }

    public ArrayList<Claim> getClaimList() {
        return claimList;
    }

    public void setClaimList(ArrayList<Claim> claimList) {
        this.claimList = claimList;
    }

    public Claim addClaim() {
        Claim c = new Claim();
        claimList.add(c);
        return c;
    }
    
}
