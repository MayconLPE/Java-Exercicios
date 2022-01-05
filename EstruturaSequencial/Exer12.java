package EstruturaSequencial;
import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		/* 12. Tendo como dados de entrada a altura de uma pessoa, construa 
		   um algoritmo que calcule seu peso ideal, usando a seguinte
		   fórmula: (72.7*altura) - 58 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua altura:");
		Double altura = sc.nextDouble();
		
		Double pesoIdeal = (72.7 * altura) - 58;
		System.out.println(pesoIdeal);
	}

}
