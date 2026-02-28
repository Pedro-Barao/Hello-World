package Exerciciop_30;

import java.util.Scanner;

public class MainAtualizaEletronicos {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		Eletronicos eletronicos = new Eletronicos();
		String nome;
		int quantidade = 10, opcao;
		
		System.out.println("Qual o nome dos eletronicos?: ");
		nome = scanner.nextLine();
		eletronicos.setNome(nome);
		
		System.out.println("A quantidade de " + eletronicos.getNome() + " no estoque e de " + quantidade);
		System.out.println("Deseja atualizar a quantidade em estoque? 1-Sim 2-Nao: ");
		opcao = scanner.nextInt();
		
		if(opcao == 1)
		{
			
			System.out.println("Qual a nova quantidade no estoque?: ");
			quantidade = scanner.nextInt();
			
			eletronicos.AtualizarQuantidade(nome, quantidade);
			
		}
		
	}
	
}
