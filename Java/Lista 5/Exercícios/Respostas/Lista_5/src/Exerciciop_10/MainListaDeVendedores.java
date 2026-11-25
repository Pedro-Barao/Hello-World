package Exerciciop_10;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MainListaDeVendedores {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		Double total_vendas;
		
		List<Vendedor> vendedor = new ArrayList<>();
		
		for(int i = 0; i < 2; i++)
		{
			
			System.out.println("Qual o nome do vendedor?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual o total de vendas do vendedor?: ");
			total_vendas = scanner.nextDouble();
			
			System.out.print("\n");
			
			scanner.nextLine();
			
			vendedor.add(new Vendedor(nome, total_vendas));
			
		}
		
		List<String> NomesVendedor = vendedor.stream()
				.map(Vendedor::getNome)
				.collect(Collectors.toList());
		
		List<String> VendedorMais10000 = vendedor.stream()
				.filter(v -> v.getTotalVendas() > 10000)
				.map(Vendedor::getNome)
				.collect(Collectors.toList());
		
		Vendedor MaiorTotalVenda = vendedor.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Vendedor::getTotalVendas))).orElse(null);
		
		Vendedor MenorTotalVenda = vendedor.stream()
				.collect(Collectors.minBy(Comparator.comparingDouble(Vendedor::getTotalVendas))).orElse(null);
		
		System.out.println("Os vendedores sao: ");
		NomesVendedor.forEach(v -> System.out.println("- " + v));
		
		System.out.print("\n");
		
		System.out.println("Vendedores que venderam mais que 10000: ");
		VendedorMais10000.forEach(v -> System.out.println("- " + v));
		
		System.out.print("\n");
		
		System.out.println("O maior vendedor foi: " + MaiorTotalVenda.getNome() + ", vendendo um total de: " + MaiorTotalVenda.getTotalVendas());
		System.out.println("O menor vendedor foi: " + MenorTotalVenda.getNome() + ", vendendo um total de: " + MenorTotalVenda.getTotalVendas());
		
	}
	
}
