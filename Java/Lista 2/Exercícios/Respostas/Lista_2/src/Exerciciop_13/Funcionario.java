/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Adicione uma lista de funcionários a Empresa e um método listarFuncionarios()

 */

package Exerciciop_13;

import java.util.Map;

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

	public abstract void MostrarFuncionarios(Map<String, Float> Funcionarios);

}
