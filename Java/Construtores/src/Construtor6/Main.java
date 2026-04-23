package Construtor6;

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		
		String id_conta;
		double saldo;
		
		do
		{
			
			System.out.println("Qual o id da conta?: ");
			id_conta = scanner.nextLine();
		
			System.out.println("Qual o saldo da conta?: ");
			saldo = scanner.nextDouble();
			
			scanner.nextLine();
		
			Conta conta = new Conta(id_conta, saldo);
			
			conta.MostrarConta(id_conta, saldo);
			
		} while(id_conta == null || id_conta.isEmpty() || saldo == -1);
		
		scanner.close();
		
	}
	
}
