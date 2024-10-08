/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.samplegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author com4936
 */
public class Game1 extends javax.swing.JFrame implements KeyListener, Runnable {

    /**
     * Creates new form Game1
     */
    Image image;
    int x = 10;
    int y = 640;
    int x2, y2;
    int count = 0, damage = 0;
    Clip clip, clip2, clip3, clip4, clip5;
    int red, green, blue;

    Ball[] ball = new Ball[7];

    Item item;

    Bullet[] bullet = new Bullet[7];

    Heart heart;

//    Heal heal;
    int bulletCheck;

    int bulletCount = bullet.length;

    public Game1() {

        initComponents();
        setSize(700, 700);
        setTitle("เกมเล่น ๆ");
        image = Toolkit.getDefaultToolkit().createImage("..\\picture\\police.png");
        for (int i = 0; i < ball.length; i++) {
            ball[i] = new Ball(getWidth());
            new Thread(ball[i]).start();
        }
        new Thread(this).start();
        this.addKeyListener(this);
        createBox();
        heart = new Heart(damage);
//        heal = new Heal(getWidth());
        item = new Item(getWidth());
        new Thread(item).start();
//        new Thread(heal).start();
    }

    public void createBox() {
        Random random = new Random();
        x2 = random.nextInt(getWidth() - 60);
        y2 = random.nextInt(getHeight() - 60);
        red = random.nextInt(255);
        green = random.nextInt(255);
        blue = random.nextInt(255);
        createSound();
    }

    public void createSound() {
        try {
            File soundFile = new File("..\\img\\SoundTrue.wav");
            AudioInputStream adioIn = AudioSystem.getAudioInputStream(soundFile);
            clip = AudioSystem.getClip();
            clip.open(adioIn);
        } catch (Exception ex) {
        }
    }

    public void win() {
        try {
            File soundFile = new File("..\\img\\win.wav");
            AudioInputStream adioIn = AudioSystem.getAudioInputStream(soundFile);
            clip2 = AudioSystem.getClip();
            clip2.open(adioIn);
        } catch (Exception ex) {
        }
    }

    public void lose() {
        try {
            File soundFile = new File("..\\img\\lose.wav");
            AudioInputStream adioIn = AudioSystem.getAudioInputStream(soundFile);
            clip3 = AudioSystem.getClip();
            clip3.open(adioIn);
        } catch (Exception ex) {
        }
    }

    public void reloading() {
        try {
            File soundFile = new File("..\\img\\gunreload.wav");
            AudioInputStream adioIn = AudioSystem.getAudioInputStream(soundFile);
            clip4 = AudioSystem.getClip();
            clip4.open(adioIn);
        } catch (Exception ex) {
        }
    }

    public void SoundFalse() {
        try {
            File soundFile = new File("..\\img\\SoundFalse.wav");
            AudioInputStream adioIn = AudioSystem.getAudioInputStream(soundFile);
            clip5 = AudioSystem.getClip();
            clip5.open(adioIn);
        } catch (Exception ex) {
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, super.getWidth(), super.getHeight());
        g.drawImage(image, x, y, 50, 50, this);

        for (int i = 0; i < ball.length; i++) {
            ball[i].paint(g);
        }

//        item.paint(g);
        for (int j = 0; j < bullet.length; j++) {
            if (bullet[j] != null) {
                bullet[j].paint(g);
            }
        }

//        g.setColor(new Color(red, green, blue));
//        g.fillRect(x2, y2, 50, 50);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Angsana new", Font.BOLD, 60));
        g.drawString("Score " + count, 50, 100);

        g.setColor(Color.RED);
        g.setFont(new Font("Angsana new", Font.BOLD, 60));
        g.drawString("Bullet " + bulletCount, 500, 100);

        heart.paint(g);

//        heal.paint(g);
        if (count >= 1000) {
//            g.setColor(Color.GRAY);
//            g.fillRect(0, 0, super.getWidth(), super.getHeight());
            g.setColor(Color.GREEN);
            g.setFont(new Font("Angsana new", Font.BOLD, 60));
            g.drawString("THE WINNER", ((super.getWidth() - 250) / 2), (super.getHeight()) / 2);
            win();
            clip2.loop(0);
        }

        if (damage >= 200) {
//            g.setColor(Color.GRAY);
//            g.fillRect(0, 0, super.getWidth(), super.getHeight());
            g.setColor(Color.RED);
            g.setFont(new Font("Angsana new", Font.BOLD, 60));
            g.drawString("YOU LOSE", ((super.getWidth() - 250) / 2), (super.getHeight()) / 2);
            lose();
            clip3.loop(0);
        }
    }

