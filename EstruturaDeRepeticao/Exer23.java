package EstruturaDeRepeticao;

// import java.util.ArrayList;
import java.util.Scanner;

public class Exer23 {
    public static void main(String[] args) {
        /** Faça um programa que mostre todos os primos entre 1 e N sendo 
         * N um número inteiro fornecido pelo usuário. O programa deverá 
         * mostrar também o número de divisões que ele executou para 
         * encontrar os números primos. Serão avaliados o funcionamento,
         * o estilo e o número de testes (divisões) executados */

         Scanner sc = new Scanner(System.in);
                          
         System.out.print("Digite o número máximo para mostrar os primos antes dele: ");
         int num = sc.nextInt();

         int numDivisores = 0;

         for (int i = 1; i <= num; i++) { 
             if (num % i == 0) {
             }

             for (int j = 1; j <= i; j++) {
                 if ( i % j == 0) {
                    numDivisores++;         
                 }
             }
             if (numDivisores == 2) {
                System.out.println("O número " + i + " é primo. Número de divisores: " + numDivisores) ;  
             }
             numDivisores = 0;   
         }
         sc.close();

    }
}
