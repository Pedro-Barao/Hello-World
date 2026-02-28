package Exerciciop_25;

public class Ebook extends Livro {

	Ebook() {

		super();

	}

	Ebook(String titulo, int quantidade_paginas) {

		super.getTitulo();
		super.getQuantidadePaginas();

	}

	@Override
	public void Abrir(String titulo, int quantidade_paginas) {

		System.out.println("O Ebook " + titulo + " com " + quantidade_paginas + " paginas foi aberto");

	}

}
