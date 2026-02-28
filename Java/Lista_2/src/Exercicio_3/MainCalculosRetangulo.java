package Exercicio_3;

import java.util.Scanner;

public class MainCalculosRetangulo {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Quadrado quadrado = new Quadrado();
		double base, altura, perimetro, area;

		System.out.println("Quanto vale a base do quadrado?: ");
		base = scanner.nextFloat();
		quadrado.setBase(base);

		System.out.println("Quanto vale a altura do quadrado?: ");
		altura = scanner.nextFloat();
		quadrado.setAltura(altura);

		perimetro = quadrado.CalcularPerimetro(base, altura);
		area = quadrado.CalcularArea(base, altura);

		System.out.println("O quadrado de base " + quadrado.getBase() + " e altura " + quadrado.getAltura());
		System.out.println("Tem de area " + area + " e de perimetro " + perimetro);

	}

}
