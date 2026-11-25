/*
 *
 * Nome: Pedro Gonella Barao
 * Data: 10/02/2026
 * Objetivo: Classe InstrumentoMusical: Crie uma superclasse InstrumentoMusical e subclasses como
			Violao e Piano, cada uma com um método tocar().

 */

package Exerciciop_12;

public class InstrumentoMusical {

	private String tipo;

	InstrumentoMusical() {
	}

	InstrumentoMusical(String tipo) {

		this.tipo = tipo;

	}

	public String getTipo() {

		return this.tipo;

	}

	public void setTipo(String tipo) {

		this.tipo = tipo;

	}

	public void Tocar() {

		System.out.println("Som generico");

	}

}
