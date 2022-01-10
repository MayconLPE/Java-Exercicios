package EstruturaDeRepeticao;

public class Exer04 {

	public static void main(String[] args) {
	/*
         * 4.Supondo que a população de um país A seja da ordem de 80000 habitantes com
         * uma taxa anual de crescimento de 3% e que a população de B seja 200000
         * habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule
         * e escreva o número de anos necessários para que a população do país A
         * ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
         */
        Double paisA = 80.000;
        Double paisB = 200.000;
        Double cont = 0.0;

        while (paisA < paisB) {

            paisA += (paisA / 100) * 3; // 3% de crescimento da população A.
            paisB += (paisB / 100) * 1.5; // 1.5% de cresimento da população B.
            cont++;
        }
        System.out.println("População A " + paisA);
        System.out.println("População B " + paisB);
        System.out.println("Anos:" + cont);
    }

}


