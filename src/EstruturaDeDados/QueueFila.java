package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueFila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);

		Boolean faca = true;
		String cliente = null;
		int opcao = 0;

		while (faca) {
			System.out.println("\nEscolha a opção desejada:" + "\n1 - Adicionar cliente na fila"
					+ "\n2 - Listar todos os clientes" + "\n3 - Retirar cliente da fila" + "\n0 - Sair");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite o nome do cliente: ");
				cliente = leia.next();
				fila.add(cliente);
				System.out.println("\nCliente Adicionado!!");
				break;

			case 2:
				System.out.println("Lista de Clientes na Fila: " + fila);
				break;

			case 3:
				if (fila.size() == 0) {
					System.out.println("A Fila está vazia!!");
				} else {
					System.out.println(fila.poll());
					System.out.println("O Cliente foi Chamado!");
					System.out.println("\nFila: " + fila);
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
