package Exerciciop_15;

import java.util.Scanner;

public class MainImprimirWord {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Word word = new Word();
		String nome;
		float tamanho;

		System.out.println("Qual o nome do documento word?: ");
		nome = scanner.nextLine();
		word.setNome(nome);

		System.out.println("Qual o tamanho do word?: ");
		tamanho = scanner.nextFloat();
		word.setTamanho(tamanho);

		word.Imprimir(nome, tamanho);

	}

}
