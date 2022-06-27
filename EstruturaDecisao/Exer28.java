package EstruturaDecisao;

import java.util.Scanner;

public class Exer28 {
    public static void main(String[] args) {
        /**
         * 28. O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
         * Até 5 Kg Acima de 5 Kg
         * File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
         * Alcatra R$ 5,90 por Kg R$ 6,80 por Kg
         * Picanha R$ 6,90 por Kg R$ 7,80 por Kg
         * Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção,
         *  porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara
         *  o cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo
         *  e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra:
         *  tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar
         */

        // Preços sem desconto.
        double precoFileDuplo = 4.90;
        double precoAlcatra = 5.90;
        double precoPicanha = 6.90;
        double totalValor = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo da carne:");
        System.out.println("1- File duplo\n2- alcatra\n3- Picanha");
        int tipoCarne = sc.nextInt();
        System.out.println("Quantidade em Kg:");
        double quantidadeCarne = sc.nextDouble();

        if (quantidadeCarne > 5) {
            precoFileDuplo = 5.80;
            precoAlcatra = 6.80;
            precoPicanha = 7.80;     
       }
        
        if (tipoCarne == 1) {
            System.out.println("Tipo: File Duplo");
            quantidadeCarne *= precoFileDuplo;
            totalValor = quantidadeCarne;

        } else if ( tipoCarne == 2 ) {
            System.out.println("Tipo: Alcatra");
            quantidadeCarne *= precoAlcatra;
            totalValor = quantidadeCarne;
            
        } else if ( tipoCarne == 3) {
            System.out.println("Tipo: Picanha");
            quantidadeCarne *= precoPicanha;
            totalValor = quantidadeCarne;
            
        }
        System.out.println("Forma de pagamento:\n1- Cartão\n2- Dinheiro:");
        int formaPag = sc.nextInt();

        if (formaPag == 1) {
            double desconto5 = (totalValor / 100) * 5;
            totalValor -= desconto5;
            System.out.println("Total Valor com Desconto: R$ " + totalValor);
            
        } else if (formaPag == 2) {
            System.out.println("Total Valor: R$ " + totalValor);
        }
        sc.close();
    }
}
