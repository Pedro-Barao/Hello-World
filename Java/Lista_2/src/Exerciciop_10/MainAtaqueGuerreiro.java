package Exerciciop_10;

import java.util.Scanner;

public class MainAtaqueGuerreiro {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Guerreiro guerreiro = new Guerreiro();
		String nome;
		int vida, vida_inimigo = 50, dano, mana = 0;

		System.out.println("Qual o nome do seu guerreiro?: ");
		nome = scanner.nextLine();
		guerreiro.setNome(nome);

		System.out.println("Quanto de vida tem o seu guerreiro?: ");
		vida = scanner.nextInt();
		guerreiro.setVida(vida);

		System.out.println("Quanto de dano tem o seu guerreiro?: ");
		dano = scanner.nextInt();
		guerreiro.setDano(dano);

		vida_inimigo = guerreiro.Atacar(nome, dano, mana, vida_inimigo);

		if (vida_inimigo <= 0) {

			System.out.println("O inimigo foi derrotado");

		}

	}

}
