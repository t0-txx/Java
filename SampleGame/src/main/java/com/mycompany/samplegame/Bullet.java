/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.samplegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.io.File;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author WONG-PC
 */
public class Bullet extends Thread implements ImageObserver {

    int x, y;
    int width;
    Boolean play = true;
    Clip clip;
    Image image;

    public Bullet(int width, int x) {
        this.width = width;
        y = width - 30;
        this.x = x;
        createSound();
        loadImage();
    }

    private void loadImage() {
        try {
            image = ImageIO.read(new File("..\\picture\\bullet.png")); // Adjust the path as needed
        } catch (Exception ex) {
        }
    }

    public void createSound() {
        try {
            File soundFile = new File("..\\img\\pew.wav");
            AudioInputStream adioIn = AudioSystem.getAudioInputStream(soundFile);
            clip = AudioSystem.getClip();
            clip.open(adioIn);
            clip.loop(0);
        } catch (Exception ex) {
        }
    }

    public void paint(Graphics g) {

//        g.drawImage(image, x, y, 10, 30, (ImageObserver) this);
//        g.setColor(Color.BLACK);
//        g.fillRect(x, y, 10, 30);
        g.drawImage(image, x, y, 40, 40, this); // Draw the loaded image
    }

    public void run() {
        while (y + 10 >= 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ball.class.getName()).log(Level.SEVERE, null, ex);
            }
            y = y - 10;
        }
        play = false;
    }

    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
