package ExerciciosListas;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        /** Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
         *  Armazene os números pares no vetor PAR e os números IMPARES no vetor impar.
         *  Imprima os três vetores. */
        Scanner sc = new Scanner(System.in);

        int num[] = new int[20];
        int par[] = new int[20];
        int impar[] = new int[20];

        int vPar = 0;
        int vImpar = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o número: ");
            num[i] = sc.nextInt();

            if (num[i] % 2 ==0) {
                System.out.println(num[i] + " é par");
                vPar = num[i];
                par[i] = vPar;
                
            } else {
                System.out.println(num[i] + " é impar");
                vImpar = num[i];
                impar[i] = vImpar;
            }
        }
        
        System.out.println("Pares: ");
        for (int nPar : par) {
            System.out.println(nPar);
        }
        
        System.out.println("Ípares: ");
        for (int nImpar : impar) {
            System.out.println(nImpar);
        }
        
        sc.close();
    }
}
