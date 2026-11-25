package Exercicio_4;

import java.util.Scanner;

public class MainCalcularSalarioGerente {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Gerente gerente = new Gerente();
		String nome;
		float salario, bonificacao = 2;

		System.out.println("Qual o nome do gerente?: ");
		nome = scanner.nextLine();
		gerente.setNome(nome);

		System.out.println("Qual o salario dele?: ");
		salario = scanner.nextFloat();
		gerente.setSalario(salario);

		salario = gerente.CalcularSalario(salario, bonificacao);

		gerente.MostrarFuncionario(nome, salario);

	}

}
