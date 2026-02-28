package Exerciciop_27;

import java.util.Scanner;

public class MainMostrarAlimento {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		Alimento alimento = new Alimento();
		String nome;
		float preco;
		
		System.out.println("Qual o nome do alimento?: ");
		nome = scanner.nextLine();
		alimento.setNome(nome);
		
		System.out.println("Quanto custa o alimento?: ");
		preco = scanner.nextFloat();
		alimento.setPreco(preco);
		
		alimento.CalcularDesconto(nome, preco);
		
	}
	
}
