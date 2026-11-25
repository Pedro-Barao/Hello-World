package Exercicio_1;

import java.util.Scanner;

public class MainDistanciaMovimentadaBicicleta {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Bicicleta bicicleta = new Bicicleta();
		String marca, modelo;
		int quantidade_rodas = 2;
		float metro_rodado, metros;

		bicicleta.setQuantidadeRodas(quantidade_rodas);

		System.out.println("Qual a marca da sua bicicleta?: ");
		marca = scanner.nextLine();
		bicicleta.setMarca(marca);

		System.out.println("Qual o modelo da sua bicicelta?: ");
		modelo = scanner.nextLine();
		bicicleta.setModelo(modelo);

		System.out.println("Quantos metros sua bicicleta ja andou hoje?: ");
		metro_rodado = scanner.nextFloat();
		bicicleta.setMetroRodado(metro_rodado);

		System.out.println("Quantos quilometros ele percorreu?: ");
		metros = scanner.nextFloat();

		metro_rodado = bicicleta.Mover(metro_rodado, metros);

		System.out.println("Sua " + bicicleta.getMarca() + " " + bicicleta.getModelo() + " tem "
				+ bicicleta.getQuantidade_Rodas() + " rodas");
		System.out.println("Sua bicicleta andou no total: " + metro_rodado + " m");

	}

}
