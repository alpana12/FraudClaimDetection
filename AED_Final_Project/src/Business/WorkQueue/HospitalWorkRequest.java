/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Hospital.Patient;
import Business.Hospital.PatientDirectory;
import Business.Hospital.VitalSignHistory;

/**
 *
 * @author hp
 */
public class HospitalWorkRequest extends WorkRequest{
    private Patient patient;
    private VitalSignHistory vitalSignHistory; 
    private int sbp;
    private int dbp;
    private int hdlC;
    private int ldlC;
    private int treatmentAmount;
    private int pharmacyAmount;
    private String treatmentType;
    private String treatmentDate;
    private int totalBill;

    public int getSbp() {
        return sbp;
    }

    public int getTreatmentAmount() {
        return treatmentAmount;
    }

    public void setTreatmentAmount(int treatmentAmount) {
        this.treatmentAmount = treatmentAmount;
    }

    public int getPharmacyAmount() {
        return pharmacyAmount;
    }

    public void setPharmacyAmount(int pharmacyAmount) {
        this.pharmacyAmount = pharmacyAmount;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(String treatmentType) {
        this.treatmentType = treatmentType;
    }

    public String getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(String treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public void setSbp(int sbp) {
        this.sbp = sbp;
    }

    public int getDbp() {
        return dbp;
    }

    public void setDbp(int dbp) {
        this.dbp = dbp;
    }

    public int getHdlC() {
        return hdlC;
    }

    public void setHdlC(int hdlC) {
        this.hdlC = hdlC;
    }

    public int getLdlC() {
        return ldlC;
    }

    public void setLdlC(int ldlC) {
        this.ldlC = ldlC;
    }
    

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
    
    
}
