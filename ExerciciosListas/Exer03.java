package ExerciciosListas;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        /** Faça um Programa que leia 4 notas, mostre as notas e a média na tela. */

        Scanner sc = new Scanner(System.in);

        int num[] = new int[4];
        int media = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digita a Nota:");
            num[i] = sc.nextInt();
            media += num[i];
        }

        for (int i : num) {            
            System.out.println("Nota: "+ i);
        }
        media = media / num.length;
        System.out.println("Média: " + media);


        sc.close();
    }
}
