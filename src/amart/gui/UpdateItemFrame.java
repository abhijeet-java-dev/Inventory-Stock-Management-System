/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amart.gui;

import amart.dao.ProductsDAO;
import amart.pojo.ProductsPojo;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class UpdateItemFrame extends javax.swing.JFrame {
DefaultTableModel tm;
public UpdateItemFrame() {
    initComponents();
    setLocationRelativeTo(null);
    loadProductDetails();
}
   private boolean validateInputs()
   {
   return !(txtPName.getText().isEmpty() || txtPCompany.getText().isEmpty() || txtPPrice.getText().isEmpty() || txtOPrice.getText().isEmpty() || txtQuantity.getText().isEmpty());
   }     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbTax = new javax.swing.JComboBox<>();
        txtPCompany = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPId = new javax.swing.JTextField();
        txtPName = new javax.swing.JTextField();
        txtOPrice = new javax.swing.JTextField();
        txtPPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtQuantity.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, 179, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Product Name ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 130, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Product Id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 110, 40));

        cbTax.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbTax.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "5%", "18%", "28%" }));
        cbTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTaxActionPerformed(evt);
            }
        });
        jPanel1.add(cbTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, 179, -1));

        txtPCompany.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtPCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 179, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Product Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 130, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Our Price");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 100, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Update Item");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 220, 40));

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 109, 40));

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
        jLabel1.setText("Update Item Panel");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 6, 440, 39));

        txtPId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtPId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 179, 30));

        txtPName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtPName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 179, 30));

        txtOPrice.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtOPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 179, 30));

        txtPPrice.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtPPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 179, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Quantity");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, 110, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tax");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, 60, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Product Company");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 160, 30));

        btnUpdate.setBackground(new java.awt.Color(255, 204, 153));
        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 660, 110, 40));

        jtProductList.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT ID", "PRODUCT NAME", "PRODUCT COMPANY", "PRODUCT PRICE", "OUR PRICE", "QUANTITY", "TAX"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProductList.setRowHeight(30);
        jtProductList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProductList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 1000, 320));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amart/images/stocks1.jpg"))); // NOI18N
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

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void cbTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTaxActionPerformed

    }//GEN-LAST:event_cbTaxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new ManageStocksFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txtPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPNameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
     if(!validateInputs())
     {
     JOptionPane.showMessageDialog(this,"Please fill all the fields ! ","Incomplate data",JOptionPane.ERROR_MESSAGE);  
      return;
     }
     try{
     int n=cbTax.getSelectedItem().toString().trim().length();
     int tax=Integer.parseInt(cbTax.getSelectedItem().toString().substring(0,n-1));
     ProductsPojo p=new ProductsPojo();
     p.setProductId(txtPId.getText().trim());
     p.setProductName(txtPName.getText().trim());
     p.setProductCompany(txtPCompany.getText().trim());
     p.setProductPrice(Double.parseDouble(txtPPrice.getText().trim()));
     p.setOurPrice(Double.parseDouble(txtOPrice.getText().trim()));
     p.setQuantity(Integer.parseInt(txtQuantity.getText().trim()));
     p.setTax(tax);
     
     boolean result=ProductsDAO.updateProduct(p);
     if(result)
     {
      JOptionPane.showMessageDialog(this,"Product Update Succesfully ! ","Success",JOptionPane.INFORMATION_MESSAGE);
      tm.setRowCount(0);
      loadProductDetails();
      return;
     } 
     JOptionPane.showMessageDialog(this,"Product Not Update ! ","Error",JOptionPane.ERROR_MESSAGE);  
        return;
     }catch(SQLException e1)
        {
        JOptionPane.showMessageDialog(this,"DataBase Error ! ","Error ",JOptionPane.ERROR_MESSAGE);  
        e1.printStackTrace();
        }
       catch(NumberFormatException e1)
       {
       JOptionPane.showMessageDialog(this,"Please fill numeric value for salary ","Error ",JOptionPane.ERROR_MESSAGE);  
       e1.printStackTrace();
       }   
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jtProductListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductListMouseClicked
       int row=jtProductList.getSelectedRow();
       txtPId.setText(tm.getValueAt(row,0).toString());
       txtPName.setText(tm.getValueAt(row, 1).toString()); 
       txtPCompany.setText(tm.getValueAt(row, 2).toString());
       txtPPrice.setText(tm.getValueAt(row,3).toString()); 
       txtOPrice.setText(tm.getValueAt(row, 4).toString());
       txtQuantity.setText(tm.getValueAt(row,5).toString()); 
       cbTax.setSelectedItem(tm.getValueAt(row, 6).toString()); 
    }//GEN-LAST:event_jtProductListMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateItemFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbTax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtProductList;
    private javax.swing.JTextField txtOPrice;
    private javax.swing.JTextField txtPCompany;
    private javax.swing.JTextField txtPId;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtPPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
private void loadProductDetails() {
      try
      {
        List<ProductsPojo> al=ProductsDAO.getProductDetails();
         if(al.isEmpty())
         {
         JOptionPane.showMessageDialog(this,"Products Not Present in Stocks! ","Products not available",JOptionPane.INFORMATION_MESSAGE);  
        return;
         }
         btnUpdate.setEnabled(true);
         Object[] rows=new Object[7];
         tm=(DefaultTableModel)jtProductList.getModel();
         for(ProductsPojo p:al)
         {
          rows[0]=p.getProductId();
          rows[1]=p.getProductName();
          rows[2]=p.getProductCompany();
          rows[3]=p.getProductPrice();
          rows[4]=p.getOurPrice();
          rows[5]=p.getQuantity();
          rows[6]=p.getTax()+"%";
          tm.addRow(rows);
         }   
      
      }catch(SQLException e1)
        {
        JOptionPane.showMessageDialog(this,"DataBase Error ! ","Error ",JOptionPane.ERROR_MESSAGE);  
        e1.printStackTrace();
        }
        
    }
}
