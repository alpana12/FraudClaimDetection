/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Hospital.Patient;
import Business.Insurance.Claim;
import Business.Insurance.ClaimDirectory;
import Business.Insurance.Policy;
import Business.Insurance.PolicyDirectory;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Customer extends Person {
    
    private String username;
    private String password;
    private Patient patient;
    private PolicyDirectory policyDirectory;
    private ClaimDirectory claimDirectory;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public PolicyDirectory getPolicyDirectory() {
        return policyDirectory;
    }

    public void setPolicyDirectory(PolicyDirectory policyDirectory) {
        this.policyDirectory = policyDirectory;
    }

    public ClaimDirectory getClaimDirectory() {
        return claimDirectory;
    }

    public void setClaimDirectory(ClaimDirectory claimDirectory) {
        this.claimDirectory = claimDirectory;
    }
    

}
