package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        /** Faça um programa que calcule o fatorial de um número inteiro 
         * fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120 */
        
         Scanner sc = new Scanner(System.in);

         System.out.println("Digite o número:");
         int num = sc.nextInt();

         int fatorial = 1;

         for (int i = 1; i <= num; i++) {
             fatorial *= i;           
         }
         System.out.println("Fatorial de "+ num + " = " + fatorial);

         sc.close();
    }
    
}