    public void checkCollission() {
        Rectangle rPlayer = new Rectangle(x, y, 50, 50);
        Rectangle rBox = new Rectangle(x2, y2, 50, 50);
        if (count < 1000) {
            if (rPlayer.intersects(rBox)) {
                //System.out.println("Collised");
                clip.loop(0);
                createBox();
                count = count + 1;
            }
        }
    }

    public void checkBall() {
        for (int i = 0; i < ball.length; i++) {
            Rectangle rPlayer = new Rectangle(x, y, 50, 50);
            Rectangle rBall = new Rectangle(ball[i].x, ball[i].y, 50, 50);
            if (rPlayer.intersects(rBall)) {
                SoundFalse();
                clip5.loop(0);
                count = count - (ball[i].count);
                ball[i] = new Ball(getWidth());
                new Thread(ball[i]).start();
                damage = damage + 20;
                heart = new Heart(damage);
//                new Heal(getWidth());
            }

            if (ball[i].play == false) {
                ball[i] = new Ball(getWidth());
                new Thread(ball[i]).start();
            }

            for (int j = 0; j < bullet.length; j++) {
                if (bullet[j] != null) {
                    Rectangle rBullet = new Rectangle(bullet[j].x, bullet[j].y, 40, 40);
                    if (rBullet.intersects(rBall)) {
                        createSound();
                        clip.loop(0);
                        count = count + (ball[i].count);
                        ball[i] = new Ball(getWidth());
                        new Thread(ball[i]).start();
                        bullet[j] = null;
                        bulletCount = bulletCount + 1;
                    }
                }
            }
        }
    }

    public void createBullet() {
        for (int i = 0; i < bullet.length; i++) {
            if (bullet[i] == null) {
                bullet[i] = new Bullet(y, x + (10 / 2));
                new Thread(bullet[i]).start();
                bulletCheck = i;
                bulletCount = bulletCount - 1;
                break;
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            if (count < 1000 && damage < 200) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Game1.class.getName()).log(Level.SEVERE, null, ex);
                }
                checkBall();
                repaint();
            } else {
                break;
            }
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            java.util.logging.Logger.getLogger(Game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game1().setVisible(true);
            }
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
//        System.out.println(ke.getKeyCode());
        if (count < 1000 && damage < 200) {
            switch (ke.getKeyCode()) {
                case 39:
                case 68:
                    if (x < getWidth() - 60) {
                        x = x + 10;
                        repaint();
                    }
                    break;
                case 37:
                case 65:
                    if (x > 10) {
                        x = x - 10;
                        repaint();
                    }
                    break;
                case 38:
                case 87:
                    if (y > 30) {
                        y = y - 10;
                        repaint();
                    }
                    break;
                case 40:
                case 83:
                    if (y < getHeight() - 60) {
                        y = y + 10;
                        repaint();
                    }
                    break;

                case 32: {
                    createBullet();
                    break;
                }
                case 82: {
                    for (int i = 0; i < bullet.length; i++) {
                        bullet[i] = null;
                        bulletCount = bullet.length;
                        reloading();
                        clip4.loop(0);
                    }
                    break;
                }
            }
            checkCollission();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
