package Exerciciop_19;

import java.util.Scanner;

public class EncherTanqueManual extends CarroManual {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		CarroManual carromanual = new CarroManual();
		String marca, modelo;
		int limite_tanque;

		System.out.println("Qual a marca do carro?: ");
		marca = scanner.nextLine();
		carromanual.setMarca(marca);

		System.out.println("Qual o modelo do carro?: ");
		modelo = scanner.nextLine();
		carromanual.setModelo(modelo);

		System.out.println("Qual o limite do tanque do carro?: ");
		limite_tanque = scanner.nextInt();
		carromanual.setLimiteTanque(limite_tanque);

		carromanual.Abastecer();

	}

}
