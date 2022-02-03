package EstruturaDeRepeticao;
import java.util.Scanner;


public class Exer01 {

	public static void main(String[] args) {
		/*
		 * 1. Faça um programa que peça uma nota, entre zero e dez. 
		 * Mostre uma mensagem caso o valor seja inválido e continue 
		 * pedindo
		 * até que o usuário informe um valor válido.
		 */		
		
		boolean notaValida = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite uma nota entre zero e dez:");
			Double nota = sc.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Sua nota é: " + nota);
			}
			else {
				System.out.println("Nota inválida");
			}
		} while (!notaValida);	
		sc.close();
	}
}
