package EstruturaSequencial;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        /** Faça um Programa para uma loja de tintas. O programa deverá pedir 
         * o tamanho em metros quadrados da área a ser pintada.Considere que 
         * a cobertura da tinta é de 1 litro para cada 6 metros quadrados e 
         * que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 
         * ou em galões de 3,6 litros, que custam R$ 25,00. Informe ao usuário 
         * as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
         * comprar apenas latas de 18 litros;
         * comprar apenas galões de 3,6 litros;
         * misturar latas e galões, de forma que o preço seja o menor. 
         * Acrescente 10% de folga e sempre arredonde os valores
         * para cima, isto é, considere latas cheias. */

         Scanner sc = new Scanner(System.in);

         System.out.print("Medidas de metros a serem pintadas: ");
         float medida = sc.nextFloat();

         double litros = medida / 6; // Quantidade de tinta para pintar parede.
         double latas = Math.ceil(litros / 18); // Math.ceil Arredondamento.
         double galoes = Math.ceil(litros / 3.6);

         double precoLatas = latas * 80;
         double precoGaloes = galoes * 25;

         double combinacao = (litros / 18) * 80 + (Math.ceil((litros % 18)/3.6)) * 25;

        System.out.println("O preço só com latas é: R$ " + precoLatas);
        System.out.println("O preço só com galões é: R$ " + precoGaloes);
        System.out.println("O preço combinado é: R$ " + Math.ceil(combinacao));

    }
    
}
