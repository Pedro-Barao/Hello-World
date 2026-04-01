/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 04/03/2026
 * Objetivo: Filtragem de Dados e Cálculo Estatístico
 */

package Exerciciop_10;

public class Vendedor {
	
	private String nome;
	private Double total_vendas;
	
	Vendedor(String nome, Double total_vendas)
	{
		
		this.nome = nome;
		this.total_vendas = total_vendas;
		
	}

	public String getNome()
	{
		
		return nome;
		
	}
	
	public Double getTotalVendas()
	{
		
		return total_vendas;
		
	}
	
}
