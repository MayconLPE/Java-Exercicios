package EstruturaDecisao;
import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		/* 8. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é
				sempre pelo mais barato.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto um:");
		Double p1 = sc.nextDouble();
		
		System.out.println("Digite o preço do produto dois:");
		Double p2 = sc.nextDouble();
		
		System.out.println("Digite o preço do produto trés:");
		Double p3 = sc.nextDouble();
		
		if (p1 < p2 && p1 < p3) {
			System.out.println("O primeiro produto é mais barato: R$ " + p1);
		} 
		else if (p2 < p1 && p2 < p3) {
			System.out.println("O segundo produto é mais barato: R$ " + p2);
		}
		else if (p3 < p1 && p3 < p2) {
			System.out.println("O terceiro produto é mais barato: R$ " + p3);
		}
		sc.close();

	}

}
