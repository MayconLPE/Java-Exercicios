package EstruturaDecisao;

import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {

        /*16. Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir os
            valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
            Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os
            demais valores, sendo encerrado;
            Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
            Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
            Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Valor de a:");
        int a = sc.nextInt();

        if (a == 0) {
            System.out.println("Valor de A igual a zero, a equação não é do segundo grau");     
        } else {
            System.out.println("Digite o Valor de B:");
            int b = sc.nextInt();
            System.out.println("Digite o Valor de C:");
            int c = sc.nextInt();

            int delta = b * b - (4 * a * c);

            if (delta < 0) {
                System.out.println("a equação não possui raizes reais, valor negativo.");
            } else if (delta == 0) {
                int raiz = -b / (2 * a);
                System.out.println("Delta = 0, raiz = " + raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Raizes: " + raiz1 + " e " + raiz2);
            }
        }
        sc.close();        
        
    }   
}
