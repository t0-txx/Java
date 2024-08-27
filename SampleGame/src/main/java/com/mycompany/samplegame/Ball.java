/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.samplegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author com4936
 */
public class Ball extends Thread {
    int x,y=30;
    int width,delay;
    int count;
    Color[] colorList={Color.PINK,Color.BLUE,Color.RED,Color.GREEN,Color.YELLOW};
    Color color;
    Boolean play = true;
    
    public Ball(int width){
        this.width = width;
        Random random = new Random();
        x = random.nextInt(width-50);
        int c = random.nextInt(colorList.length);
        color = colorList[c];
        delay = random.nextInt(480)+20;
        count = 500/delay;
    }
    
    public void paint(Graphics g){
        g.setColor(color);
        g.fillOval(x, y, 50, 50);
        
        g.setColor(Color.BLACK);
        g.setFont(new Font("Angsana new", Font.BOLD, 20));
        g.drawString("" + count ,x+20, y+30);
    }
    
    public void run(){
        while(y+10<width-50){
            try {
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ball.class.getName()).log(Level.SEVERE, null, ex);
            }
            y=y+10;
        }
        play = false;
    }
}