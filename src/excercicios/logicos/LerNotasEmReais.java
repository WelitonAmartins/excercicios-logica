package excercicios.logicos;

import java.util.Scanner;

/*
 *EsCrever um algoritmo que lê um valor em reais e calcula qual o menor número possível de notas de
 *100, 50 ,10, 5 ,1 em que o valor lido pode ser decomposto. Escrever o valor lido
 * e a reção de notas necessárias 
 *
 */
public class LerNotasEmReais {

	public static void main(String[] args) {
		int valor =0, cem = 0, cinquenta =0, dez=0, cinco= 0, um = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor em reais: ");
		valor = teclado.nextInt();
		
		if(valor % 100 !=0) {
			cem = valor/100;
			cinquenta = valor% 100;
			
			if(cinquenta % 50!=0) {
				dez = cinquenta %50;
				cinquenta = cinquenta / 50;
				
				if(dez % 10 !=0) {
					cinco = dez % 10;
					dez = dez / 10;
					
					if(cinco % 5 !=0) {
						um = cinco % 5;
						cinco = cinco / 5;
					}else {
						cinco = cinco / 5;
					}
				}else {
					dez = dez/ 10;
				}
			}else {
				cinquenta = cinquenta / 50;
			}
			
		}else {
			cem = valor /100;
		}
		System.out.format("Cem: %d\nCinquenta: %d\nCinquenta: %d\nCinco: %d\nUm: %d", cem, cinquenta, dez, cinco, um);
	}

}
