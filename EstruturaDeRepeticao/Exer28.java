package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer28 {
    public static void main(String[] args) {
        /** Faça um programa que calcule o valor total investido 
         * por um colecionador em sua coleção de CDs e o valor 
         * médio gasto em cada um deles. O usuário deverá informar 
         * a quantidade de CDs e o valor para em cada um. */

         Scanner sc = new Scanner(System.in);

         System.out.println("Informe a quantidade de CDs:");
         double numCDs = sc.nextDouble();

         double valorTotal = 0;

         for (int i = 1; i <= numCDs; i++) {
             System.out.println("Digite o valor do " + i + "° CD");
             valorTotal += sc.nextDouble();
         }

         System.out.println("Valor total gasto nos CDs: " + valorTotal);
         sc.close();
         
    }
    
}
