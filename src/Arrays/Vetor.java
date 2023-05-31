package Arrays;
//Exercicio 1

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int vetorNum[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int num;

		System.out.println("Digite o número que você quer encontrar: ");
		num = leia.nextInt();

		if (num > 0 && num <= 10) {
			System.out.println("O número " + num + " está localizado na posição: " + Arrays.binarySearch(vetorNum, num));

		} else {
			System.out.println("O número não foi encontrado");
		}
	}
}
