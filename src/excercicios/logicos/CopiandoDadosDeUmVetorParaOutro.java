package excercicios.logicos;

public class CopiandoDadosDeUmVetorParaOutro {
	public static void main(String[]args) {
		String [] vetorUm = {"Cereija", "Marfim", "Mogno", "Garapa", "Cedro"	};
		String [] vetorDois = new String [vetorUm.length];
		
		for(int i =0; i < vetorUm.length; i++) {
			vetorDois [i] = vetorUm [i];
			System.out.println(vetorDois[i] + " ");
}
	}
}
