package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		/* 3. Faça um programa que leia e valide as seguintes informações:
			Nome: maior que 3 caracteres;
			Idade: entre 0 e 150;
			Salário: maior que zero;
			Sexo: 'f' ou 'm';
			Estado Civil: 's', 'c', 'v', 'd';
		*/
		Scanner sc = new Scanner(System.in);
		boolean valido = false;
		String nome, sexo, estadoCivil;
		Double salario;
		int idade;
		
		do {
			System.out.println("Digite seu nome maior que 3 caracteres:");
			nome = sc.next();
			
			if (nome.length() > 3) { //comparar tamanho da String.
				valido = true;
			} 
			else {
				System.out.println("Nome menor que 3 caracteres!");
			}				
		}while(!valido);	
		
		valido = false; //resetando a variável.
		do {
			System.out.println("Digite sua idade entre 0 e 150:");
			idade = sc.nextInt();
			
			if (idade >=0 && idade <= 150) {
				valido = true;
			} 
			else {
				System.out.println("Idade invalida, Digite idade entra 0 a 150 anos!");
			}
		} while(!valido);
		
		valido = false; //resetando a variável.
		do {
			System.out.println("Digite sua salário acima de zero:");
			salario = sc.nextDouble();
			
			if (salario >= 1) {
				valido = true;
			} 
			else {
				System.out.println("Salário abaixo de 0, Digite um salário maior que zero:");
			}
			
		} while(!valido);
		
		valido = false; //resetando a variável.
		do {
			System.out.println("Digite seu sexo:(M)Masculino ou (F)Feminino:");
			sexo = sc.next();
			
			if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
				valido = true;
			} 
			else {
				System.out.println("Sexo inválido, Digite seu sexo:(M)Masculino ou (F)Feminino:");
			}
		} while(!valido);
		
		valido = false; //resetando a variável.
		do {
			System.out.println("Digite seu estado Civil: \n(S)Solteiro(a) \n(C)Casado(a) \n(V)viuvo(a) \n(D)Divorciado:");
			estadoCivil = sc.next();
			
			if (estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C")
				|| estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")) {
				valido = true;
			} 
			else {
				System.out.println("Estado civil inválido, Digite seu estado Civil: \n(S)Solteiro(a) \n(C)Casado(a) \n(V)viuvo(a) \n(D)Divorciado:");
			}
		} while(!valido);
		
		System.out.println("Resultados:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);

		sc.close();
	}
}
