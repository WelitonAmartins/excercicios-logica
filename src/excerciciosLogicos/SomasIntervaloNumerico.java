package excerciciosLogicos;

import java.util.Scanner;

//soma de todos os numeros de um intervalo
public class SomasIntervaloNumerico {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o inicio do intervalo");
		int ini = in.nextInt();
		
		System.out.println("Informe o final do intervalo");
		int fim = in.nextInt();
		
		int i = ini;
		int soma = ini;
		
		while(i<fim) {
			i++;
			soma+=i;
		}
		System.out.println(soma);
	}

}
