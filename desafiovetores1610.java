package com.mycompany.vetores;

import java.util.Scanner;

public class desafiovetores1610 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] nome = new String[5];
        int[] ras = new int[5];
        double[] nota = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome do aluno " + (i + 1) + ":");
            nome[i] = s.next();
            System.out.println("Informe o RA do aluno " + (i + 1) + ":");
            ras[i] = s.nextInt();
            System.out.println("Informe a nota do aluno " + (i + 1) + ":");
            nota[i] = s.nextDouble();
        }

        for (int i = 0; i < 5; i++) { String status = (nota[i] >= 60.0) ? "Aprovado" : "Reprovado"; 
            System.out.printf("%d-%s - RA: %d - Nota: %.1f - %s%n", (i + 1), nome[i], ras[i], nota[i], status);
        }
    }
}
