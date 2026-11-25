/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Classe Veiculo e Moto: Crie uma classe Veiculo e uma subclasse Moto. Adicione um atributo
			cilindrada e um método para exibi-lo

 */

package Exerciciop_10;

public class Veiculo {

	private String marca;
	private String modelo;
	private int velocidade_maxima;

	public Veiculo() {
	}

	public Veiculo(String marca, String modelo, int velocidade_maxima) {

		this.marca = marca;
		this.modelo = modelo;
		this.velocidade_maxima = velocidade_maxima;

	}

	public String getMarca() {

		return marca;

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

	public int getVelocidadeMaxima() {

		return this.velocidade_maxima;

	}

	public void setVelocidadeMaxima(int velocidade_maxima) {

		this.velocidade_maxima = velocidade_maxima;

	}

}
