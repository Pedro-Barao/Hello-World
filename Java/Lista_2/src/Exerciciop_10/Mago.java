package Exerciciop_10;

public class Mago extends Personagem {

	Mago() {

		super();

	}

	Mago(String nome, int vida, int mana, int dano) {

		super.setNome(nome);
		super.setVida(vida);
		super.setMana(mana);
		super.setDano(dano);

	}

	@Override
	public int Atacar(String nome, int dano, int mana, int vida_inimigo) {

		int mana_gasta = 10;

		System.out.println("O mago " + nome + " atacou o inimigo e causou " + dano + " de dano");
		System.out.println("A mana atual de " + nome + " e igual a " + (mana - mana_gasta));

		return vida_inimigo - dano;

	}

}
