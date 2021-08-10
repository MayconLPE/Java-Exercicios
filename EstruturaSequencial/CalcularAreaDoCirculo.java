package EstruturaSequencial;
import java.util.Scanner;

public class CalcularAreaDoCirculo {

	public static void main(String[] args) {
		// 6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio do círculo:");
		Double raio = sc.nextDouble(); // Raio do círculo.
		
		double area = Math.PI * raio * raio; // A = π . r2
		
		System.out.println("O valor da area é " + area);

	}

}
