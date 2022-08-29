package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer38 {
    public static void main(String[] args) {
        /** 38. Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se que:
         * Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
         * Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
         * A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior.
         *  Faça um programa que determine o salário atual desse funcionário. Após concluir isto, 
         * altere o programa permitindo que o usuário digite o salário inicial do funcionário. */
        
        Scanner sc = new Scanner(System.in);
        double salarioInicial = 0; 
        double salarioFinal = 0;
        int anoInicial = 1995;
        int anoFinal = 2022;
        int anosTrabalhados = anoFinal - anoInicial; // Anos Trabalhados.
        double porcenInicial = 1.5; // 1,5%

        System.out.println("Digite seu salário atual:");
        salarioInicial = sc.nextDouble();

        double PorcenSal = (salarioInicial / 100) * porcenInicial;
        salarioFinal = salarioInicial + PorcenSal;
       
        System.out.println("Salário: R$ " + salarioFinal + " Ano: " + anoInicial);

        for (int i = 1;i <= anosTrabalhados; i++ ) {
            anoInicial++;
            porcenInicial = porcenInicial * 2;
            System.out.println(porcenInicial);

            PorcenSal = (salarioFinal / 100) * porcenInicial;
            salarioFinal = salarioInicial + PorcenSal;

            System.out.println("Salário R$ " + salarioFinal + " Ano: " + anoInicial);
            
        }         

        /**
        double salarioInicial = 1000; // R$ 100
        double salarioFinal = 0;
        int anoInicial = 1995;
        int anoFinal = 2022;
        int anosTrabalhados = anoFinal - anoInicial; // Anos Trabalhados.
        double porcenInicial = 1.5; // 1,5%

        double PorcenSal = (salarioInicial / 100) * porcenInicial;
        
        salarioFinal = salarioInicial + PorcenSal;
       
        System.out.println("Salário: R$ " + salarioFinal + " Ano: " + anoInicial);

        for (int i = 1;i <= anosTrabalhados; i++ ) {
            anoInicial++;
            porcenInicial = porcenInicial * 2;
            System.out.println(porcenInicial);

            PorcenSal = (salarioFinal / 100) * porcenInicial;
            salarioFinal = salarioInicial + PorcenSal;

            System.out.println("Salário R$ " + salarioFinal + " Ano: " + anoInicial);
            
        }          
         */
    }
}
