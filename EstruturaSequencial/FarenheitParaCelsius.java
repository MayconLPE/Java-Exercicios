package EstruturaSequencial;
import java.util.Scanner;

public class FarenheitParaCelsius {

	public static void main(String[] args) {
		/* 9. Faça um Programa que peça a temperatura em graus Farenheit, transforme 
		 e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9). */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura em graus Farenheit:");
		Double grausF = sc.nextDouble();

		Double grausC = (5 * (grausF - 32) / 9);//C = (5 * (F-32) / 9).
		System.out.printf("A temperatura " + grausF + "°F convertido \nem graus Celsius é: %.2f " , grausC); // %.2f duas casas decimais.
		
	}

}
