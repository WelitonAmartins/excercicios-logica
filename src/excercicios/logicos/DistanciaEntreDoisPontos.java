package excercicios.logicos;

import java.util.Scanner;

public class DistanciaEntreDoisPontos {
	/*
	 * Logica
	 * Obter 2 numeros que  representam p1(x1,y1)
	 * Obter outros 2 numeros que reoresenta p2(x2, y2)]
	 * 
	 * Calcula a distancia e imprimir na tela 
	 * 
	 * 
	 * formula Distancia = Raiz de (x2 - x1)² + (y2 - y1)²
	 */
	
	public static void main(String[] args) {
		double x1, y1, x2, y2;
		double parte1, parte2;
		double distancia;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor de X1:");
		x1 = leitor.nextDouble();
		
		System.out.println("Digite o valor de Y1:");
		y1 = leitor.nextDouble();
		
		System.out.println("Digite o valor de X2:");
		x2 = leitor.nextDouble();
		
		System.out.println("Digite o valor de Y2:");
		y2= leitor.nextDouble();
		
		parte1 = Math.pow(x2 - x1, 2);//Math.pow funcao do java que ela a potencia
		parte2 = Math.pow(y2 - y1, 2);
		
		distancia = Math.sqrt(parte1 + parte2); // Math.sqrt funcao que tira a raiz quadrada  
		
		System.out.println("Distancia: "+ distancia);
		
	}
}
