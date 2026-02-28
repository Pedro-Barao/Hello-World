package Exerciciop_11;

import java.util.Scanner;

public class MainAtaqueJogador {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Personagem personagem = new Personagem();
		String nome;
		int vida, vida_inimigo = 50, dano, mana, opcao;

		System.out.println("Qual o nome do seu personagem?: ");
		nome = scanner.nextLine();
		personagem.setNome(nome);

		System.out.println("Quanto de vida tem o seu personagem?: ");
		vida = scanner.nextInt();
		personagem.setVida(vida);

		System.out.println("Quanto de dano tem o seu personagem?: ");
		dano = scanner.nextInt();
		personagem.setDano(dano);

		System.out.println("Quanto de mana tem o seu personagem?: ");
		mana = scanner.nextInt();
		personagem.setMana(mana);

		System.out.println("Como deseja atacar o inimigo?: 1 - Ataque Comum  2 - Ataque especial: ");
		opcao = scanner.nextInt();

		if (opcao == 1) {

			vida_inimigo = personagem.Atacar(nome, dano, mana, vida_inimigo);

		}

		else {

			vida_inimigo = personagem.UsarHabilidadeEspecial(nome, dano, mana, vida_inimigo);

		}

		if (vida_inimigo <= 0) {

			System.out.println("O inimigo foi derrotado");

		}

	}

}
