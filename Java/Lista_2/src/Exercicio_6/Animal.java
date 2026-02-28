/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Adicione um construtor à classe Animal que aceite um nome e um método getNome().

 */

package Exercicio_6;

public abstract class Animal {

	private String nome;
	private int idade;

	Animal(String nome, int idade) {

		this.nome = nome;
		this.idade = idade;

	}

	public String getNome() {

		return this.nome;

	}

	public int getIdade() {

		return this.idade;

	}

	public abstract void FazerSom();

}
