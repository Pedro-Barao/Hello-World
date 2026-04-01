package Exerciciop_18;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class MainListaItem {

	public static void main(String args[])
	{
	
		Scanner scanner = new Scanner(System.in);
		String nome;
		int quantidade;
		
		List<Item> item = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o nome do item?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual a quantidade do item?: ");
			quantidade = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.print("\n");
			
			item.add(new Item(nome, quantidade));
			
		}
		
		String itens = item.stream()
				.map(i -> i.getNome() + ": " + i.getQuantidade())
				.collect(Collectors.joining(", "));
		
		System.out.println(itens);
		
	}
	
}
