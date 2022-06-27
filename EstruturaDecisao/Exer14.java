package EstruturaDecisao;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        /*
        Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina 
        ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
        Média de Aproveitamento Conceito
            Entre 9.0 e 10.0 A
            Entre 7.5 e 9.0 B
            Entre 6.0 e 7.5 C
            Entre 4.0 e 6.0 D
            Entre 4.0 e zero E
        O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” 
        se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
        */
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota de 0 a 10:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota de 0 a 10:");
        double nota2 = sc.nextDouble();

        double media = (nota1+nota2)/2;


        if (media >= 9.0 && media <= 10.0) {
            System.out.println("Média: " + media + " nota: A");
            System.out.println("APROVADO");
        } else if (media >= 7.5 && media < 9.0) {
            System.out.println("Média: " + media + " nota: B");
            System.out.println("APROVADO");
        } else if (media >= 6.0 && media < 7.5) {
            System.out.println("Média: " + media + " nota: C");
            System.out.println("APROVADO");
        } else if (media >= 4.0 && media < 6.0) {
            System.out.println("Média: " + media + " nota: D");
            System.out.println("REPROVADO");
        } else if (media > 4.0 && media < 0) {
            System.out.println("Média: " + media + " nota: E");
            System.out.println("REPROVADO");
        } else {
            System.out.println("Invalido, Digite nota de 0 a 10");
        }
        sc.close();
    }   
}
