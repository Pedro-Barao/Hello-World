package Exerciciop_11;

import java.util.Scanner;

public class RegistroAluno extends Aluno {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();
		String nome, turma;
		int idade, RA;

		System.out.println("Qual o nome do Aluno?: ");
		nome = scanner.nextLine();
		aluno.setNome(nome);

		System.out.println("Qual a idade do Aluno?: ");
		idade = scanner.nextInt();
		aluno.setIdade(idade);

		System.out.println("Qual a turma do Aluno?: ");
		turma = scanner.nextLine();
		aluno.setTurma(turma);

		System.out.println("Qual o RA do Aluno?: ");
		RA = scanner.nextInt();
		aluno.setRA(RA);

		aluno.MostrarAluno(nome, idade, turma, RA);

	}
}
