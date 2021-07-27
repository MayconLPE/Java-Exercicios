package EstruturaSequencial;
import java.util.Scanner;

public class DobroAreaQuadrado {

	public static void main(String[] args) {
		// 7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o lado do Quadrado:");
		Double lado = sc.nextDouble();
		
		//Double area = lado * lado; // area = lado * lado.
		
		Double area = Math.pow(lado, 2);
		
		System.out.println("Área do quadrado é: " + area);
		System.out.println("Dobro da área do quadrado" + (area * 2));

	}

}
