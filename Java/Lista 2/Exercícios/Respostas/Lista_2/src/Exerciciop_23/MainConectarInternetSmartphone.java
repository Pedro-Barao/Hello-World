package Exerciciop_23;

import java.util.Scanner;

public class MainConectarInternetSmartphone {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Smartphone tv = new Smartphone();
		String marca, modelo;

		System.out.println("Qual a marca do seu Smartphone?: ");
		marca = scanner.nextLine();
		tv.setMarca(marca);

		System.out.println("Qual o modelo da sua Smartphone?: ");
		modelo = scanner.nextLine();
		tv.setModelo(modelo);

		tv.ConectarInternet(marca, modelo);

	}

}
