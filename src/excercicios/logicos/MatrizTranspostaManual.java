package excercicios.logicos;

public class MatrizTranspostaManual {

	public static void main(String[] args) {
		int[][] matriz = {{ 2, 0, 3},
							{ 5, 4, 3},
							{2, 1, 0}
							};
		int[][] matrizTransposta = new int[ matriz.length][matriz.length];
			
			for( int i =0; i < matriz.length; i++) {
				for( int j =0; j < matriz.length; j++) {
					matrizTransposta[j][j] = matriz [i][j];
					System.out.print(matrizTransposta[j][j]+ " ");
			
				}
				System.out.println();
		}

	}

}
