
package amart.gui;

import amart.dao.ReceptionistDAO;
import amart.pojo.UserPojo;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;


public class AddReceptionistFrame extends javax.swing.JFrame {

    Map <String,String> receptionist;
    public AddReceptionistFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadReceptionistDetails();
    }
    private int validateInputs()
    {
     if(txtPassword.getPassword().length <4 || txtRePassword.getPassword().length <4 )
         return 0;
     else if(txtUserId.getText().trim().isEmpty() )
         return -1;
     return 1;
    
    } 
    
    private boolean isPasswordMatching(String a,String b)
    {
     return a.equals(b);
    
    }    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtEmpName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbEmpId = new javax.swing.JComboBox<>();
        txtUserId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtRePassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmpName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 179, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Employee Name ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 160, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Employee Id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 150, 40));

        cbEmpId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmpIdActionPerformed(evt);
            }
        });
        jPanel1.add(cbEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 179, -1));

        txtUserId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 179, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("User Id");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 160, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 160, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText(" Re-Password ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 160, 30));

        btnAdd.setBackground(new java.awt.Color(204, 204, 255));
        btnAdd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setText("ADD");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 110, 40));

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 109, 40));

        btnLogout.setBackground(new java.awt.Color(204, 204, 255));
        btnLogout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 0, 0));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 109, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Receptionist Panel");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 6, 440, 39));
        jPanel1.add(txtRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 180, 30));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 180, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amart/images/Receptions.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

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

    private void cbEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmpIdActionPerformed
        if(cbEmpId.getItemCount()==0)
            return;
        txtEmpName.setText(receptionist.get(cbEmpId.getSelectedItem().toString()) );
    }//GEN-LAST:event_cbEmpIdActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
   int result=validateInputs();
     if(result==0)
     {
      JOptionPane.showMessageDialog(null,"Passwords must be atleast 4 characters long ","password",JOptionPane.INFORMATION_MESSAGE);
      return;
     }   
     if(result==-1)
     {
      JOptionPane.showMessageDialog(null,"UserId cannot be left blank ","UserId",JOptionPane.INFORMATION_MESSAGE);
      return;
     }  
     char []pwd=txtPassword.getPassword();
     char []repwd=txtRePassword.getPassword();
     String Pwd=String.valueOf(pwd);
     String rePwd=String.valueOf(repwd);
     if(isPasswordMatching(Pwd,rePwd)==false)
     {
     JOptionPane.showMessageDialog(null,"Password do not match","password",JOptionPane.INFORMATION_MESSAGE);
      return;
     }  
     
     try{
       String empid=cbEmpId.getSelectedItem().toString();
       String userid=txtUserId.getText().trim();
       String username=txtEmpName.getText().trim();
       UserPojo u=new UserPojo();
       u.setEmpid(empid);
       u.setUserid(userid);
       u.setUsername(username);  
       u.setPassword(Pwd);
       u.setUsertype("Receptionist");
       boolean status=ReceptionistDAO.addReceptionist(u);
       if(status)
       {
        JOptionPane.showMessageDialog(this,"Receptionists Added Succesfully ! ","Success",JOptionPane.INFORMATION_MESSAGE);
        clearText();
        loadReceptionistDetails();
        return;
       }  
       JOptionPane.showMessageDialog(this,"Receptionists not Added ! ","Success",JOptionPane.INFORMATION_MESSAGE);
     }
       catch(SQLException e1)
        {
        JOptionPane.showMessageDialog(this,"DataBase Error ! ","Error ",JOptionPane.ERROR_MESSAGE);  
        e1.printStackTrace();
        }
       catch(NumberFormatException e1)
       {
       JOptionPane.showMessageDialog(this,"Please fill numeric value for salary ","Error ",JOptionPane.ERROR_MESSAGE);  
       e1.printStackTrace();
       }
     
     
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
     new ManageReceptionistFrame().setVisible(true);
     this.dispose();
     
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
      new LoginFrame().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddReceptionistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> cbEmpId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables

    private void loadReceptionistDetails() {
      try
      {
        receptionist=ReceptionistDAO.getNonRegisteredReceptionists();
        if(receptionist.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"No un-registerd receptionist present ");
            btnAdd.setEnabled(false);
            return;
        }
            btnAdd.setEnabled(true);
             Set keys=receptionist.keySet();
             Iterator <String> it=keys.iterator();
             cbEmpId.removeAllItems();
             while(it.hasNext())
             {
               cbEmpId.addItem(it.next());
             }   
      }
      catch(SQLException e1)
      {
      JOptionPane.showMessageDialog(this,"DataBase Error ! ","Error ",JOptionPane.ERROR_MESSAGE);  
        e1.printStackTrace();
      }
                
    }

    private void clearText() {
      txtPassword.setText("");
      txtRePassword.setText("");
      txtUserId.setText("");
    }
}
