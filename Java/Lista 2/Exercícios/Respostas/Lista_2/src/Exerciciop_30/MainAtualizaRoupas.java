package Exerciciop_30;

import java.util.Scanner;

public class MainAtualizaRoupas {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		Roupas roupas = new Roupas();
		String nome;
		int quantidade = 10, opcao;
		
		System.out.println("Qual o nome das roupas?: ");
		nome = scanner.nextLine();
		roupas.setNome(nome);
		
		System.out.println("A quantidade de " + roupas.getNome() + " estoque e de " + quantidade);
		System.out.println("Deseja atualizar a quantidade em estoque? 1-Sim 2-Nao: ");
		opcao = scanner.nextInt();
		
		if(opcao == 1)
		{
			
			System.out.println("Qual a nova quantidade no estoque?: ");
			quantidade = scanner.nextInt();
			
			roupas.AtualizarQuantidade(nome, quantidade);
			
		}
		
	}
	
}
