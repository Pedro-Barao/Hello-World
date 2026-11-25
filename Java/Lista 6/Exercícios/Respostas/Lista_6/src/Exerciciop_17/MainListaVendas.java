package Exerciciop_17;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

public class MainListaVendas {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String produto;
		double valor;
		
		List<Venda> venda = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o nome do produto vendido?: ");
			produto = scanner.nextLine();
			
			System.out.println("Qual o valor da venda?: ");
			valor = scanner.nextDouble();
			
			scanner.nextLine();
			
			System.out.print("\n");
			
			venda.add(new Venda(produto, valor));
			
		}
		
		Map<String, DoubleSummaryStatistics> produtos = venda.stream()
				.collect(Collectors.groupingBy(Venda::getProduto,  Collectors.summarizingDouble(Venda::getValor)));
		
		
		produtos.forEach((NomeProduto, Valores) -> {
			
			System.out.println(NomeProduto + ":\n");
			System.out.println("Soma total: " + Valores.getSum());
			System.out.println("Valor medio: " + Valores.getAverage());
			System.out.println("Menor valor: " + Valores.getMin());
			System.out.println("Maior valor: " + Valores.getMax());
			System.out.print("\n");
			
		});
		
	}
	
}
