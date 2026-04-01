package Exercicio_1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainListaEletronico {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		List<Eletronico> eletronico = new ArrayList<>();
		String nome;
		int id;
		double preco;
		
		for(int i = 0; i < 3; i++)
		{
			
			System.out.println("Qual o codigo de identificacao do eletronico?: ");
			id = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("Qual o nome do eletronico?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual o preco do eletronico?: ");
			preco = scanner.nextDouble();
			
			
			eletronico.add(new Eletronico(id, nome, preco));
			
		}
		
		List<String> eletronico100 = eletronico.stream()
				.filter(e -> e.getPreco() > 100)
				.map(ItemLoja::getNome)
				.collect(Collectors.toList());
		
		System.out.println("Lista de eletronicos acima de 100 reais:");
		eletronico100.forEach(e -> System.out.println("Eletronico: " + e));
		
	}
	
}
