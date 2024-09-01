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
import java.awt.image.ImageObserver;
import java.io.File;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author com4936
 */
public class Ball extends Thread implements ImageObserver {

    int x, y = 30;
    int width, delay;
    int count;
    Color[] colorList = {Color.PINK, Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW};
    Color color;
//    Image[] imageList = new Image[8];
//    Image image;
    Boolean play = true;
    Random random = new Random();
    

    public Ball(int width) {
        this.width = width;
        x = random.nextInt(width - 50);
        int c = random.nextInt(colorList.length);
        color = colorList[c];
//        loadImage();
//        int c = random.nextInt(imageList.length);
//        image = imageList[c];
        delay = random.nextInt(480) + 20;
        count = 500 / delay;
    }

//    private void loadImage() {
//        try {
//            imageList[0] = ImageIO.read(new File("..\\picture\\ponit  (1).png"));
//            imageList[1] = ImageIO.read(new File("..\\picture\\ponit  (2).png"));
//            imageList[2] = ImageIO.read(new File("..\\picture\\ponit  (3).png"));
//            imageList[3] = ImageIO.read(new File("..\\picture\\ponit  (4).png"));
//            imageList[4] = ImageIO.read(new File("..\\picture\\ponit  (5).png"));
//            imageList[5] = ImageIO.read(new File("..\\picture\\ponit  (6).png"));
//            imageList[6] = ImageIO.read(new File("..\\picture\\ponit  (7).png"));
//            imageList[7] = ImageIO.read(new File("..\\picture\\ponit  (8).png"));
//        } catch (Exception ex) {
//        }
//    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 50, 50);
//        g.drawImage(image, x, y, 50, 50, this); // Draw the loaded image

        g.setColor(Color.BLACK);
        g.setFont(new Font("Angsana new", Font.BOLD, 20));
        g.drawString("" + count, x + 20, y + 30);
    }

    public void run() {
        while (y + 10 < width - 50) {
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
