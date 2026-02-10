/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Uso de @Override: Garanta que as subclasses sobrescrevem corretamente os métodos
			usando @Override.

 */

package Exerciciop_16;

public class Cliente {

	private String nome;

	Cliente() {
	}

	Cliente(String nome) {

		this.nome = nome;

	}

	public String getNome() {

		return this.nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public void Compra(String nome) {

		System.out.println(nome + " comprou um produto generico");

	}

}
