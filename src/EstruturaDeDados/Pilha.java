package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		Scanner leia = new Scanner(System.in);
		
		String livro;
		int opcao;
		
		System.out.println("Escolha a opção desejada: ");
		opcao = leia.nextInt();
		
		
			System.out.println("Digite o nome: ");
			livro = leia.nextLine();
			pilha.push(livro);
		
		}
	}


