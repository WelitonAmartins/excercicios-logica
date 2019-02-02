package excercicios.logicos;

import java.util.Scanner;

/*
 * Elabore um algoritmo que lê 2 valores A e B e os escreve com a mensagem:
 * "São multiplos" ou "nao multiploes"
 * 
 * Múltiplos e divisores são números que resultam da multiplicação por um número natural
 *  e que dividem um número deixando resto zero
 */
public class MultiplosEnaoMult {
	public static void main(String [] args) {
		
		
		Scanner ler = new Scanner(System.in);
		double a =0;
		double b=0;
		
		System.out.println("Digite o primeiro número: ");
		a=ler.nextDouble();
		System.out.println("Digite o segundo número: ");
		b=ler.nextDouble();
		
		if(a % b == 0 || b % a ==0) {
			System.out.println(" São Multiplos");
		}else {
			System.out.println(" nao são múltiplos");
		}
		
	}

}
