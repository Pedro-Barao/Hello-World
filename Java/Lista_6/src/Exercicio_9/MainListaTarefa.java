package Exercicio_9;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainListaTarefa {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String titulo, concluida;
		
		List<Tarefa> tarefa = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o titulo da tarefa?: ");
			titulo = scanner.nextLine();
			
			System.out.println("Qual a categoria da tarefa?: ");
			concluida = scanner.nextLine();
			
			System.out.print("\n");
			
			tarefa.add(new Tarefa(titulo, concluida));
			
		}
		
	
		List<String> TarefaConcluida = tarefa.stream()
				.filter(t -> t.getConcluida().equals("concluido")|| t.getConcluida().equals("Concluido"))
				.map(Tarefa::getTitulo)
				.collect(Collectors.toList());
		
		if(!TarefaConcluida.isEmpty())
		{
			
			System.out.println("Tarefas concluidas: ");
			TarefaConcluida.forEach(t -> System.out.println("- " + t));
			
		}
		
	}
	
}
