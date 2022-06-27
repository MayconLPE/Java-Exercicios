package EstruturaDecisao;
import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		// 2.Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para saber se é positivo ou negativo: ");
		int num1 = sc.nextInt();
		
		if (num1 > 0) {
			System.out.println(num1 + " é um número positivo");
		}
		else if (num1 < 0){
			System.out.println(num1 + " é um número negativo");
		}
		else {
			System.out.println("número 0 não é postivo nem negativo");
		}

		sc.close();
	}
}
