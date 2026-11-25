/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe Trabalho com um método executar(), e implemente Professor e Engenheiro.
 *
 */

package Exerciciop_26;

public abstract class Trabalho {

	private String nome;
	private int anos_experiencia;

	public String getNome() {

		return nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public int getAnosExperiecia() {

		return anos_experiencia;

	}

	public void setAnosExperiencia(int anos_experiencia) {

		this.anos_experiencia = anos_experiencia;

	}

	public abstract void Executar(String nome, int anos_experiencia);

}
