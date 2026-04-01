package Exerciciop_21;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class MainListaTransacao {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		String descricao;
		Double valor;
		
		List<Transacao> transacao = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o valor da transacao?: ");
			valor = scanner.nextDouble();
			
			scanner.nextLine();
			
			System.out.println("Qual a descricao da transacao?: ");
			descricao = scanner.nextLine();
			
			System.out.print("\n");
			
			transacao.add(new Transacao(valor, descricao));
			
		}
		
		Map<String, Transacao> TransacaoPorDescricao = transacao.stream()
				.collect(Collectors.groupingBy(Transacao::getDescricao, 
						Collectors.collectingAndThen(Collectors.reducing((atual, proximo)
						-> atual.getValor() > proximo.getValor() ? atual : proximo
								),
						 opcional -> opcional.orElse(null)
						 )
						));
		
		TransacaoPorDescricao.forEach((Descricao, MaiorValor) -> {
			
			System.out.println(Descricao + ": " + MaiorValor.getValor());
			
		});
		
	}
	
}
