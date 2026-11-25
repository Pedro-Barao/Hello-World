package Exercicio_1;

public abstract class Pessoa implements Entidade {

	private String nome;
	private int idade;

	Pessoa(String nome, int idade) {

		this.nome = nome;
		this.idade = idade;

	}

	@Override
	public String getNome() {

		return nome;

	}

	@Override
	public int getIdade() {

		return idade;

	}

}
