package excercicios.logicos;

import java.util.Scanner;

/*
 * Elabore um algoritmo que l� 2 valores A e B e os escreve com a mensagem:
 * "S�o multiplos" ou "nao multiploes"
 * 
 * M�ltiplos e divisores s�o n�meros que resultam da multiplica��o por um n�mero natural
 *  e que dividem um n�mero deixando resto zero
 */
public class MultiplosEnaoMult {
	public static void main(String [] args) {
		
		
		Scanner ler = new Scanner(System.in);
		double a =0;
		double b=0;
		
		System.out.println("Digite o primeiro n�mero: ");
		a=ler.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		b=ler.nextDouble();
		
		if(a % b == 0 || b % a ==0) {
			System.out.println(" S�o Multiplos");
		}else {
			System.out.println(" nao s�o m�ltiplos");
		}
		
	}

}
