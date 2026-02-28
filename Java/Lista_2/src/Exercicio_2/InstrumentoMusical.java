/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe abstrata InstrumentoMusical com um método abstrato tocar(), e implemente
			Guitarra e Piano.

 */

package Exercicio_2;

public abstract class InstrumentoMusical {

	private String tipo;

	public String getTipo() {

		return this.tipo;

	}

	public void setTipo(String tipo) {

		this.tipo = tipo;

	}

	public abstract void Tocar();

}
