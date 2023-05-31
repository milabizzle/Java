package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExArrayList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<Double>();
		
		Double num = 0.0;
		
	for(int x = 0; x <= 5; x ++) {
		System.out.println("Digite um número positivo: ");
		num = leia.nextDouble();
		notas.add(num); //add. para adicionar os dados diretamente na lista (ArrayList)
	}
	
	System.out.println("Números cadastrados: " + notas);
	
	System.out.println("\nA posição da nota 5 é: " + notas.indexOf(5d));//O d no "5" é de Double, 
	//só pra especificar o tipo da variável
	
//Mostra a posição (indice) de um dado, na lista *lembrando que começa no 0
		
	}

	
	
}
