package Exerciciop_11;

import java.util.Scanner;

public class RegistroProfessor extends Professor {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Professor professor = new Professor();
		String nome, turma;
		int idade, CNDB;

		System.out.println("Qual o nome do Professor?: ");
		nome = scanner.nextLine();
		professor.setNome(nome);

		System.out.println("Qual a idade do Professor?: ");
		idade = scanner.nextInt();
		professor.setIdade(idade);

		System.out.println("Qual a sala do Professor?: ");
		turma = scanner.nextLine();
		professor.setTurma(turma);

		System.out.println("Qual o RA do Professor?: ");
		CNDB = scanner.nextInt();
		professor.setCNDB(CNDB);

		professor.MostrarProfessor(nome, idade, turma, CNDB);

	}
}
