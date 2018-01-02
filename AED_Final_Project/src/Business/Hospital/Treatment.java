/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

/**
 *
 * @author hp
 */
public class Treatment {
    private String treatmentID;
    private String patientID;
    private String treatmentType;
    private String details;
    private int treatmentAmount;
    private int medicalAmount;
    private String date;

    public String getTreatmentID() {
        return treatmentID;
    }

    public void setTreatmentID(String treatmentID) {
        this.treatmentID = treatmentID;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(String treatmentType) {
        this.treatmentType = treatmentType;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public int getTreatmentAmount() {
        return treatmentAmount;
    }

    public void setTreatmentAmount(int treatmentAmount) {
        this.treatmentAmount = treatmentAmount;
    }

    public int getMedicalAmount() {
        return medicalAmount;
    }

    public void setMedicalAmount(int medicalAmount) {
        this.medicalAmount = medicalAmount;
    }
    
}