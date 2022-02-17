package EstruturaDeRepeticao;

public class Exer15 {
    public static void main(String[] args) {
        /** A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
         *  Faça um programa capaz de gerar a série até o décimo termo */

         int num1 = 1, num2 = 1;

         System.out.println(num1);
         System.out.println(num2);

         for (int i = 0; i < 8; i++) {
             num1 = num1 + num2;
             num2 = num1 - num2;
             System.out.println(num1);
             
         }


    }
    
}
