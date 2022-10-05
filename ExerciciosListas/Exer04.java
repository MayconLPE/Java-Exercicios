package ExerciciosListas;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        /** Faça um Programa que leia um vetor 
         * de 10 caracteres, e diga quantas 
         * consoantes foram lidas. Imprima 
         * as consoantes */
        Scanner sc = new Scanner(System.in);

        char carc[] = new char[10];
        int consoantes = 0;
        int vogais = 0;
        
        for (int i = 0; i < carc.length; i++) {
            System.out.println("Digite uma letra: ");
            carc[i] = sc.next().charAt(0);

            if (carc[i]== 'a' || carc[i]== 'e' || carc[i]== 'i' || carc[i]== 'o' || carc[i]== 'u'
                || carc[i]== 'A' || carc[i]== 'E' || carc[i]== 'I' || carc[i]== 'O' || carc[i]== 'U'
            ) {
                System.out.println("(" + carc[i] + ")" + " é uma vogal.");
                vogais++;
            } else {
                System.out.println("(" + carc[i] + ")" + " é uma consoante.");
                consoantes++;
            }
        }
            System.out.println("Números de consoantes: " + consoantes);
            System.out.println("Número de vogais " + vogais );

        sc.close();    
    }
}
