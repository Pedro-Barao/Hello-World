package Exerciciop_12;

import java.util.Scanner;

public class MainCalcularBonificacaoGerente {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Gerente gerente = new Gerente();
		String nome;
		float salario, bonificacao;

		System.out.println("Qual o nome do gerente?: ");
		nome = scanner.nextLine();
		gerente.setNome(nome);

		System.out.println("Qual o salario do gerente?: ");
		salario = scanner.nextFloat();
		gerente.setSalario(salario);

		System.out.println("Quanto de bonificacao ele ganha?: ");
		bonificacao = scanner.nextFloat();
		gerente.setBonificacao(bonificacao);

		salario = gerente.CalcularBonificacao(nome, salario, bonificacao);

		System.out.println(nome + " ganha no total: " + salario + " reais");

	}

}
