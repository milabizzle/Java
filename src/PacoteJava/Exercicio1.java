package PacoteJava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		float salario, abono;
		
		System.out.println("Digite o valor do seu salario: ");
		
		salario = leia.nextFloat();
		
		System.out.println("Digite o valor do seu abono: ");
		
		abono = leia.nextFloat();
		
		System.out.println("Valor final do salário: "+(salario+abono));
		
	}

}
