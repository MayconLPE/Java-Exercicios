package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer39 {
    public static void main(String[] args) {
        /** 39. Faça um programa que leia dez conjuntos de dois valores, o primeiro 
         * representando o número do aluno e o segundo representando a sua altura 
         * em centímetros. Encontre o aluno mais alto e o mais baixo. Mostre o número 
         * do aluno mais alto e o número do aluno mais baixo, junto com suas alturas. */

         Scanner sc = new Scanner(System.in);

         int numAluno[] = new int[5];
         double altura[] = new double[5];

        for (int i = 0; i<numAluno.length;i++) {
            System.out.println("Digite o número do aluno:");
            numAluno[i] = sc.nextInt();

            System.out.println("Aluno " + i + " Cadastrado");
        }

      

        
    }
}
