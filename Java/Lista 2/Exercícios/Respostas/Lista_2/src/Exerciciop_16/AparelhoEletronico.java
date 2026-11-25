/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe AparelhoEletronico com um método ligar(), e implemente Celular e Tablet.
 *
 */

package Exerciciop_16;

public abstract class AparelhoEletronico {

	private String marca;
	private String modelo;

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

	public abstract void Ligar(String marca, String modelo);

}
