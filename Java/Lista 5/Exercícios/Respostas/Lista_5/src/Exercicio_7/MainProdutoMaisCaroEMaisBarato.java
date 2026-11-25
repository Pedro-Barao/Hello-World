package Exercicio_7;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainProdutoMaisCaroEMaisBarato {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		List<Produto> produto = new ArrayList<>();
		String nome;
		Double preco;
		
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
		
		List<String> Produtos = produto.stream()
				.map(Produto::getNome)
				.collect(Collectors.toList());
		
		Produto ProdutoMaisCaro = produto.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco))).orElse(null);
		
		Produto ProdutoMaisBarato = produto.stream()
				.collect(Collectors.minBy(Comparator.comparingDouble(Produto::getPreco))).orElse(null);
		
		System.out.println("Lista de produtos: ");
		Produtos.forEach(p -> System.out.println("-" + p));
		
		
		System.out.println("\nO produto mais caro e: " + ProdutoMaisCaro.getNome() + ", custando: " + ProdutoMaisCaro.getPreco());
		System.out.println("\nO produto mais barato e: " + ProdutoMaisBarato.getNome() + ", custando: " + ProdutoMaisBarato.getPreco());
		
	}
	
}
