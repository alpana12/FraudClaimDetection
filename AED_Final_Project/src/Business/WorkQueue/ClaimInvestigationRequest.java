/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Insurance.Claim;
import Business.Customer.Customer;

/**
 *
 * @author hp
 * Request sent from agent to investigator when he suspects that its a fraud claim
 */
public class ClaimInvestigationRequest extends WorkRequest {
    private Claim claim;
    private Customer customer;

    public Claim getClaim() {
        return claim;
    }

    public void setClaim(Claim claim) {
        this.claim = claim;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
}
