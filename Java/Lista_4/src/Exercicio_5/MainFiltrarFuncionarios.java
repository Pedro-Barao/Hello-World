package Exercicio_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainFiltrarFuncionarios {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		String nome, departamento;
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

			System.out.println("Qual o  departamento do funcionario?: ");
			departamento = scanner.nextLine();

			funcionarios.add(new Funcionario(nome, idade, salario, departamento));

		}

		Map<String, List<Funcionario>> funcionariospordepartamento = funcionarios.stream()
				.filter(f -> f.getSalario() >= 2000 && f.getSalario() <= 5000)
				.collect(Collectors.groupingBy(Funcionario::getDepartamento));

		funcionariospordepartamento.forEach((dep, lista) -> {

			System.out.println("Departamento de: " + dep + " \n");
			lista.forEach(f -> System.out.println("O funcionario " + f.getNome() + " tem  " + f.getIdade()
					+ " anos  e recebe " + f.getSalario() + " reais\n"));

		});

	}

}
