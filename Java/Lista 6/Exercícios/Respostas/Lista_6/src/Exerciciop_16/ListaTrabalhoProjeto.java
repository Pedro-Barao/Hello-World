package Exerciciop_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import Exerciciop_15.Filme;

public class ListaTrabalhoProjeto {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome, descricao;
		int id, projeto_id;
		
		List<Projeto> projeto = new ArrayList<>();
		List<Trabalho> trabalho = new ArrayList<>();
		
		for(int i = 0; i < 1; i++)
		{
			
			System.out.println("Qual o id do projeto?: ");
			id = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("Qual o nome do projeto?: ");
			nome = scanner.nextLine();
			
			System.out.print("\n");
			
			projeto.add(new Projeto(id, nome));
			
		}
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o id do trabalho?: ");
			projeto_id = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("Qual a descricao do trabalho?: ");
			descricao = scanner.nextLine();
			
			System.out.print("\n");
			
			trabalho.add(new Trabalho(projeto_id, descricao));
			
		}
		
		Map<Integer, List<String>> IdDoProjetoComDescricao = trabalho.stream()
				.collect(Collectors.groupingBy(Trabalho::getProjetoId, Collectors.mapping(
						
							Trabalho::getDescricao, Collectors.toList()
						
						)
						
					));
		
		IdDoProjetoComDescricao.forEach((ProjetoId, Descricao) -> {
			
		    System.out.println("Projeto ID: " + ProjetoId);
		    Descricao.forEach(d-> System.out.println(" - " + d));
		    System.out.println();
		    
		});
		
	}
	
}
