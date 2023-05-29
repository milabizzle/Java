package LacosDeRepeticao;
//Exercicio 2

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int contador = 0, numero, pares = 0, impares = 0;

		for(contador = 1; contador <= 10; contador++){
			System.out.println("\nDigite o " + contador + "º número: ");
			numero = leia.nextInt();{
			
			}
		
		if (numero %2 == 0) {
			pares++;
		}
		else {
			impares++;
			System.out.println("Total de números pares: " + pares);
			System.out.println("Total de números impares: " + impares);
			
			//Descobrir como deixar o print somente no encerramento do contador.
			
		}
		
		
		}

	}

}