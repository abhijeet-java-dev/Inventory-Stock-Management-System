
package amart.gui;

import amart.dao.EmployeeDAO;
import amart.pojo.EmployeePojo;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddEmployeesFrame extends javax.swing.JFrame {
    public AddEmployeesFrame(){
        initComponents();
        this.setLocationRelativeTo(null);
        loadEmpId();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        txtEmpName = new javax.swing.JTextField();
        btnAddEmp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        cboxJob = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Employees Panel");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 390, 39));

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

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Employee Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 280, 39));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Employee Id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 150, 40));

        txtEmpId.setEditable(false);
        txtEmpId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 179, 30));

        txtEmpName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 179, 30));

        btnAddEmp.setBackground(new java.awt.Color(204, 204, 255));
        btnAddEmp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAddEmp.setForeground(new java.awt.Color(0, 0, 0));
        btnAddEmp.setText("Add");
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 110, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Employee Name ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 160, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Job");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 60, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Salary");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 80, 30));

        txtSalary.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 179, 30));

        cboxJob.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboxJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Manager", "Receptionist", "Watchman", "Helper", "Cleaner", " " }));
        jPanel1.add(cboxJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 179, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amart/images/manager1.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

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

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
       
        if(!validateInputs())
       {
        JOptionPane.showMessageDialog(this,"Please fill all the fields ! ","Incomplate data",JOptionPane.ERROR_MESSAGE);  
        return;
       }
       try{
        EmployeePojo emp=new EmployeePojo();
        emp.setEmpid(txtEmpId.getText());
        emp.setEmpname(txtEmpName.getText());
        emp.setJob(cboxJob.getSelectedItem().toString());
        emp.setSalary(Double.parseDouble(txtSalary.getText()));
        boolean result=EmployeeDAO.addEmployee(emp);
        if(!result)
        {
        JOptionPane.showMessageDialog(this,"Record Not Inserted ! ","Error",JOptionPane.ERROR_MESSAGE);  
        return;
        }
        JOptionPane.showMessageDialog(this,"Recors Added Succesfully ! ","Success",JOptionPane.INFORMATION_MESSAGE);
        clearText();
        loadEmpId();
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
        
    }//GEN-LAST:event_btnAddEmpActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
      new LoginFrame().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       new ManageEmplyeesFrame().setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_btnBackActionPerformed

   
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
            java.util.logging.Logger.getLogger(AddEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> cboxJob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables

    private void loadEmpId() {
        try
        {
        txtEmpId.setText(EmployeeDAO.getNextEmpId());
        }catch(SQLException e1)
        {
        JOptionPane.showMessageDialog(this,"DataBase Error ! ","Error ",JOptionPane.ERROR_MESSAGE);  
        e1.printStackTrace();
        }
    }
    
    private boolean validateInputs()
    {
      return !(txtEmpName.getText().isEmpty() || txtSalary.getText().isEmpty());
    }

    private void clearText() {
     txtEmpName.setText("");
     txtSalary.setText("");
     cboxJob.setSelectedIndex(0);

    }
}
