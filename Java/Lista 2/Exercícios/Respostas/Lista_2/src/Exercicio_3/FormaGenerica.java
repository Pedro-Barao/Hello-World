/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe abstrata FormaGeometrica com métodos abstratos calcularArea() e
			calcularPerimetro(). Crie Circulo e Retangulo.

 */

package Exercicio_3;

public abstract class FormaGenerica {

	private double base;
	private double altura;

	public double getBase() {

		return this.base;

	}

	public void setBase(double base) {

		this.base = base;

	}

	public double getAltura() {

		return this.altura;

	}

	public void setAltura(double altura) {

		this.altura = altura;

	}

	public abstract double CalcularPerimetro(double base, double altura);

	public abstract double CalcularArea(double base, double atura);

}
