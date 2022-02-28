package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer25 {
    public static void main(String[] args) {
        /** Faça um programa que peça para n pessoas a sua idade, ao final 
         * o programa devera verificar se a média de idade da turma varia 
         * entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma 
         * é jovem, adulta ou idosa, conforme a média calculada. */

         Scanner sc = new Scanner(System.in);

         System.out.print("Digite a quantidade de pessoas: ");
         int numPessoas = sc.nextInt();

         int jovem = 0;
         int adulta = 0;
         int idosa = 0;

         for (int i = 1; i <= numPessoas ; i++) {
             System.out.print("Digite a idade da " + i + "º Pessoa: ");
             int idade = sc.nextInt();

             if (idade >=0 && idade <=25) {
                 jovem++;   
             } else if (idade >= 26 && idade <=60) {
                 adulta++;     
             } else if (idade > 60) {
                 idosa++;
             } else {
                 System.out.println("Idade inválida.");
             }
         }
         if (jovem > adulta && jovem > idosa) {
             System.out.println("Media de pessoas jovens");   
         } else if (adulta > jovem && adulta > idosa) {
            System.out.println("Media de pessoas adultas");     
         } else if (idosa > jovem && idosa > adulta) {
            System.out.println("Media de pessoas idosas"); 
         } else if (jovem == adulta) {
            System.out.println("Media de pessoas jovens e adultas iguais"); 
         } else if (jovem == idosa) {
            System.out.println("Media de pessoas jovens e idosas iguais"); 
         } else if (adulta == idosa) {
            System.out.println("Media de pessoas adultas e idosas iguais"); 
         } else {
            System.out.println("Algo de errado.");
         }

         System.out.println("Número de Jovens: " + jovem);
         System.out.println("Número de Adultos: " + adulta);
         System.out.println("Número de Idosos: " + idosa);

         sc.close();
        
    }
    
}
