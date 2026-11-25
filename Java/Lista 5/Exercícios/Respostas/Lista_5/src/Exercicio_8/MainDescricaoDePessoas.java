package Exercicio_8;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainDescricaoDePessoas {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome, descricao;
		
		List<Pessoa> pessoa = new ArrayList();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o nome da pessoa?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual a descricao dessa pessoa?: ");
			descricao = scanner.nextLine();
			
			System.out.print("\n");
			
			pessoa.add(new Pessoa(nome, descricao));
			
		}
		
		List<String> PessoaDescricao = pessoa.stream()
				.map(Pessoa::getDescricao)
				.collect(Collectors.toList());
		
		String TodasDescricao = pessoa.stream()
				.map(Pessoa::getDescricao)
				.collect(Collectors.joining(", "));
		
		System.out.println("Lista de descricoes de pessoas: ");
		PessoaDescricao.forEach(d -> System.out.println("- " + d));
		
		System.out.print("\n");
		
		System.out.println(TodasDescricao);
		
  	}
	
}
