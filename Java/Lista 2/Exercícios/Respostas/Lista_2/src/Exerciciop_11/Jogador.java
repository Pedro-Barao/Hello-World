/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe Jogador que extenda Personagem e adicione um método
			usarHabilidadeEspecial().

 */

package Exerciciop_11;

public abstract class Jogador {

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

	public int UsarHabilidadeEspecial(String nome, int dano, int mana, int vida_inimigo) {

		int mana_gasta = 10;

		System.out.println(
				"O personagem " + nome + " usou o seu especial no inimigo e causou " + (2 * dano) + " de dano");
		System.out.println("A mana atual de " + nome + " e igual a " + (mana - mana_gasta));

		return vida_inimigo - (2 * dano);

	}
}
