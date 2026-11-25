/*
 *
 * Nome: Pedro Gonella Barao
 * Data: 10/02/2026
 * Objetivo: Classe Professor e Aluno: Crie uma hierarquia onde Aluno e Professor herdam de Pessoa,
			cada um com atributos específicos.

 */

package Exerciciop_11;

public class Pessoa {

	private String nome;
	private int idade;
	private String turma;

	Pessoa() {
	}

	Pessoa(String nome, int idade, String turma) {

		this.nome = nome;
		this.idade = idade;
		this.turma = turma;

	}

	public String getNome() {

		return this.nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public int getIdade() {

		return idade;

	}

	public void setIdade(int idade) {

		this.idade = idade;

	}

	public String getTurma() {

		return this.turma;

	}

	public void setTurma(String turma) {

		this.turma = turma;

	}

}
