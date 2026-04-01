/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 03/03/2026
 * Objetivo: Encontrar o Maior e o Menor Valor de uma Lista com Mapeamento
 */

package Exercicio_7;

public class Produto {
	
	private String nome;
	private Double preco;
	
	Produto(String nome, Double preco)
	{
		
		this.nome = nome;
		this.preco = preco;
		
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
