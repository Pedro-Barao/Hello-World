/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe RedeSocial com métodos postar() e curtir(), e implemente Facebook e Twitter
 *
 */

package Exerciciop_21;

public abstract class RedeSocial {

	private String dono_post;
	private int curtidas;

	public String getDonoPost() {

		return this.dono_post;

	}

	public void setDonoPost(String dono_post) {

		this.dono_post = dono_post;

	}

	public int getCurtidas() {

		return this.curtidas;

	}

	public void setCurtidas(int curtidas) {

		this.curtidas = curtidas;

	}

	public abstract int Curtir(String dono_post, int curtidas, int opcao);

	public abstract void Postar(String dono_post, int opcao);

}
