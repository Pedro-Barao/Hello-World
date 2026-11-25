package Exerciciop_25;

public class LivroFisico extends Livro {

	LivroFisico() {

		super();

	}

	LivroFisico(String titulo, int quantidade_paginas) {

		super.getTitulo();
		super.getQuantidadePaginas();

	}

	@Override
	public void Abrir(String titulo, int quantidade_paginas) {

		System.out.println("O Livro Fisico " + titulo + " com " + quantidade_paginas + " paginas foi aberto");

	}

}