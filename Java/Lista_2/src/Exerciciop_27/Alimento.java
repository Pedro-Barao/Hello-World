package Exerciciop_27;

public class Alimento extends Produto{

	private float desconto;
	
	Alimento() {

		super();

	}

	Alimento(String nome, float preco) {

		this.getNome();
		this.getPreco();

	}

	@Override
	public void CalcularDesconto(String nome, float preco) {

		desconto = (float) 0.05;
		
		System.out.println("O alimento " + nome + " esta custando " + preco + " reais tera 5% de desconto");
		System.out.println("Assim custando: " + (preco - (preco * desconto)));


	}
	
}
