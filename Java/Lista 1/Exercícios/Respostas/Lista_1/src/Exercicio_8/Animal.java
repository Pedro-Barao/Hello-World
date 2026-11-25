/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Criando uma Hierarquia de Classes: Crie uma classe Animal com os atributos nome e idade.
			Depois, crie as classes Cachorro e Gato que herdam de Animal.

			a. Métodos Específicos: Adicione métodos latir() em Cachorro e miar() em Gato.

			b. Sobrecarga de Construtores: Adicione várias formas de inicializar um Animal,
			incluindo um construtor padrão e outro que recebe nome e idade.

			c. Superclasse e Subclasses: Utilize super() dentro das subclasses para chamar o
			construtor da superclasse.

 */

package Exercicio_8;

public class Animal {

	String nome;
	int idade;

	Animal() {
	}

	public Animal(String nome, int idade) {

		this.nome = nome;
		this.idade = idade;

	}

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

}
