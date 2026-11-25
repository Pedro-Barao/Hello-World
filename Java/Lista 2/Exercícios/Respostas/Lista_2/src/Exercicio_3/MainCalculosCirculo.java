package Exercicio_3;

import java.util.Scanner;

public class MainCalculosCirculo {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Circulo circulo = new Circulo();
		double base, altura = 3.14, perimetro, area;

		System.out.println("Quanto vale o raio do ciruclo?: ");
		base = scanner.nextFloat();
		circulo.setBase(base);

		perimetro = circulo.CalcularPerimetro(base, altura);
		area = circulo.CalcularArea(base, altura);

		System.out.println(
				"O circulo de raio " + circulo.getBase() + " e levando me consideracao pi = " + circulo.getAltura());
		System.out.println(
				"Tem de area " + String.format("%.2f", area) + " e de perimetro " + String.format("%.2f", perimetro));

	}

}
