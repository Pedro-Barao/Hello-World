package Exerciciop_11;

public class Aluno extends Pessoa {

	private int RA;

	public Aluno() {

		super();

	}

	public Aluno(String nome, int idade, String turma, int RA) {

		super(nome, idade, turma);
		this.RA = RA;

	}

	public int getRA() {

		return this.RA;

	}

	public void setRA(int RA) {

		this.RA = RA;

	}

	public void MostrarAluno(String nome, int idade, String turma, int RA) {

		System.out.println("Nome do Aluno: " + nome);
		System.out.println("Idade Aluno: " + idade);
		System.out.println("Sala do Aluno: " + turma);
		System.out.println("RA do Aluno: " + RA);

	}

}
