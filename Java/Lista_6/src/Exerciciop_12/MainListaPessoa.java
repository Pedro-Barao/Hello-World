package Exerciciop_12;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainListaPessoa {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		int idade;
		
		List<Pessoa> pessoa = new ArrayList<>();
		
		System.out.println("Pessoa: ");
		
		for(int i = 0; i < 1; i++)
		{
			
			System.out.println("Qual o nome da pessoa?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual a idade da pessoa?: ");
			idade = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.print("\n");
			
			pessoa.add(new Pessoa(nome, idade));
			
		}
		
		List<ResumoPessoa> AdaptacaoParaResumoPessoa = pessoa.stream()
				.map(p -> new ResumoPessoa(p.nome, p.idade))
				.collect(Collectors.toList());
		
		System.out.println("Resumo Pessoa: ");
		AdaptacaoParaResumoPessoa.forEach(a -> System.out.println("Nome Completo: " + a.getNomeCompleto() + 
				" | Faixa Etaria: " + a.getFaixaEtaria()));
		
	}
	
}
