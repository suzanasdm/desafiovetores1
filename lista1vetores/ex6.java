/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1vetores;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author suzana
 */
public class ex6 { public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Quantos preços você deseja gerar? ");
        int quantidade = s.nextInt();
        double[] precos = new double[quantidade];

        double menor  = 99999.0, maior =  -99999.0, soma = 0;

        
        for (int i = 0; i < quantidade; i++) {
            precos[i] = 1.0 + (100.0 - 1.0) * random.nextDouble();
            soma += precos[i];
            if (i == 0 || precos[i] < menor) menor = precos[i];
            if (i == 0 || precos[i] > maior) maior = precos[i];
            System.out.printf("Preço %d: %.2f\n", i + 1, precos[i]);
        }

      
        System.out.println("\nResultados:");
        System.out.printf("Menor preço: %.2f\nMaior preço: %.2f\nMédia dos preços: %.2f\n", menor, maior, soma / quantidade);
    }
}

    

