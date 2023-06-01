package Arrays;

public class Matriz {

	public static void main(String[] args) {
		
		int matrizNum [][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		int somaPrincipal = 0, somaSecundaria = 0;
		String principal = "", secundaria = "";
		
		for (int indice = 0; indice < matrizNum.length; indice++) {
			somaPrincipal += matrizNum[indice][indice];
			
			principal += matrizNum[indice][indice] + " " ;
		}

		for (int indice = 0; indice < matrizNum.length; indice++) {
			somaSecundaria += matrizNum[indice][matrizNum.length -1 - indice];
			
			secundaria += matrizNum[indice][matrizNum.length -1 - indice] + " " ;
		}

		System.out.println("Elementos da diagonal principal: " + principal);
		System.out.println("\nElementos da diagonal secundária: " + secundaria);
		System.out.println("\nSoma do elementos da diagonal principal: " + somaPrincipal);
		System.out.println("\nSoma do elementos da diagonal secundária: " + somaSecundaria);
	         
	}
}

