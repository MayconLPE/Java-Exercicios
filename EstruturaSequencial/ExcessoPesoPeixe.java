package EstruturaSequencial;

import java.util.Scanner;

public class ExcessoDePeixes {

	public static void main(String[] args) {
		/*
		  14.João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda
			vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
			deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso
			de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da
			multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso dos Peixes: ");
		Double pesoPeixes = sc.nextDouble(); // Peso dos peixes.	
		
		if (pesoPeixes > 50) {
			Double multaValor = (pesoPeixes - 50)* 4; // Valor de multa.
			System.out.println("Peso ultrapassado valor a ser pago com multa é: R$ " + multaValor);
		}
		else {
			System.out.println("Peso não ultrapassado sem pagamentos de multa."); // Valor sem multa.
		}
	}
}
