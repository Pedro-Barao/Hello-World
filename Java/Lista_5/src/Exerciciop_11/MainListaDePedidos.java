package Exerciciop_11;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class MainListaDePedidos {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome, status;
		int id;
		
		List<Pedido> pedido = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o id do pedido?: ");
			id = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("Qual o nome do pedido?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual o status atual do pedido? 'Pendente', 'Pago' ou 'Cancelado' : ");
			status = scanner.nextLine();
			
			System.out.print("\n");
			
			pedido.add(new Pedido(id, nome, status));
			
		}
		
		List<String> PedidoPago = pedido.stream()
				.filter(p -> p.getStatus().equals("Pago"))
				.map(Pedido::getNome)
				.collect(Collectors.toList());
		
		Map<String, List<Pedido>> PedidoPorStatus = pedido.stream()
				.collect(Collectors.groupingBy(Pedido::getStatus));
		
		System.out.println("Pedidos pagos:");
		PedidoPago.forEach(p -> System.out.println("- " + p));
		
		PedidoPorStatus.forEach((StatusAtual, lista) ->{
			
			System.out.println("\nStatus: " + StatusAtual);
			lista.forEach(p -> System.out.println("- " + p.getNome()));
			
		});
		
	}
	
}
