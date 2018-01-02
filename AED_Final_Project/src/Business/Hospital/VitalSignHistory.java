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
public class VitalSignHistory {
    
    private ArrayList<VitalSigns> vitalSignList;

    public ArrayList<VitalSigns> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSigns> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    public VitalSignHistory(){
        vitalSignList = new ArrayList<VitalSigns>();
    }
    
    public VitalSigns addVitalSigns() {
        VitalSigns vs = new VitalSigns();
        vitalSignList.add(vs);
        return vs;
    }

    public void deleteVitalSign(VitalSigns v) {
        vitalSignList.remove(v);
    }
    
}
