package excercicios.logicos;

import javax.swing.JOptionPane;

/*
 * Crie um programa que leia um número que será o limite 
 * superior de um intervalo. Imprimir todos os números 
 * impares menores do que esse número 
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
