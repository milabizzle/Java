package Arrays;

public class Matriz {

	public static void main(String[] args) {
		
		int matrizNum [][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		System.out.println("Elementos da diagonal principal: " + matrizNum[0][0] + " " + matrizNum[1][1] + " " + matrizNum[2][2]);
		System.out.println("\nElementos da diagonal secundária: " + matrizNum[0][2] + " " + matrizNum[1][1] + " " + matrizNum[2][0]);
		System.out.println("\nSoma do elementos da diagonal principal: " + (matrizNum[0][0] + matrizNum[1][1] + matrizNum[2][2]));
		System.out.println("\nSoma do elementos da diagonal secundária: " + (matrizNum[0][2] + matrizNum[1][1] + matrizNum[2][0]));
	         
	}
}

