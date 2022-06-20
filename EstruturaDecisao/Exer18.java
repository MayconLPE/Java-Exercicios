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

        // ano
        if ((ano >= 1 && ano <= 9999) || (mes >=1 && mes <= 12) || (dia >= 1 && dia <= 31)){
            System.out.println("Data valida");
            System.out.println(dia + " / " + mes + " / " + ano);
        } else {
            System.out.println("Data invalida");
        }



                /**
                if (dia >= 1 && dia <= 31) {
                    // dia
                    if ((dia >= 1 && dia <= 31) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) {
                        System.out.println("Data Valida.");
                    } else {
                        System.out.println("Dia invalida!");
                    }

                    if ((dia >= 1 && dia <= 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
                        System.out.println("Data Valida");
                    } else {
                            System.out.println("Dia invalida!");
                        }
                     if ((dia >= 1 && dia <= 28) && (mes == 2)) {
                         System.out.println("Data Valida");
                     } else {
                         System.out.println("Dia invalida!");
                     }
                     if (dia == 29 && mes == 2 && (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))) {
                        System.out.println("Data Valida");
                    }else {
                         System.out.println("Dia invalida!");
                     }

                    /**else {
                        System.out.println("Dia invalida!");
                    } else {
                        System.out.println("Mês invalido");
                    } else {
                        System.out.println("Ano invalido");
                    }
                 System.out.println(dia + " / " + mes + " / " + ano);
                 */

                sc.close();

        }


    }


