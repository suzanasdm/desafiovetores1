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
public class ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
               
        System.out.print("Informe a quandtidade de frutas: ");
        int quantidade = s.nextInt();
        s.nextLine();

       
        String[] frutas = new String[quantidade];

        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Ensira  o nome da fruta " + (i + 1) + ": ");
            frutas[i] = s.nextLine();
        }

        
        System.out.println("\nFrutas informadas e número de caracteres:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Fruta " + (i + 1) + ": " + frutas[i] + " (" + frutas[i].length() + " letras)");
        }
    }

    }

