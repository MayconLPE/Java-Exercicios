package EstruturaDecisao;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        /*
        15. Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores 
            podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, 
            isósceles ou escaleno. Dicas:
            Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
            Triângulo Equilátero: três lados iguais;
            Triângulo Isósceles: quaisquer dois lados iguais;
            Triângulo Escaleno: três lados diferentes;
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado 1:");
        int lado1 = sc.nextInt();
        System.out.println("Digite o lado 2:");
        int lado2 = sc.nextInt();
        System.out.println("Digite o lado 3:");
        int lado3 = sc.nextInt();

        // Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
        if (lado1 > (lado2 + lado3) || lado2 > (lado1 + lado3) || lado3 > (lado1 + lado2)) {
            System.out.println("Não é um triângulo.");
        } else if (lado1 == lado2 && lado1 == lado3 ) { //Triângulo Equilátero: três lados iguais;
            System.out.println("Triângulo Equilátero: três lados iguais.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) { // Triângulo Isósceles: quaisquer dois lados iguais;
            System.out.println("Triângulo Isósceles: quaisquer dois lados iguais.");
        } else { //Triângulo Escaleno: três lados diferentes;
            System.out.println("Triângulo Escaleno: três lados diferentes.");
        }
        sc.close();
    }
}
