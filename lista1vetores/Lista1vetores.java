/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista1vetores;
import java.util.Scanner;
/**
 *
 * @author suzana
 */
public class Lista1vetores {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String[] nome = new String[4];
        int[] ras = new int[4];
        double[] nota = new double[4]   ;
        double soma , mediasala; 
       
       
       
           System.out.println("Informe a nota do aluno 1B:");
           nota[0] = s.nextDouble();
           System.out.println("Informe a nota do aluno 2B:");
           nota[1] = s.nextDouble();
           System.out.println("Informe a nota do aluno 3B:");
           nota[2] = s.nextDouble();
           System.out.println("Informe a nota do aluno 4B:");
           nota[3] = s.nextDouble();
           
           
          
           soma = (nota[0]+ nota[1]+nota[2]+nota[3]) ;
           
           System.out.println("nota total do aluno: " + soma);
           
          mediasala = soma / 4 ;
          
          System.out.println("media da sala :" + mediasala);
           
         
          
          for (int i = 0; i < 5; i++){
       
       
       
       }

        }
}

