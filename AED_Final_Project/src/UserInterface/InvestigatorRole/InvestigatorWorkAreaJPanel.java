/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.InvestigatorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HospitalAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClaimApprovalRequest;
import Business.WorkQueue.CustomerClaimRequest;
import Business.WorkQueue.CustomerPolicyRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.InsuranceApproverRole.VerifySelectedPolicyJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class InvestigatorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageInvestigatorJPanel
     */
      JPanel userProcessContainer;
    Enterprise enterprise;
        EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    WorkRequest req;
    
    public InvestigatorWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem system, UserAccount userAccount, Organization organization) {
        initComponents();
        
this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
                this.system = system;
        this.userAccount = userAccount;
        this.organization = organization;
        this.organization = organization;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        investigatorWorkAreaJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestsJTable = new javax.swing.JTable();
        verifyClaimJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        requestTreatmentJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        investigatorWorkAreaJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        investigatorWorkAreaJLabel.setText("Investigator Work Area");
        add(investigatorWorkAreaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 27, -1, -1));

        workRequestsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Customer Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestsJTable);
        if (workRequestsJTable.getColumnModel().getColumnCount() > 0) {
            workRequestsJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestsJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 132, -1, 90));

        verifyClaimJButton.setText("Verify Claim");
        verifyClaimJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyClaimJButtonActionPerformed(evt);
            }
        });
        add(verifyClaimJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 237, 105, 30));

        jLabel2.setText("Claim Requests");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 127, 23));

        requestTreatmentJButton.setText("Request Treatment Details");
        requestTreatmentJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTreatmentJButtonActionPerformed(evt);
            }
        });
        add(requestTreatmentJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
         public void populateTable(){
         DefaultTableModel model = (DefaultTableModel)workRequestsJTable.getModel();
         model.setRowCount(0);
             for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if (request instanceof ClaimApprovalRequest) {
                Object[] row = new Object[2];
                row[0] = request;
                row[1] = ((ClaimApprovalRequest) request).getCustomerName();
                model.addRow(row);
            }

        }
     }
         
    private void verifyClaimJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyClaimJButtonActionPerformed
        // TODO add your handling code here:
        try{
        int selectedrow = workRequestsJTable.getSelectedRow();
        if (selectedrow >= 0)
        {
              for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if (request instanceof ClaimApprovalRequest){
                         request = (ClaimApprovalRequest)workRequestsJTable.getValueAt(selectedrow, 0);
                        VerifyClaimJPanel verifyClaimJPanel = new VerifyClaimJPanel(userProcessContainer, enterprise, (ClaimApprovalRequest) request);
            userProcessContainer.add("verifyClaimJPanel", verifyClaimJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);}}

        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Please select one row","Warning" , JOptionPane.WARNING_MESSAGE);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_verifyClaimJButtonActionPerformed

    private void requestTreatmentJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTreatmentJButtonActionPerformed
        // TODO add your handling code here:
        try{
        int selectedrow = workRequestsJTable.getSelectedRow();
        if (selectedrow >= 0)
        {
            ClaimApprovalRequest request1 = (ClaimApprovalRequest)workRequestsJTable.getValueAt(selectedrow, 0);
            //HospitalAdminWorkAreaJPanel hospitalAdminWorkAreaJPanel = new HospitalAdminWorkAreaJPanel(userProcessContainer, enterprise,request1);
            //userProcessContainer.add("hospitalAdminWorkAreaJPanel", hospitalAdminWorkAreaJPanel);
            //CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            //layout.next(userProcessContainer);
              Organization org = null;
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getEnterpriseType() == Enterprise.EnterpriseType.Hospital) {
                    e.getWorkQueue().getWorkRequestList().add(request1);
                }
                for (Organization insApp : e.getOrganizationDirectory().getOrganizationList()) {
                    if (insApp instanceof HospitalAdminOrganization) {
                        org = insApp;
                        org.getWorkQueue().getWorkRequestList().add(request1);
                        userAccount.getWorkQueue().getWorkRequestList().add(request1);
                    } }}}
        
        JOptionPane.showMessageDialog(null, "Request Sent Successfully.");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Please select one row","Warning" , JOptionPane.WARNING_MESSAGE);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_requestTreatmentJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel investigatorWorkAreaJLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestTreatmentJButton;
    private javax.swing.JButton verifyClaimJButton;
    private javax.swing.JTable workRequestsJTable;
    // End of variables declaration//GEN-END:variables
}