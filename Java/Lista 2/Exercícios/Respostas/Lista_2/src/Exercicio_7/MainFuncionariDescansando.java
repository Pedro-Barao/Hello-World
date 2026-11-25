package Exercicio_7;

import java.util.Scanner;

public class MainFuncionariDescansando {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Estagiario estagiario = new Estagiario();
		String nome;

		System.out.println("Qual o nome do estagiario?: ");
		nome = scanner.nextLine();
		estagiario.setNome(nome);

		System.out.println("O estagiario " + estagiario.getNome() + " esta");
		estagiario.Descansando();

	}

}
