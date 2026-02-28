package Exerciciop_14;

import java.util.Scanner;

public class MainCalcularVelocidadeMaximaCaminhao {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Caminhao caminhao = new Caminhao();
		String marca, modelo;
		float velocidade, raio_roda;
		double velocidade_maxima;

		System.out.println("Qual a marca do caminhao?: ");
		marca = scanner.nextLine();
		caminhao.setMarca(marca);

		System.out.println("Qual o modelo do caminhao?: ");
		modelo = scanner.nextLine();
		caminhao.setModelo(modelo);

		System.out.println("Qual a velocidade media do caminhao?: ");
		velocidade = scanner.nextFloat();
		caminhao.setVelocidade(velocidade);

		System.out.println("Qual o raio da roda da caminhao(em milimetros)?: ");
		raio_roda = scanner.nextFloat();
		caminhao.setRaioRoda(raio_roda);

		velocidade_maxima = caminhao.VelocidadeMaxima(raio_roda);

		System.out.println("O caminhao da marca " + caminhao.getMarca() + " e do modelo " + caminhao.getModelo());
		System.out.println("Tem uma velocidade media de " + caminhao.getVelocidade() + " km/h e pode atingidir ate "
				+ String.format("%.2f", velocidade_maxima) + " km/h");

	}

}
