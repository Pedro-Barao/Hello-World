/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe abstrata Personagem com um método atacar(), e implemente Guerreiro e
			Mago.


 */

package Exerciciop_10;

public abstract class Personagem {

	private String nome;
	private int vida;
	private int mana;
	private int dano;

	public String getNome() {

		return this.nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public int getVida() {

		return this.vida;

	}

	public void setVida(int vida) {

		this.vida = vida;

	}

	public int getMana() {

		return this.mana;

	}

	public void setMana(int mana) {

		this.mana = mana;

	}

	public int getDano() {

		return this.dano;

	}

	public void setDano(int dano) {

		this.dano = dano;

	}

	public abstract int Atacar(String nome, int dano, int mana, int vida_inimigo);
}
