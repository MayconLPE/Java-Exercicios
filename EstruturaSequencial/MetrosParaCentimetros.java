package EstruturaSequencial;
import java.util.Scanner;

public class MetrosParaCentimetros {

	public static void main(String[] args) {
		// 5. Faça um Programa que converta metros para centímetros.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os metros para transforma em centímetros:");
		Double m = sc.nextDouble(); // Metros.
		
		Double cm = m * 100; // centímetros	
		
		System.out.println( m + " metros, convertidos em centímetros é igual a " + cm + "cm");
	}

}
