package EstruturaDecisao;

import java.util.Scanner;

public class Exer25 {
    public static void main(String[] args) {

        /**
         * 25. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
         * "Telefonou para a vítima?"
         * "Esteve no local do crime?"
         * "Mora perto da vítima?"
         * "Devia para a vítima?"
         * "Já trabalhou com a vítima?" 
         * O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa 
         * responder positivamente a 2 questões ela deve ser classificada como"Suspeita", entre 3 e 4 como "Cúmplice" 
         * e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
         */
        
        Scanner sc = new Scanner(System.in);
        int sim = 0;
        int nao = 0;
        System.out.println("Responda 1 para sim e 2 para não:");
        System.out.println("Telefonou para a vítima?");
        int pergunta1 = sc.nextInt();
        if (pergunta1 == 1) {
            sim++;
        } else {
            nao++;
        }
        System.out.println("Esteve no local do crime?");
        int pergunta2 = sc.nextInt();
        if (pergunta2 == 1) {
            sim++;
        } else {
            nao++;
        }
        System.out.println("Mora perto da vítima?");
        int pergunta3 = sc.nextInt();
        if (pergunta3 == 1) {
            sim++;
        } else {
            nao++;
        }
        System.out.println("Devia para a vítima?");
        int pergunta4 = sc.nextInt();
        if (pergunta4 == 1) {
            sim++;
        } else {
            nao++;
        }
        System.out.println("Já trabalhou com a vítima?");
        int pergunta5 = sc.nextInt();
        if (pergunta5 == 1) {
            sim++;
        } else {
            nao++;
        }

        if (sim == 2) {
            System.out.println("Classificação: Suspeita"); 
        } else if ( sim >= 3 && sim <=4) {
            System.out.println("Classificação: Cúmplice");
        } else if ( sim == 5) {
            System.out.println("Classificação: Assassino");
        } else {
            System.out.println("Classificação: Inocente");
        }

        sc.close();    
    }
}
