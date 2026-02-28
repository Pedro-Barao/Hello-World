/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Adicione um método concreto descansar() à classe Funcionario, que imprime Descansando....

 */

package Exercicio_7;

public abstract class Funcionario {

	private String nome;

	public String getNome() {

		return this.nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public void Descansando() {

		System.out.println("Descansando....");

	}

}
