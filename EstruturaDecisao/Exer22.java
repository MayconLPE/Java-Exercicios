package EstruturaDecisao;

import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args) {
        /**
         * 22. Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
         *  Dica: utilize o operador módulo (resto dadivisão).
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }



        sc.close();
    }
}
