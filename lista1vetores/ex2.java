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
public class ex2 {public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double notas[] = new double[10];
    double mediaturma  , menor = 99999.0, maior = -99999.0;
  
    
            System.out.println("Informe as notas dos bimestres");
            System.out.println("Ensira a nota do aluno:");
            notas[0] = s.nextDouble();
            System.out.println("Ensira a nota do aluno:");
            notas[1] = s.nextDouble();
            System.out.println("Ensira a nota do aluno");
            notas[2] = s.nextDouble();
            System.out.println("Ensira a nota do aluno");
            notas[3] = s.nextDouble();
            System.out.println("Ensira a nota do aluno");
            notas[4] = s.nextDouble();
            System.out.println("Ensira a nota do aluno");
            notas[5] = s.nextDouble();
            System.out.println("Ensira a nota do aluno");
            notas[6] = s.nextDouble();
            System.out.println("Ensira a nota do aluno");
            notas[7] = s.nextDouble();
            System.out.println("Ensira a nota do aluno");
            notas[8] = s.nextDouble();
            System.out.println("Ensira a nota do aluno");
            notas[9] = s.nextDouble();
            
            mediaturma = (notas[0]+ notas[1] + notas[2] + notas[3] + notas[4]+ notas[5] + notas[6] + notas[7]+ notas[8] + notas[9])  / 10;
            System.out.println("Media da turma:" + mediaturma);
            
            System.out.println("Calculo com laço:");
            for(int i=0;i<notas.length; i++){
              if(notas[i] < menor ){
                menor = notas[i];  
                  }
              else if (notas[i] > maior ){
                  maior = notas[i];
            
                  System.out.println("maior nota:" + maior + "-" + "menor nota:" + menor);
            
            }
                  
           
            }
}

                      

            

        
    }
    
    

