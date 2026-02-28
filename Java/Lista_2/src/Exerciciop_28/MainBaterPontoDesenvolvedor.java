package Exerciciop_28;

import java.util.Scanner;

public class MainBaterPontoDesenvolvedor {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		Desenvolvedor desenvolvedor = new Desenvolvedor();
		String nome;
		
		System.out.println("Qual o nome do desenvolvedor?: ");
		nome = scanner.nextLine();
		desenvolvedor.setNome(nome);
		
		desenvolvedor.BaterPonto(nome);
		
	}
	
}
