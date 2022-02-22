package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        /** Altere o programa de cálculo do fatorial, permitindo ao usuário calcular 
         * o fatorial várias vezes e limitando o fatorial a números inteiros positivos 
         * e menores que 16. */
        
         Scanner sc = new Scanner(System.in);

         boolean rodando = true;

         while (rodando) {
             System.out.println("*** Digite a opção ***");
             System.out.println("1- Fatorar.");
             System.out.println("2- Sair.");
             int opcao = sc.nextInt();

             switch (opcao) {
                 case 1:
                 System.out.print("Digite o número para fatorar: ");
                 int num = sc.nextInt();
                 int fatorial = 1;
                 if (num > 0 && num < 16) {
                    for (int i = 1; i <= num; i++) {
                        fatorial *= i;         
                        }
                        System.out.println("Fatorial de " + num + " é " + fatorial);
                        
                 } else {
                    System.out.println("Número inválido, Digite um número maior que 0 e menor que 16.");
                           
                 }
                    break;
                 case 2: 
                 rodando = false;
                 System.out.println("Encerrando programa...");

                 default:
                     break;
             }
             
         }

         System.out.println("Programa encerrado.");   

         sc.close();

    }
    
}
