/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Person.Person;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author hp
 */
public class ConfigureASystem {
    
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        String name = "ARA";
        
        
        //Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        Person person = system.getPersonDirectory().createPerson(name);
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", "sysadmin@a.com", person, new SystemAdminRole());
        
        return system;
    }
    
}
