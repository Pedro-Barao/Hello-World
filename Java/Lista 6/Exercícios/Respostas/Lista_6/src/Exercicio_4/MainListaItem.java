package Exercicio_4;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class MainListaItem {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		
		List<Item> item = new ArrayList<>();
		String nome, categoria;
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o nome do item?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual a categoria do item?: ");
			categoria = scanner.nextLine();
			
			System.out.print("\n");
			
			item.add(new Item(nome, categoria));
			
		}
		
		Map<String, List<Item>> NomePorCategoria = item.stream()
				.collect(Collectors.groupingBy(Item::getCategoria));
		
		NomePorCategoria.forEach ((Categoria, lista) -> {
				
			System.out.println(Categoria);
			lista.forEach(l -> System.out.println("- " + l.getNome()));
			
		});
		
	}
	
}
