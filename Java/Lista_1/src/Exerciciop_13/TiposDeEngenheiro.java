package Exerciciop_13;

import java.util.Scanner;

public class TiposDeEngenheiro extends Engenheiro {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Engenheiro engenheiro = new Engenheiro();
		String nome, funcao;

		System.out.println("Qual o nome do engenheiro: ");
		nome = scanner.nextLine();
		engenheiro.setNome(nome);

		System.out.println("Qual a funcao especifica do engenheiro?: ");
		funcao = scanner.nextLine();
		engenheiro.setFuncao(funcao);

		engenheiro.MostrarFuncao(nome, funcao);

	}

}
