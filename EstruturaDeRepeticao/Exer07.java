package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        // 7. Faça um programa que leia 5 números e informe o maior número.

        Scanner sc = new Scanner(System.in);

        int num, maior = 0;
        
        System.out.println("Digite um numero:");
        num = sc.nextInt();

        for (int i = 1; i < 5; i++) {
            System.out.println("Digite um número:");
            num = sc.nextInt();
            if (num > maior) {
                maior = num;
            }     
        }

        System.out.println("Maior númeor é: " + maior);
        
        sc.close();
    }
    
}
