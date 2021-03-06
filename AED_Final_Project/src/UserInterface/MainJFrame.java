/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CustomerRole.NewCustomerJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
      private EcoSystem system;
      private Network network;
      private Enterprise enterprise;
        private DB4OUtil db4oUtil = DB4OUtil.getInstance();
    public MainJFrame() {
        initComponents();
              system = db4oUtil.retrieveSystem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        loginPanel = new javax.swing.JPanel();
        userNameJLabel = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        passwordJLabel = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JPasswordField();
        loginJButton = new javax.swing.JButton();
        logoutJButton = new javax.swing.JButton();
        newCustJButton = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();
        imglabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameJLabel.setText("User Name");
        loginPanel.add(userNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });
        loginPanel.add(userNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 118, -1));

        passwordJLabel.setText("Password");
        loginPanel.add(passwordJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, -1, -1));
        loginPanel.add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 129, 118, -1));

        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });
        loginPanel.add(loginJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 167, 100, -1));

        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        loginPanel.add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 224, 100, -1));

        newCustJButton.setText("New Customer");
        newCustJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCustJButtonActionPerformed(evt);
            }
        });
        loginPanel.add(newCustJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 285, -1, -1));

        jSplitPane1.setLeftComponent(loginPanel);

        userProcessContainer.setLayout(new java.awt.CardLayout());

        imglabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\jaina\\DEMO\\FINAL PROJECT\\aed_fall_2016_project_alpana_pothukuchi_001217567\\AED_Final_Project\\src\\Images\\ARA.JPG")); // NOI18N
        userProcessContainer.add(imglabel, "card2");

        jSplitPane1.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
       // TODO add your handling code here:
        String name = userNameJTextField.getText();
        String password = String.valueOf(passwordJTextField.getPassword());
        
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(name, password);
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        
        if(userAccount == null){
            for(Network network : system.getNetworkList()){
                for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(name, password);
                    if(userAccount == null){
                        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                            userAccount = organization.getUserAccountDirectory().authenticateUser(name, password);
                            if(userAccount != null){
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }
                    } else{
                        inEnterprise = enterprise;
                        break;
                    }
                    if(inOrganization != null){
                        break;
                    }
                }
                if(inEnterprise != null){
                    break;
                }
            }
        }
        if(userAccount == null){
            JOptionPane.showMessageDialog(null, "Please enter valid credentials", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
            userProcessContainer.add("WorkArea",userAccount.getRole().createWorkArea(userProcessContainer, userAccount, inOrganization, inEnterprise, system));
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordJTextField.setEnabled(false);
        newCustJButton.setEnabled(false);

    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
      
    logoutJButton.setEnabled(false);
       userNameJTextField.setEnabled(true);
       passwordJTextField.setEnabled(true);
       loginJButton.setEnabled(true);
       newCustJButton.setEnabled(true);
       userNameJTextField.setText("");
       passwordJTextField.setText("");
       
       userProcessContainer.removeAll();
       JPanel blankJP = new JPanel();
       userProcessContainer.add("blank", blankJP);
       CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
       crdLyt.next(userProcessContainer);
       db4oUtil.storeSystem(system);
      

    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void newCustJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCustJButtonActionPerformed
        // TODO add your handling code here:
        NewCustomerJPanel panel = new NewCustomerJPanel(userProcessContainer, system, network, enterprise);
        userProcessContainer.add("NewCustomerJPanel", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_newCustJButtonActionPerformed

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imglabel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton newCustJButton;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JPasswordField passwordJTextField;
    private javax.swing.JLabel userNameJLabel;
    private javax.swing.JTextField userNameJTextField;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
