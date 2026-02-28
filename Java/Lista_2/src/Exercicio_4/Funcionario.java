/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe abstrata Funcionario com um método abstrato calcularSalario(). Crie Gerente
			e Estagiario.

 */

package Exercicio_4;

public abstract class Funcionario {

	private String nome;
	private float salario;

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

	public abstract float CalcularSalario(float salario, float bonificacao);

	public void MostrarFuncionario(String nome, float salario) {

		System.out.println("O funcionario " + nome);
		System.out.println("Recebe " + salario + " por mes");

	}

}
