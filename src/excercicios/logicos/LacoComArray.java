package excercicios.logicos;

import javax.swing.JOptionPane;

/*
 * Uma loja tem 3 clientes cadastrado e deseja mandar uma
 * correspond�ncia a cada umdeles anunciando um b�nus especial.
 * Escreva um algoritmo que leia o nome do cliente e o valor
 *  das suas compras no ano passado e calcule um b�nus de 10% se 
 *  o valor das compras for menor que 5.000 e de 15%, caso contr�rio
 */

public class LacoComArray {

	static final int total = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nome = new String[total];
		double[] valorCompras = new double[total];
		double[] bonus = new double[total];

		for (int i = 0; i < total; i++) {
			nome[i] = JOptionPane.showInputDialog("Digite o nome do cliente: ");
			valorCompras[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das suas compras"));
			bonus[i] = valorCompras[i] < 5000 ? valorCompras[i] * 0.10f : valorCompras[i] * 0.15f;

		}
		for (int j = 0; j < 1; j++) {
			JOptionPane.showMessageDialog(null,
					String.format("O cliente %s ir� receber %.2f de b�nus! \nO cliente %s ir� receber %.2f de b�nus! \nO cliente %s ir� receber %.2f de b�nus!",
							nome[j], bonus[j], nome[j + 1], bonus[j + 1], nome[j + 2], bonus[j + 2]));

		}
	}

}
