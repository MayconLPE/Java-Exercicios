package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        /** Altere o programa anterior para que ele aceite apenas números entre 0 e 1000 */
        
        /**  Faça um programa que, dado um conjunto de N números, 
         * determine o menor valor, o maior valor e a soma dos valores. */

         Scanner sc = new Scanner(System.in);

         System.out.print("Digite a quantidade de números que deseja digitar: ");
         int quant = sc.nextInt();
         int soma = 0;
         int maior = 0;
         int menor = Integer.MAX_VALUE;
  
         for (int i = 0; i < quant; i++) {
             System.out.print("Digite o número: ");
             int num = sc.nextInt();
             
             if (num >= 0 && num <= 1000) {
                 soma +=num;

                 if (num > maior) {
                    maior = num;                              
                 } 
                 if (num < menor) {
                    menor = num;   
                 }  
                 
             } else {
                 System.out.println("Número invalido, Digite um número entre 0 e 1000.");
             }
             
         }
         System.out.println("A soma dos números: " + soma);
         System.out.println("O maior número: " + maior);
         System.out.println("O menor número: " + menor);
         sc.close();
         
    }
    
}
