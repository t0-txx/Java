package com.mycompany.graphicdemo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author WONG-PC
 */
public class GraphicTest2 extends javax.swing.JFrame {

    /**
     * Creates new form GraphicTest2
     */
    public GraphicTest2() {
        initComponents();
        setSize(600,600);
    }
    
     public void paint(Graphics g){
        super.setSize(600, 600);
        
        g.setColor(new Color(251, 249, 241));
        g.fillRect(0,0,getWidth(), getHeight());    
        
        //แสงแดด
        g.setColor(new Color(254, 243, 226));
        g.fillArc(0-750, 0-750, 1500, 1500, 270, 90);
        
        g.setColor(new Color(251, 249, 241));
        g.fillArc(0-600, 0-600, 1200, 1200, 270, 90);
        
        //แสงแดด
        g.setColor(new Color(254, 243, 226));
        g.fillArc(0-450, 0-450, 900, 900, 270, 90);
        
        g.setColor(new Color(251, 249, 241));
        g.fillArc(0-300, 0-300, 600, 600, 270, 90);
        
        //แสงแดด
        g.setColor(new Color(254, 243, 226));
        g.fillArc(0-150, 0-150, 300, 300, 270, 90);
        
        //พื้น
        g.setColor(new Color(222, 172, 128));
        g.fill3DRect(0,450,600,150,true);
        
        //ดวงอาทิตย์ ขอบนอก
        g.setColor(new Color(153, 77, 28));
        g.drawArc(75, 75, 200, 200, 0, 360);
        
        g.setColor(new Color(15, 103, 177));
        g.drawArc(75, 75, 200, 200, 0, 45);
        g.drawArc(75, 75, 200, 200, 90, 45);
        g.drawArc(75, 75, 200, 200, 180, 45);
        g.drawArc(75, 75, 200, 200, 270, 45);
         
        //ดวงอาทิตย์
        g.setColor(new Color(255, 143, 0));
        g.fillOval(100, 100, 150, 150);
         
        //กระบองเพชร
        g.setColor(new Color(112, 136, 113));
        g.fillRect(100+200,400, 20, 50);
        g.fillRect(80+200,420, 60, 15);
        g.fillRect(80+200,410, 10, 10);
        g.fillRect(130+200,430, 10, 10);
        
        //พีรมิด
        g.setColor(new Color(228, 143, 69));
        g.fillRect(310,430,240,10);
        g.fillRect(330,410,200,10);
        g.fillRect(350,390,160,10);
        g.fillRect(370,370,120,10);
        g.fillRect(390,350,80,10);
        g.fillRect(410,330,40,10);
        
        //เส้นแนวตั้ง
        g.drawLine(430, 250, 430, 320);
        //เส้นแนวนอน
        g.drawLine(400, 260, 460, 260);

         //พีรมิด
        g.setColor(new Color(153, 77, 28));
        g.fillRect(300,440,260,10);
        g.fillRect(320,420,220,10);
        g.fillRect(340,400,180,10);
        g.fillRect(360,380,140,10);
        g.fillRect(380,360,100,10);
        g.fillRect(400,340,60,10);
        g.fillRect(420,320,20,10);
        
         //เมฆ
        g.setColor(new Color(218, 245, 255));
        g.fillOval(30+150, 110+100, 80-10, 80-10);
        g.fillRoundRect(10+150,140+100, 120-10, 50-10, 50-10, 50-10);
        
        g.fillOval(30+20, 110+20, 80, 80);
        g.fillRoundRect(10+20,140+20, 120, 50, 50, 50);
        
        g.fillOval(30+330, 110+20, 80-20, 80-20);
        g.fillRoundRect(10+330,140+20, 120-20, 50-20, 50-20, 50-20);
        
        g.fillOval(30+500, 110+120, 80-20, 80-20);
        g.fillRoundRect(10+500,140+120, 120-20, 50-20, 50-20, 50-20);
        
        g.fillOval(30+550, 110-50, 80-20, 80-20);
        g.fillRoundRect(10+550,140-50, 120-20, 50-20, 50-20, 50-20);
        
        g.fillOval(30+200, 110-100, 80-20, 80-20);
        g.fillRoundRect(10+200,140-100, 120-20, 50-20, 50-20, 50-20);
        
        //กระบองเพชร
        g.setColor(new Color(181, 193, 142));
        g.fillRect(100,400, 20, 50);
        g.fillRect(80,420, 60, 15);
        g.fillRect(80,410, 10, 10);
        g.fillRect(130,430, 10, 10);
        
        g.setColor(new Color(112, 136, 113));
        g.fillRect(100+400,400, 20, 50);
        g.fillRect(80+400,420, 60, 15);
        g.fillRect(80+400,410, 10, 10);
        g.fillRect(130+400,430, 10, 10);
        
        //ล่างสุด
        g.setColor(new Color(251, 249, 241));
        g.fillArc(0, 550, 100, 100, 0, 180);
        g.fillArc(100, 550, 100, 100, 0, 180);
        g.fillArc(200, 550, 100, 100, 0, 180);
        g.fillArc(300, 550, 100, 100, 0, 180);
        g.fillArc(400, 550, 100, 100, 0, 180);
        g.fillArc(500, 550, 100, 100, 0, 180);
        g.fillArc(600, 550, 100, 100, 0, 180);
        
        g.setColor(new Color(254, 243, 226));
        g.fillArc(50-100, 550, 100, 100, 0, 180);
        g.fillArc(50, 550, 100, 100, 0, 180);
        g.fillArc(150, 550, 100, 100, 0, 180);
        g.fillArc(250, 550, 100, 100, 0, 180);
        g.fillArc(350, 550, 100, 100, 0, 180);
        g.fillArc(450, 550, 100, 100, 0, 180);
        g.fillArc(550, 550, 100, 100, 0, 180);
        
        g.drawRect(200, 475, 200, 25);
        int[] x={200,225,250,275,300,325,350,375,400};
        int[] y={475,500,475,500,475,500,475,500,475};
        g.drawPolyline(x, y,x.length);
        
        //
        g.setColor(new Color(153, 77, 28));
        g.setFont(new Font("Angsana new", Font.BOLD, 54));
        g.drawString("EGYPT",240, 500);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graghic 8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GraphicTest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicTest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicTest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicTest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphicTest2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
