package excerciciosLogicos;
/*
 * Fa�a um algoritmo que fa�a a uni�o de dois vetores de mesmo tamanho
 * e mesmo tipo em um terceiro vetor com dobro do tamanho.
 */
public class UniaoDoisVetores {

	public static void main(String[] args) {
		String[] frutas = {"banana", "ma�a", "pera", "goiaba"};
		String [] adicionais = {"a�ucar", "mel", "chocolate", "leite"};
		String [] salada = new String [frutas.length + adicionais.length];
		
		for(int i = 0, j = 0; i <salada.length; i +=2, j++ ) {
			System.out.println(salada[i] = frutas [j]);
			System.out.println(" ");
			System.out.println(salada [i+1] = adicionais[j]);
			System.out.println(" ");
		}
	}

}
