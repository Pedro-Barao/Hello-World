/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Adicione um método calcularBonificacao() à classe Funcionario, e sobrescreva em Gerente.

 */

package Exerciciop_12;

public class Funcionario {

	private String nome;
	private float salario;
	private float bonificacao;

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

	public float getBonificacao() {

		return this.bonificacao;

	}

	public void setBonificacao(float bonificacao) {

		this.bonificacao = bonificacao;

	}

	public float CalcularBonificacao(String nome, float salario, float bonificacao) {

		System.out.println("O funcionario " + nome + " com o salario de " + salario + " reais tera " + bonificacao
				+ " reais de bonificacao");

		return salario + bonificacao;

	}
}
