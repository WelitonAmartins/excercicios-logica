package exercicios.uri;

import java.util.Scanner;

public class Uri06 {

	public static void main(String[] args) {
		
		double a =0, b =0, c =0, media =0;
		
		Scanner tec = new Scanner(System.in);
		
		a = tec.nextDouble();
		b = tec.nextDouble();
		c = tec.nextDouble();
		
		media =((a*2)+(b*3)+(c*5))/10;
		
		System.out.printf("MEDIA = %.1f\n", media);

	}

}
