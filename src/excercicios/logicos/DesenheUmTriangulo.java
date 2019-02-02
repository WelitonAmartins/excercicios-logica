package excercicios.logicos;
/*
 * Tipo de triangulo a ser desenhado
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * * 
 *  * * * *
 *  * * *
 *  * *
 *  *
 *  
 *
 */

// nao entendi muito essa logica
import javax.swing.JOptionPane;

public class DesenheUmTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String crescente = "";
		int decrescente = 1;
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		for (int i = 0; i < +valor; i++) {
			crescente += "* ";
			System.out.println( crescente);
			
		}
		for (int j = valor; j > 0; j--) {
			while(decrescente <j) {
				System.out.print("* ");
				decrescente++;
			}
			System.out.println();
			decrescente = 1;
			
		}

	}

}
