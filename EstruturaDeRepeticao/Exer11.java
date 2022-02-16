package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        /** 11. Altere o programa anterior para mostrar no final a soma dos números. */

        /*Faça um programa que receba dois números inteiros 
         * e gere os números inteiros que estão no intervalo 
         * compreendido por eles.*/

         Scanner sc = new Scanner(System.in);

         System.out.print("Digite o primeiro número:");
         int n1 = sc.nextInt();
         System.out.print("Digite o segundo número:");
         int n2 = sc.nextInt();

         int soma = 0;

         if (n1 < n2) {
             for (int i = n1+1; n2 > i; i++) {
                 System.out.println(i);
                 soma += i;
             }

         } else if (n2 < n1) {
             for (int i = n2+1; n1 > i; i++) {
                 System.out.println(i);
                 soma += i;
             }

         } else {
             System.out.println("Número iguais.");
         }
         System.out.println("Soma dos números: " + soma);
        sc.close();
    }
    
}
