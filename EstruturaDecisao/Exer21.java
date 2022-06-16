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

         int notas100 = valorSaque / 100;
         valorSaque = valorSaque % 100;

         int notas50 = valorSaque / 50;
         valorSaque = valorSaque % 50;

         int notas10 = valorSaque / 10;
         valorSaque = valorSaque % 10;

         int notas5 = valorSaque / 5;
         valorSaque = valorSaque % 5;

         int notas1 = valorSaque;

         System.out.println(notas100 + " Notas de 100");
         System.out.println(notas50 + " Notas de 50");
         System.out.println(notas10 + " Notas de 10");
         System.out.println(notas5 + " Notas de 5");  
         System.out.println(notas1 + " Notas de 1");

               


         if(valorSaque >= 10 && valorSaque <= 600) {
            System.out.println("ok");

         } else {
            System.out.println("Valor de saque inválido!\nO valor mínimo é de 10 reais e o máximo de 600 reais.");
         }

        
    }
    
}
