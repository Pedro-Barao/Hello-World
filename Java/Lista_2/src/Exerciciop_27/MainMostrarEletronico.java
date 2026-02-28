package Exerciciop_27;

import java.util.Scanner;

public class MainMostrarEletronico {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		Eletronico eletronico = new Eletronico();
		String nome;
		float preco;
		
		System.out.println("Qual o nome do eletronico?: ");
		nome = scanner.nextLine();
		eletronico.setNome(nome);
		
		System.out.println("Quanto custa o eletronico?: ");
		preco = scanner.nextFloat();
		eletronico.setPreco(preco);
		
		eletronico.CalcularDesconto(nome, preco);
		
	}
	
}
