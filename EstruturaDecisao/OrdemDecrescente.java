package EstruturaDecisao;
import java.util.Scanner;

public class OrdemDecrescente {

	public static void main(String[] args) {
		// 9. Faça um Programa que leia três números e mostre-os em ordem decrescente.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int num3 = sc.nextInt();
		
		if (num1 >= num2 && num1 >= num3 && num2 >= num3) {
			System.out.println("Ordem decrescente é: " + num1 + num2 + num3);
		}
		else if (num1 >= num2 && num1 >= num3 && num3 >= num2) {
			System.out.println("Ordem decrescente é: " + num1 + num3 + num2);
		}
		else if (num2 >= num1 && num2 >= num3 && num1 >= num3) {
			System.out.println("Ordem decrescente é: " + num2 + num1 + num3);
		}
		else if (num2 >= num1 && num2 >= num3 && num3 >= num1) {
			System.out.println("Ordem decrescente é: " + num2 + num3 + num1);
		}
		else if (num3 >= num1 && num3 >= num2 && num1 >= num2) {
			System.out.println("Ordem decrescente é: " + num3 + num1 + num2);
		}
		else if (num3 >= num1 && num3 >= num2 && num2 >= num1) {
			System.out.println("Ordem decrescente é: " + num3 + num2 + num1);
		}
		
	}
}


