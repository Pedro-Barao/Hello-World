package Exerciciop_14;

import java.util.Scanner;

public class MainCalcularVelocidadeMaximaMoto {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Moto moto = new Moto();
		String marca, modelo;
		float velocidade, raio_roda;
		double velocidade_maxima;

		System.out.println("Qual a marca da moto?: ");
		marca = scanner.nextLine();
		moto.setMarca(marca);

		System.out.println("Qual o modelo da moto?: ");
		modelo = scanner.nextLine();
		moto.setModelo(modelo);

		System.out.println("Qual a velocidade media da moto?: ");
		velocidade = scanner.nextFloat();
		moto.setVelocidade(velocidade);

		System.out.println("Qual o raio da roda da moto(em milimetros)?: ");
		raio_roda = scanner.nextFloat();
		moto.setRaioRoda(raio_roda);

		velocidade_maxima = moto.VelocidadeMaxima(raio_roda);

		System.out.println("A moto da marca " + moto.getMarca() + " e do modelo " + moto.getModelo());
		System.out.println("Tem uma velocidade media de " + moto.getVelocidade() + " km/h e pode atingidir ate "
				+ String.format("%.2f", velocidade_maxima) + " km/h");

	}

}
