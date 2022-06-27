package EstruturaDecisao;
import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		/* 11.As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o
			programa que calculará os reajustes.
			Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário
			atual:
			salários até R$ 280,00 (incluindo) : aumento de 20%
			salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
			salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
			salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
			o salário antes do reajuste;
			o percentual de aumento aplicado;
			o valor do aumento;
			o novo salário, após o aumento.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu salário atual:");
		Double salario = sc.nextDouble();
		Double salarioAumento;
		Double salarioTotal;
		
		System.out.println("Seu salário é: R$ " + salario);
		if (salario < 280.00) {
			salarioAumento = (salario/100)*20; // 20%
			salarioTotal = salario + salarioAumento;
			System.out.println("Percetual de aumento de 20%: R$% " + salarioAumento);
			System.out.println("Seu salário agora é: R$ " + salarioTotal);
		}
		else if (salario >= 280.00 && salario <= 700.00) {
			salarioAumento = (salario/100)*15; // 15%
			salarioTotal = salario + salarioAumento;
			System.out.println("Percetual de aumento de 15%: R$% " + salarioAumento);
			System.out.println("Seu salário agora é: R$ " + salarioTotal);
		}
		else if (salario > 700.0 && salario <= 1500.00) {
			salarioAumento = (salario/100)*10; // 10%
			salarioTotal = salario + salarioAumento;
			System.out.println("Percetual de aumento de 10%: R$% " + salarioAumento);
			System.out.println("Seu salário agora é: R$ " + salarioTotal);
		}
		else if (salario > 1500.00) {
			salarioAumento = (salario/100)*5; // 5%
			salarioTotal = salario + salarioAumento;
			System.out.println("Percetual de aumento de 5%: R$% " + salarioAumento);
			System.out.println("Seu salário agora é: R$ " + salarioTotal);
		}
		else {
			System.out.println("Opção invalida");
		}
		
		sc.close();
	}

}
