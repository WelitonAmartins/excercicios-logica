package exercicios.uri;

import java.util.Scanner;

/*Leia dois valores inteiros. A seguir,
 calcule o produto entre estes dois valores e atribua esta opera��o � vari�vel PROD.
 A seguir mostre a vari�vel PROD com mensagem correspondente.   

Entrada
O arquivo de entrada cont�m 2 valores inteiros.

Sa�da
Imprima a vari�vel PROD conforme exemplo abaixo, com um espa�o em branco antes e depois da igualdade.
 N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.

Exemplos de Entrada	Exemplos de Sa�da
3
9

PROD = 27

-30
10

PROD = -300

0
9

PROD = 0
 * 
 */

public class Uri04 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		int PROD =0;
		
		A = tec.nextInt();
		B = tec.nextInt();
		
		PROD = (A*B);
		
		System.out.print("PROD = "+PROD+"\n");
				
	}
}
