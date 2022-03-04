package EstruturaDeRepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer30 {
    public static void main(String[] args) {
        /** O Sr. Manoel Joaquim acaba de adquirir uma panificadora
         *  e pretende implantar a metodologia da tabelinha, que já 
         * é um sucesso na sua loja de 1,99. Você foi contratado para 
         * desenvolver o programa que monta a tabela de preços de pães,
         *  de 1 até 50 pães, a partir do preço do pão informado pelo 
         * usuário, conforme o exemplo abaixo:
         * Preço do pão: R$ 0.18 
         * Panificadora Pão de Ontem - Tabela de preços
         * 1 - R$ 0.18
         * 2 - R$ 0.36
         * ...
         * 50 - R$ 9.00
         * */

         Scanner sc = new Scanner(System.in);

         System.out.print("Digite a quantidade de pães: ");
         int quant = sc.nextInt();

         double valorPao = 0.18;
         double valorTotal = 0;

         for (int i = 0; i < quant; i++) {
             valorTotal += valorPao;    
         }
         
         System.out.printf("Quantidade de pães: "+ quant + " Valor a pagar: R$ %.2f " , valorTotal);
        
         sc.close();
         
    }
    
}
