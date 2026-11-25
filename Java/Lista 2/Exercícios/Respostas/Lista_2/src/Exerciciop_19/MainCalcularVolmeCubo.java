package Exerciciop_19;

import java.util.Scanner;

public class MainCalcularVolmeCubo {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Cubo cubo = new Cubo();
		float altura = 0, largura, comprimento = 0;
		double volume;

		System.out.println("Qual a altura do cubo?: ");
		largura = scanner.nextFloat();
		cubo.setLargura(largura);

		System.out.println("Qual a largura do cubo?: ");
		altura = scanner.nextFloat();
		cubo.setAltura(altura);

		System.out.println("Qual o comprimento do cubo?: ");
		comprimento = scanner.nextFloat();
		cubo.setComprimento(comprimento);

		volume = cubo.CalcularVolume(altura, largura, comprimento);

		System.out.println("O volume do cubo vale = " + String.format("%.2f", volume));

	}

}
