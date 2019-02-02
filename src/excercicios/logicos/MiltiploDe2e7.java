package excercicios.logicos;


public class MiltiploDe2e7 {

	public static void main(String[] args) {
		int n,igual, contapar,contasete;
		contapar =0;
		contasete =0;
		igual =0;
		//Scanner teclado = new Scanner(System.in);
		//System.out.println("Entre com um valor númerico");
		//n = teclado.nextInt();
		
		for(int i =1; i<=100; i++) {
			if(i %3 ==0) {
				contapar++;
				System.out.println("BUZZ "+contapar);
			}
			if(i %5 ==0) {
				contasete++;
				System.out.println("BIZZ "+contasete);
			}
			if(i%3 ==0 && i%5 ==0 ) {
				contapar++;
				contasete++;
				System.out.println("BUZZ "+contapar+" BIZZ "+contasete);
			}
			
		}
	
		//System.out.println("par ="+contapar);
	//	System.out.println("contaSete ="+contasete);
	}

}
