 package excercicios.logicos;

import java.util.Scanner;

public class TesteTCI {
	
	/*
	 * faça um programa que o usuario informe um valor que nao pode ser maior que 100 e 
	 * ao informar o valor desenhe uma piramede com "#"
	 * Exemplo: valor 5 
	 * 
	 * 	#
	 * 	##
	 * 	###
	 * 	####
	 */
		
	public static void main(String[] args) {
		
		int n;
		String nome = "";
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um valor");
		n = scan.nextInt();
		
		if(n < 100) {
			for(int i=0; i < n; i++) {
				System.out.println(nome += "#");
				}
			} else {
				System.out.println("Valor invalido");
			}
		}
	}
