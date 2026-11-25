package Exerciciop_13;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MainListaDeLivros {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome, autor;
		Double preco;
		
		List<Livro> livro = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o titulo do livro?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual o nome do autor?: ");
			autor = scanner.nextLine();
			
			System.out.println("Qual o preco do livro?: ");
			preco = scanner.nextDouble();
			
			scanner.nextLine();
			
			System.out.print("\n");
			
			livro.add(new Livro(nome, autor, preco));
			
		}
		
		List<Livro> OrganizacaoLivro = livro.stream()
				.sorted(Comparator.comparing(Livro::getPreco).thenComparing(Livro::getAutor))
				.collect(Collectors.toList());
		
		List<String> NomesLivro = livro.stream()
				.map(Livro::getNome)
				.collect(Collectors.toList());
		
		String TodosNomeLivro = livro.stream()
				.map(Livro::getNome)
				.collect(Collectors.joining(" | "));
 		
		System.out.println("Nomes Dos Livros:");
		NomesLivro.forEach(f -> System.out.println("- " + f));
		
		System.out.print("\n");
		
		OrganizacaoLivro.forEach(f -> System.out.println("Nome: " + f.getNome() + " -- Preco: " + f.getPreco() + " -- Autor: " + f.getAutor()));
		
		System.out.println("\n" + TodosNomeLivro);
		
	}
	
}
