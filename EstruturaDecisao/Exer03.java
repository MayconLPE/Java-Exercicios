package EstruturaDecisao;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		/* 3.Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
			Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite F para Feminino ou M para Masculino:");
		String sexo = sc.next();
		
		if (sexo.equalsIgnoreCase("F")) { //sexo.equals comparação de String
			System.out.println("Sexo feminino");
		}
		else if (sexo.equalsIgnoreCase("M")){
			System.out.println("Sexo masculino");
		}
		else {
			System.out.println("Opção invalida");
		}
		sc.close();
	}

}
