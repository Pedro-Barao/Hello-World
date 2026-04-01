package Exerciciop_15;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class MainListaFilme {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome, genero;
		int ano;
		
		List<Filme> filme = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o nome do filme?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual o genero do filme?: ");
			genero = scanner.nextLine();
			
			System.out.println("Qual o ano de lancamento do filme?: ");
			ano = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.print("\n");
			
			filme.add(new Filme(nome, genero, ano));
			
		}
		
		Map<String, List<Filme>> FilmesPorGenero = filme.stream()
				.collect(Collectors.groupingBy(Filme::getGenero));
		
		Map<Integer, List<Filme>> FilmesPorAno = filme.stream()
				.collect(Collectors.groupingBy(Filme::getAno));
		
		FilmesPorGenero.forEach((Genero, listaGenero) -> {
			
			System.out.println(Genero + ":");
			listaGenero.forEach(g -> System.out.println("- " + g.getNome()));
			
		});
		
		System.out.print("\n");
		
		FilmesPorAno.forEach((Ano, listaAno) -> {
			
			System.out.println(Ano + ":");
			listaAno.forEach(g -> System.out.println("- " + g.getNome()));
			
		});
		
	}
	
}