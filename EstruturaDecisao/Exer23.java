package EstruturaDecisao;

import java.util.Scanner;

public class Exer23 {
    public static void main(String[] args) {
        /**
         * 23. Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
         *  Dica: utilize uma função de arredondamento.
         */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        double num = sc.nextDouble();

        if (num % 1 == 0) {
            System.out.println("Inteiro");
        } else {
            System.out.println("Decimal");
        }

    }
}
