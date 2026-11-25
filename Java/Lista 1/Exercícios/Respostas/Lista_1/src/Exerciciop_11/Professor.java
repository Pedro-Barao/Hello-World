package Exerciciop_11;

public class Professor extends Pessoa {

	private int CNDB;

	public Professor() {

		super();

	}

	public Professor(String nome, int idade, String turma, int CNDB) {

		super(nome, idade, turma);
		this.CNDB = CNDB;

	}

	public int getCNDB() {

		return this.CNDB;

	}

	public void setCNDB(int CNDB) {

		this.CNDB = CNDB;

	}

	public void MostrarProfessor(String nome, int idade, String turma, int CNDB) {

		System.out.println("Nome do Professor: " + nome);
		System.out.println("Idade Professor: " + idade);
		System.out.println("Turma do Professor: " + turma);
		System.out.println("CNDB do Professor: " + CNDB);

	}

}
