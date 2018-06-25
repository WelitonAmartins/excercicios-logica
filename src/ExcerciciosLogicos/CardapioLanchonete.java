package ExcerciciosLogicos;

import javax.swing.JOptionPane;

public class CardapioLanchonete {

	public static void main(String[] args) {
		/*
		 * O cardápio de uma lanchonete é o seguinte:
		 * 
		 * ESPECIFICAÇÃO       CODIGO       PREÇO
		 * Cachorro quente     100          1,20
		 * Bauru simples       101          1,30
		 * Bauru com ovo       102          1,50
		 * Hambúrguer          103			1,20
		 * Cheeseburguer	   104			1,30
		 * Refrigerante        105			1,00
		 * 
		 * Escrever um algoritmo que leia o código do item pedido,
		 * a quantidade e calcule o valor a ser pago aquele lanche. 
		 * Considere que a cada execução somente será calculado um item.
		 */
		
		int codigo = 0, quantidade =0;
		double valor = 0, total =0;
		
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do lanche: "));
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada: "));
		
		if(codigo == 100 || codigo ==103 ) {
			valor = 1.20;
		}
		if(codigo ==101 || codigo == 104) {
			valor = 1.30;
			
		}
		if(codigo == 102) {
			valor = 1.50;
		}
		if(codigo == 105) {
			valor = 1.00;
		}
		total = valor * quantidade;
		
		JOptionPane.showMessageDialog(null, "O total a pagar é: "+ total+"R$");
	
	}

}
