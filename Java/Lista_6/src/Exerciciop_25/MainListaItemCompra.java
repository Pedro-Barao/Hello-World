package Exerciciop_25;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class MainListaItemCompra {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		int id, quantidade;
		
		List<Item> item1 = new ArrayList<>();
		List<Item> item2 = new ArrayList<>();
		List<Compra> compra = new ArrayList<>();
			
		for(int i = 0; i < 3; i++)
		{
				
			System.out.println("Qual o nome do item da lista 1?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual a quantidade desse item na lista 1?: ");
			quantidade = scanner.nextInt();
			
			scanner.nextLine();
		
			System.out.print("\n");
			
			item1.add(new Item(nome, quantidade));
				
		}
			
		for(int j = 0; j < 3; j++)
		{
				
			System.out.println("Qual o nome do item da lista 2?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual a quantidade desse item na lista 2?: ");
			quantidade = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.print("\n");
			
			item2.add(new Item(nome, quantidade));
			
		}
		
        compra.add(new Compra(1, item1));
        compra.add(new Compra(2, item2));
		
		Map<String, List<Item>> CompraPorNome = compra.stream()
				.flatMap(c -> c.getItem().stream())
				.collect(Collectors.groupingBy(Item::getNome));
		
		CompraPorNome.forEach((NomeItem, Compras) -> {
			
			Compras.forEach(ci -> System.out.println(NomeItem + ":" + ci.getQuantidade()));
			
		});
		
	}
	
}
