package Exerciciop_26;

import java.util.Scanner;

public class MainMostrarProfessor {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Professor professor = new Professor();
		String nome;
		int anos_experiencia;

		System.out.println("Qual o nome do professor?: ");
		nome = scanner.nextLine();
		professor.setNome(nome);

		System.out.println("Quantos anos de experiencia tem o professor?: ");
		anos_experiencia = scanner.nextInt();
		professor.setAnosExperiencia(anos_experiencia);

		professor.Executar(nome, anos_experiencia);

	}

}
