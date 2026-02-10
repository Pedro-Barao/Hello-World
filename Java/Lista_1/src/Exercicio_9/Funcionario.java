/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Classe Funcionario e Gerente: Crie uma classe Funcionario com nome e salario. Crie uma
			subclasse Gerente que tem um bônus adicional

 */

package Exercicio_9;

public class Funcionario {

	private String nome;
	private float salario;

	public Funcionario() {
	}

	public Funcionario(String nome, float salario) {

		this.nome = nome;
		this.salario = salario;

	}

	public String getNome() {

		return this.nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public float getSalario() {

		return this.salario;

	}

	public void setSalario(float salario) {

		this.salario = salario;

	}

	public void MostrarFuncionario(String nome, float salario) {

		System.out.println("O nome do funcionario e: " + nome);
		System.out.println("O salario do funcionario e: " + salario);

	}

}
