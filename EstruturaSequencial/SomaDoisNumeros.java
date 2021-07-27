package EstruturaSequencial;
import javax.swing.JOptionPane;

public class SomaDoisNumeros {

	public static void main(String[] args) {
		// 3. Faça um Programa que peça dois números e imprima a soma.
		
		int num1 = 0;
		int num2 = 0;
		
				
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		
		JOptionPane.showMessageDialog(null, "Soma: " + (num1 + num2));
	}

}
