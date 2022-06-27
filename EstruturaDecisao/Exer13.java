package EstruturaDecisao;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        /* 13. Faça um Programa que leia um número e exiba o dia correspondente da semana. 
        (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia da semana desejado: \n1- Domingo \n2- Segunda \n3- Terça \n4- Quarta \n5- Quinta \n6- Sexta \n7- Sábado");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;

            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                break;

            case 6:
                System.out.println("Sexta");
                break;

            case 7:
                System.out.println("Sábado");
                break;
            default:
            System.out.println("Número inválido!");

        }
        sc.close();
    }         
}
