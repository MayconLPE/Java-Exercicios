package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer34 {
    public static void main(String[] args) {
        /** 34. Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia.
         *  Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça 
         * um número inteiro e determine se ele é ou não um número primo. */

         Scanner sc = new Scanner(System.in);
         int numDivisores = 0;

         System.out.println("Digite um número inteiro:");
         int num = sc.nextInt();
         
         for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                numDivisores++;
            }   
        }
        if (numDivisores == 2) {
            System.out.println("Primo");
        } else {
            System.out.println("Não é primo");
        }
        sc.close();
    }
}
