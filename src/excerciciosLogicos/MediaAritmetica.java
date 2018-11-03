package excerciciosLogicos;

import javax.swing.JOptionPane;

public class MediaAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor =0, media = 0;
		int contador =0;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
	
		while(valor >=0) {
			media += valor;
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
			contador++;
		}
		JOptionPane.showMessageDialog(null, " A média dos valores lidos é: "+(media / contador));
	}

}
