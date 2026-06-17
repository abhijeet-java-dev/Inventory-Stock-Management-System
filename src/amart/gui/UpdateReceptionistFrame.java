/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amart.gui;

import amart.dao.ReceptionistDAO;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;


public class UpdateReceptionistFrame extends javax.swing.JFrame {

    Map<String,String> receptionist;
    String password;
    public UpdateReceptionistFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadReceptionistDetails();
    }
   private boolean validateInputs()
   {
     char [] pwd=txtPassword1.getPassword();
     char [] repwd=txtRePassword.getPassword();
     if(pwd.length<4 || repwd.length<4)
     {
      JOptionPane.showMessageDialog(null,"Passwords must be atleast 4 characters long ","password",JOptionPane.INFORMATION_MESSAGE);
      return false;
     }  
     password=String.valueOf(pwd);
     String repassword=String.valueOf(repwd);
     if(!password.equals(repassword))
     {
     JOptionPane.showMessageDialog(null,"Passwords Not Matching ","password",JOptionPane.INFORMATION_MESSAGE);
      return false;
     }   
     return true;
     
   }        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        txtRecepEmpName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cbRecepId = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtRePassword = new javax.swing.JPasswordField();
        txtPassword1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRecepEmpName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel5.add(txtRecepEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 179, 30));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Receptionist Name");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 178, 30));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Receptionist Id");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 150, 40));

        cbRecepId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbRecepId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRecepIdActionPerformed(evt);
            }
        });
        jPanel5.add(cbRecepId, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 179, -1));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Password");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 160, 30));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText(" Re-Password ");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 160, 30));

        btnUpdate.setBackground(new java.awt.Color(204, 204, 255));
        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 110, 40));

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel5.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 109, 40));

        btnLogout.setBackground(new java.awt.Color(204, 204, 255));
        btnLogout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 0, 0));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel5.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 109, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Receptionist Panel");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 468, 39));
        jPanel5.add(txtRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 180, 30));
        jPanel5.add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 180, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amart/images/Receptions.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbRecepIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRecepIdActionPerformed
     txtRecepEmpName.setText(receptionist.get(cbRecepId.getSelectedItem().toString()));
    }//GEN-LAST:event_cbRecepIdActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       
        if(!validateInputs())
        return;
       try{ 
       String userid=cbRecepId.getSelectedItem().toString();
       boolean result=ReceptionistDAO.updatePassword(userid,password);
       if(result)
       {
       JOptionPane.showMessageDialog(null,"Password Changed Successfully !! ","password",JOptionPane.INFORMATION_MESSAGE);
       clearText(); 
       cbRecepId.setSelectedIndex(0);
       return;
       }    
       JOptionPane.showMessageDialog(null,"Passwords Not Changed ","password",JOptionPane.INFORMATION_MESSAGE);
       clearText();
       return;
       }catch(SQLException e1)
        {
        JOptionPane.showMessageDialog(this,"DataBase Error ! ","Error ",JOptionPane.ERROR_MESSAGE);  
        e1.printStackTrace();
       }
                
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
     new ManageReceptionistFrame().setVisible(true);
       this.dispose();   
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
     new LoginFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateReceptionistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbRecepId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtRecepEmpName;
    // End of variables declaration//GEN-END:variables

    private void loadReceptionistDetails(){
     try
     {
       receptionist=ReceptionistDAO.getAllReceptionists();
       if(receptionist.isEmpty())
       {
        JOptionPane.showMessageDialog(null, "No Receptionist Present!!");
        return;
       }   
      Set<String> keys=receptionist.keySet();
      for(String id:keys)
      {
      cbRecepId.addItem(id);
      }
     }catch(SQLException e1)
        {
        JOptionPane.showMessageDialog(this,"DataBase Error ! ","Error ",JOptionPane.ERROR_MESSAGE);  
        e1.printStackTrace();
       }
     }

    private void clearText() {
      txtPassword1.setText("");
      txtRePassword.setText("");
    }
}
