
package amart.gui;

import amart.pojo.UserProfile;


public class ManagerOptionsFrame extends javax.swing.JFrame {

   
    public ManagerOptionsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblUserName.setText(UserProfile.getUsername());
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnManageEmp = new javax.swing.JButton();
        btnManageStocks = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        btnManageReceptionist = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manager Panel");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 280, 39));

        btnLogout.setBackground(new java.awt.Color(204, 204, 255));
        btnLogout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 0, 0));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 109, 40));

        btnManageEmp.setBackground(new java.awt.Color(204, 204, 255));
        btnManageEmp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnManageEmp.setForeground(new java.awt.Color(0, 0, 0));
        btnManageEmp.setText("Manage Employees");
        btnManageEmp.setPreferredSize(new java.awt.Dimension(170, 30));
        btnManageEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 210, 130));

        btnManageStocks.setBackground(new java.awt.Color(204, 204, 255));
        btnManageStocks.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnManageStocks.setForeground(new java.awt.Color(0, 0, 0));
        btnManageStocks.setText("Manage  Stocks");
        btnManageStocks.setPreferredSize(new java.awt.Dimension(170, 30));
        btnManageStocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStocksActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageStocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 210, 130));

        btnViewOrder.setBackground(new java.awt.Color(204, 204, 255));
        btnViewOrder.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnViewOrder.setForeground(new java.awt.Color(0, 0, 0));
        btnViewOrder.setText("View Orders");
        btnViewOrder.setPreferredSize(new java.awt.Dimension(170, 30));
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 220, 130));

        btnManageReceptionist.setBackground(new java.awt.Color(204, 204, 255));
        btnManageReceptionist.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnManageReceptionist.setForeground(new java.awt.Color(0, 0, 0));
        btnManageReceptionist.setText("Manage Receptionist");
        btnManageReceptionist.setPreferredSize(new java.awt.Dimension(170, 30));
        btnManageReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageReceptionistActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageReceptionist, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 220, 130));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Select Option");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 190, 39));

        lblUserName.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 250, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText(" welcome ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 180, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 490, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amart/images/mg.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 300, 350));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 250, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amart/images/manager1.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

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

    private void btnManageEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmpActionPerformed
      new ManageEmplyeesFrame().setVisible(true);
      this.dispose();    
    }//GEN-LAST:event_btnManageEmpActionPerformed

    private void btnManageReceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageReceptionistActionPerformed
        new ManageReceptionistFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnManageReceptionistActionPerformed

    private void btnManageStocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStocksActionPerformed
       new ManageStocksFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnManageStocksActionPerformed

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        new ViewOrdersFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewOrderActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageEmp;
    private javax.swing.JButton btnManageReceptionist;
    private javax.swing.JButton btnManageStocks;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables
}
