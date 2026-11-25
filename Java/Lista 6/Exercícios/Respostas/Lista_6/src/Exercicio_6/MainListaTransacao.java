package Exercicio_6;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainListaTransacao {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		double valor;
		
		List<Transacao> transacao = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o valor da transacao " + (i + 1) + " ?: ");
			valor = scanner.nextDouble();
			
			System.out.print("\n");
			
			transacao.add(new Transacao(valor));
			
		}
		
		Double SomaTransacoes = transacao.stream()
				.collect(Collectors.summingDouble(Transacao::getValor));
		
		System.out.println("A soma do valor de todas as transacoes e: " + SomaTransacoes);
		
	}
	
}
