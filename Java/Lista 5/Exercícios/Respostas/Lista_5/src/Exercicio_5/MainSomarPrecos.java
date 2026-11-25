package Exercicio_5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainSomarPrecos {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		double preco;
		
		List<Produto> produto = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o nome do produto?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual o preco do produto?: ");
			preco = scanner.nextDouble();
			
			scanner.nextLine();
			
			System.out.print("\n");
			
			produto.add(new Produto(nome, preco));
			
		}
		
		List<Double> precos = produto.stream()
				.map(Produto::getPreco)
				.collect(Collectors.toList());
		
		double somaprecos = produto.stream()
				.collect(Collectors.summingDouble(Produto::getPreco));
		
		double mediaprecos = produto.stream()
				.collect(Collectors.averagingDouble(Produto::getPreco));
		
		
		System.out.println("Os precos dos produtos sao: ");
		precos.forEach(p -> System.out.println("- " + p));
		
		System.out.println("\n");
		
		System.out.println("A soma de todos os precos e: " + somaprecos);
		System.out.println("A media de todos os precos e: " + mediaprecos);
		
	}
	
}
