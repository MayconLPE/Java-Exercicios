package EstruturaSequencial;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		/* 13. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo 
		    que calcule seu peso ideal, utilizando as
			seguintes fórmulas:
			Para homens: (72.7*h) - 58
			Para mulheres: (62.1*h) - 44.7 
			
			
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua altura: ");
		Double altura = sc.nextDouble();
		
		System.out.println("Digite seu peso atual: ");
		Double peso = sc.nextDouble();
		
		Double imc = peso / (altura * altura); //IMC = Peso / (Altura × Altura)
		
		System.out.println("Digite seu sexo como: M para masculico e F para Feminino: ");
		char sexo = sc.next().charAt(0);
		
		if (sexo == 'M') {
			System.out.println("Pessoa do sexo masculico:");		
		}
		else {
			System.out.println("Pessoa do sexo feminino:");
		}
		
		
		if (imc < 18.5) {
			System.out.println("Abaixo do peso normal");
		}
		else if (imc >= 18.6 && imc <= 24.9) {
			System.out.println("Peso normal");
		}
		else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Peso em excesso");
		}
		else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidade grau I");
		}
		else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidade grau II");
		}
		else {
			System.out.println("Obesidade grau III");
		}
			
		System.out.println("Seu IMC é: " + imc);
	}

}
