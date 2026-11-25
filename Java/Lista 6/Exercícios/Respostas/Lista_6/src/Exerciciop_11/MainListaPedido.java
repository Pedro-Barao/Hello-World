package Exerciciop_11;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class MainListaPedido {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		int id;
		double valor;
		
		List<Pedido> pedido = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o id do pedido?: ");
			id = scanner.nextInt();
			
			System.out.println("Qual o valor do pedido?: ");
			valor = scanner.nextDouble();
			
			System.out.print("\n");
			
			pedido.add(new Pedido(id, valor));
			
		}
		
		Map<Integer, Double> ValorPorId = pedido.stream()
				.collect(Collectors.groupingBy(Pedido::getId, Collectors.summingDouble(Pedido::getValor)));
		
		System.out.println("Lista de Valor por Id:");
		ValorPorId.forEach((Id, Valor) -> {
			
			System.out.println("Id: " + Id + " | Valor: " + Valor);
			
		});
		
	}
	
}
