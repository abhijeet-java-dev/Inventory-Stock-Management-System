
package amart.gui;

import amart.dao.UserDAO;
import amart.pojo.UserPojo;
import amart.pojo.UserProfile;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LoginFrame extends javax.swing.JFrame {

    String userid,password;
    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
   private boolean validateInputs()
   {
     userid=txtUserId.getText().trim();
     char[] pwd=txtPassword.getPassword();
     password=String.valueOf(pwd).trim();
     if(userid.isEmpty() || password.isEmpty())
       return false;
       return true;
   
   }
   
   private String getUserType()
   {
   if(jrbManager.isSelected())
       return jrbManager.getText();
   else if(jrbReceptionist.isSelected())
       return jrbReceptionist.getText();
   else
       return null;
   
   }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnQuit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jrbReceptionist = new javax.swing.JRadioButton();
        jrbManager = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login page");
        setResizable(false);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(119, 166, 166));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Type");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 100, 30));

        txtUserId.setBackground(new java.awt.Color(255, 255, 255));
        txtUserId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtUserId.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 200, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User Id");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 100, 30));

        btnQuit.setBackground(new java.awt.Color(204, 204, 255));
        btnQuit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(0, 0, 0));
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 110, 40));

        btnLogin.setBackground(new java.awt.Color(204, 204, 255));
        btnLogin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 110, 40));

        buttonGroup1.add(jrbReceptionist);
        jrbReceptionist.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jrbReceptionist.setForeground(new java.awt.Color(255, 255, 255));
        jrbReceptionist.setText("Receptionist");
        jrbReceptionist.setContentAreaFilled(false);
        jPanel1.add(jrbReceptionist, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, -1, -1));

        buttonGroup1.add(jrbManager);
        jrbManager.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jrbManager.setForeground(new java.awt.Color(255, 255, 255));
        jrbManager.setText("Manager");
        jrbManager.setContentAreaFilled(false);
        jPanel1.add(jrbManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, -1));

        jLabel3.setBackground(new java.awt.Color(119, 166, 166));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 120, 30));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 200, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amart/images/plogin.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       if(!validateInputs())
       {
           JOptionPane.showMessageDialog(this,"Please fill all the fields ! ","Incomplate data",JOptionPane.ERROR_MESSAGE);  
           return;
       }
       String usertype=getUserType();
       if(usertype==null)
       {
       JOptionPane.showMessageDialog(this,"Please select usertype ! ","Incomplate data",JOptionPane.ERROR_MESSAGE);  
           return;
       } 
       UserPojo u=new UserPojo();
       u.setUserid(userid);
       u.setPassword(password);
       u.setUsertype(usertype);
       try
       {
          boolean result=UserDAO.validateUser(u);
          if(result==false)
          {
          JOptionPane.showMessageDialog(this,"Invalid username/password/usertype ! ","Error",JOptionPane.ERROR_MESSAGE);  
           return;
          }
          
          UserProfile.setUserid(userid);
          UserProfile.setUsertype(usertype);
          
          if(usertype.equalsIgnoreCase("Manager"))
          {
            ManagerOptionsFrame mframe=new ManagerOptionsFrame();
            mframe.setVisible(true);
            this.dispose();
          }
          else
          {
          ReceptionistOptionsFrame mframe=new ReceptionistOptionsFrame();
            mframe.setVisible(true);
            this.dispose();
          
          }
          
       }
       catch(SQLException e2)
       {
       JOptionPane.showMessageDialog(this,"DataBase Error ! ","Error ",JOptionPane.ERROR_MESSAGE);  
      e2.printStackTrace();
       }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuitActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQuit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbManager;
    private javax.swing.JRadioButton jrbReceptionist;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
