package EstruturaSequencial;
import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		/* 8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
		  Calcule e mostre o total do seu salário no referido mês. */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quanto você ganha por hora: ");
		Double horaSalario = sc.nextDouble();
		
		System.out.println("Digite o número de horas trabalhadas: ");
		Double horasTrabalhadas = sc.nextDouble();
		
		Double salarioMes = horaSalario * horasTrabalhadas;
		System.out.println("Salário do mês: R$ " + salarioMes);
	}

}
