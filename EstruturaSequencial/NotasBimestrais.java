package EstruturaSequencial;
import javax.swing.JOptionPane;

public class NotasBimestrais {

	public static void main(String[] args) {
		// 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		Double nota1, nota2, nota3, nota4;
		
		JOptionPane.showMessageDialog(null, "Bem Vindo");
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua primeira nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digitesua segunda nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua terceira nota"));
		nota4 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua quarta nota"));
		
		Double soma = (nota1 + nota2 + nota3 + nota4)/4;
		
		JOptionPane.showMessageDialog(null, "Média: " + soma);
		

	}

}
