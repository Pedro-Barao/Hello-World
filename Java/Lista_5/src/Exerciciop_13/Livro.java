/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 04/03/2026
 * Objetivo:  Criar, Ordenar e Transformar Objetos de Uma Lista
 */

package Exerciciop_13;

public class Livro {

	private String nome;
	private String autor;
	private double preco;
	
	Livro(String nome, String autor, double preco)
	{
	
		this.nome = nome;
		this.autor = autor;
		this.preco = preco;
		
	}
	
	public String getNome()
	{
		
		return nome;
		
	}
	
	public String getAutor()
	{
		
		return autor;
		
	}
	
	public double getPreco()
	{
		
		return preco;
		
	}
	
}
