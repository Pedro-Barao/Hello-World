package Exerciciop_22;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Year;
import java.time.Month;
import java.util.stream.Collectors;

public class MainListaPorIdade {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String nome, dataFacilitada;
		LocalDate dataNascimento;;
		DateTimeFormatter transformarStringEmLocalDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Pessoa> pessoa = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o seu nome?: ");
			nome = scanner.nextLine();
			
			System.out.println("Qual a sua data de nascimento? formato:(dia/mes/ano): ");
			dataFacilitada = scanner.nextLine();
			
			dataNascimento = LocalDate.parse(dataFacilitada, transformarStringEmLocalDate);
					
			System.out.print("\n");
			
			pessoa.add(new Pessoa(nome, dataNascimento));
			
		}
		
		Map<Integer, List<Pessoa>> IdadePorPessoa = pessoa.stream()
			    .collect(Collectors.groupingBy(p -> {
			        int idade = LocalDate.now().getYear() - p.getDataNascimento().getYear();

			        if (LocalDate.now().getMonthValue() < p.getDataNascimento().getMonthValue() ||
			           (LocalDate.now().getMonthValue() == p.getDataNascimento().getMonthValue() &&
			            LocalDate.now().getDayOfMonth() < p.getDataNascimento().getDayOfMonth())) {
			        	
			            idade = idade - 1;
			            
			        }
			        
			        return idade;

			    }));

		
			
		IdadePorPessoa.forEach((Idade, Pessoas) -> {
			
			
			System.out.println(Idade);
			Pessoas.forEach(p -> System.out.println("- " + p.getNome()));
			System.out.print("\n");
			
		});
		
	}
	
}
