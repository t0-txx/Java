/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopcompany;

import java.awt.Font;
import javax.swing.UIManager;

/**
 *
 * @author WONG-PC
 */
public class SetFont {

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
}
