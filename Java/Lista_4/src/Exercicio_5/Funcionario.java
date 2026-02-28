package Exercicio_5;

public class Funcionario extends Pessoa {

	private double salario;
	private String departamento;

	Funcionario(String nome, int idade, double salario, String departamento) {

		super(nome, idade);
		this.salario = salario;
		this.departamento = departamento;

	}

	public double getSalario() {

		return salario;

	}

	public String getDepartamento() {

		return departamento;

	}

}
