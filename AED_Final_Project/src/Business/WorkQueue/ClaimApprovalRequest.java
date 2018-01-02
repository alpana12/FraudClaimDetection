/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.Insurance.Claim;
import Business.Insurance.Policy;

/**
 *
 * @author hp
 */
public class ClaimApprovalRequest extends WorkRequest {
    
     
    private String customerName;
    private Claim claim;
    private String claimRequestDate;
       private String claimRequestId;
              private String sumInsured;
       private String claimAmt;

    public String getClaimRequestDate() {
        return claimRequestDate;
    }

    public void setClaimRequestDate(String claimRequestDate) {
        this.claimRequestDate = claimRequestDate;
    }

    public String getClaimRequestId() {
        return claimRequestId;
    }

    public void setClaimRequestId(String claimRequestId) {
        this.claimRequestId = claimRequestId;
    }

    public String getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(String sumInsured) {
        this.sumInsured = sumInsured;
    }

    public String getClaimAmt() {
        return claimAmt;
    }

    public void setClaimAmt(String claimAmt) {
        this.claimAmt = claimAmt;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
       private Customer customer;
           

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public Claim getClaim() {
        return claim;
    }

    public void setClaim(Claim claim) {
        this.claim = claim;
    }
       
}
