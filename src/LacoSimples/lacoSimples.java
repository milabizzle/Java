package LacoSimples;

import java.util.Scanner;

public class lacoSimples {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num;

		System.out.println("Digite um número");
		num = ler.nextInt();

		if (num == 1) {
			System.out.println("conta paga no débito");
		} else if (num == 2)

		{
			System.out.println("conta paga no crédito");

		}

		else {
			System.out.println("Número inválido");
		}
	}
}
