package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer26 {
    public static void main(String[] args) {
        /** Numa eleição existem três candidatos. Faça um programa
         * que peça o número total de eleitores. Peça para cada 
         * eleitor votar e ao final mostrar o número de votos 
         * de cada candidato. */
        Scanner sc = new Scanner(System.in);

         System.out.print("Digite a quantidade de eleitores: ");
         int numEleitores = sc.nextInt();

         int candidato1 = 0;
         int candidato2 = 0;
         int candidato3 = 0;

         for (int i = 1; i <= numEleitores ; i++) {
             System.out.println("Digite o voto para seu candidato: \n 1 para candidato1 \n 2 para candidato2 \n 3 para candidato3");
             System.out.print(i + "º Eleitor: ");
             int voto = sc.nextInt();

             System.out.println("***********");

             if (voto == 1) {
                 candidato1++;
             } else if (voto == 2) {
                 candidato2++;
             } else if (voto == 3) {
                 candidato3++;
             } else {
                 System.out.println("Opção inválida.");
                 System.out.println("***********");
             }  
             System.out.println("Voto concluido.");
             System.out.println("***********");         
         }
         System.out.println("Candidato 1: " + candidato1);
         System.out.println("Candidato 2: " + candidato2);
         System.out.println("Candidato 3: " + candidato3);
         sc.close();

    }
    
}
