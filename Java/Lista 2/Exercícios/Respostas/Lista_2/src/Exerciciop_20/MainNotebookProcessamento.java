package Exerciciop_20;

import java.util.Scanner;

public class MainNotebookProcessamento {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Notebook notebook = new Notebook();
		String marca, modelo, funcao;

		System.out.println("Qual a marca do seu notebook?: ");
		marca = scanner.nextLine();
		notebook.setMarca(marca);

		System.out.println("Qual o modelo do seu notebook?: ");
		modelo = scanner.nextLine();
		notebook.setModelo(modelo);

		System.out.println("Qual funcao voce deseja executar do seu notebook?: ");
		funcao = scanner.nextLine();
		notebook.setFuncao(funcao);

		System.out.println("O notebook da marca " + marca + " e do modelo " + modelo);
		notebook.Processar(funcao);

	}

}
