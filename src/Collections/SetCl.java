package Collections;
//Exercício 4

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class SetCl {

	public static void main(String[] args) {

		Set<Integer> setNumeros = new HashSet<Integer>();

		Integer num;
		Scanner leia = new Scanner(System.in);

		setNumeros.add(2 + 5 + 1 + 3 + 4 + 9 + 7 + 8 + 10 + 6);

		System.out.println("Digite um número: ");
		num = leia.nextInt();

		if (num > 0 && num <= 10) {
			System.out.println("O número " + num + " foi encontrado!");

		} else {
			System.out.println("O número " + num + " não foi encontrado.");
		}

	}

}
