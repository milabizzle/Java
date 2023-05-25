package PacoteJava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4;
		
		System.out.println("Digite a Nota 1: ");
		
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a Nota 2: ");
		
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a nota 3: ");
		
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a Nota 4: ");
		
		nota4 = leia.nextFloat();
		
		System.out.printf("Média final: %.1f " , (nota1+nota2+nota3+nota4)/4);
		//%.xf (x = números que eu quero depois da vírgula)
	}

}