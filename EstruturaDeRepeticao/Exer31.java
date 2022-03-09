package EstruturaDeRepeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer31 {
    public static void main(String[] args) {
        /** O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 
         * e agora possui uma loja de conveniências. Faça um programa que implemente uma 
         * caixa registradora rudimentar. O programa deverá receber um número desconhecido de 
         * valores referentes aos preços das mercadorias. Um valor zero deve ser informado 
         * pelo operador para indicar o final da compra. O programa deve então mostrar o total 
         * da compra e perguntar o valor em dinheiro que o cliente forneceu, para então calcular e
         * mostrar o valor do troco. Após esta operação, o programa deverá voltar ao ponto inicial, 
         * para registrar a próxima compra. A saída deve ser conforme o exemplo abaixo: 
         * Lojas Tabajara 
         * Produto 1: R$ 2.20 
         * Produto 2: R$ 5.80 
         * Produto 3: R$ 0
         * Total: R$ 9.00
         * Dinheiro: R$ 20.00
         * Troco: R$ 11.00
         * ...
         * */

         Scanner sc = new Scanner(System.in);
         ArrayList<Integer> listaCompras = new ArrayList<Integer>();

         boolean registrando = true;
         double valorTotal = 0;
         int quantProdutos = 0;
         double troco = 0;
         
         while (registrando) {
             System.out.println("*** Lojas Tabajara ***");
             System.out.println("1- Registrar produtos");
             System.out.println("2- Sair");
             int opcao = sc.nextInt();
             sc.nextLine();

             switch (opcao) {
                 case 1:
                    

                    for (int i = 1; i > quantProdutos; i++) {
                        System.out.println("Digite o valor do " + i + "° produto");
                        double valor = sc.nextDouble();
                        valorTotal += valor;                        

                        System.out.println("Total: " + valorTotal);
                        System.out.println("Continuar: 1 / 2");
                        int continuar = sc.nextInt();

                        if (continuar == 1) {
                            System.out.println("...");
                        } else if(continuar == 2) {      
                            System.out.println("Digite o valor do dinheiro:");   
                            double valorPago = sc.nextDouble();
                            troco = valorPago - valorTotal;
                            System.out.println("troco: " + valorPago + " - " + valorTotal + " = " + troco);

                            
                            
                            System.out.println("Encerrando...");
                            System.out.println("Total: R$ " + valorTotal);
                            
                            break;
                        } else {
                            System.out.println("Invalido");
                        }       
                              
                    }
   
                     break;
                 case 2:
                     System.out.println("Encerrando...");
                     registrando = false;
                     break;
             
                 default:
                     break;
             }
             System.out.println("Programa encerrado");


         }
             
         }    
    }
    

