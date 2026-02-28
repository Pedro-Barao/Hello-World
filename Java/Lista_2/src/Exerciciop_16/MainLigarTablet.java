package Exerciciop_16;

import java.util.Scanner;

public class MainLigarTablet {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Tablet tablet = new Tablet();
		String marca, modelo;

		System.out.println("Qual a marca do seu tablet?: ");
		marca = scanner.nextLine();
		tablet.setMarca(marca);

		System.out.println("Qual o modelo do seu tablet?: ");
		modelo = scanner.nextLine();
		tablet.setModelo(modelo);

		tablet.Ligar(marca, modelo);

	}

}
