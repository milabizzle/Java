package Poo;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente novoCliente = new Cliente(0, 0, null, null, 0);
		
		novoCliente.setIdade(25);
		novoCliente.setNome("Camila"); 
			
		
			System.out.println(" O nome do cliente é " + novoCliente.getNome());
			System.out.println(" A idade do cliente é " + novoCliente.getIdade() + " anos.");
		
	}

}
