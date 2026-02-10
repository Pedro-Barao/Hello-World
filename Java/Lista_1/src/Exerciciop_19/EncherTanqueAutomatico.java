package Exerciciop_19;

import java.util.Scanner;

public class EncherTanqueAutomatico extends CarroAutomatico {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		CarroAutomatico carroautomatico = new CarroAutomatico();
		String marca, modelo;
		int limite_tanque;

		System.out.println("Qual a marca do carro?: ");
		marca = scanner.nextLine();
		carroautomatico.setMarca(marca);

		System.out.println("Qual o modelo do carro?: ");
		modelo = scanner.nextLine();
		carroautomatico.setModelo(modelo);

		System.out.println("Qual o limite do tanque do carro?: ");
		limite_tanque = scanner.nextInt();
		carroautomatico.setLimiteTanque(limite_tanque);

		carroautomatico.Abastecer();

	}
}
