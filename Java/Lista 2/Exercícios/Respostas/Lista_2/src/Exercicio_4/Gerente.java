package Exercicio_4;

public class Gerente extends Funcionario {

	Gerente() {

		super();
	}

	Gerente(String nome, float salario) {

		super.setNome(nome);
		super.setSalario(salario);

	}

	@Override
	public float CalcularSalario(float salario, float bonificacao) {

		return salario + (salario * bonificacao);

	}

}
