package Exercicio_9;

import java.util.Scanner;

public class ChamaGerente extends Gerente {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Gerente gerente = new Gerente();
		String nome;
		float salario;
		float bonus;

		System.out.println("Qual o nome do gerente?: ");
		nome = scanner.nextLine();
		gerente.setNome(nome);

		System.out.println("Qual o salario do gerente?: ");
		salario = scanner.nextFloat();
		gerente.setSalario(salario);

		System.out.println("Qual o bonus do gerente?: ");
		bonus = scanner.nextFloat();
		gerente.setSalario(bonus);

		gerente.MostrarGerente(nome, salario, bonus);

	}

}
