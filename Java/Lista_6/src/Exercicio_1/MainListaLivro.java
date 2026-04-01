package Exercicio_1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainListaLivro {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String titulo, autor;
		
		List<Livro> livro = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o titulo do livro?: ");
			titulo = scanner.nextLine();
			
			System.out.println("Qual o nome do autor do livro?: ");
			autor = scanner.nextLine();
			
			System.out.print("\n");
			
			livro.add(new Livro(titulo, autor));
			
		}
		
		
		List<String> NomesLivros = livro.stream()
				.map(Livro::getTitulo)
				.collect(Collectors.toList());
		
		System.out.println("Titulos dos livros:");
		NomesLivros.forEach(l -> System.out.println("- " + l));
		
	}
	
}
