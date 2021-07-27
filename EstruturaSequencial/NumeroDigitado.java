package EstruturaSequencial;
import javax.swing.JOptionPane;

public class NumeroDigitado {

	public static void main(String[] args) {
		// 2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
		 
		JOptionPane.showMessageDialog(null,"Bem vindo");
		
		String ler = JOptionPane.showInputDialog(null,"Digite um número:");
		JOptionPane.showMessageDialog(null,"O número digitado foi: " + ler);
		
	}

}
