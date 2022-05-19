package EstruturaDecisao;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        /* 18. Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("digite uma data com o seguinte formato dd/mm/aaaa");

        System.out.println("Digite o Dia:");
        int dia = sc.nextInt();
        System.out.println("Digite o mês:");
        int mes = sc.nextInt();
        System.out.println("Digite o ano:");
        int ano = sc.nextInt();

        if (ano >= 1900 && ano <= 9999) {
            // ano
            if (mes >=1 && mes <= 12) {
                // mês
                if (dia >= 1 && dia <= 31) {
                    // dia

                }
            }
        }

        System.out.println(dia + " / " + mes + " / " + ano);
    }
}

