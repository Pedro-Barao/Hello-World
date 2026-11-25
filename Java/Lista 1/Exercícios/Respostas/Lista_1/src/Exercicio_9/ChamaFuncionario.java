package Exercicio_9;

import java.util.Scanner;

public class ChamaFuncionario extends Funcionario {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		String nome;
		float salario;

		System.out.println("Qual o nome do funcionario?: ");
		nome = scanner.nextLine();
		funcionario.setNome(nome);

		System.out.println("Qual o salario do funcionario?: ");
		salario = scanner.nextFloat();
		funcionario.setSalario(salario);

		funcionario.MostrarFuncionario(nome, salario);

	}

}
