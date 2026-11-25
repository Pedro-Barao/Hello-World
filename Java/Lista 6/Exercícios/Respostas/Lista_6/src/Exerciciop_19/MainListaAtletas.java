package Exerciciop_19;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MainListaAtletas {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		int pontuacao;
		
		List<Atleta> atleta = new ArrayList<>();
		
		for(int i = 0; i < 6; i++)
		{
			
			System.out.println("Qual o nome do atleta?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual a pontuacao do atleta?: ");
			pontuacao = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.print("\n");
			
			atleta.add(new Atleta(nome, pontuacao));
			
		}
		
		List<Atleta> AtletaOrdemDecrescente = atleta.stream()
				.sorted(Comparator.comparing(Atleta::getPontuacao).reversed())
				.collect(Collectors.toList());
		
		List<Atleta> Lista5Atletas = atleta.stream()
				.limit(5)
				.collect(Collectors.toList());
		
		System.out.println("Atletas Em Ordem Decrescente:\n");
		AtletaOrdemDecrescente.forEach(a -> System.out.println("- " + a.getNome()));
		
		System.out.println("\nOs 5 primeiros atletas (ordem):\n");
		Lista5Atletas.forEach(a -> System.out.println("- " + a.getNome()));
		
	}
	
}
