package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer32 {
    public static void main(String[] args) {
        /** 32. Faça um programa que calcule o fatorial de um número inteiro
         *  fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser
         * conforme o exemplo abaixo: 
         * Fatorial de: 5
         * 5! = 5 . 4 . 3 . 2 . 1 = 120 */

         Scanner sc = new Scanner(System.in);

         System.out.print("Digite o número que deseja o fatorial: ");
         int num = sc.nextInt();
         
         int fator = 1;

         for (int i = 1; i <= num ; i++) {
             fator *= i;       
         }

         System.out.println("Fatorial de: " + num + " é " + fator);

    }
    
}
