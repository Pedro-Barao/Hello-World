package Exerciciop_16;

import java.util.Scanner;

public class MainLigarTelefone {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Telefone telefone = new Telefone();
		String marca, modelo;

		System.out.println("Qual a marca do seu telefone?: ");
		marca = scanner.nextLine();
		telefone.setMarca(marca);

		System.out.println("Qual o modelo do seu telefone?: ");
		modelo = scanner.nextLine();
		telefone.setModelo(modelo);

		telefone.Ligar(marca, modelo);

	}

}
