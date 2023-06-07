package Poo;
//Exercicio 1

public class Cliente {

		private int manequim;
		private int idade;
		private String nome;
		private String sexo;
		private float altura;
		
		public Cliente(int manequim, int idade, String nome, String sexo, float altura) {
			super();
			this.manequim = manequim;
			this.idade = idade;
			this.nome = nome;
			this.sexo = sexo;
			this.altura = altura;
		}

		public int getManequim() {
			return manequim;
		}

		public void setManequim(int manequim) {
			this.manequim = manequim;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public float getAltura() {
			return altura;
		}

		public void setAltura(float altura) {
			this.altura = altura;
		}
		
		public void vizualizar() { 
			System.out.println(" O nome docliente é" + this.nome);
			System.out.println(" A idade do cliente é" + this.idade);
			System.out.println(" O manequim do cliente é" + this.manequim);
			System.out.println(" O sexo do cliente é" + this.sexo);
			System.out.println(" A altura do cliente é" + this.altura);
		}

}
