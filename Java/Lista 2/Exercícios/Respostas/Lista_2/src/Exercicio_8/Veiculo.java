/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Adicione um atributo cor à classe Veiculo e um método concreto mostrarCor().

 */

package Exercicio_8;

public abstract class Veiculo {

	private String marca;
	private String modelo;
	private String cor;

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

	public String getCor() {

		return this.cor;

	}

	public void setCor(String cor) {

		this.cor = cor;

	}

	public void MostrarCor(String cor) {

		System.out.println("Tem a cor: " + cor);

	}

}
