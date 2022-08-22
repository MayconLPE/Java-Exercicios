package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer36 {
    public static void main(String[] args) {
        /** 36. Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário, mas a tabuada não
         * deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados também pelo usuário, 
         * conforme exemplo abaixo:
         * Montar a tabuada de: 5
         * Começar por: 4
         * Terminar em: 7
         * Vou montar a tabuada de 5 começando em 4 e terminando em 7:
         * 5 X 4 = 20
         * 5 X 5 = 25
         * 5 X 6 = 30
         * 5 X 7 = 35
         * Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Digite a tabuada que deseja: ");
         int tabNumero = sc.nextInt();
         System.out.println("Digite o inicio da tabuada:");
         int iniTabuada = sc.nextInt();
         System.out.println("Digite o final da tabuada:");
         int fimTabuada = sc.nextInt();

         if (iniTabuada < fimTabuada) {
            for (int i = iniTabuada; i <= fimTabuada; i++) {
                System.out.println(tabNumero + " X " + i + " = " + (tabNumero * i));
            }

         } else {
            System.out.println("Número inicial menor que o final");
         }
         sc.close();
    }
}
