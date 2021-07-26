package EstruturaSequencial;
import java.util.Scanner;

public class SomaNumeros {

	public static void main(String[] args) {
		/* 11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
		o produto do dobro do primeiro com metade do segundo.
		a soma do triplo do primeiro com o terceiro.
		o terceiro elevado ao cubo. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int numInt1 = sc.nextInt(); // Primeiro número inteiro.
		
		System.out.println("Digite um outro número inteiro:");
		int numInt2 = sc.nextInt(); // Segundo número inteiro.
		
		System.out.println("Digite um outro número real:");
		float numReal = sc.nextFloat(); // Número real.
		
		int calculo1 = numInt1 * 2 + numInt2 / 2 ; // O produto do dobro do primeiro com metade do segundo.	
		System.out.println("O produto do dobro do primeiro com a metade do segundo: " + calculo1);
		
		float calculo2 = numInt1 * 3 + numReal; // A soma do triplo do primeiro com o terceiro
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + calculo2);
		
		
		System.out.println("O terceiro elevado ao cubo é: " + Math.pow(numReal, 3)); // Cubo

	}

}
