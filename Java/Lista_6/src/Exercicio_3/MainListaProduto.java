package Exercicio_3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainListaProduto {

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
		
		List<Produto> ProdutoPorPreco = produto.stream()
				.filter(p -> p.getPreco() > 100)
				.collect(Collectors.toList());
		
		if(!ProdutoPorPreco.isEmpty())
		{

			System.out.println("Nome | Preco");
			ProdutoPorPreco.forEach(p -> System.out.println(p.getNome() + " | " + p.getPreco()));
			
		}	
		
	}
	
}
