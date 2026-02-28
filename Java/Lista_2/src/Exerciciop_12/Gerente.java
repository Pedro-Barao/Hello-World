package Exerciciop_12;

public class Gerente extends Funcionario {

	Gerente() {

		super();

	}

	Gerente(String nome, float salario, float bonificacao) {

		super.setNome(nome);
		super.setSalario(salario);
		super.setBonificacao(bonificacao);

	}

	@Override
	public float CalcularBonificacao(String nome, float salario, float bonificacao) {

		System.out.println("O gerente " + nome + " com o salario de " + salario + " reais tera " + bonificacao
				+ " reais de bonificacao");

		return salario + bonificacao;

	}

}
