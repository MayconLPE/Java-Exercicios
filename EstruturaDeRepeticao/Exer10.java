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

        for (int i = n1;i < n2;i++ ) {
            System.out.println(i);

        }



    }
    
}
