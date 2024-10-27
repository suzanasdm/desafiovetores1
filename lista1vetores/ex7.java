/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    
import java.util.Random;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[50];

       
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100) + 1; 
        }

       
        System.out.print("Digite um número para verificar se está presente: ");
        int numero = s.nextInt();

        
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                encontrado = true;
                break;
            }
        }

        
        if (encontrado) {
            System.out.println("Está presente.");
        } else {
            System.out.println("Não está presente.");
        }
    }
}


