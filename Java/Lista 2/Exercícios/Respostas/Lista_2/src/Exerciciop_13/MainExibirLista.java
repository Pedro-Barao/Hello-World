package Exerciciop_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainExibirLista {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Map<String, Float> Funcionarios = new HashMap<>();
		Estagiario estagiario = new Estagiario();
		String nome;
		float salario;

		for (int i = 0; i < 3; i++) {

			System.out.println("Qual o nome do funcionario " + (i + 1) + " ?: ");
			nome = scanner.nextLine();

			System.out.println("Quanto ganha o funcionario " + (i + 1) + " ?: ");
			salario = scanner.nextFloat();

			scanner.nextLine();

			Funcionarios.put(nome, salario);
			estagiario.setNome(nome);
			estagiario.setSalario(salario);

		}

		estagiario.MostrarFuncionarios(Funcionarios);

	}

}
