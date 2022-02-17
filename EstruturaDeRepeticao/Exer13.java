package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        
        /** Faça um programa que peça dois números, base e expoente, 
         * calcule e mostre o primeiro número elevado ao segundo número.
         * Não utilize a função de potência da linguagem */

         Scanner sc = new Scanner(System.in);

         System.out.print("Digite a base: ");
         int base = sc.nextInt();
         System.out.print("Digite o expoente: ");
         int expoente = sc.nextInt();

         int potencia = 1;
         int count = 1;

         while(count <= expoente) {
         potencia *= base;
         count++;
        }
            System.out.println(base + " ^ " + expoente + " = " + potencia);
             }
        
    }
    

