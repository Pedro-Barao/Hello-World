/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe Produto com um método calcularDesconto(), e implemente Eletronico e
			Alimento.
 *
 */

package Exerciciop_27;

public abstract class Produto {

	private String nome;
	private float preco;

	public String getNome() {

		return nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public float getPreco() {

		return preco;

	}

	public void setPreco(float preco) {

		this.preco = preco;

	}

	public abstract void CalcularDesconto(String nome, float preco);

}
