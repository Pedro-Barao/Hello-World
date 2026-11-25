/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe Jogo com um método iniciar(), e implemente JogoAventura e JogoCorrida.
 *
 */

package Exerciciop_18;

public abstract class Jogo {

	private String nome_jogo;
	private int horas_jogadas;

	public String getNomeJogo() {

		return this.nome_jogo;

	}

	public void setNomeJogo(String nome_jogo) {

		this.nome_jogo = nome_jogo;

	}

	public int getHorasJogadas() {

		return this.horas_jogadas;

	}

	public void setHorasJogadas(int horas_jogadas) {

		this.horas_jogadas = horas_jogadas;

	}

	public abstract void Iniciar(String nome_jogo);
}
