package Exercicio_5;

import java.util.Scanner;

public class MainCachorroSom {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Cachorro cachorro = new Cachorro();
		String nome;
		int idade;

		System.out.println("Qual o nome do seu cachorro?: ");
		nome = scanner.nextLine();
		cachorro.setNome(nome);

		System.out.println("Qual a idade do seu cachorro?: ");
		idade = scanner.nextInt();
		cachorro.setIdade(idade);

		System.out.println("O cachorro " + cachorro.getNome() + " tem " + cachorro.getIdade() + " ano(s)");
		cachorro.FazerSom();

	}

}
