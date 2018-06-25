package ExcerciciosLogicos;

import java.util.Random;

public class MatrizTranspostaRandom {
	/*
	 * Faça uma função que receba uma matriz
	 * e calcule a sua trnsposta e retorne
	 */
	static int[][] criaMatriz(int N, int M){
		int [][] matriz = new int [N][M];
		Random gerador = new Random();
		for(int i =0; i < matriz.length; i++) {
			for(int j= 0; j < matriz[0].length; j++) {
				matriz[i][j] = gerador.nextInt(100);
			}
		}
		return matriz;
	}
	static void imprimematriz(int [][] matriz) {
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
	
	static int [][] transposta(int [][] matriz){
		int [][] matrizTransposta = new int [matriz[0].length][matriz.length];
		for(int i=0; i < matrizTransposta.length; i++) {
			for(int j=0; j< matrizTransposta[0].length; j++) {
				matrizTransposta[i][j]= matriz [j][i];
			}
		}
		return matrizTransposta;
		
	}
	public static void main(String[]args) {
		int [][] matriz = criaMatriz(2, 3);
		imprimematriz(matriz);
		System.out.println();
		int [][] transposta = transposta(matriz);
		imprimematriz(transposta);
	}
}
