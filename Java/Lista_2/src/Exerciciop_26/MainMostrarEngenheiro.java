package Exerciciop_26;

import java.util.Scanner;

public class MainMostrarEngenheiro {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Engenheiro engenheiro = new Engenheiro();
		String nome;
		int anos_experiencia;

		System.out.println("Qual o nome do professor?: ");
		nome = scanner.nextLine();
		engenheiro.setNome(nome);

		System.out.println("Quantos anos de experiencia tem o professor?: ");
		anos_experiencia = scanner.nextInt();
		engenheiro.setAnosExperiencia(anos_experiencia);

		engenheiro.Executar(nome, anos_experiencia);

	}

}
