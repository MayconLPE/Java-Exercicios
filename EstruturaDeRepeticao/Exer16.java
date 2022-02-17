package EstruturaDeRepeticao;

public class Exer16 {
    public static void main(String[] args) {
        /** A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... 
         * Faça um programa que gere a série até que o valor seja maior que 500. */

        int num1 = 1, num2 = 0;

        System.out.println(num2);
        System.out.println(num1);

        for (int i = 500; i > num1; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
    }
    
}
