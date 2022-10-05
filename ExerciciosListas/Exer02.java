package ExerciciosListas;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        /** Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa. */

        Scanner sc = new Scanner(System.in);

        int num[] = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite a posição: " + i);
            num[i] = sc.nextInt();
        }

        for (int i = num.length - 1; i >= 0 ; i--) {
            System.out.print(num[i] + " ");
        }

        
    }
}
