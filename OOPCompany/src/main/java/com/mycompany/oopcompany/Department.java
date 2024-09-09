/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.oopcompany;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author com4936
 */
public class Department extends javax.swing.JFrame {

    /**
     * Creates new form OPCompany
     */
    Connection conn;
    Statement statement;

    public Department() {
        setFont();
        connectDB();
        initComponents();
    }
    
    public void connectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Load driver error");
        }

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop2567", "root", "12345678");
            statement = conn.createStatement();
        } catch (SQLException ex) {
//            Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("connect database error");
        }
    }

    public void setFont() {
        try {
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            // กำหนดฟอนต์พื้นฐานสำหรับแอปพลิเคชันทั้งหมด
            Font newFont = new Font("Tahoma", Font.PLAIN, 14);
//            UIManager.put("Button.font", newFont);
            UIManager.put("Label.font", newFont);
//            UIManager.put("TextField.font", newFont);
            UIManager.put("JOptionPane.font", newFont);
        } catch (Exception ex) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bNew = new javax.swing.JButton();
        bShow = new javax.swing.JButton();
        departmentCode = new javax.swing.JTextField();
        departmentName = new javax.swing.JTextField();
        bInsert = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bClose.setText("Close");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("รหัส");
        jLabel1.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ชื่อ");

        bNew.setText("New");
        bNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewActionPerformed(evt);
            }
        });

        bShow.setText("Show");
        bShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bShowActionPerformed(evt);
            }
        });

        departmentCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        departmentName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        bInsert.setText("Insert");
        bInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInsertActionPerformed(evt);
            }
        });

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(departmentCode, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(25, 25, 25)
                            .addComponent(departmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bNew)
                            .addGap(18, 18, 18)
                            .addComponent(bShow)
                            .addGap(18, 18, 18)
                            .addComponent(bInsert)
                            .addGap(18, 18, 18)
                            .addComponent(bUpdate)
                            .addGap(18, 18, 18)
                            .addComponent(bDelete)
                            .addGap(42, 42, 42)
                            .addComponent(bClose)
                            .addGap(28, 28, 28)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(departmentCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(departmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bInsert)
                        .addComponent(bUpdate)
                        .addComponent(bDelete)
                        .addComponent(bClose))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bNew)
                        .addComponent(bShow)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
        if (JOptionPane.showConfirmDialog(this, "ปิดหรือไม่ ?", "ยืนยัน", 0) == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_bCloseActionPerformed

    private void bNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewActionPerformed
        departmentCode.setText(null);
        departmentName.setText(null);
        departmentCode.requestFocus();
    }//GEN-LAST:event_bNewActionPerformed

    private void bShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bShowActionPerformed
        String ms = departmentCode.getText() + "\n" + departmentName.getText();
        JOptionPane.showMessageDialog(this, ms);
    }//GEN-LAST:event_bShowActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        String sql = "update department set departmentName = '"+ departmentName.getText() +"' where departmentCode = '"+ departmentCode.getText() +"'";
        try {
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        String sql = "delete from department where departmentCode = '"+ departmentCode.getText() +"'";
        try {
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInsertActionPerformed
        String sql = "insert into department(departmentCode,departmentName) values ('"+ departmentCode.getText() +"','"+ departmentName.getText() +"')";
        try {
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bInsertActionPerformed

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
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Department().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClose;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bInsert;
    private javax.swing.JButton bNew;
    private javax.swing.JButton bShow;
    private javax.swing.JButton bUpdate;
    private javax.swing.JTextField departmentCode;
    private javax.swing.JTextField departmentName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
