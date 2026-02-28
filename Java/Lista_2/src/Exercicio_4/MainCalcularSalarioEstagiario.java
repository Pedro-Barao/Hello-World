package Exercicio_4;

import java.util.Scanner;

public class MainCalcularSalarioEstagiario {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Estagiario estagiario = new Estagiario();
		String nome;
		float salario, bonificacao = 2;

		System.out.println("Qual o nome do estagiario?: ");
		nome = scanner.nextLine();
		estagiario.setNome(nome);

		System.out.println("Qual o salario dele?: ");
		salario = scanner.nextFloat();
		estagiario.setSalario(salario);

		salario = estagiario.CalcularSalario(salario, bonificacao);

		estagiario.MostrarFuncionario(nome, salario);

	}

}
