package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer27 {
    public static void main(String[] args) {
        /** Faça um programa que calcule o número médio de alunos por turma.
         * Para isto, peça a quantidade de turmas e a quantidade de alunos 
         * para cada turma. As turmas não podem ter mais de 40 alunos. */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de turmas:");
        int turmas = sc.nextInt();

        int numAlunos = 0;
    

        for (int i = 1; i <= turmas; i++) {
            System.out.println("Digite o número de alunos da turma " + i);
            numAlunos += sc.nextInt();
            
        }
        double mediaAlunos = numAlunos / turmas;
        System.out.println("Média alunos: " + mediaAlunos);
        
        sc.close();
    }
    
}
