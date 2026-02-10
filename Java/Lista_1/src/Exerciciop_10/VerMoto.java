package Exerciciop_10;

import java.util.Scanner;

public class VerMoto extends Moto {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Moto moto = new Moto();
		String marca, modelo;
		int velocidade_maxima, cilindrada;

		System.out.println("Qual a marca da moto?: ");
		marca = scanner.nextLine();

		System.out.println("Qual o modelo da moto?: ");
		modelo = scanner.nextLine();
		moto.setModelo(modelo);

		System.out.println("Qual a velocidade maxima da moto?: ");
		velocidade_maxima = scanner.nextInt();
		moto.setVelocidadeMaxima(velocidade_maxima);

		System.out.println("Qual a cilindada da moto?: ");
		cilindrada = scanner.nextInt();
		moto.setCilindrada(cilindrada);

		moto.MostrarDados(marca, modelo, velocidade_maxima, cilindrada);

	}

}
