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
public class TreatmentHistory {
    private ArrayList<Treatment> treatmentList;

    public ArrayList<Treatment> getTreatmentList() {
        return treatmentList;
    }

    public void setTreatmentList(ArrayList<Treatment> treatmentList) {
        this.treatmentList = treatmentList;
    }
    
    public TreatmentHistory(){
        treatmentList = new ArrayList<Treatment>();
    }
    
    public Treatment addTreatment() {
        Treatment t = new Treatment();
        treatmentList.add(t);
        return t;
    }

    public void deleteTreatment(Treatment t) {
        treatmentList.remove(t);
    }
    
}
