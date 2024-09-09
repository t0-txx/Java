/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.samplegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author WONG-PC
 */
public class Heart {
    int heart = 200;
    int damage;
    
     public Heart(int damage){
        this.damage = damage;
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(50, 150, 200, 20);

        g.setColor(Color.RED);
        g.fillRect(50, 150, heart-damage, 20);
    }
}
