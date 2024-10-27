/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1vetores;
import java.util.Scanner;
/**
 *
 * @author suzana
 */
public class ex4 {public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         int[] num1  = new int[8];
         int[] num2 = new int[8];
         int[] num3 = new int[8];
          
         for ( int i = 0; i < 8; i++){
                 System.out.println("vetor 1:" );
                 num1[i] = s.nextInt();
                 
    }
         
    for ( int i = 0; i < 8; i++){
                 System.out.println("vetor 2:" );
                 num2[i] = s.nextInt();
                 
    }
   
                 
    
    for (int i = 0; i < 8; i++) {
            num3[i] = num1[i] * num2[i];
        }

     
            System.out.println("resultado de num1 e num2:");
        for ( int i = 0; i < 8; i++){
             System.out.println("resultado da multiplicacao de num1 + num2:" +(i +1) + num3[i]);
    
         
    
        }     
    
}
}