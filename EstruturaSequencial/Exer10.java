package EstruturaSequencial;
import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		/* 10. Faça um Programa que peça a temperatura em graus 
		Celsius, transforme e mostre em graus Farenheit.
		°F = °C × 1, 8 + 32 */
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite a temperatura em graus Celsius:");
	Double grausC = sc.nextDouble();
	
	Double grausF = grausC * 1.8 + 32; // °F = °C × 1, 8 + 32
	
	System.out.println(grausC + "°C = " + grausF + "°F");

	}
}
