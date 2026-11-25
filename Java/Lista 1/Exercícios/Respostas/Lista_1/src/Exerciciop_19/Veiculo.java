/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Hierarquia de Veículos: Crie uma hierarquia de classes Veiculo -> Carro -> CarroEletrico, e
			sobrescreva um método abastecer() para se adaptar a cada tipo de veículo.

 */

package Exerciciop_19;

public abstract class Veiculo {

	private String marca;
	private String modelo;
	private float limite_tanque;

	Veiculo() {
	}

	Veiculo(String marca, String modelo, float limite_tanque) {

		this.marca = marca;
		this.modelo = modelo;
		this.limite_tanque = limite_tanque;

	}

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

	public float getLimiteTanque() {

		return this.limite_tanque;

	}

	public void setLimiteTanque(float limite_tanque) {

		this.limite_tanque = limite_tanque;

	}

	public abstract void Abastecer();

}
