package Exercicio_4;

public class Estagiario extends Funcionario {

	Estagiario() {

		super();
	}

	Estagiario(String nome, float salario) {

		super.setNome(nome);
		super.setSalario(salario);

	}

	@Override
	public float CalcularSalario(float salario, float bonificacao) {

		return salario + (salario / bonificacao);

	}

}
