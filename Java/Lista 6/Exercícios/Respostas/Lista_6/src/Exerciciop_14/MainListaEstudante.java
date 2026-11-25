package Exerciciop_14;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainListaEstudante {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		double nota;
		
		List<Estudante> estudante = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o nome do estudante?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual a nota do estudante?: ");
			nota = scanner.nextDouble();
			
			scanner.nextLine();
			
			System.out.print("\n");
			
			estudante.add(new Estudante(nome, nota));
			
		}
		
		Double MediaEstudantes = estudante.stream()
				.collect(Collectors.averagingDouble(Estudante::getNota));
		
		System.out.println("A soma das notas dos estudantes e: " + MediaEstudantes);
		
	}
	
}
