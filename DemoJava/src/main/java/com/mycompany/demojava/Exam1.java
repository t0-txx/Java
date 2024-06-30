/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.demojava;

import java.util.Scanner;

/**
 *
 * @author com4936
 */
public class Exam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
//        int day;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter day : ");
//        day = scan.nextInt();
        getMonthName(2);
    }
    
    public static void getNumber()
    {
        int x = 2;
        int y = 8;
        int z = x+y;
        if (z > 10)
            System.out.print("more than 10");
        else
            System.out.print("less than or equal 10");

//        System.out.print(x + " + " + y + " = " + z);
    }
    
    public static void getTextNumber()
    {
        int number = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        number = scan.nextInt();
        System.out.println("number = " + number);
        switch (number) {
            case 0:
                System.out.print("Zero");
                break;
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
            default:
                System.out.print("Over");
                break;
        }
    }
    
    public static void getDayName(int day)
    {
//        int day = 1;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter day : ");
//        day = scan.nextInt();
//        System.out.println("day = " + day);
        switch (day) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("No Day Name");
                break;
        }
    }
    
    public static void getMonthName(int month)
    {
//        int month = 1;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter month : ");
//        month = scan.nextInt();
//        System.out.println("month = " + month);
        if(month == 1)
            System.out.print("January");
        else if(month == 2)
            System.out.print("February");
        else if(month == 3)
            System.out.print("March");
        else if(month == 4)
            System.out.print("April");
        else if(month == 5)
            System.out.print("May");
        else if(month == 6)
            System.out.print("June");
        else if(month == 7)
            System.out.print("July");
        else if(month == 8)
            System.out.print("August");
        else if(month == 9)
            System.out.print("September");
        else if(month == 10)
            System.out.print("October");
        else if(month == 11)
            System.out.print("November");
        else if(month == 12)
            System.out.print("December");
    }
    
    public static void getNumderOfMonth()
    {
        int month;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter month : ");
        month = scan.nextInt();
        System.out.println("month = " + month);
        int year = 2024;
        if(month == 1||month == 3||month == 5||month == 7||month == 8||month == 10||month == 12)
            System.out.print("31 days");
        else if(month == 2)
            if(year % 4 == 0)
                System.out.print("29 days");
            else
                System.out.print("28 days");
        else if (month == 4||month == 6||month == 9||month == 11)
            System.out.print("30 days");
        else
            System.out.print("No Month Name");
    }
    
    public static void getNumderOfMonth2()
    {
        int month;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter month : ");
        month = scan.nextInt();
        System.out.println("month = " + month);
        int year = 2024;
        switch (month) {
            case 1:case 3:case 5:case 7:case 10:case 12:
                System.out.print("31 days");
                break;
            case 2:
                if(year % 4 == 0)
                    System.out.print("29 days");
                else
                    System.out.print("28 days");
                break;
            case 4:case 6:case 8:case 9:case 11:
                System.out.print("30 days");
                break;
            default:
                System.out.print("No Month Name");
                break;
        }
    }
    
    public static void showNumber()
    {
        int i = 1;
        while(i <= 10)
        {
            System.out.println(i);
            i++;
        }
    }
    
    public static void showNumber2()
    {
        int i = 1;
        do
        {
            System.out.print(i + "\t");
            if(i % 10 == 0)
                System.out.print("\n");
            i++;
        }
        while(i <=100);
    }
    
    public static void showEvenNumber()
    {
        for(int i = 2;i <= 100;i = i + 2)
        {
            System.out.println(i);
        }
    }
    
    public static void showOddNumber()
    {
        int i = 3;
        while(i <=100)
        {
            System.out.println(i);
            i = i + 2;
        }
    }
    
    public static void showLetter()
    {
        for(char i = 'a';i <= 'z';i++)
        {
            System.out.println(i);
        }
    }
}
