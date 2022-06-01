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

        int numTotal = num;

        int unidade = num % 10;
        num = (num - unidade)/10;

        int dezena = num % 10;
        num = (num - dezena)/10;

        int centena = num;


        if (numTotal >= 100) {
            System.out.println(centena + " Centena(s), " + dezena + " dezena(s) e " + unidade + " unidade(s)");
        } else if (numTotal >=10 && numTotal < 100) {
            System.out.println(dezena + " dezena(s) e " + unidade + " unidade(s)");
        } else if (numTotal < 10) {
            System.out.println(unidade + " unidade(s)");
        }


    }
}
