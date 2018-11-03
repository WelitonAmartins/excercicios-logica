package exercicios.uri;

import java.util.Scanner;

public class Uri07 {

	public static void main(String[] args) {
		int a=0, b=0, c=0, d=0, diferenca =0;
		
		Scanner tec = new Scanner(System.in);
		
		a = tec.nextInt();
		b = tec.nextInt();
		c = tec.nextInt();
		d = tec.nextInt();
		
		diferenca = (a*b)-(c*d);
		
		System.out.println("DIFERENCA = "+diferenca);

	}

}
