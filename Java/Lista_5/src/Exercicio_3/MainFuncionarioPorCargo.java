package Exercicio_3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class MainFuncionarioPorCargo {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		List<Funcionario> funcionario = new ArrayList<>();
		String nome, cargo;
		int idade;
		double salario;
		
		for(int i = 0; i < 4; i++)
		{
			
			System.out.println("Qual o nome do funcionario?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual a idade do funcioanrio?: ");
			idade = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("Qual o cargo do funcionario?: ");
			cargo = scanner.nextLine();
	
			System.out.println("Qual o salario do funcionario?: ");
			salario = scanner.nextDouble();
			
			scanner.nextLine();
			
			System.out.print("\n");
			
			funcionario.add(new Funcionario(nome, idade, cargo, salario));
			
		}
		
		Map<String, List<Funcionario>> funcionarioporcargo = funcionario.stream()
				.collect(Collectors.groupingBy(Funcionario::getCargo));
		
		List<String> funcionarionome = funcionario.stream()
				.map(Funcionario::getNome)
				.collect(Collectors.toList());
				
		Map<String, Double> funcionariomediasalario = funcionario.stream()
				.collect(Collectors.groupingBy(
						Funcionario::getCargo,
						Collectors.averagingDouble(Funcionario::getSalario)));
		
		System.out.println("Nome dos funcionarios:");
		funcionarionome.forEach(f -> System.out.println("- " + f));
		
		
		System.out.println("\nLista de funcionarios:\n");
		funcionarioporcargo.forEach((cargoMap, lista) -> {
			System.out.println("Cargo: " + cargoMap);
			lista.forEach(f -> System.out.println("-" + f.getNome()));
			
		});
		
		System.out.println("\nMedia salarial por cago:\n");
		funcionariomediasalario.forEach((cargoMap, media) -> {
			System.out.println("Cargo: " + cargoMap + " Media Salarial: " + media);
		});
	
	}
	
}
