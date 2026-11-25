package Exercicio_2;

public class Funcionario extends Pessoa {

	private double salario;

	Funcionario(String nome, int idade, double salario) {

		super(nome, idade);
		this.salario = salario;

	}

	public double getSalario() {

		return salario;

	}

}
