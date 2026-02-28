package Exerciciop_20;

import java.util.Scanner;

public class MainDesktopProcessamento {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Desktop desktop = new Desktop();
		String marca, modelo, funcao;

		System.out.println("Qual a marca do seu desktop?: ");
		marca = scanner.nextLine();
		desktop.setMarca(marca);

		System.out.println("Qual o modelo do seu desktop?: ");
		modelo = scanner.nextLine();
		desktop.setModelo(modelo);

		System.out.println("Qual funcao voce deseja executar do seu desktop?: ");
		funcao = scanner.nextLine();
		desktop.setFuncao(funcao);

		System.out.println("O desktop da marca " + marca + " e do modelo " + modelo);
		desktop.Processar(funcao);

	}

}
