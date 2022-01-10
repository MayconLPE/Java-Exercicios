package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		/*
		 * 2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a
		 * senha igual ao nome do usuúrio, mostrando uma mensagem de erro e voltando a
		 * pedir as informações.
		 */

		boolean igual = false;
		String usuario, senha;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Digite nome de usuário:");
			usuario = sc.next();
			System.out.println("Digite sua senha:");
			senha = sc.next();

			if (!usuario.equalsIgnoreCase(senha)) {
				igual = true;
				System.out.println("Nome de usuário é diferente da senha.");
			} else {
				System.out.println("Nome de usuário é igual a senha!\nDigite um usuário diferente da senha:");
			}

		} while (!igual);

	}

}
