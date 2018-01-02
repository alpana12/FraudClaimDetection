/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class PatientDirectory {
    private ArrayList<Patient> patientList;
    
    public PatientDirectory(){
        patientList = new ArrayList<Patient>();
    }
    
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient searchPatientId(Patient patientId){
        for(Patient patient : patientList){
            if(patient.getPatientId().equals(patient)){
            return patient;
        }
        }
        return null;
    }
    
    public Patient checkIfPatientIsUnique(String patientId){
        for(Patient pd : patientList){
            if(pd.getPatientId().equalsIgnoreCase(patientId)){
                return pd;
            }
        }
        return null;
    }
    
}
