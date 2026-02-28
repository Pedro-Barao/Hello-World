/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe ContaBancaria com métodos sacar() e depositar(), e implemente
			ContaCorrente e ContaPoupanca.
 *
 */

package Exerciciop_23;

public abstract class Dispositivo {

	private String marca;
	private String modelo;

	public String getMarca() {

		return this.marca;

	}

	public void setMarca(String marca) {

		this.marca = marca;

	}

	public String gerModelo() {

		return this.modelo;

	}

	public void setModelo(String modelo) {

		this.modelo = modelo;

	}

	public abstract void ConectarInternet(String marca, String modelo);

}
