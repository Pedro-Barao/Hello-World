package Exerciciop_18;

import java.util.Scanner;

public class MainIniciarJogoCorrida {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		JogoCorrida jogo = new JogoCorrida();
		String nome_jogo;
		int horas_jogadas;

		System.out.println("Qual o nome do jogo que deseja inicar?: ");
		nome_jogo = scanner.nextLine();
		jogo.setNomeJogo(nome_jogo);

		System.out.println("Quantas horas voce ja jogou desse jogo?: ");
		horas_jogadas = scanner.nextInt();
		jogo.setHorasJogadas(horas_jogadas);

		jogo.Iniciar(nome_jogo);
		System.out.println("Voce ja jogou " + horas_jogadas + " desse jogo");

	}

}
