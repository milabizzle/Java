package LacosDeRepeticao;
//Exercício 5

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero, resultado = 0;

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			if (numero > 0)
				resultado = resultado + numero;

		} while (numero != 0);

		System.out.println("A soma dos resuldados positivos é:" + resultado);

	}

}
