package Exercicio_5;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class MainListaFuncionarios {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome, departamento;
		
		List<Funcionario> funcionario = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o nome do funcnionario?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual o departamento em que o funcionario trabalha?: ");
			departamento = scanner.nextLine();
			
			System.out.print("\n");
			
			funcionario.add(new Funcionario(nome, departamento));
			
		}
		
		Map<String, List<Funcionario>> FuncionarioPorDepartamento = funcionario.stream()
				.collect(Collectors.groupingBy(Funcionario::getDepartamento));
		
		FuncionarioPorDepartamento.forEach((Departamento, lista) -> {
			
			System.out.println(Departamento + ":");
			lista.forEach(l -> System.out.println("- " + l.getNome()));
			
		});
		
	}
	
}
