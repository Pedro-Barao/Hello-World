package Exercicio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainFiltrarFuncionarios {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		String nome;
		int idade;
		double salario;

		List<Funcionario> funcionarios = new ArrayList();

		for (int i = 0; i < 5; i++) {

			System.out.println("Qual o nome do funcionario?: ");
			nome = scanner.nextLine();

			System.out.println("Qual a idade do funcionario?: ");
			idade = scanner.nextInt();

			System.out.println("Qual o salario do funcionario?: ");
			salario = scanner.nextDouble();

			scanner.nextLine();

			funcionarios.add(new Funcionario(nome, idade, salario));

		}

		List<Funcionario> funcionarios5000 = funcionarios.stream().filter(f -> f.getSalario() > 5000)
				.sorted((a, b) -> Double.compare(b.getSalario(), a.getSalario())).collect(Collectors.toList());

		funcionarios5000.forEach(f -> System.out.println(
				f.getNome() + " tem " + f.getIdade() + " anos e ganha por mes " + f.getSalario() + " reais\n"));

	}

}
