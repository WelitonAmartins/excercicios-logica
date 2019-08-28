package excercicios.canaldocodigo;

import java.util.Random;

/**
 * Dado n inteiro, 0 < n <= 100. e uma sequencia de n números entre 0 e 99,
 *  determinar quantos elementos estão entre 0 e 9,
 *   entre 10 e 19, 
 *   ..., entre 90 e 99.
 * @author weliton.martins
 *
 */
public class ContagemFaixasValoresEX10 {
	public static void main(String[] args) {
		int []v = gerarVetor(100);
		
		int []contador = new int[10];
		
		for(int i =0; i < v.length; i++) 
			contador[v[i]/10]++;
//			System.out.println(contador[v[i]/10]++);
		for(int i= 0; i<10; i++) 
			System.out.printf("[%d - %d] = %d \n", i*10, i*10 + 9, contador[i]);
	}

	private static int[] gerarVetor(int n) {
		int []v = new int[n];
		
		Random gerador = new Random();
		
		for(int i=0; i < n; i++) {
			v[i] = gerador.nextInt(100);
		}
		
		return v;
	}

}
