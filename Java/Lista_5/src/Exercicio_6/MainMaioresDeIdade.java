package Exercicio_6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainMaioresDeIdade {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		int idade;
		
		List<Cliente> clientes = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o seu nome?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual a sua idade?: ");
			idade = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("");
			
			clientes.add(new Cliente(nome, idade));
			
		}
		
		List<String> cliente18 = clientes.stream()
				.filter(c -> c.getIdade() > 18)
				.map(Cliente::getNome)
				.collect(Collectors.toList());
		
		long cliente30 = clientes.stream()
				.filter(c -> c.getIdade() > 30)
				.count();
		
		if(!cliente18.isEmpty())
		{
			
			System.out.println("Usuarios com mais de 18 anos: ");
			cliente18.forEach(c -> System.out.println("- " + c));
			
		}
		
		if(cliente30 != 0)
		{
			
			System.out.println("Existem " + cliente30 + " com mais de 30 anos");
			
		}
	
	}
	
}
