package exercicios.uri;

import java.util.Scanner;
/*
 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto de A e B 
pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada cont�m 4 valores inteiros.

Sa�da
Imprima a mensagem DIFERENCA com todas as letras mai�sculas, conforme exemplo abaixo, 
com um espa�o em branco antes e depois da igualdade.

Exemplos de Entrada	Exemplos de Sa�da
5
6
7
8

DIFERENCA = -26
 */

public class Uri07 {

	public static void main(String[] args) {
		int a=0, b=0, c=0, d=0, diferenca =0;
		
		Scanner tec = new Scanner(System.in);
		
		a = tec.nextInt();
		b = tec.nextInt();
		c = tec.nextInt();
		d = tec.nextInt();
		
		diferenca = (a*b)-(c*d);
		
		System.out.println("DIFERENCA = "+diferenca);

	}

}
