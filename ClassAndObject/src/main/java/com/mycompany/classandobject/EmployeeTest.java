/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.classandobject;

import java.util.Scanner;

/**
 *
 * @author com4936
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Employee emp = inputData();
        
        Employee emp[] = new Employee[5];
        
        emp[0] = new Employee("0001","wirachai","M",20000);
        emp[1] = new Employee("0002","two","M",25000);
        emp[2] = new Employee("0003","three","F",30000);
        emp[3] = new Employee("0004","four","F",35000);
        emp[4] = new Employee("0005","five","M",40000);
        
        for(int i = 0;i < emp.length;i++)
        {
            emp[i].print();
        }       
    }
    
    public static Employee inputData()
    {
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();
        employee.setID(scan.next());
        employee.setName(scan.next());
        employee.setSex(scan.next());
        employee.setSalary(scan.nextInt());
        //employee.id = scan.next();
        //employee.name = scan.next();
        //employee.sex = scan.next();
        //employee.salary = scan.nextInt();
        return employee;
    }
}
