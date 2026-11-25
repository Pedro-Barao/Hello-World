/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe Documento com um método abstrato imprimir(), e implemente PDF e Word.
 *
 */

package Exerciciop_15;

public abstract class Documento {

	private String nome;
	private float tamanho;

	public String getNome() {

		return this.nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public float getTamanho() {

		return this.tamanho;

	}

	public void setTamanho(float tamanho) {

		this.tamanho = tamanho;

	}

	public abstract void Imprimir(String nome, float tamanho);

}
