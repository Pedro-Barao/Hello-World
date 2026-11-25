package Exerciciop_11;

public class Personagem extends Jogador {

	Personagem() {

		super();

	}

	Personagem(String nome, int vida, int mana) {

		super.setNome(nome);
		super.setVida(vida);
		super.setMana(mana);
		super.setDano(mana);

	}

	@Override
	public int Atacar(String nome, int dano, int mana, int vida_inimigo) {

		System.out.println("O personagem " + nome + " atacou o inimigo e causou " + dano + " de dano");

		return vida_inimigo - dano;

	}

}
