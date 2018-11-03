package exercicios.uri;

import java.util.Scanner;
/*
 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B 
pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, 
com um espaço em branco antes e depois da igualdade.

Exemplos de Entrada	Exemplos de Saída
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
