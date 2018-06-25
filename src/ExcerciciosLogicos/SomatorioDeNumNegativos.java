package ExcerciciosLogicos;

import javax.swing.JOptionPane;

public class SomatorioDeNumNegativos {
	public static void main(String[]args) {
		int n =1, somatorio = 0;
		
		while ( n !=0) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n: "));
			
			if(n < 0) {
				somatorio += n;
			}
		}
		
		JOptionPane.showMessageDialog(null, " O somatório dos números negativos é: "+somatorio);
	}

}
