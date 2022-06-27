package EstruturaDecisao;

import java.util.Scanner;

public class Exer26 {
    public static void main(String[] args) {
        /** 26. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
         * Álcool:
         * até 20 litros, desconto de 3% por litro
         * acima de 20 litros, desconto de 5% por litro
         * Gasolina:
         * até 20 litros, desconto de 4% por litro
         * acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia o número
         * de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina),
         * calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina 
         * é R$ 2,50 o preço do litro do álcool é R$ 1,90
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a opção desejada: ");
        System.out.println("A-álcool \nG-gasolina");
        String tipo = sc.nextLine();

        System.out.println("*****");
        System.out.println("Digito a quantidade de litros:");
        // Quantidade de litros
        double litros = sc.nextDouble();

        // Descontos do Álcool e Gasolinha
        double descontoA = 0;
        double descontoG = 0;
        // Preços do Álcool e Gasolinha
        double precoA = 1.90;
        double precoG = 2.50;
        
        System.out.println("*****");
        if (tipo.equalsIgnoreCase("A")) {
            if (litros <= 20) {
                // desconto de 3%.
                descontoA = (precoA / 100) * 3;
                precoA = precoA - descontoA;
                System.out.println("álcool 3% de Desconto: R$ " + precoA);
                
            } else if (litros > 20) {
                // desconto de 5%
                descontoA = (precoA / 100) * 5;
                precoA = precoA - descontoA;
                System.out.println("álcool 5% de Desconto: R$ " + precoA);
            }
            
        } else if (tipo.equalsIgnoreCase("G")) {
            if (litros <= 20) {
                // desconto de 4%.
                descontoG = (precoG / 100) * 4;
                precoG = precoG - descontoG;
                System.out.println("Gasolina 4% de Desconto: R$ " + precoG);
                
            } else if (litros > 20) {
                // desconto de 6%
                descontoG = (precoG / 100) * 6;
                precoG = precoG - descontoG;
                System.out.println("Gasolina 6% de Desconto: R$ " + precoG);
            }

        } else {
            System.out.println("opção digitada inválida!");
        }

        if (tipo.equalsIgnoreCase("A")) {
            double precoTotal = precoA * litros;
            System.out.println("Total a pagar: \nR$: " + precoTotal);     
        } else if (tipo.equalsIgnoreCase("G")){
            double precoTotal = precoG * litros;
            System.out.println("Total a pagar: \nR$: " + precoTotal);   
        }

        sc.close();
        
    }
}
