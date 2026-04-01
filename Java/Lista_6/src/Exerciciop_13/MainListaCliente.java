package Exerciciop_13;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class MainListaCliente {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		int verificacao;
		boolean ativo;
		
		List<Cliente> cliente = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o nome do cliente?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual o status do cliente? 1-Ativo 2-Inativo: ");
			verificacao = scanner.nextInt();
			
			if(verificacao == 1) 
			{ 
				
				ativo = true; 
				
			}
			
			else 
			{ 
				
				ativo = false; 
				
			}
			
			scanner.nextLine();
			
			System.out.print("\n");
			
			cliente.add(new Cliente(nome, ativo));
			
		}
		
		Map<Boolean, List<Cliente>> ClienteAtivoOuInativo = cliente.stream()
				.collect(Collectors.partitioningBy(c -> c.getAtivo() == true));
		
		List<Cliente> ClienteAtivo = ClienteAtivoOuInativo.get(true);
		List<Cliente> ClienteInativo = ClienteAtivoOuInativo.get(false);
		
		if(!ClienteAtivo.isEmpty())
		{	
			
			System.out.println("Clientes Ativos:");
			ClienteAtivo.forEach(c -> System.out.println("- " + c.getNome()));
			
		}
		
		System.out.print("\n");
		
		if(!ClienteInativo.isEmpty())
		{
			
			System.out.println("Clientes Inativos:");
			ClienteInativo.forEach(c -> System.out.println("- " + c.getNome()));
			
		}
		
	
	}
			
}
