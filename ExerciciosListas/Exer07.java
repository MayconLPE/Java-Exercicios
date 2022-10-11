package ExerciciosListas;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		// 7. Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.
		
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		
		int soma = 0;
		int mult = 1;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite o número " + (i +1));
			num[i] = sc.nextInt();
			
			soma += num[i];
			mult *= num[i];
		}
		
		System.out.println("Soma de todos os números: " + soma);
		System.out.println("Multiplicação de todos os números: " + mult);
		
		for (int i : num) {
			System.out.print(i + " ");
		}

		sc.close();
	}

}
