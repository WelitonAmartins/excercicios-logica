package excerciciosLogicos;
import java.util.ArrayList;
import java.util.List;

public class Primo {
	
	
		public static void main(String[] args) {
			int primo = Integer.valueOf( args[0] );
			boolean isPrimo = true;
			List<Integer> divisor = new ArrayList<Integer>(); 
			
			for (int i = 2; i <= primo; i++) {
				if ( ( (primo % i) == 0) && (i != primo) ) {
					isPrimo = false;
					divisor.add( i );
				}
			}
			if (isPrimo) {
				System.out.println( "� Primo" );
			} else {
				System.out.print( "N�o � Primo e seus divisores s�o --> ");
				for (Integer i : divisor) {
					System.out.print( i + ", ");
				}
			}
		}
	}

