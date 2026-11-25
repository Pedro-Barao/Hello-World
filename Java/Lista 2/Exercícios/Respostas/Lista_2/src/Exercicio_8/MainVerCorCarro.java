package Exercicio_8;

import java.util.Scanner;

public class MainVerCorCarro {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Carro carro = new Carro();
		String marca, modelo, cor;

		System.out.println("Qual a marca do seu carro?: ");
		marca = scanner.nextLine();
		carro.setMarca(marca);

		System.out.println("Qual o modelo do seu carro?: ");
		modelo = scanner.nextLine();
		carro.setModelo(modelo);

		System.out.println("Qual a cor do seu carro?: ");
		cor = scanner.nextLine();
		carro.setCor(cor);

		System.out.println("O carro da marca " + carro.getMarca() + " do modelo " + carro.getModelo());
		carro.MostrarCor(cor);

	}

}
