/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.oopcompany;

import java.awt.Event;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author com4936
 */
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    DatabaseConnection dbConnection = new DatabaseConnection();
    SetFont setFontMs = new SetFont();
    String sex = "";
    String selectedItem;
    String departmentCode, departmentName;

    public Employee() {
        setFontMs.setFont();
        dbConnection.connectDB();
        initComponents();
        departmentSelect();
        sexM.setSelected(true);
        getEmployeeData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        employeeCode = new javax.swing.JTextField();
        employeeName = new javax.swing.JTextField();
        bClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bNew = new javax.swing.JButton();
        bShow = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        department = new javax.swing.JComboBox<>();
        sexM = new javax.swing.JRadioButton();
        sexF = new javax.swing.JRadioButton();
        sexU = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bInsert = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        employeeCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        employeeCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                employeeCodeKeyPressed(evt);
            }
        });

        employeeName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("เพศ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("แผนก");

        department.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonGroup1.add(sexM);
        sexM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sexM.setText("ชาย");

        buttonGroup1.add(sexF);
        sexF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sexF.setText("หญิง");

        buttonGroup1.add(sexU);
        sexU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sexU.setText("ไม่ระบุ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("เงินเดือน");

        salary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("บาท");

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

        table1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Sex", "DCode", "DName", "Salary"
            }
        ));
        table1.setEnabled(false);
        jScrollPane2.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setMinWidth(50);
            table1.getColumnModel().getColumn(0).setPreferredWidth(50);
            table1.getColumnModel().getColumn(0).setMaxWidth(50);
            table1.getColumnModel().getColumn(2).setMinWidth(50);
            table1.getColumnModel().getColumn(2).setPreferredWidth(50);
            table1.getColumnModel().getColumn(2).setMaxWidth(50);
            table1.getColumnModel().getColumn(3).setMinWidth(50);
            table1.getColumnModel().getColumn(3).setPreferredWidth(50);
            table1.getColumnModel().getColumn(3).setMaxWidth(50);
            table1.getColumnModel().getColumn(5).setMinWidth(100);
            table1.getColumnModel().getColumn(5).setPreferredWidth(100);
            table1.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addGap(44, 44, 44)
                        .addComponent(bClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(sexM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sexF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sexU))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(employeeCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sexM)
                    .addComponent(sexF)
                    .addComponent(sexU))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bInsert)
                        .addComponent(bUpdate)
                        .addComponent(bDelete)
                        .addComponent(bClose))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bNew)
                        .addComponent(bShow)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void bNew() {
        employeeCode.setText(null);
        employeeName.setText(null);
        sexM.setSelected(true);
        sexF.setSelected(false);
        sexU.setSelected(false);
        department.setSelectedIndex(0);
        salary.setText(null);
        employeeCode.requestFocus();
    }

    private void getEmployeeData() {
        //((DefaultTableModel) table1.getModel()).setRowCount(0);
        String sql = "select employeeCode,employeeName,sex,employee.departmentCode,department.departmentName,salary from employee inner join department on department.departmentCode = employee.departmentCode";
        employeeCode.setText(null);
        try {
            ResultSet rs = dbConnection.statement.executeQuery(sql);
            while (rs.next()) {
                Object[] rowData = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)};
                ((DefaultTableModel) table1.getModel()).addRow(rowData);
            }
            rs.close();
        } catch (SQLException ex) {
        }
    }

    private int searchRowIndex(String code) {
        for (int i = 0; i < table1.getRowCount(); i++) {
            if (code.equals(table1.getValueAt(i, 0))) {
                return i;
            }
        }
        return -1;
    }

    public void departmentSelect() {
        String sql = "select departmentCode, departmentName from department";
        try {
            department.addItem(" กรุณาเลือกแผนก");
            // รัน SQL Query
            ResultSet rs = dbConnection.statement.executeQuery(sql);

            // ลูปดึงข้อมูลจาก ResultSet
            while (rs.next()) {
                // ดึงค่าของ departmentName
                String departmentCode1 = rs.getString("departmentCode");
                String departmentName = rs.getString("departmentName");

                // เพิ่ม departmentName ลงใน JComboBox
                department.addItem(departmentCode1 + " " + departmentName);
            }
            rs.close(); // ปิด ResultSet
        } catch (SQLException ex) {
            ex.printStackTrace(); // แสดงข้อผิดพลาดถ้ามีการเกิด SQLException
        }
    }

    public void departmentCode() {
        selectedItem = (String) department.getSelectedItem();
        departmentCode = selectedItem.split(" ")[0];
        departmentName = selectedItem.split(" ")[1];
    }

    public void sexSelect() {
        if (sexM.isSelected()) {
            sex = "M";
        } else if (sexF.isSelected()) {
            sex = "F";
        } else if (sexU.isSelected()) {
            sex = "U";
        }
    }

    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
        if (JOptionPane.showConfirmDialog(this, "ปิดหรือไม่ ?", "ยืนยัน", 0) == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_bCloseActionPerformed

    private void bNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewActionPerformed
        bNew();
    }//GEN-LAST:event_bNewActionPerformed

    private void bShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bShowActionPerformed
        String sex1 = "";
        if (sexM.isSelected()) {
            sex1 = sexM.getText();
        } else if (sexF.isSelected()) {
            sex1 = sexF.getText();
        } else if (sexU.isSelected()) {
            sex1 = sexU.getText();
        }
        String ms = employeeCode.getText() + "\n" + employeeName.getText() + "\n" + sex1 + "\n" + department.getSelectedItem() + "\n" + salary.getText();
        JOptionPane.showMessageDialog(this, ms);
    }//GEN-LAST:event_bShowActionPerformed

    private void bInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInsertActionPerformed
        if ("".equals(employeeCode.getText())) {
            JOptionPane.showMessageDialog(this, "Insert ไม่สำเร็จ");
        } else {
            sexSelect();
            departmentCode();
            String formattedId = String.format("%04d", Integer.parseInt(employeeCode.getText()));
            String sql = "insert into employee(employeeCode,employeeName,sex,departmentCode,salary) values ('" + formattedId + "','" + employeeName.getText() + "','" + sex + "','" + departmentCode + "','" + salary.getText() + "')";
            try {
                dbConnection.statement.executeUpdate(sql);
                Object[] rowData = {formattedId, employeeName.getText(), sex, departmentCode, departmentName, salary.getText()};
                ((DefaultTableModel) table1.getModel()).addRow(rowData);
                JOptionPane.showMessageDialog(this, "Insert สำเร็จ");
            } catch (SQLException ex) {
                Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Insert ไม่สำเร็จ");
            }
        }
    }//GEN-LAST:event_bInsertActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        if ("".equals(employeeCode.getText())) {
            JOptionPane.showMessageDialog(this, "Update ไม่สำเร็จ");
        } else {
            sexSelect();
            departmentCode();
            String formattedId = String.format("%04d", Integer.parseInt(employeeCode.getText()));
            String sql = "update employee set employeeName = '" + employeeName.getText() + "', sex = '" + sex + "' ,departmentCode = '" + departmentCode + "',salary = '" + salary.getText() + "' where employeeCode = '" + formattedId + "'";
            int row = searchRowIndex(formattedId);
            try {
                dbConnection.statement.executeUpdate(sql);
                ((DefaultTableModel) table1.getModel()).setValueAt(employeeName.getText(), row, 1);
                ((DefaultTableModel) table1.getModel()).setValueAt(sex, row, 2);
                ((DefaultTableModel) table1.getModel()).setValueAt(departmentCode, row, 3);
                ((DefaultTableModel) table1.getModel()).setValueAt(departmentName, row, 4);
                ((DefaultTableModel) table1.getModel()).setValueAt(salary.getText(), row, 5);
                JOptionPane.showMessageDialog(this, "Update สำเร็จ");
            } catch (SQLException ex) {
                Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Update ไม่สำเร็จ");
            }
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        if (JOptionPane.showConfirmDialog(this, "ลบหรือไม่ ?", "ยืนยัน", 0) == 0) {
            if ("".equals(employeeCode.getText())) {
                JOptionPane.showMessageDialog(this, "Delete ไม่สำเร็จ");
            } else {
                String formattedId = String.format("%04d", Integer.parseInt(employeeCode.getText()));
                String sql = "delete from employee where employeeCode = '" + formattedId + "'";
                int row = searchRowIndex(formattedId);
                try {
                    dbConnection.statement.executeUpdate(sql);
                    ((DefaultTableModel) table1.getModel()).removeRow(row);
                    JOptionPane.showMessageDialog(this, "Delete สำเร็จ");
                } catch (SQLException ex) {
                    Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Delete ไม่สำเร็จ");
                }
//                bNew();
            }
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void employeeCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeCodeKeyPressed
        if (evt.getKeyCode() == Event.ENTER) {
            String formattedId = String.format("%04d", Integer.parseInt(employeeCode.getText()));
            String sql = "select employeeName,departmentCode,sex,salary from employee where employeeCode = '" + formattedId + "'";
            employeeName.setText(null);
            sexM.setSelected(true);
            sexF.setSelected(false);
            sexU.setSelected(false);
            department.setSelectedIndex(0);
            salary.setText(null);
            try {
                ResultSet rs = dbConnection.statement.executeQuery(sql);
                while (rs.next()) {
                    employeeName.setText(rs.getString("employeeName"));

                    String departmentCode1 = rs.getString("departmentCode");
                    String departmentName = null;

                    for (int i = 0; i < department.getItemCount(); i++) {
                        String item = (String) department.getItemAt(i);
                        if (item.startsWith(departmentCode1 + " ")) {
                            department.setSelectedIndex(i);
                            break;
                        }
                    }
//                    JOptionPane.showMessageDialog(this, rs.getString("departmentCode"));

                    String checkSex = rs.getString("sex");
                    if ("M".equals(checkSex)) {
                        sexM.setSelected(true);
                    } else if ("F".equals(checkSex)) {
                        sexF.setSelected(true);
                    } else if ("U".equals(checkSex)) {
                        sexU.setSelected(true);
                    }
//                    JOptionPane.showMessageDialog(this, checkSex);
                    salary.setText(rs.getString("salary"));
                }
                rs.close();
            } catch (SQLException ex) {
                employeeName.setText(null);
                sexM.setSelected(true);
                sexF.setSelected(false);
                sexU.setSelected(false);
                department.setSelectedIndex(0);
                salary.setText(null);
            }
        }
    }//GEN-LAST:event_employeeCodeKeyPressed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JTextField employeeCode;
    private javax.swing.JTextField employeeName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField salary;
    private javax.swing.JRadioButton sexF;
    private javax.swing.JRadioButton sexM;
    private javax.swing.JRadioButton sexU;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
