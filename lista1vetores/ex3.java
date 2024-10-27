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
public class ex3 {public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] nome = new String[5];
        
        
             for ( int i = 0; i < 5; i++){
                 System.out.println("ensira o nome:"+ ( i + 1) + ":" );
                 nome[i] = s.next();
                 
                 
                   }
                      System.out.println("nomes informados:");
                       for (int i = 0; i < 5; i++){
                       System.out.println("nome"+ (i + 1) +":" +nome[i]);
                   }
                 
       
             }
        
    }
    
