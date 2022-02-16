package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        /** 12. Desenvolva um gerador de tabuada, capaz de gerar a tabuada 
         * de qualquer número inteiro entre 1 a 10. O usuário deve informar 
         * de qual numero ele deseja ver a tabuada. A saída deve ser conforme 
         * o exemplo abaixo:
         * Tabuada de 5:
         * 5 X 1 = 5
         * 5 X 2 = 10
         * ...
         * 5 X 10 = 50
         */

         Scanner sc = new Scanner(System.in);

         System.out.print("digite um número entre 1 a 10, para gerar a tabuada: ");
         int num = sc.nextInt();

         System.out.println("Tabuada de " + num);
         for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + " X " + i + " = " + resultado);
             
         }

        
    }
    
}
