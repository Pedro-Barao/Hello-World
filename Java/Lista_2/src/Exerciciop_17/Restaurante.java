/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe Restaurante que contenha pratos (Prato), e implemente pratos específicos
			(Pizza, Sushi).
 *
 */

package Exerciciop_17;

public abstract class Restaurante {

	private String nome_prato;
	private int mesa;

	public String getNomePrato() {

		return this.nome_prato;

	}

	public void setNomePrato(String nome_prato) {

		this.nome_prato = nome_prato;

	}

	public int getMesa() {

		return this.mesa;
	}

	public void setMesa(int mesa) {

		this.mesa = mesa;

	}

	public abstract void Comida(String nome, int mesa);
}
