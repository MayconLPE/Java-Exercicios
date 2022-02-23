package EstruturaDeRepeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args) {
        /** Altere o programa de cálculo dos números primos, informando, 
         * caso o número não seja primo, por quais número ele é divisível. */

         Scanner sc = new Scanner(System.in);
         ArrayList<Integer> divisiveis = new ArrayList<Integer>();

         int numDivisores = 0;

         System.out.print("Digite um número: ");
         int num = sc.nextInt();

         for (int i = 1; i <= num; i++) {
             if (num % i == 0) { 
                divisiveis.add(num / i);    
                numDivisores++;
             } 

         }

         if (numDivisores == 2) {
             System.out.println("Número é primo");
             System.out.println("Divisível por: " + divisiveis); 
             
         } else {
             System.out.println("Número não é primo");  
             System.out.println("Divisível por: " + divisiveis);                
         }

        sc.close();
    }
    
}
