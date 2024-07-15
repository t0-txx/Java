/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classandobject;

/**
 *
 * @author com4936
 */
public class Manager extends Employee { //extends (inheritance)
    String department;
    
    public Manager(){}
    
    public Manager(String id,String name,String sex,int salary,String department)
    {
        super(id,name,sex,salary);
        this.department = department;
    }
    
    public void print()
    {
        super.print();
        System.out.print(" " + department);
    }
}
