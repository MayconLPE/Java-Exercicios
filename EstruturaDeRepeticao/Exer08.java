package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        // 8.Faça um programa que leia 5 números e informe a soma e a média dos números.
        
        Scanner sc = new Scanner(System.in);
        int num, soma = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número");
            num = sc.nextInt();
            soma += num;
        }
        int media = soma/5;
        System.out.println("A soma dos 5 números: " + soma);
        System.out.println("A média dos 5 números: " + media);
    
        sc.close();
    }
}
