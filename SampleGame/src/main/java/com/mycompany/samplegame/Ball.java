/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.samplegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author com4936
 */
public class Ball extends Thread implements ImageObserver {

    int x, y = 30;
    int width, delay;
    int count;
//    Color[] colorList = {Color.PINK, Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW};
//    Color color;
    BufferedImage[] imageList = new BufferedImage[8];
    ImageIcon image;
    Boolean play = true;
    Random random = new Random();

    public Ball(int width) {
        this.width = width;
        x = random.nextInt(width - 50);
////        int c = random.nextInt(colorList.length);
////        color = colorList[c];
        loadImage();
        int c = random.nextInt(imageList.length);
        image = new ImageIcon(imageList[c]);
        delay = random.nextInt(50,300) + 20;
        count = 500 / delay;
    }

    private void loadImage() {
        try {
            for (int i = 0; i < imageList.length; i++) {
                imageList[i] = ImageIO.read(new File("..\\picture\\ponit  (" + (i + 1) + ").png"));
            }
        } catch (Exception ex) {
        }
    }

    public void paint(Graphics g) {
//        g.setColor(color);
//        g.fillOval(x, y, 50, 50);
        g.drawImage(image.getImage(), x, y,50, 50,null);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Angsana new", Font.BOLD, 20));
        g.drawString("" + count, x + 20, y + 30);
    }

    public void run() {
        while (y + 10 < width ) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ball.class.getName()).log(Level.SEVERE, null, ex);
            }
            y = y + 10;
        }
        play = false;
    }

    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
