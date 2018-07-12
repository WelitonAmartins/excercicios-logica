package ExcerciciosLogicos;

import java.util.Scanner;

public class TabuadaInversa {
//tabuada ao avesso
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Digite a tabuada que voce deseja: ");
		
		Scanner tec = new Scanner(System.in);
		int tabuada = tec.nextInt();
		
		for(int i = 10; i >= 1; i--) {
			System.out.println(tabuada + "X" + i + " = " +(tabuada*i));
		}
		
	}

}
