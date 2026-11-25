package Exercicio_9;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class MainUsandoMap {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		int id;
		String nome;
		double preco;
		
		List<Produto> produto = new ArrayList<>();
		
		for(int i = 0; i < 3; i++)
		{
			
			System.out.println("Qual o id do produto?: ");
			id = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("Qual o nome do produto?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual o preco do produto?: ");
			preco = scanner.nextDouble();
			
			System.out.print("\n");
			
			produto.add(new Produto(id, nome, preco));
			
		}
		
		Map<Integer, Produto> DadosProduto = produto.stream()
				.collect(Collectors.toMap(Produto::getId, p -> p));
		
		DadosProduto.forEach((idp, p) -> System.out.println("\nId: " + idp + "\nProduto: " + p.getNome() + "\nPreco: " + p.getPreco() + "\n"));
		
	}
	
}
