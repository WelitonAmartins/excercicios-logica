package ExcerciciosLogicos;

import javax.swing.JOptionPane;

public class CalcularAnosComWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pedro tem 1,50 metro e cresce 2 centimetros por ano, 
		 * enquanto Manoel tem 1,10 mnetro e cresce 3 centimetros por ano. 
		 * Construa um algoritmo que calcule e imprima quantos anos ser�o necesss�rios
		 * para que manoel seja maior que P�dro.
		 */
		float alturaPedro = 1.50f, alturaManoel = 1.10f;
		int anos = 0;
		
		while (alturaPedro > alturaManoel) {
			alturaPedro += .02;
			alturaManoel += .03;
			anos++;
		}
		JOptionPane.showMessageDialog(null, "Manoel ser� maior do que Pedro ap�s "+anos+" Anos!" );
		
	}

}
