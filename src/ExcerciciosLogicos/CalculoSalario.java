package ExcerciciosLogicos;

import java.util.Scanner;

/*
 * Criar um algoritmo que efetue o calculo do salario liquido de um professor.
 * Os dados fornecidos serão: valor da hora aula, número de aulas dadas no mes e
 *  percentual de desconto do INSS
 */

public class CalculoSalario {

	public static void main(String[] args) {
		
		float valor_hora, total_horas, inss;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor da sua hora: ");
		valor_hora = teclado.nextFloat();
		System.out.println("Digite o seu total de horas: ");
		total_horas = teclado.nextFloat();
		System.out.println("Qanto % está o seu INSS? ");
		inss = teclado.nextFloat();
		
		double salario_bruto, salario_liquido;
		
		
		salario_bruto = (valor_hora*total_horas);
		salario_liquido = salario_bruto-(inss/100)*salario_bruto;
		
		System.out.print("Salario liquido: R$ "+salario_liquido);
		
		
		
		
		

	}

}
