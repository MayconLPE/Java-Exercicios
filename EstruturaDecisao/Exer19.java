package EstruturaDecisao;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        /**
         * 19. Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do
         * mesmo.
         * Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
         * 326 = 3 centenas, 2 dezenas e 6 unidades
         * 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int num = sc.nextInt();

        int centenas = 0;
        int dezenas = 0;

        if (num >= 100) {
            centenas = num / 100;
            num = (centenas * 100) - num;
            System.out.print(centenas + " Centenas, ");
        }
        if (num < 100) {
            dezenas = num / 10;
            num = (dezenas * 10) - num;
            System.out.print(dezenas + " Dezenas e ");
        }
        if (num < 10) {
            System.out.print( num + " Unidades");
        }


    }
}
