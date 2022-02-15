package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        /** 10. Faça um programa que receba dois números inteiros 
         * e gere os números inteiros que estão no intervalo 
         * compreendido por eles. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = sc.nextInt();

        if (n1 < n2) {
            System.out.println("Números entre " + n1 + " e " + n2);
            for (int i = n1+1;n2 > i;i++) {
                System.out.print(" " + i);
            }
        } else if (n2 < n1) {
            System.out.println("Números entre " + n2 + " e " + n1);
            for (int i = n2 +1;n1 > i;i++) {
                System.out.print(" " + i);
            }
        } else {
            System.out.println("Iguais");
        }   
        sc.close();  
    }
}
