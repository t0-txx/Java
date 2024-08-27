/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.samplegame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author WONG-PC
 */
public class Item extends Thread {
    int x,y;
    int width;
    Boolean play = true;
    
    public Item(int width){
        this.width = width;
        Random random = new Random();
        y = random.nextInt(width-50);
        x = width-50;
    }
    
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(x, y, 50, 50);
    }
    
    public void run(){
        while(x-10>0){
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ball.class.getName()).log(Level.SEVERE, null, ex);
            }
            x=x-10;
        }
        play = false;
    }
}
