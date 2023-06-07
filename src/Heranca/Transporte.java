package Heranca;

public abstract class Transporte {

	public static void main(String[] args) {

	}
		private int capacidade;
		
		public Transporte(int capacidade) {
			super();
			this.capacidade = capacidade;
			
		}

		public int getCapacidade() {
			return capacidade;
		}

		public void setCapacidade(int capacidade) {
			this.capacidade = capacidade;
		}

		public abstract void vizualizar(); {
			System.out.println(" A capacidade é" + this.capacidade); {
		
		
			}

	}

}
