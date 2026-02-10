package Exerciciop_16;

import java.util.Scanner;

public class CompraMelancia extends Cliente {

	CompraMelancia() {
		super();
	}

	CompraMelancia(String nome) {
		super(nome);
	}

	@Override
	public void Compra(String nome) {

		System.out.println(nome + " comprou uma melancia");

	}

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		CompraMelancia compramelancia = new CompraMelancia();
		String nome;

		System.out.println("Quak o nome do cliente que fez a compra?: ");
		nome = scanner.nextLine();
		compramelancia.setNome(nome);

		compramelancia.Compra(nome);

	}

}
