package Exercicio_2;


import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MainAlunosAprovados {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		List<Aluno> aluno = new ArrayList<>();
		String nome;
		int idade;
		double nota;
		
		for(int i = 0; i < 3; i++)
		{
			
			System.out.println("Qual o nome do aluno?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual a idade do aluno?: ");
			idade = scanner.nextInt();
			
			System.out.println("Qual a nota do aluno na prova?: ");
			nota = scanner.nextDouble();
			
			scanner.nextLine();
			
			aluno.add(new Aluno(nome, idade, nota));
			
		}
		
		List<String> aluno7 = aluno.stream()
				.filter(a -> a.getNota() >=7)
				.sorted(Comparator.comparing(Aluno::getNota).reversed().thenComparing(Aluno::getIdade))
				.map(Aluno::getNome)
				.collect(Collectors.toList());
		
		System.out.println("Ordem de alunos (nota decres e idade cresc):");
		aluno7.forEach(a -> System.out.println("Aluno: " + a));
		
	}
	
}
