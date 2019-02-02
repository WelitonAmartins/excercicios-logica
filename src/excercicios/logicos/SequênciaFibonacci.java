package excercicios.logicos;

import java.util.Scanner;

public class SequênciaFibonacci {
	/*
	 * Escreva um programa que leia um número n inteiro qualquer 
	 * e mostre na tela os n priemrios elementos de uma sequencia de Fabonacci
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println(" Sequência de Fibonacci");
		System.out.println("------------------------");
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Quantos termos você quer mostrar?");
		int n = tec.nextInt();
		
		/*
		 *
		int t1 =0;
		int t2 =1;
		int t3;
		int cont =1;
		while(cont <= n) {
			 t3 =t1+t2;
			System.out.println(t3);
			t1=t2;
			t2=t3;
			cont +=1;
			
			
		}
		
		System.out.println("Fim");
	*/
	
	// com for
		int a = 0;
		int b = 1;
		int aux;
		for(int i=0; i<n; i++) {
			System.out.println(a);
			aux = a;
			a = a + b;
			b = aux;
		}
	}

}
