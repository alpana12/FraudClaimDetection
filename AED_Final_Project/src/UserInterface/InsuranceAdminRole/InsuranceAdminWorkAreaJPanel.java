/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.InsuranceAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author anusha
 */
public class InsuranceAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceAdminWorkArea
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;

    public InsuranceAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insuranceAdminJLabel = new javax.swing.JLabel();
        manageUsersJButton = new javax.swing.JButton();
        manageOrganisationJButton = new javax.swing.JButton();
        manageEmployeesJButton = new javax.swing.JButton();

        insuranceAdminJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        insuranceAdminJLabel.setText("Insurance Admin");

        manageUsersJButton.setText("Manage Users");
        manageUsersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUsersJButtonActionPerformed(evt);
            }
        });

        manageOrganisationJButton.setText("Manage Organisations");
        manageOrganisationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganisationJButtonActionPerformed(evt);
            }
        });

        manageEmployeesJButton.setText("Manage Employees");
        manageEmployeesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeesJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insuranceAdminJLabel)
                    .addComponent(manageEmployeesJButton)
                    .addComponent(manageUsersJButton)
                    .addComponent(manageOrganisationJButton))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {manageEmployeesJButton, manageOrganisationJButton, manageUsersJButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(insuranceAdminJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageOrganisationJButton)
                .addGap(34, 34, 34)
                .addComponent(manageEmployeesJButton)
                .addGap(30, 30, 30)
                .addComponent(manageUsersJButton)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {manageEmployeesJButton, manageOrganisationJButton, manageUsersJButton});

    }// </editor-fold>//GEN-END:initComponents

    private void manageUsersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUsersJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountsJPanel manageUserAccountsJPanel = new ManageUserAccountsJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("manageUserAccountsJPanel", manageUserAccountsJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUsersJButtonActionPerformed

    private void manageOrganisationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganisationJButtonActionPerformed
        // TODO add your handling code here:
        ManageOrganisationsJPanel manageOrganisationsJPanel = new ManageOrganisationsJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageOrganisationsJPanel", manageOrganisationsJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganisationJButtonActionPerformed

    private void manageEmployeesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeesJButtonActionPerformed
        // TODO add your handling code here:
        ManageEmployeesJPanel manageEmployeesJPanel = new ManageEmployeesJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageEmployeesJPanel", manageEmployeesJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeesJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel insuranceAdminJLabel;
    private javax.swing.JButton manageEmployeesJButton;
    private javax.swing.JButton manageOrganisationJButton;
    private javax.swing.JButton manageUsersJButton;
    // End of variables declaration//GEN-END:variables
}
