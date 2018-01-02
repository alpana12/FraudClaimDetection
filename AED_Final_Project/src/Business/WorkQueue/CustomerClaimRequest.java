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
public class CustomerClaimRequest extends WorkRequest {
       private String claimRequestDate;
       private String claimRequestId;
       private CustomerPolicyRequest customerPolicyRequest;
       private Claim claim;
              private String sumInsured;
       private String claimAmt;
       private Customer customer;
              private int claimId;

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

    public CustomerPolicyRequest getCustomerPolicyRequest() {
        return customerPolicyRequest;
    }

    public void setCustomerPolicyRequest(CustomerPolicyRequest customerPolicyRequest) {
        this.customerPolicyRequest = customerPolicyRequest;
    }

    public Claim getClaim() {
        return claim;
    }

    public void setClaim(Claim claim) {
        this.claim = claim;
    }

    public int getClaimId() {
        return claimId;
    }

    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    
          
       
}
