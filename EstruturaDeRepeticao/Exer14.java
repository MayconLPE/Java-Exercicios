package EstruturaDeRepeticao;

import java.util.Scanner;
import java.util.SortedMap;

public class Exer14 {
    public static void main(String[] args) {
        /**
         * Faça um programa que peça 10 números inteiros, calcule 
         * e mostre a quantidade de números pares e a quantidade de números impares.
         */
         Scanner sc = new Scanner(System.in);

         int num = 0;
         int soma = 0;
         int count = 10;
         int impares = 0;
         int pares = 0;

         for (int i = 0; i < count; i++) {
             System.out.print("Digite um número inteiro:");
             num = sc.nextInt();
             if (num % 2 == 0) {
                 pares++;
             } else {
                 impares++;
             }
             soma += num;               
         }
         System.out.println("Soma dos 10 números: " + soma);
         System.out.println("Quantidade de números pares: " + pares);
         System.out.println("Quantidade de números impares: " + impares);
         
         sc.close();
    }
    
}
