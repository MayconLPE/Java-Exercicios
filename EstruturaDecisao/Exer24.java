package EstruturaDecisao;

import java.util.Scanner;

public class Exer24 {
    public static void main(String[] args) {
        /**
         * 24. Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.
         * O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
         * par ou ímpar;
         * positivo ou negativo;
         * inteiro ou decimal.
         */
        boolean condicao = true;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        double num1 = sc.nextDouble();
        System.out.println("Digite outro número:");
        double num2 = sc.nextDouble();


        while (condicao) {
            double calculo = 0;
            System.out.println("Digite a operação desejada:\n 1- Soma \n 2- Subtração \n 3- Multiplicação \n 4- Divisão \n 0- Sair");
            int opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    calculo = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + calculo);
                    break;
                case 2:
                    calculo = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + calculo);
                    break;
                case 3:
                    calculo = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + calculo);
                    break;
                case 4:
                    calculo = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + calculo);
                    break;
                case 0:
                    condicao = false;
                    System.out.println("Saiu");
                    break;
            
                default:
                    break;
            }
            
            if (calculo % 2 == 0) {
                System.out.println(calculo + " é par");
            } else {
                System.out.println(calculo + " é impar");
            }

            if (calculo >= 0) {
                System.out.println("Número positivo.");
            } else {
                System.out.println("Número negativo");       
            }

            if (calculo % 1 == 0) {
                System.out.println("Inteiro");
            } else {
                System.out.println("Decimal");
            }
            
        }
        
        sc.close();   
    }
}
