package excerciciosLogicos;

public class InverterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int[] conteiner = new int [vetor.length];
		
		for( int i =0; i < vetor.length; i++) {
			conteiner [i]=vetor [( vetor.length -i)-1];
			System.out.println(conteiner[i]+ " ");
		}

	}

}
