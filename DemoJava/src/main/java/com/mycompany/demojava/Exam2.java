/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.demojava;

/**
 *
 * @author com4936
 */
public class Exam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int ans = plusNumber(599,855);
//        System.out.println(ans);
//        System.out.println(plusNumber(599,855));

//        int result = computeNumber(8,4,'/');
//        System.out.println(result);
//        System.out.println(computeNumber(8,4,'/'));

//        showAtoN('e','z');

//1 
//        int num = 10;
//        System.out.println("Muliplication = " + num);
//        showMuliplicationN(num);

//2
//        int num1 = 1;
//        int num2 = 5;
//        System.out.print("showResultN " + num1 + " - " + num2 + " : ");
//        System.out.print(showResultN(num1,num2));

//3
//        int num1 = 1;
//        int num2 = 10;
//        System.out.println("EvenNumber " + num1 + " - " + num2);
//        showEvenNumber(num1,num2);

//4
//        int num1 = 1;
//        int num2 = 10;
//        int divid = 3;
//        System.out.println("showDivide " + num1 + " - " + num2 + " Divide = " + divid);
//        System.out.println("Count = "+showDivideN(1,10,3));
    }
    
    public static int plusNumber(int num1,int num2)
    {
//        int answer = num1 + num2;
//        return answer;
        return num1 + num2;
    }
    
    public static int computeNumber(int num1,int num2,char opt)
    {
        //int answer = 0;
        switch(opt)
        {
            case '+' : return num1 + num2;
            case '-' : return num1 - num2;
            case '*' : return num1 * num2;
            case '/' : return num1 / num2;
        }
        return 0;
    }
    
    public static String getProgramName()
    {
        int programCode = 63;
        if(programCode == 13)
        {
            return "Infomation Technology";
        }
        else
        {
            return "Computter Science";
        }
    } 
    
    public static void show1ToN(int n)
    {
        for(int i = 1;i <= n ;i++)
        {
            System.out.println(i);
        }
    }
    
    public static void showAtoN(char n1,char n2)
    {
        for(char i = n1;i <= n2 ;i++)
        {
            System.out.println(i);
        }
    }
    
    public static void showMuliplicationN(int n)
    {
        for(int i = 1;i <= 12 ;i++)
        {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
    
    public static int showResultN(int number1,int number2)
    {
        int result = 0;
        for(int i = number1;i <= number2 ;i++)
        {
            result = result + i;
        }
        return result;
    }
    
    public static void showEvenNumber(int number1,int number2)
    {
        for(int i = number1;i <= number2 ;i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
    
    public static int showDivideN(int number1,int number2,int div)
    {
        int count = 0;
        for(int i = number1;i <= number2 ;i++)
        {
            if(i % div == 0)
            {
                count++;
            }
        }
        return count;
    }
}
