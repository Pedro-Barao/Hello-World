package Exerciciop_17;

import java.util.Scanner;

public class MainServirPrato {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Prato prato = new Prato();
		String nome_prato;
		int mesa;

		System.out.println("Qual prato sera servido?: ");
		nome_prato = scanner.nextLine();
		prato.setNomePrato(nome_prato);

		System.out.println("Qual mesa sera servida?: ");
		mesa = scanner.nextInt();
		prato.setMesa(mesa);

		prato.Comida(nome_prato, mesa);

	}

}
