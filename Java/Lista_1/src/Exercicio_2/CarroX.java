package Exercicio_2;

import java.util.Scanner;

public class CarroX extends Carro {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Carro carro = new Carro();
		String marca, modelo, marca2, modelo2;
		int ano, ano2;

		System.out.println("Qual a marca do carro?: ");
		marca = scanner.nextLine();
		System.out.println("");

		System.out.println("Qual o modelo do carro?: ");
		modelo = scanner.nextLine();
		System.out.println("");

		System.out.println("Qual o ano do carro?: ");
		ano = scanner.nextInt();
		System.out.println("");

		carro.ExibirDados(marca, modelo, ano);
		System.out.println("");

		carro.MostrarCarros();

		System.out.println("Qual a marca do carro?: ");
		marca2 = scanner.nextLine();
		System.out.println("");

		System.out.println("Qual o modelo do carro?: ");
		modelo2 = scanner.nextLine();
		System.out.println("");

		System.out.println("Qual o ano do carro?: ");
		ano2 = scanner.nextInt();
		System.out.println("");

		carro.ExibirDados(marca2, modelo2, ano2);
		System.out.println("");

		carro.MostrarCarros();

	}

}
