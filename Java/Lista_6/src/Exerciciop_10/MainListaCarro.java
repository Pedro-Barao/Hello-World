package Exerciciop_10;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainListaCarro {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String modelo;
		int ano;
		
		List<Carro> carro = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o modelo do carro?: ");
			modelo = scanner.nextLine();
			
			System.out.println("Qual o ano de fabricacao do carro?: ");
			ano = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.print("\n");
			
			carro.add(new Carro(modelo, ano));
			
		}
		
		List<Integer> AnoFabricacao = carro.stream()
				.map(Carro::getAno)
				//.distinct() Caso queira que os anos não se repitam
				.collect(Collectors.toList());
		
		System.out.println("Anos de fabricacao: ");
		AnoFabricacao.forEach(a -> System.out.println("- " + a));
		
	}
	
}
