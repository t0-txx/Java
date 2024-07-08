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
        
//        int[] n = countNumber();

//        for(int i = 1;i <=5;i++)
//        {
//            System.out.println(countNumber(i));
//        }
//        System.out.println(receiveNumber(1,2,3,4,5));

        int[] number = {1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,4,4,4,5,5,5};
        int[] n = countNumber(number);
//        showData(number);
//        showData(n);
        float[] f = percentOfFrequency(number);
        showData(f);
        System.out.println(getMax(number));
        System.out.print(getMin(number));
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
    
    public static int[] countNumber(int[] number)
    {
        int[] c = {0,0,0,0,0};
        for(int i = 0;i < number.length;i++)
        {
            c[number[i]-1]++;
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
    
    public static int countMax()
    {
        int[] number = {1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,4,4,4,5,5,5};
        int c=number[0];
        for(int i = 0;i <= number.length-1;i++)
        {
            if(number[i] > c)
                c = number[i];
        }
        return c;
    }
    
    public static int countMin()
    {
        int[] number = {1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,4,4,4,5,5,5};
        int c=number[0];
        for(int i = 0;i <= number.length-1;i++)
        {
            if(number[i] < c)
                c = number[i];
        }
        return c;
    }
    
    public static String receiveNumber(int num1,int num2,int num3,int num4,int num5)
    {
        int[] number = {num1,num2,num3,num4,num5};
        String st = "";
        for(int i = 0;i <= number.length-1;i++)
        {
            st += number[i] + " ";
        }
        return st;
    }
    
    public static void showData(float[] x)
    {
        for(int i = 0;i < x.length;i++)
        {
            System.out.print(x[i] + "  ");
        }
        System.out.println();

    }
    
    public static float[] percentOfFrequency(int[] x)
    {
        float[] f = {0,0,0,0,0};
        int[] c = countNumber(x);
        for(int i = 0;i < c.length;i++)
        {
            f[i] = ( c[i] * 100.0f) / x.length;
        }
        return f;
    }
    
    public static String getMax(int[] perrcent)
    {
        float[] c = percentOfFrequency(perrcent);
        float m = c[0];
        int number = 0;
        String st = "";
        for(int i = 0;i < c.length;i++)
        {
            if(c[i] > m)
            {
                m = c[i];
                number = i+1;
            }
        }
        st = "number = " + number + " % = " + m;
        return st;
    }
    
    public static String getMin(int[] perrcent)
    {
        float[] c = percentOfFrequency(perrcent);
        float m = c[0];
        int number = 0;
        String st = "";
        for(int i = 0;i < c.length;i++)
        {
            if(c[i] < m)
            {
                m = c[i];
                number = i+1;
            }        
        }
        st = "number = " + number + " % = " + m;
        return st;
    }
}
