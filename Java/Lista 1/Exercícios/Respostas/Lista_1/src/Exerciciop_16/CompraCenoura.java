package Exerciciop_16;

import java.util.Scanner;

public class CompraCenoura extends Cliente {

	CompraCenoura() {
		super();
	}

	CompraCenoura(String nome) {
		super(nome);
	}

	@Override
	public void Compra(String nome) {

		System.out.println(nome + " comprou uma cenoura");

	}

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		CompraCenoura compracenoura = new CompraCenoura();
		String nome;

		System.out.println("Quak o nome do cliente que fez a compra?: ");
		nome = scanner.nextLine();
		compracenoura.setNome(nome);

		compracenoura.Compra(nome);

	}

}
