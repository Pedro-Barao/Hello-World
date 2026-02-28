/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe Transporte que tenha um método abstrato velocidadeMaxima(), e implemente
			Moto e Caminhão.

 */

package Exerciciop_14;

public abstract class Transporte {

	private String marca;
	private String modelo;
	private float velocidade;
	private float raio_roda;

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

	public float getVelocidade() {

		return this.velocidade;

	}

	public void setVelocidade(float velocidade) {

		this.velocidade = velocidade;

	}

	public float getRaioRoda() {

		return this.raio_roda;

	}

	public void setRaioRoda(float raio_roda) {

		this.raio_roda = raio_roda;

	}

	public abstract double VelocidadeMaxima(float raio_roda);

}
