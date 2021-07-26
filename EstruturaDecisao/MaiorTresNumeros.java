package EstruturaDecisao;
import java.util.Scanner;

public class MaiorTresNumeros {

	public static void main(String[] args) {
		// 6. Faça um Programa que leia três números e mostre o maior deles.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 números diferentes, Digite o primeiro número:");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo número:");
		int num2 = sc.nextInt();
		System.out.println("Digite o terceiro número:");
		int num3 = sc.nextInt();
				
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " é maior que " + num2 + " e " + num3);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " é maior que " + num1 + " e " + num3);
		}
		else if (num3 > num1 && num3 > num1) {
			System.out.println(num3 + " é maior que " + num1 + " e " + num2);
		}
		
	}

}
