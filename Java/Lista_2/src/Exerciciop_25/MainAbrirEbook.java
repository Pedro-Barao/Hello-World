package Exerciciop_25;

import java.util.Scanner;

public class MainAbrirEbook {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Ebook ebook = new Ebook();
		String titulo;
		int quantidade_paginas;

		System.out.println("Qual o titulo do ebook?: ");
		titulo = scanner.nextLine();
		ebook.setTitulo(titulo);

		System.out.println("Quantas paginas tem o ebook?: ");
		quantidade_paginas = scanner.nextInt();
		ebook.setQuantidadePaginas(quantidade_paginas);

		ebook.Abrir(titulo, quantidade_paginas);

	}

}
