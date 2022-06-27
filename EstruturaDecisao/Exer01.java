package EstruturaDecisao;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		// 1.Faça um Programa que peça dois números e imprima o maior deles.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int num1 = sc.nextInt();
		
		System.out.println("Digite outro número inteiro:");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " é maior que " + num2);
		}
		else if (num2 > num1){
			System.out.println(num2 + " é maior que " + num1);
		}
		else {
			System.out.println("números iguais");
		}	
		sc.close();
	}
}
