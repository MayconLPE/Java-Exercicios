package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer37 {
    public static void main(String[] args) {
        /** 37. Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o mais baixo, 
         * a mais gordo e o mais magro, para isto você deve fazer um programa que pergunte a cada um dos clientes 
         * da academia seu código, sua altura e seu peso. O final da digitação de dados deve ser dada quando o 
         * usuário digitar 0 (zero) no campo código. Ao encerrar o programa também deve ser informados os códigos 
         * e valores do clente mais alto, do mais baixo, do mais gordo e do mais magro, além da média das
         * alturas e dos pesos dos clientes. */

         double altura = 0;
         double peso = 0;
         double maisAlto = 0;
         double maisBaixo = Double.MAX_VALUE;
         double maisMagro = Double.MAX_VALUE;
         double maisGordo = 0;
         double mediaAltura = 0;
         double mediaPeso = 0;
         int contadorClientes = 0;
         boolean rodando = true;

         Scanner sc = new Scanner(System.in);

         while (rodando) {
            System.out.println("Digite 1 parar cadastrar ou 0 para sair");
            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite sua altura:");
                    altura = sc.nextDouble();
                    System.out.println("Digite seu peso:");
                    peso = sc.nextDouble();

                    contadorClientes++;
                    mediaAltura += altura;
                    mediaPeso += peso;
                    mediaAltura = mediaAltura / contadorClientes;
                    mediaPeso = mediaPeso / contadorClientes;
                                       

                    if (altura > maisAlto) {
                        maisAlto = altura;
                    }
                    if (altura < maisBaixo) {
                        maisBaixo = altura;
                    }
                    if (peso > maisGordo) {
                        maisGordo = peso;
                    }
                    if (peso < maisMagro) {
                        maisMagro = peso;
                    }

                    System.out.println("Mais alto: " + maisAlto);
                    System.out.println("Mais baixo: " + maisBaixo);
                    System.out.println("Mais Magro: " + maisMagro);
                    System.out.println("Mais Gordo:  " + maisGordo);

                    System.out.println("Media Altura: " + mediaAltura);
                    System.out.println("Media Peso: " + mediaPeso);
                    
 
                    
                    break;
                case 0 :
                    System.out.println("Saindo...");
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
            
         }
         sc.close();

    }
}
