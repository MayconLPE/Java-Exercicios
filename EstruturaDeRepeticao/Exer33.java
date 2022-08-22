package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exer33 {
    public static void main(String[] args) {
        /** 33. O Departamento Estadual de Meteorologia lhe contratou para desenvolver 
         * um programa que leia as um conjunto indeterminado de temperaturas, e informe 
         * ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas.
         * */
        Scanner sc = new Scanner(System.in);

        int quantTemperaturas = 0;
        float temperatura = 0f;
        float maior = 0f;
        float menor = Float.MAX_VALUE;
        

        System.out.println("Digite a quantidade de temperaturas: ");
        quantTemperaturas = sc.nextInt();

        for (int i = 1; i <= quantTemperaturas; i++) {
            System.out.println("Digite a " + i + "º Temperatura:");
            temperatura = sc.nextFloat();
            if (temperatura > maior) {
                maior = temperatura;
            } 
            if (temperatura < menor) {
                menor = temperatura;
            }


        }
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Menor temperatura: " + menor);
       

        sc.close();
    }
    
}
