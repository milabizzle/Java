package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;

public class Pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);

		String livro = null;
		int opcao = 0;
		Boolean faca = true;

		while (faca) {
			System.out.println("\nEscolha a opção desejada:" + "\n1 - Adicionar livro na pilha"
					+ "\n2 - Listar todos os livros" + "\n3 - Retirar livro da pilha" + "\n0 - Sair");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite o nome do livro: ");
				leia.skip("\\R?");
				livro = leia.nextLine();
				pilha.push(livro);
				System.out.println("\nLivro Adicionado!!\n");

				break;

			case 2:

				if (pilha.size() == 0) {
					System.out.println("A Pilha está vazia!!");
				} else {
					System.out.println("\nLivros da Pilha: " + pilha);
				}
				break;

			case 3:
				if (pilha.size() == 0) {
					System.out.println("A pilha está vazia.\n");
				} else {
					System.out.println("\nLivros na Pilha: " + pilha.pop());
					System.out.println("Um livro foi retirado da pilha\n");
				}
				break;

			default:
				if (opcao == 0) {
					faca = false;
					System.out.println("Programa finalizado!");
				} else {
					System.out.println("Opção inválida!!");
				}
				break;

			}
		}
	}
}
