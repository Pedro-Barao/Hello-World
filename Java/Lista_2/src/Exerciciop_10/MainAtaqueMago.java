package Exerciciop_10;

import java.util.Scanner;

public class MainAtaqueMago {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Mago mago = new Mago();
		String nome;
		int vida, vida_inimigo = 50, dano, mana;

		System.out.println("Qual o nome do seu mago?: ");
		nome = scanner.nextLine();
		mago.setNome(nome);

		System.out.println("Quanto de vida tem o seu mago?: ");
		vida = scanner.nextInt();
		mago.setVida(vida);

		System.out.println("Quanto de dano tem o seu mago?: ");
		dano = scanner.nextInt();
		mago.setDano(dano);

		System.out.println("Quanto de mana tem o seu mago?: ");
		mana = scanner.nextInt();
		mago.setMana(mana);

		vida_inimigo = mago.Atacar(nome, dano, mana, vida_inimigo);

		if (vida_inimigo <= 0) {

			System.out.println("O inimigo foi derrotado");

		}

	}

}
