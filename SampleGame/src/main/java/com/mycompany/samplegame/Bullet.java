/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.samplegame;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author WONG-PC
 */
public class Bullet extends Thread {
    int x,y;
    int width;
    Boolean play = true;
    Clip clip;
    
    public Bullet(int width,int x){
        this.width = width;
        y = width - 50;
        this.x=x;
        createSound();
    }
    
    public void createSound(){
        try
        {
            File soundFile = new File("G:\\img\\pew.wav");
            AudioInputStream adioIn = AudioSystem.getAudioInputStream(soundFile);
            clip = AudioSystem.getClip();
            clip.open(adioIn);
            clip.loop(0);
        }catch(Exception ex){}
    }
    
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 10, 30);
    }
    
    public void run(){
        while(y+10>=0){
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ball.class.getName()).log(Level.SEVERE, null, ex);
            }
            y=y-10;
        }
        play = false;
    }
}
