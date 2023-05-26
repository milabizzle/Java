package LacoSimples;
//Exercício 7 Swich

import java.util.Scanner;

public class Swich1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
	
		float numero1, numero2;
		int operacao;
		
		
		System.out.println("Digite o numero 1:");
		numero1 = ler.nextFloat();
		
		System.out.println("Digite o numero 2:");
		numero2 = ler.nextFloat();
		
		System.out.println("Digite a opreração desejada: 1 para Somar - 2 para Subtrair - 3 para Multiplicar e 4 para Dividir ");
		operacao = ler.nextInt();
		
		switch (operacao) {
		
		case 1:
			System.out.println("Resultado:" + (numero1 + numero2));

			break;

		case 2:
			System.out.println("Resultado:" + (numero1 - numero2));
			
			break;
			
		case 3:
			System.out.println("Resultado:" + (numero1 * numero2));
			
			break;
			
		case 4:
			System.out.println("Resultado:" + (numero1 / numero2));
			
		default:
			System.out.println("Opção inválida!");
		
		}
	}

}
