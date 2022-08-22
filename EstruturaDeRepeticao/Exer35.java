package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer35 {
    public static void main(String[] args) {
        /** Encontrar números primos é uma tarefa difícil. Faça um programa 
         * que gera uma lista dos números primos existentes entre 1 e um 
         * número inteiro informado pelo usuário. */

         Scanner sc = new Scanner(System.in);
         int numDivisores = 0;
         

         System.out.println("Digite um número que deseja ver os primos entre eles:");
         int numFinal = sc.nextInt();

         for (int i = 1; i <= numFinal; i++) {
            if (numFinal % i == 0) {
            }

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    numDivisores++;
                }
            }
            if (numDivisores == 2) {
                System.out.println("O número " + i + " é primo.");
            }
            numDivisores = 0;
        }                   
         
         sc.close();
    }
}
