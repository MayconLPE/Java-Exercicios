package EstruturaDecisao;
import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		/* 5.Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular 
		    a média alcançada por aluno e apresentar:
			A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
			A mensagem "Reprovado", se a média for menor do que sete;
	 		mensagem "Aprovado com Distinção", se a média for igual a dez.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota:");
		Double nota1 = sc.nextDouble();
		
		System.out.println("Digite sua segunda nota:");
		Double nota2 = sc.nextDouble();
		
		Double media = (nota1 + nota2) / 2;
		
		if (media >= 7 && media < 10) {
			System.out.println("Parabéns você foi aprovado: " + media);		
		}
		else if (media >= 10) {
			System.out.println("Aprovado com Distinção: " + media);
		}
		else {
			System.out.println("Reprovado: " + media);
		}
			
	}

}
