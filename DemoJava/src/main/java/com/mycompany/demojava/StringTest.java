/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.demojava;

/**
 *
 * @author com4936
 */
public class StringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String st = "Chiangrai";
        System.out.println(st); //1
        System.out.println(st.length()); //2
        System.out.println(st.charAt(0)); //3
        System.out.println(st.charAt(st.length()-1) ); //4
        System.out.println("\n" + st.substring(0,3) + "\n"); //5
        
        for(int i = 0;i <= st.length()-1;i++) //6
            System.out.println(st.charAt(i));
        
        System.out.println();
        
        for(int i = 0;i <= st.length()-1 ;i++) //6.2
            System.out.print(st.substring(i,i+1) + " ");

        System.out.println("\n");
        
        for(int i = st.length()-1;i >= 0;i--) //7.2
            System.out.println(st.charAt(i));
        
        System.out.println();
        
        for(int i = st.length()-1;i >= 0;i--) //7
            System.out.print(st.substring(i,i+1) + " ");
        
        System.out.println("\n");
        
        for(int i = 0;i < st.length();i++)
        {
            if(st.charAt(i) == 'a')
            {
                System.out.println("Yes");
                break;
            }
        }
        System.out.println(st.indexOf("a",4));
        
        int firstIndex = st.indexOf("C");
        
        if(st.indexOf("C",firstIndex + 1) >= 0)
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
    
}
