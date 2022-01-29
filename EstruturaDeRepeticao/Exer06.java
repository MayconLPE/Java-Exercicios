package EstruturaDeRepeticao;

public class Exer06 {
    public static void main(String[] args) {
        /**
         * 6. Faça um programa que imprima na tela os números de 1 a 20, 
         * um abaixo do outro. Depois modifique o programa para que ele
         * mostre os números um ao lado do outro
         */
        
         int numero = 20;

         for (int i = 1; i <= numero; i++) {

            System.out.println(i);
             
         }
         for (int i = 1; i <= numero; i++) {

            System.out.print(i + " ");
             
         }


    }
    
}
