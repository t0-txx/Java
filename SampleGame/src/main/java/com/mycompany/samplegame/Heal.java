/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.samplegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author WONG-PC
 */
public class Heal extends Thread {

    int x, y = 30;
    int width;
    Boolean play = true;
    BufferedImage imageList;
    ImageIcon image;

    public Heal(int width) {
        this.width = width;
        Random random = new Random();
        loadImage();
        image = new ImageIcon(imageList);
        x = random.nextInt(width - 50);
    }

    private void loadImage() {
        try {
            imageList = ImageIO.read(new File("..\\picture\\heal.png"));
        } catch (Exception ex) {
        }
    }

    public void paint(Graphics g) {
//        g.setColor(color);
//        g.fillOval(x, y, 50, 50);
        g.drawImage(image.getImage(), x, y, 50, 50, null);
    }

    public void run() {
        while (y + 10 < width) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ball.class.getName()).log(Level.SEVERE, null, ex);
            }
            y = y + 10;
        }
        play = false;
    }
}
