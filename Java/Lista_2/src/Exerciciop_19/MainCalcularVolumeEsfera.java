package Exerciciop_19;

import java.util.Scanner;

public class MainCalcularVolumeEsfera {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Esfera esfera = new Esfera();
		float altura = 0, largura, comprimento = 0;
		double volume;

		System.out.println("Qual o tamanho do raio da esfera?: ");
		largura = scanner.nextFloat();
		esfera.setLargura(largura);

		volume = esfera.CalcularVolume(altura, largura, comprimento);

		System.out.println("O volume da esfera vale = " + String.format("%.2f", volume));

	}

}
