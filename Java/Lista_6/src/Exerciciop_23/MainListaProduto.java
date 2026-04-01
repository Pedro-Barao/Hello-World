package Exerciciop_23;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class MainListaProduto {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		int id, versao;
		
		List<Produto> produto = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o id do produto?: ");
			id = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("Qual o nome do produto?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual a versao do produto?: ");
			versao = scanner.nextInt();
			
			System.out.print("\n");
			
			produto.add(new Produto(id, nome, versao));
			
		}
		
		Map<Integer, List<Produto>> ProdutoPorVersao = produto.stream()
				.collect(Collectors.groupingBy(Produto::getId, Collectors.toList()));
		
		ProdutoPorVersao.forEach((Id, Produtos) -> {
			
			Produto ProdutoMaisRecente = Produtos.get(0);
			
			for(int i = 0; i < Produtos.size(); i++)
			{
				
				if(Produtos.get(i).getVersao() > ProdutoMaisRecente.getVersao())
				{
					
					ProdutoMaisRecente = Produtos.get(i);
					
				}
				
			}
			
			System.out.println(Id + ": " + ProdutoMaisRecente.getNome() + " | " + ProdutoMaisRecente.getVersao());
			
		});
		
	}
		
}
	

