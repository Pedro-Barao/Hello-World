package Exerciciop_27;

public class Eletronico extends Produto {

	private float desconto;
	
	Eletronico() {

		super();

	}

	Eletronico(String nome, float preco) {

		this.getNome();
		this.getPreco();

	}

	@Override
	public void CalcularDesconto(String nome, float preco) {

		desconto = (float) 0.1;
		
		System.out.println("O eletronico " + nome + " esta custando " + preco + " reais tera 10% de desconto");
		System.out.println("Assim custando: " + (preco - (preco * desconto)));


	}
	
}
