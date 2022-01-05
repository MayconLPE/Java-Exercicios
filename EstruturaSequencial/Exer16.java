package EstruturaSequencial;
import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		/* 16. Faça um programa para uma loja de tintas. O programa deverá pedir 
		  	o tamanho em metros quadrados da área a ser pintada.
			Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados 
			e que a tinta é vendida em latas de 18 litros, que
			custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Metros da área a ser pintada: ");
		Double metros = sc.nextDouble();
		
		Double litro = metros / 3; // 1 litro para cada 3 metros quadrados 
		Double lataValor = 80.0; // Cada tinta R$ 80,00.
		Double lataCapacidade = 18.0; // latas de 18 litros.
		
		Double latas = litro / lataCapacidade; //quantidades de latas de tinta.
		Double preco = latas * lataValor; // quantidades de latas de tinta.
		
		System.out.println("Tintas a serem usadas: " + latas + " Latas");
		System.out.println("Valor a ser gasto: R$ " + preco);
				
	}

}
/* com JOptionPane
package EstruturaSequencial;
import javax.swing.JOptionPane;

public class LojaTintas {

	public static void main(String[] args) {		
		//idade = Integer.paserInt();
		
		JOptionPane.showMessageDialog(null,"Bem vindo");
		
		String aux1 = JOptionPane.showInputDialog(null,"Metros da área a ser pintada:");
		Double metros = Double.valueOf(aux1); // Convertendo String para Double.
		
		Double litro = metros / 3; // 1 litro para cada 3 metros quadrados 
		Double lataValor = 80.0; // Cada tinta R$ 80,00.
		Double lataCapacidade = 18.0; // latas de 18 litros.
		
		Double latas = litro / lataCapacidade; //quantidades de latas de tinta.
		Double preco = latas * lataValor; // quantidades de latas de tinta.
		
		JOptionPane.showMessageDialog(null,"Tintas a serem usadas: " + latas + " Latas" + "\nValor a ser gasto: R$ " + preco);		
	}

}
*/
