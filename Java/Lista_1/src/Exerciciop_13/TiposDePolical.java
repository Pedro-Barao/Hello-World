package Exerciciop_13;

import java.util.Scanner;

public class TiposDePolical extends Policial {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Policial policial = new Policial();
		String nome, funcao;

		System.out.println("Qual o nome do policial: ");
		nome = scanner.nextLine();
		policial.setNome(nome);

		System.out.println("Qual a funcao especifica do policial?: ");
		funcao = scanner.nextLine();
		policial.setFuncao(funcao);

		policial.MostrarFuncao(nome, funcao);

	}
}
