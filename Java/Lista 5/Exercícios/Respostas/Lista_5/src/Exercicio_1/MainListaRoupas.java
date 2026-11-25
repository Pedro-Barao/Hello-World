package Exercicio_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainListaRoupas {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		List<Roupa> roupa = new ArrayList<>();
		String nome;
		int id;
		double preco;
		
		for(int i = 0; i < 3; i++)
		{
			
			System.out.println("Qual o codigo de identificacao da roupa?: ");
			id = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("Qual o nome do roupa?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual o preco do roupa?: ");
			preco = scanner.nextDouble();
			
			
			roupa.add(new Roupa(id, nome, preco));
			
		}
		
		List<String> roupa100 = roupa.stream()
				.filter(r -> r.getPreco() > 100)
				.map(ItemLoja::getNome)
				.collect(Collectors.toList());
		
		System.out.println("Lista de roupas acima de 100 reais:");
		roupa100.forEach(r -> System.out.println("Roupa: " + r));
		
	}
	
}
