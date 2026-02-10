/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Polimorfismo de Sobrescrita: Modifique Animal para que tenha um método emitirSom(). Em
			Cachorro e Gato, sobrescreva esse método.

 */

package Exerciciop_15;

public class Animal {

	String nome;

	Animal() {
	}

	public Animal(String nome) {

		this.nome = nome;

	}

	public String getNome() {

		return this.nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public void FazerSom() {

		System.out.println("Som Generico");

	}

}
