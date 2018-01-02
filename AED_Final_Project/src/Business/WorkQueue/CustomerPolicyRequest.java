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
public class CustomerPolicyRequest extends WorkRequest{
       private Date policyRequestDate;
       private int policyId;
       private UserAccount custName;
       private String sumInsured;
       private String premiumAmt;
       private Customer customer;
       private Policy policy;

    public Date getPolicyRequestDate() {
        return policyRequestDate;
    }

    public void setPolicyRequestDate(Date policyRequestDate) {
        this.policyRequestDate = policyRequestDate;
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

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public UserAccount getcustName() {
        return custName;
    }

    public void setcustName(UserAccount custName) {
        this.custName = custName;
    }

       
}
