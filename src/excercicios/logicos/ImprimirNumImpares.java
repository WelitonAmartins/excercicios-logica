package excercicios.logicos;

import javax.swing.JOptionPane;

/*
 * Crie um programa que leia um n�mero que ser� o limite 
 * superior de um intervalo. Imprimir todos os n�meros 
 * impares menores do que esse n�mero 
 */
public class ImprimirNumImpares {
	public static void main(String []args) {
		int valor =0;
		String resultado = "";
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		
		for (int i = 0; i < valor; i++) {
			if(i%2 !=0) {
				resultado += i +" ";
				
			}
			
		}
		JOptionPane.showMessageDialog(null,resultado);
		
	}

}
