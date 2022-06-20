package EstruturaDecisao;

import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {
        /**
         * 21. Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário o valor 
         * do saque e depois informar quantas notas de cada valor serão fornecidas. As notas disponíveis 
         * serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. 
         * O programa não deve se preocupar com a quantidade de notas existentes na máquina.
         * Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50,
         * uma nota de 5 e uma nota de 1;
         * Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50,
         * quatro notas de 10, uma nota de 5 e quatro notas de 1.
         */

         Scanner sc = new Scanner(System.in);

         System.out.println("Digite o valor do saque: ");
         int valorSaque = sc.nextInt();

         
            if(valorSaque >= 10 && valorSaque <= 600) {

               int notas100 = ((valorSaque - (valorSaque % 100)) / 100);
               int notas50 = ((valorSaque % 100) / 50);
               int notas10 = ((valorSaque % 50) / 10);
               int notas5 = ((valorSaque % 10) / 5);
               int notas1 = ((valorSaque % 5) / 1);
         
               // Notas de 100.
               if(notas100 == 1) {
                  System.out.println(notas100 + " Nota de R$ 100");
               } else if (notas100 > 1) {
                  System.out.println(notas100 + " Notas de R$ 100");
               }
               // Notas de 50.
               if(notas50 == 1) {
                  System.out.println(notas50 + " Nota de R$ 50");
               } else if (notas50 > 1) {
                  System.out.println(notas50 + " Notas de R$ 50");
               }
               // Notas de 10.
               if(notas10 == 1) {
                  System.out.println(notas10 + " Nota de R$ 10");
               } else if (notas10 > 1) {
                  System.out.println(notas10 + " Notas de R$ 10");
               }
               // Notas de 5.
               if(notas5 == 1) {
                  System.out.println(notas5 + " Nota de R$ 5");
               } else if (notas5 > 1) {
                  System.out.println(notas5 + " Notas de R$ 5");
               }
               // Notas de 1.
               if(notas1 == 1) {
                  System.out.println(notas1 + " Nota de R$ 1");
               } else if (notas1 > 1) {
                  System.out.println(notas1 + " Notas de R$ 1");
               }

              
            } else {
               System.out.println("Valor de saque inválido!\nO valor mínimo é de 10 reais e o máximo de 600 reais.");  

         }
        
         sc.close();
    }
    
}
