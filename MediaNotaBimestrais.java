package EstruturaSequencial;
import java.util.Scanner;

public class MediaNotaBimestrais {

	public static void main(String[] args) {
		// 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota:");
		Double nota1 = sc.nextDouble();
		
		System.out.println("Digite sua segunda nota:");
		Double nota2 = sc.nextDouble();
		
		System.out.println("Digite sua terceita nota:");
		Double nota3 = sc.nextDouble();
		
		System.out.println("Digite sua quarta nota:");
		Double nota4 = sc.nextDouble();
		
		Double notaTotal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (notaTotal >= 7) {
			System.out.println("Sua nota é "+ notaTotal + " Parabéns você passou");
		} else {
			System.out.println("Sua nota é "+ notaTotal + " Você não passou na média.");
		}
		
	}

}
