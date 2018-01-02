/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.Insurance.Policy;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author hp
 */
public class ApprovalRequest extends WorkRequest{

    
    //private CustomerPolicyRequest customerPolicyRequest;
    private String customerName;
    private Policy policy;
     private Date policyRequestDate;
       private UserAccount custName;
       private String sumInsured;
       private String premiumAmt;
       private Customer customer;

    public Date getPolicyRequestDate() {
        return policyRequestDate;
    }

    public void setPolicyRequestDate(Date policyRequestDate) {
        this.policyRequestDate = policyRequestDate;
    }

    public UserAccount getCustName() {
        return custName;
    }

    public void setCustName(UserAccount custName) {
        this.custName = custName;
    }

    public String getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(String sumInsured) {
        this.sumInsured = sumInsured;
    }

    public String getPremiumAmt() {
        return premiumAmt;
    }

    public void setPremiumAmt(String premiumAmt) {
        this.premiumAmt = premiumAmt;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    
    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }
       
}

