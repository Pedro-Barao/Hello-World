package Exercicio_1;

import java.util.Scanner;

public class MainDistanciaMovimentadaCarro {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Carro carro = new Carro();
		String marca, modelo;
		int quantidade_rodas = 4;
		float quilometro_rodado, metros;

		carro.setQuantidadeRodas(quantidade_rodas);

		System.out.println("Qual a marca do seu carro?: ");
		marca = scanner.nextLine();
		carro.setMarca(marca);

		System.out.println("Qual o modelo do seu carro?: ");
		modelo = scanner.nextLine();
		carro.setModelo(modelo);

		System.out.println("Quantos quilometros rodados tem o seu carro?: ");
		quilometro_rodado = scanner.nextFloat();
		carro.setQuilometroRodado(quilometro_rodado);

		System.out.println("Quantos quilometros ele percorreu?: ");
		metros = scanner.nextFloat();

		quilometro_rodado = carro.Mover(quilometro_rodado, metros);

		System.out.println(
				"Seu " + carro.getMarca() + " " + carro.getModelo() + " tem " + carro.getQuantidade_Rodas() + " rodas");
		System.out.println("Seu carro andou no total: " + quilometro_rodado + " km");

	}

}
