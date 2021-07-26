package EstruturaDecisao;
import java.util.Scanner;

public class CalculoPagamento {

	public static void main(String[] args) {
		/* 12. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que
				depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto,
				mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O
				programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
				Desconto do IR:
				Salário Bruto até 900 (inclusive) - isento
				Salário Bruto até 1500 (inclusive) - desconto de 5%
				Salário Bruto até 2500 (inclusive) - desconto de 10%
				Salário Bruto acima de 2500 - desconto de 20% 
				Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o
				valor da hora é 5 e a quantidade de hora é 220.
				Salário Bruto: (5 * 220) : R$ 1100,00
					(-) IR (5%) : R$ 55,00
					(-) INSS ( 10%) : R$ 110,00
					(-) FGTS (11%) : R$ 121,00
					Total de descontos : R$ 165,00
					Salário Liquido : R$ 935,00
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite horas trabalhadas:");
		Double horaTrabalho = sc.nextDouble();
		System.out.println("Digite quanto você ganha por hora:");
		Double salarioHora = sc.nextDouble();
		
		Double salarioBruto = horaTrabalho * salarioHora;
		
		// Desconto do IR
		Double cinco = (salarioBruto / 100) * 5; // IR 5%
		Double dez = (salarioBruto / 100) * 10; // IR 10%
		Double vinte = (salarioBruto / 100) * 20; // IR 20%
		
		Double inss = (salarioBruto / 100) * 10; // INSS 10%
		Double fgts = (salarioBruto / 100) * 11; // FGTS 11%
		Double sindicato = (salarioBruto / 100) * 3; // Sindicato 3%
		
		
		// Salário Bruto até 900 (inclusive) - IR isento
		if (salarioBruto <= 900) {
			System.out.println("Seu salário bruto é de: " + salarioBruto);
			System.out.println("(-) IR Insento");
			System.out.println("(-) INSS 10%: R$ " + inss);
			System.out.println("(-) FGTS 11%: R$ " + fgts);
			System.out.println("Salário Liquido: R$ " + (salarioBruto - inss));					
		}
		// Salário Bruto até 1500 (inclusive) - desconto IR de 5% 
		else if (salarioBruto > 900 && salarioBruto <= 1500) {
			System.out.println("Seu salário bruto é de: " + salarioBruto);
			System.out.println("(-) IR 5%: R$ " + cinco);
			System.out.println("(-) INSS 10%: R$ " + inss);
			System.out.println("(-) FGTS 11%: R$ " + fgts);
			System.out.println("Salário Liquido: R$ " + (salarioBruto - (cinco + inss )));		
		} 
		// Salário Bruto até 2500 (inclusive) - desconto IR de 10%
		else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			System.out.println("Seu salário bruto é de: " + (salarioBruto - vinte));
			System.out.println("(-) IR 10%: R$ " + dez);
			System.out.println("(-) INSS 10%: R$ " + inss);
			System.out.println("(-) FGTS 11%: R$ " + fgts);
			System.out.println("Salário Liquido: R$ " + (salarioBruto - (dez + inss)));							
		}
		// Salário Bruto acima de 2500 - desconto IR de 20%
				else if (salarioBruto > 2500) {
					System.out.println("Seu salário bruto é de: " + (salarioBruto - vinte));
					System.out.println("(-) IR 20%: R$ " + vinte);
					System.out.println("(-) INSS 10%: R$ " + dez);
					System.out.println("(-) FGTS 11%: R$ " + fgts);
					System.out.println("Salário Liquido: R$ " + (salarioBruto - (vinte + inss)));		
		}
	}					
}


