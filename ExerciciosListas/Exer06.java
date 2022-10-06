package ExerciciosListas;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        /** Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene
         *  num vetor a média de cada aluno, imprima o número de alunos 
         * com média maior ou igual a 7.0. */
        Scanner sc = new Scanner(System.in);

        int notaAlunos[] = new int[10];
        int mediaAlunos[]= new int[10];
        int alunosAcimaMedia = 0;
        int alunosAbaixoMedia = 0;

        for (int i = 0; i < notaAlunos.length; i++) {
        
            System.out.println("Digite as 4 notas do aluno " + (i + 1));
            System.out.println("Nota 1:");
            int nota1 = sc.nextInt();
            System.out.println("Nota 2:");
            int nota2 = sc.nextInt();
            System.out.println("Nota 3:");
            int nota3 = sc.nextInt();
            System.out.println("Nota 4:");
            int nota4 = sc.nextInt();

            int somaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
            mediaAlunos[i] = somaNotas;

            if (somaNotas >= 7) {
                alunosAcimaMedia++;
            } else {
                alunosAbaixoMedia++;
            }
            
        }
         for (int i : mediaAlunos) {
            System.out.print(i +  " ");
         }
       
        System.out.println("\n Número de alunos a cima da média:" + alunosAcimaMedia);
        System.out.println("\n Número de alunos a abaixo da média:" + alunosAbaixoMedia);

        sc.close();
    }
}
