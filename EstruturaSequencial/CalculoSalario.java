package EstruturaSequencial;
import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		/* 15. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
		   Calcule e mostre o total	do seu salário no referido mês, sabendo-se que são descontados 11% para o 
		   Imposto de Renda, 8% para o INSS e 5% para o	sindicato, faça um programa que nos dê: salário bruto.
		   quanto pagou ao INSS.
		   quanto pagou ao sindicato.
		   o salário líquido.
			calcule os descontos e o salário líquido, conforme a tabela abaixo:
			+ Salário Bruto : R$
			- IR (11%) : R$
			- INSS (8%) : R$
			- Sindicato ( 5%) : R$
			= Salário Liquido : R$
			Obs.: Salário Bruto - Descontos = Salário Líquido.
		 */
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		Double salarioHora = sc1.nextDouble();
		
		System.out.println("Número de horas trabalhadas no mês?");
		Double horaTrabalho = sc1.nextDouble();
		
		Double salarioBruto = salarioHora * horaTrabalho;
		System.out.println("O salário referido a este mês é de: R$ " + salarioBruto); //Salario Bruto
		
		Double impostoRenda = (salarioBruto / 100) * 11; //IR de 11%
		System.out.println("IR (11%) : R$ " + impostoRenda);
		
		Double Inss = (salarioBruto / 100)  * 8; // INSS de 8%
		System.out.println("INSS (8%) : R$: " + Inss);
		
		Double Sindicato = (salarioBruto / 100)  * 5; //Sindicato 5%
		System.out.println("Sindicato (5%) : R$: " + Sindicato);
		
		Double descontos = impostoRenda + Inss + Sindicato; // soma de todos os descontos 
		Double salarioLiquido = salarioBruto - descontos; //total Salário Liquido
		
		System.out.println("Salário Liquido: " + salarioLiquido);
		
		
	}

}
