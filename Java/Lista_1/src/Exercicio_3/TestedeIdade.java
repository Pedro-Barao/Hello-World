package Exercicio_3;

import java.util.Scanner;

public class TestedeIdade extends Pessoa {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		String nome;
		int idade;
		boolean demaior;

		System.out.println("Qual o seu nome?: ");
		nome = scanner.nextLine();
		pessoa.setNome(nome);

		System.out.println("Qual a sua idade?: ");
		idade = scanner.nextInt();
		pessoa.setIdade(idade);

		demaior = pessoa.MaiorDeIdade(idade);

		System.out.println("");

		if (demaior) {

			System.out.println(pessoa.getNome() + " e maior de idade");

		}

		else {

			System.out.println(pessoa.getNome() + " e menor de idade");

		}

	}

}
