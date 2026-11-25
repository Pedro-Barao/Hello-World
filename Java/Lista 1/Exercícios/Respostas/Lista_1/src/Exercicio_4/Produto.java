/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Classe Produto: Crie uma classe Produto com nome, preco e quantidade. Implemente um
				método para calcular o valor total em estoque.

 */

package Exercicio_4;

public class Produto {

	private static String nome;
	private static float preco;
	private static int quantidade;

	public static String getNome() {

		return Produto.nome;

	}

	public static void setNome(String nome) {

		Produto.nome = nome;

	}

	public static float getPreco() {

		return Produto.preco;

	}

	public static void setPreco(float preco) {

		Produto.preco = preco;

	}

	public static int getQuantidade() {

		return Produto.quantidade;

	}

	public static void setQuantidade(int quantidade) {

		Produto.quantidade = quantidade;

	}

	public static float ValorTotalEstoque(float preco, int quantidade) {

		return preco * quantidade;

	}

}
