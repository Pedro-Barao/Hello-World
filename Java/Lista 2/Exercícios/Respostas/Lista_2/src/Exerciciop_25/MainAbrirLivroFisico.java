package Exerciciop_25;

import java.util.Scanner;

public class MainAbrirLivroFisico {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		LivroFisico livrofisico = new LivroFisico();
		String titulo;
		int quantidade_paginas;

		System.out.println("Qual o titulo do livro fisico?: ");
		titulo = scanner.nextLine();
		livrofisico.setTitulo(titulo);

		System.out.println("Quantas paginas tem o livro fisico?: ");
		quantidade_paginas = scanner.nextInt();
		livrofisico.setQuantidadePaginas(quantidade_paginas);

		livrofisico.Abrir(titulo, quantidade_paginas);

	}

}
