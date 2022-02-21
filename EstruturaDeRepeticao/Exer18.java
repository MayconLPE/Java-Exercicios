package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        /**  Faça um programa que, dado um conjunto de N números, 
         * determine o menor valor, o maior valor e a soma dos valores. */

         Scanner sc = new Scanner(System.in);

         System.out.print("Digite a quantidade de número que deseja digitar: ");
         int quant = sc.nextInt();

         int soma = 0;
         int maior = 0;
         int menor = 0;

         for (int i = 0; i < quant; i++) {
             System.out.print("Digite o número: ");
             int num = sc.nextInt();      
             soma += num;
             
             if (num > maior) {
                maior = num;
             } else if (num < maior) {
                 menor = num;
             } 
         }

         System.out.println("Maior: " + maior);
         System.out.println("Menor: "+ menor);
         System.out.println("Soma: " + soma);

         sc.close();        
    }    
}
