package ExerciciosListas;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		// 9. Faça um Programa que leia um vetor A com 10 números inteiros, 
		// calcule e mostre a soma dos quadrados dos elementos do vetor.

		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[10];
		int numQuadrado[] = new int[10];
		int numSomas = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite o " + (i + 1) + "° número:");
			num[i] = sc.nextInt();
			numSomas = num[i] * num[i];
			numQuadrado[i] = numSomas;
		}

		System.out.println("Quadrados dos elementos:");
		for (int i : numQuadrado) {
			System.out.print(i + " ");
		}

		sc.close();
	}

}
