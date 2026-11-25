/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Classe Pessoa: Crie uma classe Pessoa com nome e idade. Adicione um método para
			verificar se a pessoa é maior de idade.

 */

package Exercicio_3;

public class Pessoa {

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

	public boolean MaiorDeIdade(int idade) {

		boolean demaior = false;

		if (idade >= 18) {

			demaior = true;

		}

		return demaior;

	}

}
