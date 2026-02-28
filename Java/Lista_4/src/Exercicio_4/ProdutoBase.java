package Exercicio_4;

public abstract class ProdutoBase implements Entidade {

	private String nome;
	private int QuantidadeEmEstoque;

	ProdutoBase(String nome, int QuantidadeEmEstoque) {

		this.nome = nome;
		this.QuantidadeEmEstoque = QuantidadeEmEstoque;

	}

	@Override
	public String getNome() {

		return nome;

	}

	public int getQuantidadeEmEstoque() {

		return QuantidadeEmEstoque;

	}

}
