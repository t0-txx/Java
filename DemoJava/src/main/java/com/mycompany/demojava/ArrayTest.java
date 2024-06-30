/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.demojava;

/**
 *
 * @author com4936
 */
public class ArrayTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(countAvg());
    }
    
    public static String getTextNumber(int number)
    {
        String[] text = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if(number >= 1 && number <= text.length)
            return text[number-1];
        return "Unknow";
        
//        switch(number)
//        {
//            case 1 : return "One";
//            case 2 : return "Two";
//            case 3 : return "Three";
//            case 4 : return "Four";
//            case 5 : return "Five";
//            case 6 : return "Six";
//            case 7 : return "Seven";
//            case 8 : return "Eight";
//            case 9 : return "Nine";
//        }
//        return "Unknow";
    }
    
    public static int countNumber(int x)
    {
        int[] number = {1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,4,4,4,5,5,5};
        int c=0;
        for(int i = 0;i <= number.length-1;i++)
        {
            if(number[i] == x)
            {
                c++;
            }
        }
        return c;
    }
    
    public static double countAvg()
    {
        int[] number = {1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,4,4,4,5,5,5};
        int c=0;
        double avg = 0;
        for(int i = 0;i <= number.length-1;i++)
        {
            c = c + i;
        }
        avg = c/number.length;
        return avg;
    }
}
