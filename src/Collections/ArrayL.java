package Collections;
//Exercício 1

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayL {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<String> listaDeCores = new ArrayList<>();

		String cores;

		for (int x = 0; x <= 4; x++) {
			System.out.println("Digite uma cor: ");
			cores = leia.nextLine();
			listaDeCores.add(cores);
			
		}

		System.out.println("As cores escolhidas são:");
		for (String cores1 : listaDeCores) {
			System.out.println(cores1);
		}
		Collections.sort(listaDeCores);
		System.out.println("As cores em ordem crescente são :");
		for (String cores2 : listaDeCores) {
			System.out.println(cores2);
		}
	}

}
