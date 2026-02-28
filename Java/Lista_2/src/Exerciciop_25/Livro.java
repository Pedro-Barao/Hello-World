/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe Livro com um método abrir(), e implemente Ebook e LivroFisico.
 *
 */

package Exerciciop_25;

public abstract class Livro {

	private String titulo;
	private int quantidade_paginas;

	public String getTitulo() {

		return titulo;

	}

	public void setTitulo(String titulo) {

		this.titulo = titulo;

	}

	public int getQuantidadePaginas() {

		return quantidade_paginas;

	}

	public void setQuantidadePaginas(int quantidade_paginas) {

		this.quantidade_paginas = quantidade_paginas;

	}

	public abstract void Abrir(String nome, int quanitdade_paginas);

}
