package Exercicio_2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainListaVenda {

	
	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String produto_vendido, valor;
		
		List<Venda> venda = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o produto vendido?: ");
			produto_vendido = scanner.nextLine();
			
			System.out.println("Qual o valor da venda?:");
			valor = scanner.nextLine();
			
			System.out.print("\n");
			
			venda.add(new Venda(produto_vendido, valor));
			
		}
		
		List<Double> ListaDoubles = venda.stream()
				.map(v -> Double.parseDouble(v.getValor()))
				.collect(Collectors.toList());
		
		System.out.println("Valores dos produtos");
		ListaDoubles.forEach(ld -> System.out.println("- " + ld));
		
	}
	
}
