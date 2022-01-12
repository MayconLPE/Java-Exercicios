package EstruturaDecisao;
import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		/*  Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
			Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu turno de estudo: M-matutino ou V-Vespertino ou N- Noturno.");
		String turno = sc.next();
		
		if (turno.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
		}
		else if (turno.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde!");
		}
		else if (turno.equalsIgnoreCase("N")) {
			System.out.println("Boa noite!");
		} 
		else {
			System.out.println("Inv�lido!");
		}	
	}
}
