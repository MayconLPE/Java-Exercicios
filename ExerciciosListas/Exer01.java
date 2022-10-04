package ExerciciosListas;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        /** Faça um Programa que leia um vetor de 5 números inteiros e mostre-os. */

        Scanner sc = new Scanner(System.in);

        int num[] = new int[4];

        for (int i = 0; i <= num.length; i++) {
            System.out.println("Digite o número do vetor " + i );
            num[i] = sc.nextInt();
        }

       for (int i = 0; i <= num.length; i++) {
        System.out.println(num[i]);
       }

        
        
    }
    
}
