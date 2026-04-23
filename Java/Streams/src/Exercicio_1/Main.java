package Exercicio_1;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String args[])
	{
		
		List<Funcionario> funcionario = new ArrayList<>();
		
		funcionario.add(new Funcionario("Caio", 2000));
		funcionario.add(new Funcionario("Ana", 10000));
		funcionario.add(new Funcionario("Joao", 5000));
		
		List<Double> ListaSalarios = funcionario.stream()
				.map(Funcionario::getSalario)
				.collect(Collectors.toList());
		
		Double MediaSalarios = funcionario.stream()
				.collect(Collectors.averagingDouble(Funcionario::getSalario));
 		
		ListaSalarios.forEach(System.out::println);
		
		System.out.println("\n");
		
		System.out.println("Media: " + String.format("%.2f", MediaSalarios));
		
	}

}
