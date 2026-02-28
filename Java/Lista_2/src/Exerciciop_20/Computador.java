/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe Computador com um método processar(), e implemente Desktop e Notebook.
 *
 */

package Exerciciop_20;

public abstract class Computador {

	private String marca;
	private String modelo;
	private String funcao;

	public String getMarca() {

		return this.marca;

	}

	public void setMarca(String marca) {

		this.marca = marca;

	}

	public String getModelo() {

		return this.modelo;

	}

	public void setModelo(String modelo) {

		this.modelo = modelo;

	}

	public String getFuncao() {

		return this.funcao;

	}

	public void setFuncao(String funcao) {

		this.funcao = funcao;

	}

	public abstract void Processar(String funcao);

}
