/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe Forma3D que tenha calcularVolume(), e implemente Esfera e Cubo.
 *
 */

package Exerciciop_19;

public abstract class Forma3D {

	private float altura;
	private float largura;
	private float comprimento;

	public float getAltura() {

		return this.altura;

	}

	public void setAltura(float altura) {

		this.altura = altura;

	}

	public float getLargura() {

		return this.largura;

	}

	public void setLargura(float largura) {

		this.largura = largura;

	}

	public float getComprimento() {

		return this.comprimento;

	}

	public void setComprimento(float comprimento) {

		this.comprimento = comprimento;

	}

	public abstract double CalcularVolume(float altura, float largura, float comprimento);

}
