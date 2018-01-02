/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hospital.Patient;
import Business.Hospital.PatientDirectory;
import Business.Hospital.Treatment;
import Business.Hospital.TreatmentHistory;
import Business.Network.Network;
import Business.Organization.InsuranceApproverOrganization;
import Business.Organization.InsuranceInvestigatorOrganization;
import Business.Organization.Organization;
import Business.WorkQueue.ClaimApprovalRequest;
import Business.WorkQueue.HospitalWorkRequest;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class AddTreatmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTreatmentJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    ClaimApprovalRequest request;
    HospitalWorkRequest hrequest;
    EcoSystem ecoSystem;
    private String treatmentType;
    private int treatmentAmount;
    private int medicalBill;
    private String Date;
    private int totalBill;

    AddTreatmentJPanel(JPanel userProcessContainer, Enterprise enterprise, ClaimApprovalRequest request, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.request = request;
        patientIdTextField.setText((request.getCustomerName()));
        this.ecoSystem = ecoSystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPatientTreatmentJLabel = new javax.swing.JLabel();
        patientIdJLabel = new javax.swing.JLabel();
        patientIdTextField = new javax.swing.JTextField();
        treatmentTypeJLabel = new javax.swing.JLabel();
        treatmentTypeJComboBox = new javax.swing.JComboBox<>();
        amountJLabel = new javax.swing.JLabel();
        treatmentAmountTextField = new javax.swing.JTextField();
        dateJLabel = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        medicalAmountTextField = new javax.swing.JTextField();
        amountJLabel1 = new javax.swing.JLabel();

        addPatientTreatmentJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addPatientTreatmentJLabel.setText("Add Patient Treatments ");

        patientIdJLabel.setText("Patient ID: ");

        treatmentTypeJLabel.setText("Treatment Type:");

        treatmentTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consultation", "Admitted", "Surgery" }));

        amountJLabel.setText("Treatment Amount");

        treatmentAmountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treatmentAmountTextFieldActionPerformed(evt);
            }
        });
        treatmentAmountTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                treatmentAmountTextFieldKeyTyped(evt);
            }
        });

        dateJLabel.setText("Date:");

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        medicalAmountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalAmountTextFieldActionPerformed(evt);
            }
        });
        medicalAmountTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                medicalAmountTextFieldKeyTyped(evt);
            }
        });

        amountJLabel1.setText("Medical Bill Amount:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addPatientTreatmentJLabel)
                        .addGap(316, 316, 316))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330))))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(amountJLabel1)
                        .addGap(53, 53, 53)
                        .addComponent(medicalAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(amountJLabel)
                                    .addComponent(dateJLabel))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dateTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(treatmentAmountTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(treatmentTypeJLabel)
                                    .addComponent(patientIdJLabel))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(treatmentTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(addPatientTreatmentJLabel)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIdJLabel)
                    .addComponent(patientIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(treatmentTypeJLabel)
                    .addComponent(treatmentTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountJLabel)
                    .addComponent(treatmentAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountJLabel1)
                    .addComponent(medicalAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateJLabel)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        if(!patientIdTextField.getText().isEmpty()){
                if(!treatmentAmountTextField.getText().isEmpty()){
                    if(!dateTextField.getText().isEmpty()){
                    }else{
                        JOptionPane.showMessageDialog(null,"Please Enter the Date");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Please Enter the Amount");
                }
        }
       else{
            JOptionPane.showMessageDialog(null,"Please Enter the Patient ID");
        }
        
        treatmentAmount = Integer.parseInt(treatmentAmountTextField.getText());
        medicalBill = Integer.parseInt(medicalAmountTextField.getText());
        String date = dateTextField.getText();
        String treatmentType = (String) treatmentTypeJComboBox.getSelectedItem();
        
        totalBill= treatmentAmount+ medicalBill;
        
        Patient patient = new Patient();
        patient.setPatientId(patientIdTextField.getText());
        
 
//        Treatment t = patient.getTreatmentHistory().addTreatment();
//        
//        t.setTreatmentType(treatmentType);
//        t.setTreatmentAmount(treatmentAmount);
//        t.setMedicalAmount(medicalBill);
//        t.setDate(date);
        
        JOptionPane.showMessageDialog(null,"Treatment details added Successfully");
        
        hrequest = new HospitalWorkRequest();
        hrequest.setPatient(patient);
        
        hrequest.setTreatmentAmount(treatmentAmount);
        hrequest.setTreatmentDate(date);
        hrequest.setPharmacyAmount(medicalBill);
        hrequest.setTreatmentType(treatmentType);
        hrequest.setTotalBill(totalBill);
        
        
        for (Network n : ecoSystem.getNetworkList())
         {
             for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList())
             {
                 for(Organization organization: e.getOrganizationDirectory().getOrganizationList())
                 {
                     if (organization instanceof InsuranceInvestigatorOrganization) {
                        
                        organization.getWorkQueue().getWorkRequestList().add(hrequest);
                        
                    } 
                 }
             }
         }     
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void treatmentAmountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treatmentAmountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_treatmentAmountTextFieldActionPerformed

    private void treatmentAmountTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_treatmentAmountTextFieldKeyTyped
        // TODO add your handling code here:
        char enteredText = evt.getKeyChar();
       if(!(Character.isDigit(enteredText))|| enteredText == KeyEvent.VK_BACK_SPACE || enteredText == KeyEvent.VK_DELETE)
       {
           evt.consume();
       }
    }//GEN-LAST:event_treatmentAmountTextFieldKeyTyped

    private void medicalAmountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalAmountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicalAmountTextFieldActionPerformed

    private void medicalAmountTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medicalAmountTextFieldKeyTyped
        // TODO add your handling code here:
         char enteredText = evt.getKeyChar();
        if(!(Character.isDigit(enteredText))|| enteredText == KeyEvent.VK_BACK_SPACE || enteredText == KeyEvent.VK_DELETE)
       {
           evt.consume();
       }
    }//GEN-LAST:event_medicalAmountTextFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addPatientTreatmentJLabel;
    private javax.swing.JLabel amountJLabel;
    private javax.swing.JLabel amountJLabel1;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel dateJLabel;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JTextField medicalAmountTextField;
    private javax.swing.JLabel patientIdJLabel;
    private javax.swing.JTextField patientIdTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField treatmentAmountTextField;
    private javax.swing.JComboBox<String> treatmentTypeJComboBox;
    private javax.swing.JLabel treatmentTypeJLabel;
    // End of variables declaration//GEN-END:variables
}