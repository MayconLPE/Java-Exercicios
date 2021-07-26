package Treino;
import java.util.Scanner;

public class MediaNota {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite sua segunda nota");
		double nota2 = sc.nextDouble();
		
		double media = (nota1+nota2)/2;
		System.out.println("A media da sua nota é : " + media);
		
		if(media >= 7) {
			System.out.println("Parabens você passou na média.");
			
		}else {
			System.out.println("Infelizmente você não passou na média");
		}

	}

}
