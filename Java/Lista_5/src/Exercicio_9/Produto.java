/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 04/03/2026
 * Objetivo: Encontrar o Maior e o Menor Valor de uma Lista com Mapeamento
 */

package Exercicio_9;

public class Produto {
	
	private int id;
	private String nome;
	private Double preco;
	
	Produto(int id, String nome, Double preco)
	{
		
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		
	}
	
	public int getId()
	{
		
		return id;
		
	}
	
	public String getNome()
	{
		
		return nome;
		
	}
	
	public Double getPreco()
	{
		
		return preco;
		
	}
	
}
