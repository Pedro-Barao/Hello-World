package Exerciciop_12;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class MainMostrarFuncionarios {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome, departamento;
		Double salario;
		
		List<Funcionario> funcionario = new ArrayList<>();
		
		for(int i = 0; i < 3; i++)
		{
			
			System.out.println("Qual o nome do funcionario?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual o salario do funcionario?: ");
			salario = scanner.nextDouble();
			
			scanner.nextLine();
			
			System.out.println("Qual o departamento do funcionario?: ");
			departamento = scanner.nextLine();
			
			System.out.print("\n");
			
			funcionario.add(new Funcionario(nome, salario, departamento));
			
		}
		
		List<String> FuncionarioTI = funcionario.stream()
				.filter(f -> f.getDepartamento().equals("TI"))
				.map(Funcionario::getNome)
				.collect(Collectors.toList());
		
		List<Funcionario> AumentoSalario = funcionario.stream()
				.map(f -> new Funcionario(f.getNome(), f.getSalario() * 1.1, f.getDepartamento()))
				.collect(Collectors.toList());
		
		Map<String, Double> TotalDepartamento = funcionario.stream()
				.collect(Collectors.groupingBy(Funcionario::getDepartamento, Collectors.summingDouble(Funcionario::getSalario)));
		
		System.out.println("Funcionarios do TI");
		FuncionarioTI.forEach(f -> System.out.println("- " + f));
		
		System.out.print("\n");
		
		AumentoSalario.forEach(f -> System.out.println("O salario do funcionario " + f.getNome() + " do departamento " 
						+ f.getDepartamento() + " tera um aumento para: " + f.getSalario()));
		
		System.out.print("\n");
		
		TotalDepartamento.forEach((Departamento, SalarioTotal) -> {
			
				System.out.println("Departamento: " + Departamento + " --- Salario Total: " + SalarioTotal);
				
		});
		
	}
	
}
