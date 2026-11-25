package Exerciciop_26;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class MainListaFuncionarios {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		double salario;
		
		List<Funcionario> funcionario = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o nome do funcionario?: ");
			nome = scanner.nextLine();
			
			System.out.println("Quanto o funcionario ganha de salario?: ");
			salario = scanner.nextDouble();
			
			scanner.nextLine();
			
			System.out.print("\n");
			
			funcionario.add(new Funcionario(nome, salario));
			
		}
		
			
		double media_salario = funcionario.stream()
				.collect(Collectors.averagingDouble(Funcionario::getSalario));
			
		System.out.println("Funcionarios acima da media salarial:\n");
			
		funcionario.forEach(f -> {
				
				if(f.getSalario() > media_salario)
				{
						
					System.out.println("- " + f.getNome());
						
				}
					
		});
					
		System.out.println("\nFuncionarios abaixo da media salarial:\n");
			
		funcionario.forEach(f -> {
					
				if(f.getSalario() <= media_salario)
				{
						
					System.out.println("- " + f.getNome());
						
				}
						
		});
		
	}
	
}
