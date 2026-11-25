package Exerciciop_13;

import java.util.Map;

public class Estagiario extends Funcionario {

	Estagiario() {

		super();

	}

	Estagiario(String nome, float salario) {

		super.setNome(nome);
		super.setSalario(salario);

	}

	@Override
	public void MostrarFuncionarios(Map<String, Float> Funcionarios) {

		Funcionarios.forEach(
				(nome, salario) -> System.out.printf("Estagiário: " + nome + " | Salário: R$ " + salario + "\n"));

	}

}
