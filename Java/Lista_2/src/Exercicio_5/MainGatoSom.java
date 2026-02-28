package Exercicio_5;

import java.util.Scanner;

public class MainGatoSom {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Gato gato = new Gato();
		String nome;
		int idade;

		System.out.println("Qual o nome do seu gato?: ");
		nome = scanner.nextLine();
		gato.setNome(nome);

		System.out.println("Qual a idade do seu gato?: ");
		idade = scanner.nextInt();
		gato.setIdade(idade);

		System.out.println("O gato " + gato.getNome() + " tem " + gato.getIdade() + " ano(s)");
		gato.FazerSom();

	}

}
