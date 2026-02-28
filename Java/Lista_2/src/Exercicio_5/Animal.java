/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe abstrata Animal com um método abstrato fazerSom(). Implemente Cachorro e
			Gato.

 */

package Exercicio_5;

public abstract class Animal {

	private String nome;
	private int idade;

	public String getNome() {

		return this.nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public int getIdade() {

		return this.idade;

	}

	public void setIdade(int idade) {

		this.idade = idade;

	}

	public abstract void FazerSom();

}
