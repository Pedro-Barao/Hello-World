package Exercicio_7;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainListaPessoa {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		
		List<Pessoa> pessoa = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o nome da pessoa " + (i + 1) + " ?: ");
			nome = scanner.nextLine();
			
			System.out.print("\n");
			
			pessoa.add(new Pessoa(nome));
			
		}
		
		String TodosNomes = pessoa.stream()
				.map(Pessoa::getNome)
				.collect(Collectors.joining(", "));
		
		System.out.println("Nomes registrados:\n" + TodosNomes);
		
	}
	
}
