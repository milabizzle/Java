package LacoSimples;
//Exercício 3 if

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String nome;
		int idade;
		boolean resposta;

		System.out.println("Digite o nome do doador");
		nome = ler.nextLine();

		System.out.println("Digite a idade do doador: ");
		idade = ler.nextInt();

		System.out.println("Primeira doação de sangue? ");
		resposta = ler.nextBoolean();

		if (idade >= 18) {
			System.out.println(nome + " está apto a doar sangue!");
			{

			}

		} else if (idade <= 60) {
		} else if (idade == 69) {
		} else if (resposta = false) {
			System.out.println(nome + " está apto para doar sangue!");
			{

			}

		} else {
			System.out.println(nome + " não está apto para doar sangue! ");

		}
	}
}