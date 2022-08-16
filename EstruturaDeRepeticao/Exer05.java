package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exer05 {
	
	public static void main(String[] args) {
	/*
         * 5. Altere o programa anterior permitindo ao usuário informar as populações e
         * as taxas de crescimento iniciais. Valide a entrada e permita repetir a
         * operação.
         */
        Scanner sc = new Scanner(System.in);
        Double paisA, paisB, taxaA, taxaB;
        // Double cont = 0.0;
        boolean infoValido = false;

        do {
            System.out.println("Informe a população atual do país A:");
            paisA = sc.nextDouble();
        
            if (paisA > 0){
                infoValido = true;
            } else {
                System.out.println("Digite um número maior que zero!");
            }
        }while(!infoValido);

        infoValido = false;

        do {
            System.out.println("Informe a população atual do país B:");
            paisB = sc.nextDouble();
        
            if (paisB > 0){
              infoValido = true;
            } else {
                System.out.println("Digite um número maior que zero!");
            }
        }while(!infoValido);

        infoValido = false;
        
        do {
            System.out.println("Informe a taxa de crescimento do pais A:");
            taxaA = sc.nextDouble();
        
            if (taxaA > 0){
               infoValido = true;
            } else {
                System.out.println("Digite um número maior que zero!");
            }
        }while(!infoValido);

        infoValido = false;

        do {
            System.out.println("Informe a taxa de crescimento do pais B:");
            taxaB = sc.nextDouble();
        
            if (taxaB > 0){
              infoValido = true;
            } else {
                System.out.println("Digite um número maior que zero!");
            }
        }while(!infoValido);

            int contador = 0;

         while (paisA < paisB) {
            paisA += (paisA / 100) * taxaA;
            paisB += (paisB / 100) * taxaB;
            contador++;
         }
         System.out.println(contador + " Anos para passar a população B.");
         System.out.println("População A: " + paisA);
         System.out.println("População B: " + paisB);

     
         sc.close();
		
		
	}

}
