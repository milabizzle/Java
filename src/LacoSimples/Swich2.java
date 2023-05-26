package LacoSimples;
//Exercício 8 Swich

import java.util.Scanner;

public class Swich2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float saldo = 1000;
		int operacao, valor, deposito;

		System.out.println("Digite a operação desejadada: 1 para SALDO - 2 para SAQUE e 3 para DEPÓSITO");
		operacao = ler.nextInt();

		switch (operacao) {

		case 1:
			System.out.println("Saldo:" + (saldo));
			break;

		case 2:
			System.out.println("Digite o valor desejado para Saque:");
			valor = ler.nextInt();

			if (valor <= saldo) {
				System.out.println("Seu novo saldo é de: " + (saldo - valor));
			} else {
				System.out.println("Saldo insuficiente");
			}
			break;

		case 3:
			System.out.println("Qual valor gostaria de depositar?");
			deposito = ler.nextInt();

			if (deposito < 5) {
				System.out.println("Não é possível fazer depósitos abaixo de R$5,00. Deposite um outro valor");
			} else if (deposito > 5)
				System.out.println("Seu novo saldo é de: " + (saldo + deposito));

			break;

		default:
			System.out.println("Opção inválida!");
		}
	}

}
