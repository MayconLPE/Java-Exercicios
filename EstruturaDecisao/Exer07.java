package EstruturaDecisao;
import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		// 7.Faça um Programa que leia três números e mostre o maior e o menor deles.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número:");
		int num2 = sc.nextInt();
		
		System.out.println("Digite o terceiro número:");
		int num3 = sc.nextInt();
		
		//Maior número
		
		int maior = num1;
		
		if (num2 > num1 && num2 > num3) {
			maior = num2;
			System.out.println(maior + " é o maior.");
		}
		else if (num3 > num1 && num3 > num2) {
			maior = num3;
			System.out.println(maior + " é o maior.");
		}
		else {
			System.out.println(maior + " é o maior.");
		}
		
		//Menor número
		
		int menor = num1;
		
		if (num2 < num1 && num2 < num3) {
			menor = num2;
			System.out.println(menor + " é o menor.");
		}
		else if (num3 < num1 && num3 < num2) {
			menor = num3;
			System.out.println(menor + " é o menor.");
		}
		else {
			System.out.println(menor + " é o menor.");
		}
				
		
		sc.close();
	}

}
