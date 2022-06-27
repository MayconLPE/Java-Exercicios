package EstruturaDecisao;

import java.util.Scanner;

public class Exer27 {
    public static void main(String[] args) {
        /**
         * 27. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
         * Até 5 Kg Acima de 5 Kg
         * Morango R$ 2,50 por Kg R$ 2,20 por Kg
         * Maçã R$ 1,80 por Kg R$ 1,50 por Kg
         * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
         * receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a 
         * quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor 
         * a ser pago pelo cliente.
         */
        Scanner sc = new Scanner(System.in);

        double precoMorango = 2.50;
        double precoMaca = 1.80;
        double totalCompras = 0;

        System.out.println("Digite o Kg de morangos:");
        double morangoKG = sc.nextDouble();
        System.out.println("Digite o Kg de maçãs:");
        double macaKG = sc.nextDouble();

        double totalKG = morangoKG + macaKG;

        if (morangoKG > 5) {
            precoMorango = 2.20;
        }
        if (macaKG > 5) {
            precoMaca = 1.50;
        }

        precoMorango *= morangoKG;
        precoMaca *= macaKG;

        totalCompras = precoMorango + precoMaca;

        System.out.println("Morangos: R$ " + precoMorango);
        System.out.println("Maçãs: R$ " + precoMaca);
        System.out.println("Total: R$ " + totalCompras);
        if (totalKG > 8.0 || totalCompras > 25.00) {
            double desconto10 = (totalCompras / 100) * 10;
            totalCompras -= desconto10;
            System.out.println("Valor total com desconto: R$ " + totalCompras);
        }

        sc.close();
    }
    
}
