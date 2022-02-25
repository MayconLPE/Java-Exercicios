package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer24 {
    public static void main(String[] args) {

        /** Faça um programa que calcule o mostre a média aritmética de N notas. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de quantidade de notas a ser digitadas.");
        int num = sc.nextInt(); 
        int soma = 0;
        
        for (int i = 1; i <= num; i++) {
            System.out.print("Digite a " + i + "° nota: ");
            int nota = sc.nextInt();
            soma += nota;                
        }
        
        int media = soma / num;
        
        System.out.println("Média das notas: " + media);

        sc.close();
        
    }
    
}
