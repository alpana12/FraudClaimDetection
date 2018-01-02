/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.Random;

/**
 *
 * @author hp
 */
public class VitalSigns {
    private int systolicBP = 0;
    private int diastolicBP = 0;
    private int hdlCholestrol = 0;
    private int ldlCholestrol = 0;
    private boolean diabetic;
    private boolean smoking;

    public int getSystolicBP() {
        return systolicBP;
    }

    public void setSystolicBP(int systolicBP) {
        this.systolicBP = systolicBP;
    }

    public int getDiastolicBP() {
        return diastolicBP;
    }

    public void setDiastolicBP(int diastolicBP) {
        this.diastolicBP = diastolicBP;
    }

    public int getHdlCholestrol() {
        return hdlCholestrol;
    }

    public void setHdlCholestrol(int hdlCholestrol) {
        this.hdlCholestrol = hdlCholestrol;
    }

    public int getLdlCholestrol() {
        return ldlCholestrol;
    }

    public void setLdlCholestrol(int ldlCholestrol) {
        this.ldlCholestrol = ldlCholestrol;
    }

    public boolean isDiabetic() {
        return diabetic;
    }

    public void setDiabetic(boolean diabetic) {
        this.diabetic = diabetic;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    
    public void setVitalSigns(){
        Random random = new Random();
        setDiabetic(random.nextBoolean());
        setSmoking(random.nextBoolean());
        setSystolicBP(random.nextInt(80)+1);
        setDiastolicBP(random.nextInt(130)+10);
        setHdlCholestrol(random.nextInt(7)+1);
        setLdlCholestrol(random.nextInt(9)+1);
    }    
    
    public static int randomInt(int min, int max) {
       return new Random().ints(min, max + 1).distinct().limit(1).toArray()[0];
   }
}
