package EstruturaDecisao;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        
        /**
         * 17. Faça um Programa que peça um número correspondente a um determinado ano
         * e em seguida informe se este ano é ou não bissexto.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano para saber se ele é bissexto:");
        int ano = sc.nextInt();

        int anoBissexto = ano % 4;

        if (anoBissexto == 0) {
            System.out.println(ano + " é um Ano bissexto");
        } else {
            System.out.println(ano + " Não é bissexto");
        }
        sc.close();
    }
    
}
