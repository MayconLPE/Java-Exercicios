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

         System.out.print(num + "! = ");
         
         for (int i = num; i > 0 ; i--) {
            
             if (i == 1) {
                System.out.print(i + " = ");
             } else {
                System.out.print(i + " x ");
             }
             fator *= i;
         }
    
         System.out.print(fator);

         System.out.println("\nFatorial de: " + num + " é " + fator);

         sc.close();
    }
    
}
