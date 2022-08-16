package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {
        /** Faça um programa que peça um número inteiro e determine se 
         * ele é ou não um número primo. Um número primo é aquele que é 
         * divisível somente por ele mesmo e por 1. */

         Scanner sc = new Scanner(System.in);
         int numDivisores = 0;

         System.out.println("Digite um número:");
         int numPrimo = sc.nextInt();

         for (int i = 1; i <= numPrimo; i++) {
             if (numPrimo % i == 0) {
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
