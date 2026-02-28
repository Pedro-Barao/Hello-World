package Exercicio_4;

public class Produto extends ProdutoBase {

	private double preco;

	Produto(String nome, int QuantidadeEmEstoque, double preco) {

		super(nome, QuantidadeEmEstoque);
		this.preco = preco;

	}

	public double getPreco() {

		return preco;

	}

}
