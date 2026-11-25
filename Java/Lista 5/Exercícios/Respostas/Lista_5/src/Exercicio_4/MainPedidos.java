package Exercicio_4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainPedidos {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String cliente;
		int id;
		double valor_total;
		
		List<Pedido> pedidos = new ArrayList<>();
		
		for(int i = 0; i < 4; i++)
		{
			
			System.out.println("Qual o nome do cliente?: ");
			cliente = scanner.nextLine();
			
			System.out.println("Qual o id do pedido?: ");
			id = scanner.nextInt();
			
			System.out.println("Qual o valor total do pedido?: ");
			valor_total = scanner.nextDouble();
			
			scanner.nextLine();
			
			System.out.print("\n");
			
			pedidos.add(new Pedido(id, cliente, valor_total));
			
		}
		
		List<PedidoDTO> pedidosdto = pedidos.stream()
				.map(p -> new PedidoDTO(p.getId(), p.getValorTotal()))
				.collect(Collectors.toList());
		
		pedidosdto.forEach(p -> System.out.println("Codigo Pedido: " + p.getId() + " Valor Pedido: " + p.getValorTotal()));
		
	}
	
}
