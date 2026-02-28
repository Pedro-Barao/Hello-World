/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe abstrata Veiculo com um método abstrato mover(), e implemente Carro e
			Bicicleta.

 */

package Exercicio_1;

public abstract class Veiculo {

	private String marca;
	private String modelo;
	private int quantidade_rodas;

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

	public int getQuantidade_Rodas() {

		return quantidade_rodas;

	}

	public void setQuantidadeRodas(int quantidade_rodas) {

		this.quantidade_rodas = quantidade_rodas;

	}

	public abstract float Mover(float quantidade_rodas, float metros);

}
