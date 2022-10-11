package ExerciciosListas;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		// 8. Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor. 
		// Imprima a idade e a altura na ordem inversa a ordem lida.
		
		Scanner sc = new Scanner(System.in);
		
		int idades[] = new int[5];
		int alturas[] = new int[5];
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Digita a " + (i+1) + "° idade:");
			idades[i] = sc.nextInt();
			System.out.println("Digita a " + (i+1) + "° altura:");
			alturas[i] = sc.nextInt();
		}
		
		System.out.println("IDADES:");
		for (int i = idades.length - 1; i >= 0 ; i--) {
			System.out.print(idades[i] + " ");
			
		}
		
		System.out.println("ALTURAS:");
		for (int i = alturas.length - 1; i >= 0 ; i--) {
			System.out.print(alturas[i] + " ");
		}
		
		sc.close();
	}

}
