package Exerciciop_24;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class MainListaPalavra {
	
	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String texto;
		String[] por_palavra;
		
		List<Palavra> palavra = new ArrayList<>();
			
		System.out.println("Escreva palavras: ");
		texto = scanner.nextLine();
			
		por_palavra = texto.toLowerCase().split("[,\\s]+");
		
		for(int i = 0; i < por_palavra.length; i++)
		{
			
			palavra.add(new Palavra(por_palavra[i]));
			
		}
		
		System.out.print("\n");
			
		
		Map<String, Long> QuantidadePorPalavra = palavra.stream()
				.collect(Collectors.groupingBy(Palavra::getTexto, Collectors.counting()));
			
		
		QuantidadePorPalavra.forEach((Palavras, Quantidade) -> {
			
			System.out.println(Palavras + ": " + Quantidade);
			System.out.print("\n");

		});
	}
		
}

